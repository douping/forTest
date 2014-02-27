
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
					<option value="2">过期</option>
					<option value="0">预约</option>
					<option value="1">完成消费</option>
					<option value="-1">取消</option>
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
		<input type="button" value="返回预约履历" onclick="window.location.href='"""),_display_(Seq[Any](/*59.71*/controllers/*59.82*/.record.routes.Records.recordmain(1))),format.raw/*59.118*/("""';"/>
		<input type="submit" value="提交">
		""")))})),format.raw/*61.4*/("""
	</div>
""")))})))}
    }
    
    def render(record:Form[Record]): play.api.templates.HtmlFormat.Appendable = apply(record)
    
    def f:((Form[Record]) => play.api.templates.HtmlFormat.Appendable) = (record) => apply(record)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 13:46:47 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/createrecord.scala.html
                    HASH: 1c3a5c89ef2ee529ac99cc587fa0a7c30163b193
                    MATRIX: 607->1|774->22|802->77|839->80|862->95|900->96|989->151|1052->206|1090->207|2379->1460|2399->1471|2458->1507|2535->1553
                    LINES: 20->1|26->1|27->4|28->5|28->5|28->5|32->9|32->9|32->9|82->59|82->59|82->59|84->61
                    -- GENERATED --
                */
            