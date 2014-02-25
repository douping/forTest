
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
object recordmain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Record],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(records:List[Record],count:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.35*/("""
"""),_display_(Seq[Any](/*4.2*/main("s")/*4.11*/{_display_(Seq[Any](format.raw/*4.12*/("""
	<div class="content-link">
			"""),_display_(Seq[Any](/*6.5*/views/*6.10*/.html.record.recordMenu())),format.raw/*6.35*/("""
	</div>	
	<div class="content-core">
		<p>总计<span>"""),_display_(Seq[Any](/*9.15*/count)),format.raw/*9.20*/("""</span>个预约</p>
		<div>                           
                                         开始日期：<input type="date">&nbsp;&nbsp;
                                        
                                          技师名：<input name="date" style="width:70px;"> &nbsp;&nbsp;
            	服务状态：<select>
            		<option value="0">预约中 </option>
            		<option value="1">已消费</option>
            		<option value="2">已过期</option>
            		<option value="-1">已取消</option>
            	</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                               
            <input type="button" value="搜索" onclick="toPage(1);"/>
           
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
            <a href=""""),_display_(Seq[Any](/*24.23*/controllers/*24.34*/.record.routes.Records.addRecord)),format.raw/*24.66*/("""">添加预约</a>
        </div>
		<table id="recordmain" border="1px solid black" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<td>预约号</td>
					<td>预计到店时间</td>
					<td>预计结束时间</td>
					<td>服务项目</td>
					<td>预约会员名</td>
					<td>会员联系</td>
					<td>指定技师</td>
					<td>状态</td>
					<td>总计收费</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				"""),_display_(Seq[Any](/*42.6*/records/*42.13*/.map/*42.17*/{re=>_display_(Seq[Any](format.raw/*42.22*/("""
				<tr>
					<td><a href=""""),_display_(Seq[Any](/*44.20*/controllers/*44.31*/.record.routes.Records.recordview)),format.raw/*44.64*/("""">"""),_display_(Seq[Any](/*44.67*/re/*44.69*/.id)),format.raw/*44.72*/("""</a></td>                        
					<td>"""),_display_(Seq[Any](/*45.11*/re/*45.13*/.serviceStart.format("yyyy-MM-dd hh:mm"))),format.raw/*45.53*/("""</td>
					<td>"""),_display_(Seq[Any](/*46.11*/re/*46.13*/.serviceEnd.format("yyyy-MM-dd hh:mm"))),format.raw/*46.51*/("""</td>
					<td>"""),_display_(Seq[Any](/*47.11*/re/*47.13*/.serviceItem)),format.raw/*47.25*/("""</td>
					<td>"""),_display_(Seq[Any](/*48.11*/re/*48.13*/.userName)),format.raw/*48.22*/("""</td>
					<td>"""),_display_(Seq[Any](/*49.11*/re/*49.13*/.userPhone)),format.raw/*49.23*/("""</td>
					<td>"""),_display_(Seq[Any](/*50.11*/re/*50.13*/.serviceDesigner)),format.raw/*50.29*/("""</td>
					
						<td id="service-status">
						"""),_display_(Seq[Any](/*53.8*/if(re.serviceStatus==1)/*53.31*/{_display_(Seq[Any](format.raw/*53.32*/("""
						已过期
						""")))})),format.raw/*55.8*/("""
						"""),_display_(Seq[Any](/*56.8*/if(re.serviceStatus==2)/*56.31*/{_display_(Seq[Any](format.raw/*56.32*/("""
						预约中	
						""")))})),format.raw/*58.8*/("""
						"""),_display_(Seq[Any](/*59.8*/if(re.serviceStatus==0)/*59.31*/{_display_(Seq[Any](format.raw/*59.32*/("""
						已消费
						""")))})),format.raw/*61.8*/("""
					</td>
					<td>"""),_display_(Seq[Any](/*63.11*/re/*63.13*/.costTotal)),format.raw/*63.23*/("""</td>
					<td>
					<a href="#">取消</a>&nbsp;<a href="#">过期</a>&nbsp;<a href="#">已完成</a>
					
					</td>
				</tr>
				""")))})),format.raw/*69.6*/("""
			</tbody>
		</table>
	</div>
""")))})),format.raw/*73.2*/("""
"""))}
    }
    
    def render(records:List[Record],count:Long): play.api.templates.HtmlFormat.Appendable = apply(records,count)
    
    def f:((List[Record],Long) => play.api.templates.HtmlFormat.Appendable) = (records,count) => apply(records,count)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 25 10:34:55 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordmain.scala.html
                    HASH: ea31a429afe05269921c6c1c0a695bd7cd05a0b2
                    MATRIX: 579->1|758->34|795->90|812->99|850->100|919->135|932->140|978->165|1068->220|1094->225|1881->976|1901->987|1955->1019|2365->1394|2381->1401|2394->1405|2437->1410|2504->1441|2524->1452|2579->1485|2618->1488|2629->1490|2654->1493|2735->1538|2746->1540|2808->1580|2861->1597|2872->1599|2932->1637|2985->1654|2996->1656|3030->1668|3083->1685|3094->1687|3125->1696|3178->1713|3189->1715|3221->1725|3274->1742|3285->1744|3323->1760|3411->1813|3443->1836|3482->1837|3533->1857|3577->1866|3609->1889|3648->1890|3700->1911|3744->1920|3776->1943|3815->1944|3866->1964|3926->1988|3937->1990|3969->2000|4127->2127|4195->2164
                    LINES: 19->1|25->1|26->4|26->4|26->4|28->6|28->6|28->6|31->9|31->9|46->24|46->24|46->24|64->42|64->42|64->42|64->42|66->44|66->44|66->44|66->44|66->44|66->44|67->45|67->45|67->45|68->46|68->46|68->46|69->47|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|72->50|72->50|72->50|75->53|75->53|75->53|77->55|78->56|78->56|78->56|80->58|81->59|81->59|81->59|83->61|85->63|85->63|85->63|91->69|95->73
                    -- GENERATED --
                */
            