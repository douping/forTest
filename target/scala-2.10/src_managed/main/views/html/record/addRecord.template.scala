
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
object addRecord extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
	"""),_display_(Seq[Any](/*10.3*/form(controllers.record.routes.Records.recordmain(1))/*10.56*/{_display_(Seq[Any](format.raw/*10.57*/("""
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
	""")))})),format.raw/*71.3*/("""	
	</div>		
""")))})),format.raw/*73.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 13:46:04 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/addRecord.scala.html
                    HASH: bf5392e547f7c7cf11db631cfd93edaabe8914af
                    MATRIX: 598->1|761->18|789->73|826->76|849->91|887->92|956->127|969->132|1015->157|1093->200|1155->253|1194->254|2714->1743|2760->1758
                    LINES: 20->1|26->1|27->4|28->5|28->5|28->5|30->7|30->7|30->7|33->10|33->10|33->10|94->71|96->73
                    -- GENERATED --
                */
            