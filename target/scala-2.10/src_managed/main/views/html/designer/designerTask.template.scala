
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
object designerTask extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*5.2*/main("s")/*5.11*/{_display_(Seq[Any](format.raw/*5.12*/("""
	<div class="content-link">
			"""),_display_(Seq[Any](/*7.5*/views/*7.10*/.html.record.recordMenu())),format.raw/*7.35*/("""	
	</div>
	<div class="content-core">
		<div>
			<div>
				<p style="float:left;"><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/19/34/B003961934/B003961934_60-80.jpg" oncontextmenu="return false;" /></p>
				<div style="float:left;">
					<p>選択中のスタイリスト</p>
					<p>坂本 隆文</span>　の予約可能日程</p>
					<p><a href=""""),_display_(Seq[Any](/*16.19*/controllers/*16.30*/.record.routes.Records.selectDesignerRecord)),format.raw/*16.73*/("""">其它技师日程查看</a></p>
				</div>
			</div>
	</div>
		
		<table cellpadding="0" cellspacing="0" width="750px" border="1px solid gray">
			<tr>
				<th rowspan="2"><a href="#">《</a></th><th colspan="8">2014年02月</th><th colspan="4">2014年03月</th><th rowspan="2"><a href="#">》</a></th>
			</tr>
			<tr>
				<th class="dayCell">21<br/>周五</th>
				<th class="sat">22<br/>周六</th>
				<th class="sun">23<br/>周末</th>
				<th class="dayCell">24<br/>周一</th>
				<th class="dayCell">25<br/>周二</th>
				<th class="dayCell">26<br/>周三</th>
				<th class="dayCell">27<br/>周四</th>
				<th class="dayCell">28<br/>周五</th>
				<th class="sat">01<br/>周六</th>
				<th class="sun">02<br/>周末</th>
				<th class="dayCell">03<br/>周一</th>
				<th class="dayCell">04<br/>周二</th>
			</tr>
			<tr>
				<th>
					<table cellpadding="0" cellspacing="0" width="100%" border="1px solid gray">
						<tr>
							<th><p>10：00</p></th>
						</tr>
						<tr>
							<th><p>10：30</p></th>
						</tr>
						<tr>
							<th><p>11：00</p></th>
						</tr>
						<tr>
							<th><p>11：30</p></th>
						</tr>
						<tr>
							<th><p>12：00</p></th>
						</tr>
						<tr>
							<th><p>12：30</p></th>
						</tr>
						<tr>
							<th><p>13：00</p></th>
						</tr>
						<tr>
							<th><p>13：30</p></th>
						</tr>
						<tr>
							<th><p>14：00</p></th>
						</tr>
						<tr>
							<th><p>14：30</p></th>
						</tr>
						<tr>
							<th><p>15：00</p></th>
						</tr>
						<tr>
							<th><p>15：30</p></th>
						</tr>
						<tr>
							<th><p>16：00</p></th>
						</tr>
						<tr>
							<th><p>16：30</p></th>
						</tr>
						<tr>
							<th><p>17：00</p></th>
						</tr>
						<tr>
							<th><p>17：30</p></th>
						</tr>
						<tr>
							<th><p>18：00</p></th>
						</tr>
						<tr>
							<th><p>18：30</p></th>
						</tr>
						<tr>
							<th><p>19：00</p></th>
						</tr>
						<tr>
							<th><p>19：30</p></th>
						</tr>
						<tr>
							<th><p>20：00</p></th>
						</tr>
					</table>
				</th>
				<th colspan="12">
					<table cellpadding="0" cellspacing="0" width="100%" height="1080px" class="designerTask">
					"""),_display_(Seq[Any](/*109.7*/for(i <- 0 until 21) yield /*109.27*/{_display_(Seq[Any](format.raw/*109.28*/("""
						<tr>
							<th><a href="#"><span>×</span></a></th>
							<th><a href="#"><span>×</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>×</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>×</span></a></th>
							<th><a href="#"><span>×</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>◎</span></a></th>
							<th><a href="#"><span>×</span></a></th>
						</tr>
						""")))})),format.raw/*124.8*/("""
					</table>
				</th>
				<th>
					<table cellpadding="0" cellspacing="0" width="100%" border="1px solid gray">
						<tr>
							<th><p>10：00</p></th>
						</tr>
						<tr>
							<th><p>10：30</p></th>
						</tr>
						<tr>
							<th><p>11：00</p></th>
						</tr>
						<tr>
							<th><p>11：30</p></th>
						</tr>
						<tr>
							<th><p>12：00</p></th>
						</tr>
						<tr>
							<th><p>12：30</p></th>
						</tr>
						<tr>
							<th><p>13：00</p></th>
						</tr>
						<tr>
							<th><p>13：30</p></th>
						</tr>
						<tr>
							<th><p>14：00</p></th>
						</tr>
						<tr>
							<th><p>14：30</p></th>
						</tr>
						<tr>
							<th><p>15：00</p></th>
						</tr>
						<tr>
							<th><p>15：30</p></th>
						</tr>
						<tr>
							<th><p>16：00</p></th>
						</tr>
						<tr>
							<th><p>16：30</p></th>
						</tr>
						<tr>
							<th><p>17：00</p></th>
						</tr>
						<tr>
							<th><p>17：30</p></th>
						</tr>
						<tr>
							<th><p>18：00</p></th>
						</tr>
						<tr>
							<th><p>18：30</p></th>
						</tr>
						<tr>
							<th><p>19：00</p></th>
						</tr>
						<tr>
							<th><p>19：30</p></th>
						</tr>
						<tr>
							<th><p>20：00</p></th>
						</tr>
					</table>
				</th>
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
                    DATE: Tue Feb 25 10:35:35 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerTask.scala.html
                    HASH: 99212c698b96bad43caa0663d1625bac20a2eea2
                    MATRIX: 572->1|735->18|774->76|791->85|829->86|898->121|911->126|957->151|1307->465|1327->476|1392->519|3615->2706|3652->2726|3692->2727|4334->3337
                    LINES: 19->1|25->1|27->5|27->5|27->5|29->7|29->7|29->7|38->16|38->16|38->16|131->109|131->109|131->109|146->124
                    -- GENERATED --
                */
            