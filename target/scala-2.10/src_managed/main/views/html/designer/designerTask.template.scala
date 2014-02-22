
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
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*9.17*/controllers/*9.28*/.designer.routes.Designer.designermain)),format.raw/*9.66*/("""">技师管理</a></p>
			<p>预约管理</p>
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
		<div>
			<div>
				<p style="float:left;"><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/19/34/B003961934/B003961934_60-80.jpg" oncontextmenu="return false;" /></p>
				<div style="float:left;">
					<p>選択中のスタイリスト</p>
					<p>坂本 隆文</span>　の予約可能日程</p>
					<p><a href=""""),_display_(Seq[Any](/*28.19*/controllers/*28.30*/.record.routes.Records.selectDesignerRecord)),format.raw/*28.73*/("""">其它技师日程查看</a></p>
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
					"""),_display_(Seq[Any](/*121.7*/for(i <- 0 until 21) yield /*121.27*/{_display_(Seq[Any](format.raw/*121.28*/("""
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
						""")))})),format.raw/*136.8*/("""
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
                    DATE: Fri Feb 21 18:44:35 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designerTask.scala.html
                    HASH: e30ea8014c917fceed43c3d6db92aecfeb8fa9bf
                    MATRIX: 572->1|735->18|774->76|791->85|829->86|1059->281|1078->292|1137->330|1234->391|1254->402|1309->435|2024->1114|2044->1125|2109->1168|4332->3355|4369->3375|4409->3376|5051->3986
                    LINES: 19->1|25->1|27->5|27->5|27->5|31->9|31->9|31->9|34->12|34->12|34->12|50->28|50->28|50->28|143->121|143->121|143->121|158->136
                    -- GENERATED --
                */
            