
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
object loginSuccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	<body id="loginsuccess" onload="success();">
    <h2>"""),_display_(Seq[Any](/*5.10*/message)),format.raw/*5.17*/("""</h2>
    <span id="times">5</span>秒后跳转。。。。。。
	</body>
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 10:21:03 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/loginSuccess.scala.html
                    HASH: e6b3cc92a5afcd923562a688ed096656cd53da52
                    MATRIX: 594->1|705->18|744->23|775->46|814->48|907->106|935->113
                    LINES: 20->1|23->1|25->3|25->3|25->3|27->5|27->5
                    -- GENERATED --
                */
            