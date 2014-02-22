
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
object designermain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
			<ul>
				<li><a href=""""),_display_(Seq[Any](/*11.19*/controllers/*11.30*/.designer.routes.Designer.designermain)),format.raw/*11.68*/("""">我的技师</a></li>
			</ul>
			<p><a href=""""),_display_(Seq[Any](/*13.17*/controllers/*13.28*/.record.routes.Records.recordmain)),format.raw/*13.61*/("""">预约管理</a></p>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>
		</div>
		<div class="content-core">
			<h1>我的技师页面</h1>
			技师ID<input name="designerId"/>&nbsp;&nbsp;&nbsp;<input type="button" value="添加技师">
			<table cellspacing="0">
				<tr>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*28.19*/controllers/*28.30*/.designer.routes.Designer.designerview)),format.raw/*28.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
								<a href=""""),_display_(Seq[Any](/*39.19*/controllers/*39.30*/.designer.routes.Designer.designerview)),format.raw/*39.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
								<a href=""""),_display_(Seq[Any](/*50.19*/controllers/*50.30*/.designer.routes.Designer.designerview)),format.raw/*50.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
                    DATE: Fri Feb 21 14:29:35 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designermain.scala.html
                    HASH: 8d04844191d1b65d3e93b73caae24c7e979d50fc
                    MATRIX: 572->1|735->18|763->73|800->76|823->91|861->92|1092->288|1111->299|1170->337|1249->380|1269->391|1329->429|1408->472|1428->483|1483->516|2093->1090|2113->1101|2173->1139|2567->1497|2587->1508|2647->1546|3041->1904|3061->1915|3121->1953
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|33->11|33->11|33->11|35->13|35->13|35->13|50->28|50->28|50->28|61->39|61->39|61->39|72->50|72->50|72->50
                    -- GENERATED --
                */
            