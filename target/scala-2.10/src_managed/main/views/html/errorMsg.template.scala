
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
                    DATE: Wed Feb 26 10:21:03 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/errorMsg.scala.html
                    HASH: 9168daf91183903a9f563a86a4d0f5e2a2d6cf0f
                    MATRIX: 596->1|710->21|752->29|778->34
                    LINES: 20->1|23->1|25->3|25->3
                    -- GENERATED --
                */
            