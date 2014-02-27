// @SOURCE:E:/PD/playtest/forTest/conf/routes
// @HASH:24ad5d8a7e89fa9474149586d568c2064d90c6da
// @DATE:Wed Feb 26 13:38:46 CST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import se.radley.plugin.salat.Binders._

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_User_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_User_tologin3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tologin"))))
        

// @LINE:15
private[this] lazy val controllers_User_loginSuccess4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginSuccess"))))
        

// @LINE:17
private[this] lazy val controllers_User_register5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:19
private[this] lazy val controllers_User_toregister6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toregister"))))
        

// @LINE:21
private[this] lazy val controllers_User_checkNameisexit7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkNameisexit/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_designer_Designer_designermain8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designermain"))))
        

// @LINE:26
private[this] lazy val controllers_designer_Designer_designersearch9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designersearch"))))
        

// @LINE:28
private[this] lazy val controllers_designer_Designer_designerview10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designerview"))))
        

// @LINE:30
private[this] lazy val controllers_designer_Designer_designerTask11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designerTask"))))
        

// @LINE:33
private[this] lazy val controllers_record_Records_recordmain12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recordmain/"),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_record_Records_recordview13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recordview/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_record_Records_createrecord14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createrecord"))))
        

// @LINE:39
private[this] lazy val controllers_record_Records_toCreateRecords15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toCreateRecords"))))
        

// @LINE:41
private[this] lazy val controllers_record_Records_addRecord16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addRecord"))))
        

// @LINE:43
private[this] lazy val controllers_record_Records_selectDesignerRecord17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("selectDesignerRecord"))))
        

// @LINE:45
private[this] lazy val controllers_record_Records_cancelRecord18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cancelRecord/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:47
private[this] lazy val controllers_record_Records_overdateRecord19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("overdateRecord/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:49
private[this] lazy val controllers_record_Records_finishRecord20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("finishRecord/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.User.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tologin""","""controllers.User.tologin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginSuccess""","""controllers.User.loginSuccess"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.User.register"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toregister""","""controllers.User.toregister"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkNameisexit/$name<[^/]+>""","""controllers.User.checkNameisexit(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designermain""","""controllers.designer.Designer.designermain"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designersearch""","""controllers.designer.Designer.designersearch"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designerview""","""controllers.designer.Designer.designerview"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designerTask""","""controllers.designer.Designer.designerTask"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recordmain/$page<[^/]+>""","""controllers.record.Records.recordmain(page:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recordview/$id<[^/]+>""","""controllers.record.Records.recordview(id:ObjectId)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createrecord""","""controllers.record.Records.createrecord"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toCreateRecords""","""controllers.record.Records.toCreateRecords"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addRecord""","""controllers.record.Records.addRecord"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """selectDesignerRecord""","""controllers.record.Records.selectDesignerRecord"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cancelRecord/$id<[^/]+>""","""controllers.record.Records.cancelRecord(id:ObjectId)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """overdateRecord/$id<[^/]+>""","""controllers.record.Records.overdateRecord(id:ObjectId)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """finishRecord/$id<[^/]+>""","""controllers.record.Records.finishRecord(id:ObjectId)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_User_login2(params) => {
   call { 
        invokeHandler(controllers.User.login, HandlerDef(this, "controllers.User", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_User_tologin3(params) => {
   call { 
        invokeHandler(controllers.User.tologin, HandlerDef(this, "controllers.User", "tologin", Nil,"POST", """""", Routes.prefix + """tologin"""))
   }
}
        

// @LINE:15
case controllers_User_loginSuccess4(params) => {
   call { 
        invokeHandler(controllers.User.loginSuccess, HandlerDef(this, "controllers.User", "loginSuccess", Nil,"GET", """""", Routes.prefix + """loginSuccess"""))
   }
}
        

// @LINE:17
case controllers_User_register5(params) => {
   call { 
        invokeHandler(controllers.User.register, HandlerDef(this, "controllers.User", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:19
case controllers_User_toregister6(params) => {
   call { 
        invokeHandler(controllers.User.toregister, HandlerDef(this, "controllers.User", "toregister", Nil,"GET", """""", Routes.prefix + """toregister"""))
   }
}
        

// @LINE:21
case controllers_User_checkNameisexit7(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.User.checkNameisexit(name), HandlerDef(this, "controllers.User", "checkNameisexit", Seq(classOf[String]),"GET", """""", Routes.prefix + """checkNameisexit/$name<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_designer_Designer_designermain8(params) => {
   call { 
        invokeHandler(controllers.designer.Designer.designermain, HandlerDef(this, "controllers.designer.Designer", "designermain", Nil,"GET", """""", Routes.prefix + """designermain"""))
   }
}
        

// @LINE:26
case controllers_designer_Designer_designersearch9(params) => {
   call { 
        invokeHandler(controllers.designer.Designer.designersearch, HandlerDef(this, "controllers.designer.Designer", "designersearch", Nil,"GET", """""", Routes.prefix + """designersearch"""))
   }
}
        

// @LINE:28
case controllers_designer_Designer_designerview10(params) => {
   call { 
        invokeHandler(controllers.designer.Designer.designerview, HandlerDef(this, "controllers.designer.Designer", "designerview", Nil,"GET", """""", Routes.prefix + """designerview"""))
   }
}
        

// @LINE:30
case controllers_designer_Designer_designerTask11(params) => {
   call { 
        invokeHandler(controllers.designer.Designer.designerTask, HandlerDef(this, "controllers.designer.Designer", "designerTask", Nil,"GET", """""", Routes.prefix + """designerTask"""))
   }
}
        

// @LINE:33
case controllers_record_Records_recordmain12(params) => {
   call(params.fromPath[Int]("page", None)) { (page) =>
        invokeHandler(controllers.record.Records.recordmain(page), HandlerDef(this, "controllers.record.Records", "recordmain", Seq(classOf[Int]),"GET", """record managment""", Routes.prefix + """recordmain/$page<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_record_Records_recordview13(params) => {
   call(params.fromPath[ObjectId]("id", None)) { (id) =>
        invokeHandler(controllers.record.Records.recordview(id), HandlerDef(this, "controllers.record.Records", "recordview", Seq(classOf[ObjectId]),"GET", """""", Routes.prefix + """recordview/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_record_Records_createrecord14(params) => {
   call { 
        invokeHandler(controllers.record.Records.createrecord, HandlerDef(this, "controllers.record.Records", "createrecord", Nil,"GET", """""", Routes.prefix + """createrecord"""))
   }
}
        

// @LINE:39
case controllers_record_Records_toCreateRecords15(params) => {
   call { 
        invokeHandler(controllers.record.Records.toCreateRecords, HandlerDef(this, "controllers.record.Records", "toCreateRecords", Nil,"POST", """""", Routes.prefix + """toCreateRecords"""))
   }
}
        

// @LINE:41
case controllers_record_Records_addRecord16(params) => {
   call { 
        invokeHandler(controllers.record.Records.addRecord, HandlerDef(this, "controllers.record.Records", "addRecord", Nil,"GET", """""", Routes.prefix + """addRecord"""))
   }
}
        

// @LINE:43
case controllers_record_Records_selectDesignerRecord17(params) => {
   call { 
        invokeHandler(controllers.record.Records.selectDesignerRecord, HandlerDef(this, "controllers.record.Records", "selectDesignerRecord", Nil,"GET", """""", Routes.prefix + """selectDesignerRecord"""))
   }
}
        

// @LINE:45
case controllers_record_Records_cancelRecord18(params) => {
   call(params.fromPath[ObjectId]("id", None)) { (id) =>
        invokeHandler(controllers.record.Records.cancelRecord(id), HandlerDef(this, "controllers.record.Records", "cancelRecord", Seq(classOf[ObjectId]),"GET", """""", Routes.prefix + """cancelRecord/$id<[^/]+>"""))
   }
}
        

// @LINE:47
case controllers_record_Records_overdateRecord19(params) => {
   call(params.fromPath[ObjectId]("id", None)) { (id) =>
        invokeHandler(controllers.record.Records.overdateRecord(id), HandlerDef(this, "controllers.record.Records", "overdateRecord", Seq(classOf[ObjectId]),"GET", """""", Routes.prefix + """overdateRecord/$id<[^/]+>"""))
   }
}
        

// @LINE:49
case controllers_record_Records_finishRecord20(params) => {
   call(params.fromPath[ObjectId]("id", None)) { (id) =>
        invokeHandler(controllers.record.Records.finishRecord(id), HandlerDef(this, "controllers.record.Records", "finishRecord", Seq(classOf[ObjectId]),"GET", """""", Routes.prefix + """finishRecord/$id<[^/]+>"""))
   }
}
        
}

}
     