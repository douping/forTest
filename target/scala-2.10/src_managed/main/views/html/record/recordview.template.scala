
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
		<h2>预约详情</h2>
		<table border="1px solid black" cellspacing="0" cellpadding="0" class="recordview-table">
			<tr>
				<td width="100px">顾客留言</td>
				<td colspan="3" width="600px"></td>
			</tr>
			<tr>
				<td>预约编号</td>
				<td colspan="3"></td>
				
			</tr>
			<tr>
				<td>来店时间</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td>服务所需时间</td>
				<td></td>
				<td>指定技师</td>
				<td></td>
			</tr>
			<tr>
				<td>服务项目</td>
				<td></td>
			</tr>
			
			<tr>
				<td>优惠劵使用情</td>
				<td colspan="2"></td>
				<td>所剩点卷</td>
			</tr>
			<tr>
				<td>联系会员</td>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>合计金额</td>
				<td colspan="2"></td>
			</tr>
		</table>
		<input type="button" value="返回预约履历" onclick="window.location.href='"""),_display_(Seq[Any](/*60.71*/controllers/*60.82*/.record.routes.Records.recordmain)),format.raw/*60.115*/("""';"/>
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
                    DATE: Thu Feb 20 13:36:38 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/record/recordview.scala.html
                    HASH: 5148cb43840f8f27650031f1a1007109735975cd
                    MATRIX: 568->1|731->18|768->74|791->89|829->90|1059->285|1078->296|1137->334|1234->395|1254->406|1309->439|2514->1608|2534->1619|2590->1652
                    LINES: 19->1|25->1|26->4|26->4|26->4|30->8|30->8|30->8|33->11|33->11|33->11|82->60|82->60|82->60
                    -- GENERATED --
                */
            