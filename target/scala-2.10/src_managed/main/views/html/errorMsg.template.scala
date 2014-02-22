
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
object errorMsg extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Record],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(error:Form[Record]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""

<p>"""),_display_(Seq[Any](/*3.5*/error)),format.raw/*3.10*/("""</p>"""))}
    }
    
    def render(error:Form[Record]): play.api.templates.HtmlFormat.Appendable = apply(error)
    
    def f:((Form[Record]) => play.api.templates.HtmlFormat.Appendable) = (error) => apply(error)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 17:59:29 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/errorMsg.scala.html
                    HASH: 6d5c8b6823d24be9f596b8fdca992f0b3fa02353
                    MATRIX: 565->1|679->21|721->29|747->34
                    LINES: 19->1|22->1|24->3|24->3
                    -- GENERATED --
                */
            