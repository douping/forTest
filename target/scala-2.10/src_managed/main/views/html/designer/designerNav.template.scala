
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
import org.bson.types.ObjectId
/**/
object designerNav extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
		<ul>
			<li><p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p></li>
			<li><p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p></li>
			<li><p><a href=""""),_display_(Seq[Any](/*7.21*/controllers/*7.32*/.designer.routes.Designer.designermain)),format.raw/*7.70*/("""">技师管理</a></p></li>
			<li><ul>
				<li><a href=""""),_display_(Seq[Any](/*9.19*/controllers/*9.30*/.designer.routes.Designer.designermain)),format.raw/*9.68*/("""">我的技师</a></li>
			</ul></li>
			<li><p><a href=""""),_display_(Seq[Any](/*11.21*/controllers/*11.32*/.record.routes.Records.recordmain(1))),format.raw/*11.68*/("""">预约管理</a></p></li>
			<li><p><a href = "#" target = "salon_main">评论管理</a></p></li>
			<li><p><a href = "service_control.html" target = "salon_main">服务管理</a></p></li>
			<li><p><a href = "#" target = "salon_main">优惠劵管理</a></p></li>
			<li><p><a href = "trend_control.html" target = "salon_main">动态管理</a></p></li>
			<li><p><a href = "#" target = "salon_main">店铺装修</a></p></li>
		</ul>	
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 13:43:34 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerNav.scala.html
                    HASH: fed9229b7a11f2fe8af174dbbf067ff84530250d
                    MATRIX: 595->1|690->3|729->8|745->16|783->17|1014->213|1033->224|1092->262|1179->314|1198->325|1257->363|1345->415|1365->426|1423->462
                    LINES: 20->1|23->1|25->3|25->3|25->3|29->7|29->7|29->7|31->9|31->9|31->9|33->11|33->11|33->11
                    -- GENERATED --
                */
            