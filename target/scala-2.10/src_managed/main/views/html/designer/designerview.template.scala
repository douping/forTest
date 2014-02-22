
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
object designerview extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("message")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
<div class="content-link">
	<p>
		<a href="my_salon.html" target="salon_main">我的店铺</a>
	</p>
	<p>
		<a href="basic_info_control.html" target="salon_main">基本信息管理</a>
	</p>
	<p>
		<a href=""""),_display_(Seq[Any](/*14.13*/controllers/*14.24*/.designer.routes.Designer.designermain)),format.raw/*14.62*/("""">技师管理</a>
	</p>
	<ul>
		<li><a href=""""),_display_(Seq[Any](/*17.17*/controllers/*17.28*/.designer.routes.Designer.designermain)),format.raw/*17.66*/("""">我的技师</a></li>
		<li><a
			href=""""),_display_(Seq[Any](/*19.11*/controllers/*19.22*/.designer.routes.Designer.designersearch)),format.raw/*19.62*/("""">技师搜索</a></li>
	</ul>
	<p>
		<a href=""""),_display_(Seq[Any](/*22.13*/controllers/*22.24*/.record.routes.Records.recordmain)),format.raw/*22.57*/("""">预约管理</a>
	</p>
	<p>
		<a href="#" target="salon_main">评论管理</a>
	</p>
	<p>
		<a href="service_control.html" target="salon_main">服务管理</a>
	</p>
	<p>
		<a href="#" target="salon_main">优惠劵管理</a>
	</p>
	<p>
		<a href="trend_control.html" target="salon_main">动态管理</a>
	</p>
	<p>
		<a href="#" target="salon_main">店铺装修</a>
	</p>
</div>
<div class="content-core">
	<div class="designerview-main">
		<p>美发师</p>
		<p>技师.name</p>
		<div>
			<img
				src="http://imgbp.hotp.jp/CSP/IMG_SRC/19/34/B003961934/B003961934_164-219.jpg" />
		</div>
		<div>
			<a
				href="http://beauty.hotpepper.jp/CSP/bt/reserve/?storeId=H000231733&amp;stylistId=T000188298">签约</a>
		</div>
		<p>
			<a href="#">收藏此技师</a>
		</p>
	</div>
	<div class="designerview-body">
	<div>	
		<h2>技师风格</h2>
		<div>
			<p>技师个人 描述的内容：</p>
			<p>为了有一个美丽的二十年十年☆<br />
拥有高科技的声誉来获得经验的各种沙龙在原宿，青山流行的，<br />
以满足广泛的需求，从可爱的系统清理系统。至于10年后需要一个漂亮的'20中，<br />
我们提出基于自然的事情一处理方法体，尽可能友好。此外，发型和化妆技术也高度重视，<br />
并同时获委任为独家发型化妆师24hcosme。</p>
		</div>
		<p>风格说明</p>
		
		<table cellspacing="0" class="w746">
			<tr>
				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/13/37/B004181337/B004181337_89-119.jpg" /></a>
						<p>
							<a href="#">擅长风格</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/13/37/B004181337/B004181337_89-119.jpg" /></a>
						<p>
							<a href="#">擅长风格</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/13/37/B004181337/B004181337_89-119.jpg" /></a>
						<p>
							<a href="#">擅长风格</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/13/37/B004181337/B004181337_89-119.jpg" /></a>
						<p>
							<a href="#">擅长风格</a>
						</p>
					</div>
				</td>
			</tr>
		</table>	
	</div>
	<div>
		<table border="1px solid black" cellspacing="0" cellpadding="0">
			<tr>
				<td width="150px">从业年数</td>
				<td width="280px">....</td>
			</tr>
			<tr>
				<td>善于风格</td>
				<td>....</td>
			</tr>
			<tr>
				<td>擅长技术</td>
				<td>....</td>
			</tr>
			<tr>
				<td>个人喜好</td>
				<td>....</td>
			</tr>
		</table>
	</div>
	<div style="width:430px;height:150px;border:1px solid black;">
		<p>技师博客</p>
		<div>
			<p>博客内容</p>
		</div>
	</div>
	<div>
		<p>技师作品</p>
		<table cellspacing="0" class="w746">
			<tr>
				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/66/16/B004206616/B004206616_154-205.jpg" /></a>
						<p>
							<a href="#">风格类型:如短发</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/66/16/B004206616/B004206616_154-205.jpg" /></a>
						<p>
							<a href="#">风格类型:如短发</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/66/16/B004206616/B004206616_154-205.jpg" /></a>
						<p>
							<a href="#">风格类型:如短发</a>
						</p>
					</div>
				</td>

				<td class="vaT bdGrayR">
					<div>
						<a
							href="#"><img
							src="http://imgbp.hotp.jp/CSP/IMG_SRC/66/16/B004206616/B004206616_154-205.jpg" /></a>
						<p>
							<a href="#">风格类型:如短发</a>
						</p>
					</div>
				</td>
			</tr>
		</table>
	</div>
	</div>
</div>
""")))})),format.raw/*195.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:34:29 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerview.scala.html
                    HASH: 737176273b0e3c93bf5178ab3480cd5f24baeaaa
                    MATRIX: 572->1|736->18|764->74|801->77|824->92|862->93|1096->291|1116->302|1176->340|1254->382|1274->393|1334->431|1407->468|1427->479|1489->519|1568->562|1588->573|1643->606|5378->4309
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|36->14|36->14|36->14|39->17|39->17|39->17|41->19|41->19|41->19|44->22|44->22|44->22|217->195
                    -- GENERATED --
                */
            