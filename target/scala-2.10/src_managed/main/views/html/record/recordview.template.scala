
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
object recordview extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Record,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(re:Record):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.13*/("""
"""),_display_(Seq[Any](/*4.2*/main("message")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""
	<div class="content-link">
			"""),_display_(Seq[Any](/*6.5*/views/*6.10*/.html.record.recordMenu())),format.raw/*6.35*/("""	
	</div>	
	<div class="content-core">
		<h2>预约详情</h2>
		<table border="1px solid black" cellspacing="0" cellpadding="0" class="recordview-table">
			<tr>
				<td>预约编号</td>
				<td colspan="3">"""),_display_(Seq[Any](/*13.22*/re/*13.24*/.id)),format.raw/*13.27*/("""</td>
			</tr>
			<tr>
				<td>顾客留言</td>
				<td colspan="3">"""),_display_(Seq[Any](/*17.22*/re/*17.24*/.userLeaveMessage)),format.raw/*17.41*/("""</td>
				
			</tr>
			<tr>
				<td width="100px">预计到店时间</td>
				<td width="150px">"""),_display_(Seq[Any](/*22.24*/re/*22.26*/.serviceStart.format("yyyy-MM-dd hh:mm"))),format.raw/*22.66*/("""</td>
				<td width="100px">预计结束时间</td>
				<td width="150px">"""),_display_(Seq[Any](/*24.24*/re/*24.26*/.serviceEnd.format("yyyy-MM-dd hh:mm"))),format.raw/*24.64*/("""</td>
			</tr>
			<tr>
				<td>指定技师</td>
				<td colspan="3">"""),_display_(Seq[Any](/*28.22*/re/*28.24*/.serviceDesigner)),format.raw/*28.40*/("""</td>
			</tr>
			<tr>
				<td>服务项目</td>
				<td colspan="3">"""),_display_(Seq[Any](/*32.22*/re/*32.24*/.serviceItem)),format.raw/*32.36*/("""</td>
			</tr>
			
			<tr>
				<td>是否用优惠劵</td>
				<td></td>
				<td>优惠劵使用情</td>
				<td></td>
			</tr>
			<tr>
				<td>联系会员</td>
				<td colspan="3">"""),_display_(Seq[Any](/*43.22*/re/*43.24*/.userPhone)),format.raw/*43.34*/("""</td>
			</tr>
			<tr>
				<td>合计金额</td>
				<td colspan="3">"""),_display_(Seq[Any](/*47.22*/re/*47.24*/.costTotal)),format.raw/*47.34*/("""</td>
			</tr>
		</table>
		<input type="button" value="返回预约履历" onclick="window.location.href='"""),_display_(Seq[Any](/*50.71*/controllers/*50.82*/.record.routes.Records.recordmain(1))),format.raw/*50.118*/("""';"/>
		<input type="button" value="取消预约" onclick="window.location.href='"""),_display_(Seq[Any](/*51.69*/controllers/*51.80*/.record.routes.Records.cancelRecord(re.id))),format.raw/*51.122*/("""';"/>
	</div>
""")))})))}
    }
    
    def render(re:Record): play.api.templates.HtmlFormat.Appendable = apply(re)
    
    def f:((Record) => play.api.templates.HtmlFormat.Appendable) = (re) => apply(re)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 13:47:14 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordview.scala.html
                    HASH: 25ecd2837e37adf69dd8fcf302ee5f35e451b4af
                    MATRIX: 599->1|756->12|793->68|816->83|854->84|923->119|936->124|982->149|1219->350|1230->352|1255->355|1357->421|1368->423|1407->440|1533->530|1544->532|1606->572|1707->637|1718->639|1778->677|1880->743|1891->745|1929->761|2031->827|2042->829|2076->841|2274->1003|2285->1005|2317->1015|2419->1081|2430->1083|2462->1093|2597->1192|2617->1203|2676->1239|2787->1314|2807->1325|2872->1367
                    LINES: 20->1|26->1|27->4|27->4|27->4|29->6|29->6|29->6|36->13|36->13|36->13|40->17|40->17|40->17|45->22|45->22|45->22|47->24|47->24|47->24|51->28|51->28|51->28|55->32|55->32|55->32|66->43|66->43|66->43|70->47|70->47|70->47|73->50|73->50|73->50|74->51|74->51|74->51
                    -- GENERATED --
                */
            