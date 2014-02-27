
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
object selectDesignerRecord extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("message")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
		<div class="content-link">
			"""),_display_(Seq[Any](/*7.5*/views/*7.10*/.html.record.recordMenu())),format.raw/*7.35*/("""
		</div>
		<div class="content-core">
			<h1>技师日程查看</h1>
			技师ID<input name="designerId"/>&nbsp;&nbsp;&nbsp;<input type="button" value="搜索" />
			<table cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*17.19*/controllers/*17.30*/.designer.routes.Designer.designerTask)),format.raw/*17.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<a href=""""),_display_(Seq[Any](/*22.18*/controllers/*22.29*/.designer.routes.Designer.designerTask)),format.raw/*22.67*/(""""><p><input type="button" value="查看日程"></p></a>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*28.19*/controllers/*28.30*/.designer.routes.Designer.designerTask)),format.raw/*28.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<p><input type="button" value="查看日程"></p>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*39.19*/controllers/*39.30*/.designer.routes.Designer.designerTask)),format.raw/*39.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<div>10年後20年後も綺麗でいてもらうために☆</div>
							<p><input type="button" value="查看日程"></p>
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
                    DATE: Wed Feb 26 10:21:04 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/selectDesignerRecord.scala.html
                    HASH: ec9e6eb59b0218ed7007ad41de843507a5ec3d7c
                    MATRIX: 609->1|772->18|800->73|837->76|860->91|898->92|968->128|981->133|1027->158|1322->417|1342->428|1402->466|1681->709|1701->720|1761->758|1928->889|1948->900|2008->938|2402->1296|2422->1307|2482->1345
                    LINES: 20->1|26->1|27->4|28->5|28->5|28->5|30->7|30->7|30->7|40->17|40->17|40->17|45->22|45->22|45->22|51->28|51->28|51->28|62->39|62->39|62->39
                    -- GENERATED --
                */
            