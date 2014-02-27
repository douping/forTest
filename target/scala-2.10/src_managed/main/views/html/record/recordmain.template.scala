
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
object recordmain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Record],Long,Int,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(records: List[Record], count: Long, pages: Int, page:Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.60*/("""
"""),_display_(Seq[Any](/*4.2*/main("s")/*4.11*/{_display_(Seq[Any](format.raw/*4.12*/("""
	<div class="content-link">
			"""),_display_(Seq[Any](/*6.5*/views/*6.10*/.html.record.recordMenu())),format.raw/*6.35*/("""
	</div>	
	<div class="content-core">
		<p>总计<span>"""),_display_(Seq[Any](/*9.15*/count)),format.raw/*9.20*/("""</span>个预约</p>
		<input type="hidden" name="page" id="page" value=""""),_display_(Seq[Any](/*10.54*/page)),format.raw/*10.58*/("""">
		<input type="hidden" name="totalPage" id="totalPage" value=""""),_display_(Seq[Any](/*11.64*/pages)),format.raw/*11.69*/("""">
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
            
            <a href=""""),_display_(Seq[Any](/*26.23*/controllers/*26.34*/.record.routes.Records.addRecord)),format.raw/*26.66*/("""">添加预约</a>
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
				"""),_display_(Seq[Any](/*44.6*/records/*44.13*/.map/*44.17*/{re=>_display_(Seq[Any](format.raw/*44.22*/("""
				<tr>
					<td><a href=""""),_display_(Seq[Any](/*46.20*/controllers/*46.31*/.record.routes.Records.recordview(re.id))),format.raw/*46.71*/("""">"""),_display_(Seq[Any](/*46.74*/re/*46.76*/.id)),format.raw/*46.79*/("""</a></td>                        
					<td>"""),_display_(Seq[Any](/*47.11*/re/*47.13*/.serviceStart.format("yyyy-MM-dd hh:mm"))),format.raw/*47.53*/("""</td>
					<td>"""),_display_(Seq[Any](/*48.11*/re/*48.13*/.serviceEnd.format("yyyy-MM-dd hh:mm"))),format.raw/*48.51*/("""</td>
					<td>"""),_display_(Seq[Any](/*49.11*/re/*49.13*/.serviceItem)),format.raw/*49.25*/("""</td>
					<td>"""),_display_(Seq[Any](/*50.11*/re/*50.13*/.userName)),format.raw/*50.22*/("""</td>
					<td>"""),_display_(Seq[Any](/*51.11*/re/*51.13*/.userPhone)),format.raw/*51.23*/("""</td>
					<td>"""),_display_(Seq[Any](/*52.11*/re/*52.13*/.serviceDesigner)),format.raw/*52.29*/("""</td>
					
						<td id="service-status">
						"""),_display_(Seq[Any](/*55.8*/if(re.serviceStatus==2)/*55.31*/{_display_(Seq[Any](format.raw/*55.32*/("""
						已过期
						""")))})),format.raw/*57.8*/("""
						"""),_display_(Seq[Any](/*58.8*/if(re.serviceStatus==0)/*58.31*/{_display_(Seq[Any](format.raw/*58.32*/("""
						预约中	
						""")))})),format.raw/*60.8*/("""
						"""),_display_(Seq[Any](/*61.8*/if(re.serviceStatus==1)/*61.31*/{_display_(Seq[Any](format.raw/*61.32*/("""
						已消费
						""")))})),format.raw/*63.8*/("""
						"""),_display_(Seq[Any](/*64.8*/if(-1 == re.serviceStatus)/*64.34*/{_display_(Seq[Any](format.raw/*64.35*/("""
						已取消
						""")))})),format.raw/*66.8*/("""
					</td>
					<td>"""),_display_(Seq[Any](/*68.11*/re/*68.13*/.costTotal)),format.raw/*68.23*/("""</td>
					<td>
					<a href=""""),_display_(Seq[Any](/*70.16*/controllers/*70.27*/.record.routes.Records.cancelRecord(re.id))),format.raw/*70.69*/("""">取消</a>&nbsp;
					<a href=""""),_display_(Seq[Any](/*71.16*/controllers/*71.27*/.record.routes.Records.overdateRecord(re.id))),format.raw/*71.71*/("""">过期</a>&nbsp;
					<a href=""""),_display_(Seq[Any](/*72.16*/controllers/*72.27*/.record.routes.Records.finishRecord(re.id))),format.raw/*72.69*/("""">已完成</a>
					
					</td>
				</tr>
				""")))})),format.raw/*76.6*/("""
			</tbody>
		</table>
		<div class="page-limit">
			<a href="javascript:toUpPage();">上一页</a>
			"""),_display_(Seq[Any](/*81.5*/for(i <-1 to pages) yield /*81.24*/{_display_(Seq[Any](format.raw/*81.25*/("""
				"""),_display_(Seq[Any](/*82.6*/if(page==i)/*82.17*/{_display_(Seq[Any](format.raw/*82.18*/("""
					<a href="javascript:toPage("""),_display_(Seq[Any](/*83.34*/i)),format.raw/*83.35*/(""");" class="pagelink">"""),_display_(Seq[Any](/*83.57*/i)),format.raw/*83.58*/("""</a>
				""")))}/*84.6*/else/*84.10*/{_display_(Seq[Any](format.raw/*84.11*/("""
					<a href="javascript:toPage("""),_display_(Seq[Any](/*85.34*/i)),format.raw/*85.35*/(""");">"""),_display_(Seq[Any](/*85.40*/i)),format.raw/*85.41*/("""</a>
				""")))})),format.raw/*86.6*/("""
				
			""")))})),format.raw/*88.5*/("""
			<a href="javascript:toNextPage();">下一页</a>
		</div>
	</div>
""")))})),format.raw/*92.2*/("""
"""))}
    }
    
    def render(records:List[Record],count:Long,pages:Int,page:Int): play.api.templates.HtmlFormat.Appendable = apply(records,count,pages,page)
    
    def f:((List[Record],Long,Int,Int) => play.api.templates.HtmlFormat.Appendable) = (records,count,pages,page) => apply(records,count,pages,page)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 27 08:35:05 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordmain.scala.html
                    HASH: 9a6c82deaff94c70a03c3718b5b6c53e53514bef
                    MATRIX: 618->1|822->59|859->115|876->124|914->125|983->160|996->165|1042->190|1132->245|1158->250|1263->319|1289->323|1392->390|1419->395|2194->1134|2214->1145|2268->1177|2678->1552|2694->1559|2707->1563|2750->1568|2817->1599|2837->1610|2899->1650|2938->1653|2949->1655|2974->1658|3055->1703|3066->1705|3128->1745|3181->1762|3192->1764|3252->1802|3305->1819|3316->1821|3350->1833|3403->1850|3414->1852|3445->1861|3498->1878|3509->1880|3541->1890|3594->1907|3605->1909|3643->1925|3731->1978|3763->2001|3802->2002|3853->2022|3897->2031|3929->2054|3968->2055|4020->2076|4064->2085|4096->2108|4135->2109|4186->2129|4230->2138|4265->2164|4304->2165|4355->2185|4415->2209|4426->2211|4458->2221|4527->2254|4547->2265|4611->2307|4678->2338|4698->2349|4764->2393|4831->2424|4851->2435|4915->2477|4992->2523|5131->2627|5166->2646|5205->2647|5247->2654|5267->2665|5306->2666|5377->2701|5400->2702|5458->2724|5481->2725|5510->2736|5523->2740|5562->2741|5633->2776|5656->2777|5697->2782|5720->2783|5762->2794|5805->2806|5905->2875
                    LINES: 20->1|26->1|27->4|27->4|27->4|29->6|29->6|29->6|32->9|32->9|33->10|33->10|34->11|34->11|49->26|49->26|49->26|67->44|67->44|67->44|67->44|69->46|69->46|69->46|69->46|69->46|69->46|70->47|70->47|70->47|71->48|71->48|71->48|72->49|72->49|72->49|73->50|73->50|73->50|74->51|74->51|74->51|75->52|75->52|75->52|78->55|78->55|78->55|80->57|81->58|81->58|81->58|83->60|84->61|84->61|84->61|86->63|87->64|87->64|87->64|89->66|91->68|91->68|91->68|93->70|93->70|93->70|94->71|94->71|94->71|95->72|95->72|95->72|99->76|104->81|104->81|104->81|105->82|105->82|105->82|106->83|106->83|106->83|106->83|107->84|107->84|107->84|108->85|108->85|108->85|108->85|109->86|111->88|115->92
                    -- GENERATED --
                */
            