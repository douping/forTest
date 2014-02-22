
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
				<li><a href=""""),_display_(Seq[Any](/*12.19*/controllers/*12.30*/.designer.routes.Designer.designersearch)),format.raw/*12.70*/("""">技师搜索</a></li>
			</ul>
			<p><a href=""""),_display_(Seq[Any](/*14.17*/controllers/*14.28*/.record.routes.Records.recordmain)),format.raw/*14.61*/("""">预约管理</a></p>
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
								<a href=""""),_display_(Seq[Any](/*29.19*/controllers/*29.30*/.designer.routes.Designer.designerview)),format.raw/*29.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
								<a href=""""),_display_(Seq[Any](/*40.19*/controllers/*40.30*/.designer.routes.Designer.designerview)),format.raw/*40.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
								<a href=""""),_display_(Seq[Any](/*51.19*/controllers/*51.30*/.designer.routes.Designer.designerview)),format.raw/*51.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
                    DATE: Thu Feb 20 15:41:23 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designermain.scala.html
                    HASH: d2a91976723e434dc00912fc5beb0f691a9872e2
                    MATRIX: 572->1|735->18|763->73|800->76|823->91|861->92|1092->288|1111->299|1170->337|1249->380|1269->391|1329->429|1400->464|1420->475|1482->515|1561->558|1581->569|1636->602|2246->1176|2266->1187|2326->1225|2720->1583|2740->1594|2800->1632|3194->1990|3214->2001|3274->2039
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|33->11|33->11|33->11|34->12|34->12|34->12|36->14|36->14|36->14|51->29|51->29|51->29|62->40|62->40|62->40|73->51|73->51|73->51
                    -- GENERATED --
                */
            