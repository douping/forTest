
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
			"""),_display_(Seq[Any](/*7.5*/views/*7.10*/.html.designer.designerNav())),format.raw/*7.38*/("""
		</div>
		<div class="content-core">
			<h1>我的技师页面</h1>
			技师ID<input name="designerId"/>&nbsp;&nbsp;&nbsp;<input type="button" value="搜索">
			<table cellspacing="0">
				<tr>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*17.19*/controllers/*17.30*/.designer.routes.Designer.designerview)),format.raw/*17.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
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
                    DATE: Tue Feb 25 10:41:28 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designermain.scala.html
                    HASH: 8ca1ecbc1423201197810a114d4497a852d06114
                    MATRIX: 572->1|735->18|763->73|800->76|823->91|861->92|931->128|944->133|993->161|1270->402|1290->413|1350->451|1744->809|1764->820|1824->858|2218->1216|2238->1227|2298->1265
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|29->7|29->7|29->7|39->17|39->17|39->17|50->28|50->28|50->28|61->39|61->39|61->39
                    -- GENERATED --
                */
            