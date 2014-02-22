
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
			<p><a href = "my_salon.html" target = "salon_main">我的店铺</a></p>
			<p><a href = "basic_info_control.html" target = "salon_main">基本信息管理</a></p>
			<p><a href=""""),_display_(Seq[Any](/*8.17*/controllers/*8.28*/.designer.routes.Designer.designermain)),format.raw/*8.66*/("""">技师管理</a></p>
			<p>预约管理</p>
				<ul>
					<li><a href=""""),_display_(Seq[Any](/*11.20*/controllers/*11.31*/.record.routes.Records.recordmain)),format.raw/*11.64*/("""">预约查看</a></li>
				</ul>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>	
	</div>	
	<div class="content-core">
		<p>总计<span>"""),_display_(Seq[Any](/*20.15*/count)),format.raw/*20.20*/("""</span>个预约</p>
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
            
            <input type="button" value="添加预约">
        </div>
		<table border="1px solid black" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<td>预约号</td>
					<td>预计到店时间</td>
					<td>预计结束时间</td>
					<td>服务项目</td>
					<td>预约会员名</td>
					<td>会员联系</td>
					<td>指定设计师</td>
					<td>状态</td>
					<td>总计收费</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				"""),_display_(Seq[Any](/*53.6*/records/*53.13*/.map/*53.17*/{re=>_display_(Seq[Any](format.raw/*53.22*/("""
				<tr>
					<td><a href=""""),_display_(Seq[Any](/*55.20*/controllers/*55.31*/.record.routes.Records.recordview)),format.raw/*55.64*/("""">"""),_display_(Seq[Any](/*55.67*/re/*55.69*/.id)),format.raw/*55.72*/("""</a></td>                        
					<td>"""),_display_(Seq[Any](/*56.11*/re/*56.13*/.serviceStart)),format.raw/*56.26*/("""</td>
					<td>"""),_display_(Seq[Any](/*57.11*/re/*57.13*/.serviceEnd)),format.raw/*57.24*/("""</td>
					<td>"""),_display_(Seq[Any](/*58.11*/re/*58.13*/.serviceItem)),format.raw/*58.25*/("""</td>
					<td>"""),_display_(Seq[Any](/*59.11*/re/*59.13*/.userName)),format.raw/*59.22*/("""</td>
					<td>"""),_display_(Seq[Any](/*60.11*/re/*60.13*/.userPhone)),format.raw/*60.23*/("""</td>
					<td>"""),_display_(Seq[Any](/*61.11*/re/*61.13*/.serviceDesigner)),format.raw/*61.29*/("""</td>
					
						<td>
						"""),_display_(Seq[Any](/*64.8*/if(re.serviceStatus==1)/*64.31*/{_display_(Seq[Any](format.raw/*64.32*/("""
						已过期
						""")))})),format.raw/*66.8*/("""
						"""),_display_(Seq[Any](/*67.8*/if(re.serviceStatus==2)/*67.31*/{_display_(Seq[Any](format.raw/*67.32*/("""
						预约中	
						""")))})),format.raw/*69.8*/("""
						"""),_display_(Seq[Any](/*70.8*/if(re.serviceStatus==0)/*70.31*/{_display_(Seq[Any](format.raw/*70.32*/("""
						已消费
						""")))})),format.raw/*72.8*/("""
					</td>
					<td>"""),_display_(Seq[Any](/*74.11*/re/*74.13*/.costTotal)),format.raw/*74.23*/("""</td>
					<td>
					<input type="button" onclick='window.location.href="#";' value="取消预约"/>&nbsp;
					
					</td>
				</tr>
				""")))})),format.raw/*80.6*/("""
			</tbody>
		</table>
	</div>
""")))})),format.raw/*84.2*/("""
"""))}
    }
    
    def render(records:List[Record],count:Long): play.api.templates.HtmlFormat.Appendable = apply(records,count)
    
    def f:((List[Record],Long) => play.api.templates.HtmlFormat.Appendable) = (records,count) => apply(records,count)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 21 08:40:58 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordmain.scala.html
                    HASH: 9d8b3126d00ddb8fb9af4af9e8359adc3008d30c
                    MATRIX: 579->1|758->34|795->90|812->99|850->100|1080->295|1099->306|1158->344|1255->405|1275->416|1330->449|1765->848|1792->853|2952->1978|2968->1985|2981->1989|3024->1994|3091->2025|3111->2036|3166->2069|3205->2072|3216->2074|3241->2077|3322->2122|3333->2124|3368->2137|3421->2154|3432->2156|3465->2167|3518->2184|3529->2186|3563->2198|3616->2215|3627->2217|3658->2226|3711->2243|3722->2245|3754->2255|3807->2272|3818->2274|3856->2290|3924->2323|3956->2346|3995->2347|4046->2367|4090->2376|4122->2399|4161->2400|4213->2421|4257->2430|4289->2453|4328->2454|4379->2474|4439->2498|4450->2500|4482->2510|4650->2647|4718->2684
                    LINES: 19->1|25->1|26->4|26->4|26->4|30->8|30->8|30->8|33->11|33->11|33->11|42->20|42->20|75->53|75->53|75->53|75->53|77->55|77->55|77->55|77->55|77->55|77->55|78->56|78->56|78->56|79->57|79->57|79->57|80->58|80->58|80->58|81->59|81->59|81->59|82->60|82->60|82->60|83->61|83->61|83->61|86->64|86->64|86->64|88->66|89->67|89->67|89->67|91->69|92->70|92->70|92->70|94->72|96->74|96->74|96->74|102->80|106->84
                    -- GENERATED --
                */
            