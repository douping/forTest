
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import org.bson.types.ObjectId
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[scala.Tuple2[String, String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[(String, String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("")/*5.10*/{_display_(Seq[Any](format.raw/*5.11*/("""
	<div class="loginForm">
		<h2>登录</h2>
		<a href="#" id="nameLogin" >普通用户登录</a>
		<a href="#" id="emailLogin">邮箱登录</a>
		"""),_display_(Seq[Any](/*10.4*/form(routes.User.tologin)/*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
			<table>
			<tr>
				<td><label id="usernameinf">用户名</label></td>
				<td><input class="base-input" id="name" name="name"></td>
			</tr>
			<tr>
				<td><label>密码</label></td>
				<td><input type="password" class="base-input" name="password"></td>
			</tr>
			<tr>
	            <td><label>验证码</label></td>        
	            <td class="width70"><input name="imageCode" type="text" class="imagecode" /></td>
	        </tr>
			<tr>
				<td colspan="2"><input type="submit" class="submit" value="登录">
					&nbsp;&nbsp;<a href=""""),_display_(Seq[Any](/*26.28*/routes/*26.34*/.User.register)),format.raw/*26.48*/("""">注册</a>
				</td>
			</tr>
		</table>
		<div class="otheruser">
			
		</div>
		""")))})),format.raw/*33.4*/("""
		
		
		
	
	
""")))})))}
    }
    
    def render(loginForm:Form[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 10:21:03 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/login.scala.html
                    HASH: 27fd9f48f7b684643446988abfd81781c9c5b0a7
                    MATRIX: 615->1|796->36|824->91|861->94|877->102|915->103|1078->231|1112->256|1151->257|1733->803|1748->809|1784->823|1903->911
                    LINES: 20->1|26->1|27->4|28->5|28->5|28->5|33->10|33->10|33->10|49->26|49->26|49->26|56->33
                    -- GENERATED --
                */
            