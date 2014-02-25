
package views.html.record

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
object recordMenu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),_display_(Seq[Any](/*2.2*/main("")/*2.10*/{_display_(Seq[Any](format.raw/*2.11*/("""
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*5.17*/controllers/*5.28*/.designer.routes.Designer.designermain)),format.raw/*5.66*/("""">技师管理</a></p>
			<p>预约管理</p>
				<ul>
					<li><a href=""""),_display_(Seq[Any](/*8.20*/controllers/*8.31*/.record.routes.Records.recordmain)),format.raw/*8.64*/("""">预约查看</a></li>
					<li><a href=""""),_display_(Seq[Any](/*9.20*/controllers/*9.31*/.record.routes.Records.selectDesignerRecord)),format.raw/*9.74*/("""">技师日程查看</a></li>
				</ul>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 25 10:34:55 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordMenu.scala.html
                    HASH: 14aaff9bcf998c83674249f4b8cde2aab90e2dd8
                    MATRIX: 561->1|656->3|693->6|709->14|747->15|948->181|967->192|1026->230|1122->291|1141->302|1195->335|1266->371|1285->382|1349->425
                    LINES: 19->1|22->1|23->2|23->2|23->2|26->5|26->5|26->5|29->8|29->8|29->8|30->9|30->9|30->9
                    -- GENERATED --
                */
            