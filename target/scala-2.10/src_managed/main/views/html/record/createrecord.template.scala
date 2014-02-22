
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
object createrecord extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Record],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(record:Form[Record]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("message")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
		
	<div class="content-core">
		<h2>预约详情</h2>
		"""),_display_(Seq[Any](/*9.4*/form(controllers.record.routes.Records.toCreateRecords)/*9.59*/{_display_(Seq[Any](format.raw/*9.60*/("""
		<table border="1px solid black" cellspacing="0" cellpadding="0" class="recordview-table">
			<tr>
				<td width="100px">店铺</td>
				<td width="600px"><input name="store"></td>
			</tr>
			
			<tr>
				<td>预约状态</td>
				<td><select name="serviceStatus">
					<option value="1">过期</option>
					<option value="2">预约</option>
					<option value="3">取消</option>
				</select></td>
			</tr>
			<tr>
				<td>开始日期</td>
				<td><input type="date" name="serviceStart"></td>
			</tr>
			<tr>
				<td>结束日期</td>
				<td><input type="date" name="serviceEnd"></td>
			</tr>
			<tr>
				<td>指定人员</td>
				<td><input type="checkbox" name="serviceDesigner" value="zhangsan">张三</td>
			</tr>
			
			<tr>
				<td>服务项目</td>
				<td><input type="checkbox" name="serviceItem" value="spa">spa</td>
			</tr>
			<tr>
				<td>会员名</td>
				<td><input name="userName"></td>
			</tr>
			<tr>
				<td>会员号码</td>
				<td><input name="userPhone"></td>
			</tr>
			<tr>
				<td>会员留言</td>
				<td><input name="userLeaveMessage"></td>
			</tr>
			<tr>
				<td>合计金额</td>
				<td><input name="costTotal"></td>
			</tr>
		</table>
		<input type="button" value="返回预约履历" onclick="window.location.href='"""),_display_(Seq[Any](/*58.71*/controllers/*58.82*/.record.routes.Records.recordmain)),format.raw/*58.115*/("""';"/>
		<input type="submit" value="提交">
		""")))})),format.raw/*60.4*/("""
	</div>
""")))})))}
    }
    
    def render(record:Form[Record]): play.api.templates.HtmlFormat.Appendable = apply(record)
    
    def f:((Form[Record]) => play.api.templates.HtmlFormat.Appendable) = (record) => apply(record)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 18:06:51 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/createrecord.scala.html
                    HASH: 3077730c83b4b9124403e3b61025b71ea7a2f066
                    MATRIX: 576->1|743->22|771->77|808->80|831->95|869->96|958->151|1021->206|1059->207|2309->1421|2329->1432|2385->1465|2462->1511
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|80->58|80->58|80->58|82->60
                    -- GENERATED --
                */
            