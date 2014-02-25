
package views.html.designer

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
object designerNav extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
		<ul>
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*7.17*/controllers/*7.28*/.designer.routes.Designer.designermain)),format.raw/*7.66*/("""">技师管理</a></p>
			<ul>
				<li><a href=""""),_display_(Seq[Any](/*9.19*/controllers/*9.30*/.designer.routes.Designer.designermain)),format.raw/*9.68*/("""">我的技师</a></li>
			</ul>
			<p><a href=""""),_display_(Seq[Any](/*11.17*/controllers/*11.28*/.record.routes.Records.recordmain)),format.raw/*11.61*/("""">预约管理</a></p>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>
		</ul>	
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 25 10:47:16 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerNav.scala.html
                    HASH: 0ae1301c1ad6e91938afd9cf6f3285c632b0e664
                    MATRIX: 564->1|659->3|698->8|714->16|752->17|961->191|980->202|1039->240|1117->283|1136->294|1195->332|1274->375|1294->386|1349->419
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|30->9|30->9|30->9|32->11|32->11|32->11
                    -- GENERATED --
                */
            