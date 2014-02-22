
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
object addRecord extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("message")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
	<div class="content-link">
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*9.17*/controllers/*9.28*/.designer.routes.Designer.designermain)),format.raw/*9.66*/("""">技师管理</a></p>
			<p>预约管理</p>
				<ul>
					<li><a href=""""),_display_(Seq[Any](/*12.20*/controllers/*12.31*/.record.routes.Records.recordmain)),format.raw/*12.64*/("""">预约查看</a></li>
				</ul>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>	
	</div>	
	<div class="content-core">
	"""),_display_(Seq[Any](/*21.3*/form(controllers.record.routes.Records.recordmain)/*21.53*/{_display_(Seq[Any](format.raw/*21.54*/("""
		<table cellpadding="0" cellspacing="0" class="addrecord-table">
			<tr>
				<td width="105px">预约项目</td>
				<td colspan="3">
					<select>
						<option>--美发--</option>
						<option>--护肤--</option>
						<option>--美容--</option>
						<option>--整形--</option>
						<option>--美甲--</option>
						<option>--套餐A--</option>
						<option>--套餐B--</option>
						<option>--套餐C--</option>
					</select>
					<select>
						<option>--请选择--</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>联系号码</td>
				<td colspan="3">
					<input name="">
				</td>
			</tr>
			<tr>
				<td>预计到店时间</td>
				<td colspan="3"><input type="date"></td>
				
			</tr>
			<tr>
				
				<td>预计结束时间</td>
				<td colspan="3"><input type="date"></td>
			</tr>
			<tr>
				<td>指定技师</td>
				<td colspan="3">
					<input type="radio" name="serviceDesigner" value="" id="juanfa"><label for="juanfa">tomly</label>
					<input type="radio" name="serviceDesigner" value="" id="juanfa"><label for="juanfa">sara</label>
					<input type="radio" name="serviceDesigner" value="" id="juanfa"><label for="juanfa">kven</label>
				</td>
			</tr>
			<tr>
				<td>会员留言</td>
				<td><textarea rols="4" cols="20"></textarea></td>
			</tr>
			<tr>
				<td>总计</td>
				<td colspan="3">
					<input disabled="disabled" value="￥800.00">
				</td>
			</tr>
			<tr>
				<td></td>
				<td colspan="3">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	""")))})),format.raw/*82.3*/("""	
	</div>		
""")))})),format.raw/*84.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 21 14:07:24 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/addRecord.scala.html
                    HASH: e9763025257a0612890eb3e66fa8201cc85e83ba
                    MATRIX: 567->1|730->18|758->73|795->76|818->91|856->92|1086->287|1105->298|1164->336|1261->397|1281->408|1336->441|1758->828|1817->878|1856->879|3376->2368|3422->2383
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|34->12|34->12|34->12|43->21|43->21|43->21|104->82|106->84
                    -- GENERATED --
                */
            