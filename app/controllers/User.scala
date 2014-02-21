package controllers

import play.api._
import play.api.mvc._
import play.api.data.Forms._
import play.api.data.Form
import models.Users
import scala.util.matching.Regex
import play.libs.Json


object User extends Controller {

  val loginForm = Form(
	    tuple("name" -> text(minLength = 6),
	    	  "password" -> nonEmptyText(minLength = 6)
	    	  )
	  )
  val registerForm = Form(
     tuple("name" -> text(minLength = 6),
	    "password" -> tuple(
        "main" -> text(minLength = 6),
        "confirm" -> text
      ).verifying(
        // Add an additional constraint: both passwords must match
        "Passwords don't match", passwords => passwords._1 == passwords._2
      ),"email" -> nonEmptyText,
        "phone" -> nonEmptyText,
        "sex" -> text,
        "city" -> tuple(
            "first" -> text,
            "second" -> text),
        "intro" -> text
        
	    	  ) 
  )
  	/**
  	 * 璺宠浆鐧诲綍椤甸潰
  	 */
	def login = Action{
		 Ok(views.html.login(loginForm))
	}
  	/**
  	 * 鐧诲綍淇℃伅鐨勯獙璇�  	 */
  	def tologin = Action{implicit request =>
  	 loginForm.bindFromRequest.fold(
	    error =>BadRequest(views.html.index("鍙戠幇閿欒")), 
	    {
	      case(name,password)=>
	        println(name)
	      val isexists = Users.checkUserName(name)
	      println("isexists"+isexists)
	      if(isexists){
	        val isPassword: Boolean= Users.checkPassword(name, password)
	        println(isPassword)
	        if(isPassword){
	         Redirect(controllers.record.routes.Records.recordmain).withSession(request.session + ("records" ->"spahome"))
	        }else{
	          Ok(views.html.index("密码错误"))
	        }
	      }else{
	        Ok(views.html.index("用户名不存在"))
	      }
	    }
	)
  	}
  	def loginSuccess = Action {
  		Ok(views.html.loginSuccess("鐧婚櫢鎴愬姛"))
  	}
  	/**
  	 * 璺宠浆娉ㄥ唽
  	 * 
  	 */
  	def register = Action {
  	  Ok(views.html.register(registerForm))
  	}
  	/**
  	 * 娉ㄥ唽鐢ㄦ埛
  	 */
  	def toregister = Action {implicit request =>
  	  registerForm.bindFromRequest.fold(
  	    error =>BadRequest(views.html.index("鍙戠幇閿欒")),
  	    {
  	      case(name,(main,confirm),email,phone,sex,(first,second),intro)=>
  	      val isexists = Users.checkUserName(name)
  	      if(isexists){
  	        Ok(views.html.index("鐢ㄦ埛鍚嶅凡瀛樺湪"))
  	      }else{
  	        Users.toRegister(name, main, email,phone, sex, first, intro)
  	        Ok(views.html.index("娉ㄥ唽鎴愬姛"))
  	      }
  	    }
  	  )
  	  
  	}
  	/**
  	 * 涓汉淇℃伅淇敼
  	 */
  	def updateUserInfo = Action{implicit request =>
  	  val name = request.session.get("user").get
  	  if(name.isEmpty){
  	    Redirect(routes.User.login)
  	  }else{
  	    val user: Users= Users.findUserByName(name)
  	    Ok(views.html.updateUser(user,registerForm))
  	  }
  	}
  	def checkNameisexit(name: String) = Action{
  	   val isexit = Users.checkUserName(name)
  	   println("name check")
  	   println("isexit"+isexit)
  	   if(isexit){
  	     Ok("鐢ㄦ埛鍚嶅凡瀛樺湪")
  	   }else{
  	     Ok("鍙互浣跨敤")
  	   }
  	   
  	 }
}