
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
object selectDesignerRecord extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("message")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
		<div class="content-link">
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*9.17*/controllers/*9.28*/.designer.routes.Designer.designermain)),format.raw/*9.66*/("""">技师管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*10.17*/controllers/*10.28*/.record.routes.Records.recordmain)),format.raw/*10.61*/("""">预约管理</a></p>
			<ul>
					<li><a href=""""),_display_(Seq[Any](/*12.20*/controllers/*12.31*/.record.routes.Records.recordmain)),format.raw/*12.64*/("""">预约查看</a></li>
					<li>技师日程查看</li>
				</ul>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>
		</div>
		<div class="content-core">
			<h1>预约查看</h1>
			技师ID<input name="designerId"/>&nbsp;&nbsp;&nbsp;<input type="button" value="添加技师">
			<table cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*29.19*/controllers/*29.30*/.designer.routes.Designer.designerTask)),format.raw/*29.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<p><input type="button" value="解除绑定"></p>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*40.19*/controllers/*40.30*/.designer.routes.Designer.designerTask)),format.raw/*40.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<p><input type="button" value="解除绑定"></p>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*51.19*/controllers/*51.30*/.designer.routes.Designer.designerTask)),format.raw/*51.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<p><input type="button" value="解除绑定"></p>
						</div>
					</td>			
				</tr>
			</table>
			
		</div>
		
	
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 21 18:40:55 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/selectDesignerRecord.scala.html
                    HASH: 46919d34d42d86ccf342a634d262d6e5827c6502
                    MATRIX: 578->1|741->18|769->73|806->76|829->91|867->92|1098->288|1117->299|1176->337|1244->369|1264->380|1319->413|1399->457|1419->468|1474->501|2132->1123|2152->1134|2212->1172|2606->1530|2626->1541|2686->1579|3080->1937|3100->1948|3160->1986
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|32->10|32->10|32->10|34->12|34->12|34->12|51->29|51->29|51->29|62->40|62->40|62->40|73->51|73->51|73->51
                    -- GENERATED --
                */
            