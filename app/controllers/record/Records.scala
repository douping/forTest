package controllers.record

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Record
import org.bson.types.ObjectId
import views._
import se.radley.plugin.salat.Binders._

import models._

object Records extends Controller{
	
  val recordForm:Form[Record] = Form(
	    mapping(
	        "store" -> text,
	        "serviceStatus" -> number,
	        "serviceStart" ->date("yyyy-MM-dd") ,
	        "serviceEnd" -> date("yyyy-MM-dd"),
	        "serviceDesigner" -> text,
	        "serviceItem" -> text,
	        "userName" -> text,
	        "userPhone" -> text,
	        "userLeaveMessage" -> text,
	        "costTotal" -> number
	        ){
	      (store,serviceStatus,serviceStart,serviceEnd,serviceDesigner,serviceItem,userName,userPhone,userLeaveMessage,costTotal) =>
	          Record(new ObjectId,store,serviceStatus,serviceStart,serviceEnd,serviceDesigner,serviceItem,userName,userPhone,userLeaveMessage,costTotal)
	    }
	    {
	      record=> Some((record.store,record.serviceStatus,record.serviceStart,record.serviceEnd,record.serviceDesigner,record.serviceItem,record.userName,record.userPhone,record.userLeaveMessage,record.costTotal))
	    }
	)
  
  
	def recordmain = Action{implicit request =>
	  val re = request.session.get("records").get
	  val records = Record.findAllrecord(re)
	  val count = Record.counts(re)
	  Ok(views.html.record.recordmain(records,count))
	}
	def recordview = Action{
	  Ok(views.html.record.recordview("hello"))
	}
	def createrecord = Action{
	  Ok(views.html.record.createrecord(recordForm))
	}
	def toCreateRecords = Action{implicit request =>
	  recordForm.bindFromRequest.fold(
	    error =>BadRequest(views.html.errorMsg(error)),
	    {
	      case(record)=>
	        println("println....record  "+record.store+record.serviceStatus+record.serviceStart+record.serviceEnd+record.costTotal)
	       Record.createRecord(record)
	       Redirect(controllers.record.routes.Records.recordmain)
	    }
	)
	  
	}
}