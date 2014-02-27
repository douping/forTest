
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
import org.bson.types.ObjectId
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
					<li><a href=""""),_display_(Seq[Any](/*8.20*/controllers/*8.31*/.record.routes.Records.recordmain(1))),format.raw/*8.67*/("""">预约查看</a></li>
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
                    DATE: Wed Feb 26 13:43:34 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordMenu.scala.html
                    HASH: 2a2d3266917e742a2b5ae84dc9d6d87e4750e04d
                    MATRIX: 592->1|687->3|724->6|740->14|778->15|979->181|998->192|1057->230|1153->291|1172->302|1229->338|1300->374|1319->385|1383->428
                    LINES: 20->1|23->1|24->2|24->2|24->2|27->5|27->5|27->5|30->8|30->8|30->8|31->9|31->9|31->9
                    -- GENERATED --
                */
            