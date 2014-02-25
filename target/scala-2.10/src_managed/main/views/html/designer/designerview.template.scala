
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
	"""),_display_(Seq[Any](/*7.3*/views/*7.8*/.html.record.recordMenu())),format.raw/*7.33*/("""
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
""")))})),format.raw/*164.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 25 10:41:28 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerview.scala.html
                    HASH: 640c8a7907042a140e419edf021654b37d9a8151
                    MATRIX: 572->1|736->18|764->74|801->77|824->92|862->93|928->125|940->130|986->155|4382->3519
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|29->7|29->7|29->7|186->164
                    -- GENERATED --
                */
            