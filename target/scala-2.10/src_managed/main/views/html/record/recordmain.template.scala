
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
					<li><a href=""""),_display_(Seq[Any](/*12.20*/controllers/*12.31*/.record.routes.Records.selectDesignerRecord)),format.raw/*12.74*/("""">技师日程查看</a></li>
				</ul>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>	
	</div>	
	<div class="content-core">
		<p>总计<span>"""),_display_(Seq[Any](/*21.15*/count)),format.raw/*21.20*/("""</span>个预约</p>
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
            
            <a href=""""),_display_(Seq[Any](/*36.23*/controllers/*36.34*/.record.routes.Records.addRecord)),format.raw/*36.66*/("""">添加预约</a>
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
				"""),_display_(Seq[Any](/*54.6*/records/*54.13*/.map/*54.17*/{re=>_display_(Seq[Any](format.raw/*54.22*/("""
				<tr>
					<td><a href=""""),_display_(Seq[Any](/*56.20*/controllers/*56.31*/.record.routes.Records.recordview)),format.raw/*56.64*/("""">"""),_display_(Seq[Any](/*56.67*/re/*56.69*/.id)),format.raw/*56.72*/("""</a></td>                        
					<td>"""),_display_(Seq[Any](/*57.11*/re/*57.13*/.serviceStart)),format.raw/*57.26*/("""</td>
					<td>"""),_display_(Seq[Any](/*58.11*/re/*58.13*/.serviceEnd)),format.raw/*58.24*/("""</td>
					<td>"""),_display_(Seq[Any](/*59.11*/re/*59.13*/.serviceItem)),format.raw/*59.25*/("""</td>
					<td>"""),_display_(Seq[Any](/*60.11*/re/*60.13*/.userName)),format.raw/*60.22*/("""</td>
					<td>"""),_display_(Seq[Any](/*61.11*/re/*61.13*/.userPhone)),format.raw/*61.23*/("""</td>
					<td>"""),_display_(Seq[Any](/*62.11*/re/*62.13*/.serviceDesigner)),format.raw/*62.29*/("""</td>
					
						<td>
						"""),_display_(Seq[Any](/*65.8*/if(re.serviceStatus==1)/*65.31*/{_display_(Seq[Any](format.raw/*65.32*/("""
						已过期
						""")))})),format.raw/*67.8*/("""
						"""),_display_(Seq[Any](/*68.8*/if(re.serviceStatus==2)/*68.31*/{_display_(Seq[Any](format.raw/*68.32*/("""
						预约中	
						""")))})),format.raw/*70.8*/("""
						"""),_display_(Seq[Any](/*71.8*/if(re.serviceStatus==0)/*71.31*/{_display_(Seq[Any](format.raw/*71.32*/("""
						已消费
						""")))})),format.raw/*73.8*/("""
					</td>
					<td>"""),_display_(Seq[Any](/*75.11*/re/*75.13*/.costTotal)),format.raw/*75.23*/("""</td>
					<td>
					<input type="button" onclick='window.location.href="#";' value="取消预约"/>&nbsp;
					
					</td>
				</tr>
				""")))})),format.raw/*81.6*/("""
			</tbody>
		</table>
	</div>
""")))})),format.raw/*85.2*/("""
"""))}
    }
    
    def render(records:List[Record],count:Long): play.api.templates.HtmlFormat.Appendable = apply(records,count)
    
    def f:((List[Record],Long) => play.api.templates.HtmlFormat.Appendable) = (records,count) => apply(records,count)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 21 18:42:25 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordmain.scala.html
                    HASH: 6dce692e7b7b152b7f59cee6dac22d64fb77b233
                    MATRIX: 579->1|758->34|795->90|812->99|850->100|1080->295|1099->306|1158->344|1255->405|1275->416|1330->449|1402->485|1422->496|1487->539|1924->940|1951->945|2738->1696|2758->1707|2812->1739|3207->2099|3223->2106|3236->2110|3279->2115|3346->2146|3366->2157|3421->2190|3460->2193|3471->2195|3496->2198|3577->2243|3588->2245|3623->2258|3676->2275|3687->2277|3720->2288|3773->2305|3784->2307|3818->2319|3871->2336|3882->2338|3913->2347|3966->2364|3977->2366|4009->2376|4062->2393|4073->2395|4111->2411|4179->2444|4211->2467|4250->2468|4301->2488|4345->2497|4377->2520|4416->2521|4468->2542|4512->2551|4544->2574|4583->2575|4634->2595|4694->2619|4705->2621|4737->2631|4905->2768|4973->2805
                    LINES: 19->1|25->1|26->4|26->4|26->4|30->8|30->8|30->8|33->11|33->11|33->11|34->12|34->12|34->12|43->21|43->21|58->36|58->36|58->36|76->54|76->54|76->54|76->54|78->56|78->56|78->56|78->56|78->56|78->56|79->57|79->57|79->57|80->58|80->58|80->58|81->59|81->59|81->59|82->60|82->60|82->60|83->61|83->61|83->61|84->62|84->62|84->62|87->65|87->65|87->65|89->67|90->68|90->68|90->68|92->70|93->71|93->71|93->71|95->73|97->75|97->75|97->75|103->81|107->85
                    -- GENERATED --
                */
            