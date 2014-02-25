
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
object recordview extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*4.2*/main("message")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""
	<div class="content-link">
			"""),_display_(Seq[Any](/*6.5*/views/*6.10*/.html.record.recordMenu())),format.raw/*6.35*/("""	
	</div>	
	<div class="content-core">
		<h2>预约详情</h2>
		<table border="1px solid black" cellspacing="0" cellpadding="0" class="recordview-table">
			<tr>
				<td>预约编号</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td>顾客留言</td>
				<td colspan="3"></td>
				
			</tr>
			<tr>
				<td>预计到店时间</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td width="100px">预计结束时间</td>
				<td width="150px"></td>
				<td width="100px">指定技师</td>
				<td width="150px"></td>
			</tr>
			<tr>
				<td>服务项目</td>
				<td colspan="3"></td>
			</tr>
			
			<tr>
				<td>是否用优惠劵</td>
				<td></td>
				<td>优惠劵使用情</td>
				<td></td>
			</tr>
			<tr>
				<td>联系会员</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td>合计金额</td>
				<td colspan="3"></td>
			</tr>
		</table>
		<input type="button" value="返回预约履历" onclick="window.location.href='"""),_display_(Seq[Any](/*50.71*/controllers/*50.82*/.record.routes.Records.recordmain)),format.raw/*50.115*/("""';"/>
		<input type="button" value="取消预约">
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
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordview.scala.html
                    HASH: 5d75205cd568fc3c652ed2c01913386fbac679d0
                    MATRIX: 568->1|731->18|768->74|791->89|829->90|898->125|911->130|957->155|1866->1028|1886->1039|1942->1072
                    LINES: 19->1|25->1|26->4|26->4|26->4|28->6|28->6|28->6|72->50|72->50|72->50
                    -- GENERATED --
                */
            