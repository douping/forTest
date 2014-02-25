
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
                    DATE: Tue Feb 25 10:29:06 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/selectDesignerRecord.scala.html
                    HASH: 67459270aebf6e74a7e3aa0a031164a753741692
                    MATRIX: 578->1|741->18|769->73|806->76|829->91|867->92|937->128|950->133|996->158|1291->417|1311->428|1371->466|1650->709|1670->720|1730->758|1897->889|1917->900|1977->938|2371->1296|2391->1307|2451->1345
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|29->7|29->7|29->7|39->17|39->17|39->17|44->22|44->22|44->22|50->28|50->28|50->28|61->39|61->39|61->39
                    -- GENERATED --
                */
            