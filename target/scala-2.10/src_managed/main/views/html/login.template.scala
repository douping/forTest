
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
		<h2>��¼</h2>
		<a href="#" id="nameLogin" >�û����½</a>
		<a href="#" id="emailLogin">�����¼</a>
		"""),_display_(Seq[Any](/*10.4*/form(routes.User.tologin)/*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
			<table>
			<tr>
				<td><label id="usernameinf">�û���</label></td>
				<td><input class="base-input" id="name" name="name"></td>
			</tr>
			<tr>
				<td><label>����</label></td>
				<td><input type="password" class="base-input" name="password"></td>
			</tr>
			<tr>
	            <td><label>��֤��</label></td>        
	            <td class="width70"><input name="imageCode" type="text" class="imagecode" /></td>
	        </tr>
			<tr>
				<td colspan="2"><input type="submit" class="submit" value="�ύ">
					&nbsp;&nbsp;<a href=""""),_display_(Seq[Any](/*26.28*/routes/*26.34*/.User.register)),format.raw/*26.48*/("""">ע��</a>
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
                    DATE: Thu Feb 20 19:09:56 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/login.scala.html
                    HASH: 4ae6613ffad391d80d0dffcda82889090de74194
                    MATRIX: 584->1|765->36|793->91|830->94|846->102|884->103|1051->235|1085->260|1124->261|1712->813|1727->819|1763->833|1883->922
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|32->10|32->10|32->10|48->26|48->26|48->26|55->33
                    -- GENERATED --
                */
            