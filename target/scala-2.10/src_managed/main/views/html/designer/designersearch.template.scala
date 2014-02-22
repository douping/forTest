
package views.html.designer

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
object designersearch extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
			<ul>
				<li><a href=""""),_display_(Seq[Any](/*11.19*/controllers/*11.30*/.designer.routes.Designer.designermain)),format.raw/*11.68*/("""">我的技师</a></li>
				<li>技师搜索</li>
			</ul>
			<p><a href=""""),_display_(Seq[Any](/*14.17*/controllers/*14.28*/.record.routes.Records.recordmain)),format.raw/*14.61*/("""">预约管理</a></p>
			<p><a href = "#" target = "salon_main">评论管理</a></p>
			<p><a href = "service_control.html" target = "salon_main">服务管理</a></p>
			<p><a href = "#" target = "salon_main">优惠劵管理</a></p>
			<p><a href = "trend_control.html" target = "salon_main">动态管理</a></p>
			<p><a href = "#" target = "salon_main">店铺装修</a></p>
		</div>
		"""),_display_(Seq[Any](/*21.4*/form(controllers.designer.routes.Designer.designersearch)/*21.61*/{_display_(Seq[Any](format.raw/*21.62*/("""
		<div class="content-core">
			<h1>技师搜索页面</h1>
			<div>                           
               	ID<input type="text" name="design_id"/>&nbsp;&nbsp;&nbsp;&nbsp;
               	<input type="button" value="搜索">
               	
               	                          
        	</div>
        	<div>
        		<table cellspacing="0">
				<tr>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*36.19*/controllers/*36.30*/.designer.routes.Designer.designerview)),format.raw/*36.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<p>所在地：</p>
							<p><input type="button" value="绑定"></p>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*47.19*/controllers/*47.30*/.designer.routes.Designer.designerview)),format.raw/*47.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<p>所在地：</p>
							<p><input type="button" value="绑定"></p>
						</div>
					</td>
					<td>
						<div>
							<div>
								<a href=""""),_display_(Seq[Any](/*58.19*/controllers/*58.30*/.designer.routes.Designer.designerview)),format.raw/*58.68*/(""""><img src="http://imgbp.hotp.jp/CSP/IMG_SRC/05/32/B002740532/B002740532_164-219.jpg"/></a>
							</div>
							<p><a href="#">島崎 修</a></p>
							<div ><span>代表</span>（歴8年）</div>
							<p>所在地：</p>
							<p><input type="button" value="绑定"></p>
						</div>
					</td>
								
				</tr>
			</table>
        	</div>
		</div>
	""")))})),format.raw/*71.3*/("""	
	
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 15:38:56 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/designer/designersearch.scala.html
                    HASH: 3effe5ba6ad77e59e016eae34483ff9060c50b39
                    MATRIX: 574->1|737->18|765->73|802->76|825->91|863->92|1094->288|1113->299|1172->337|1251->380|1271->391|1331->429|1429->491|1449->502|1504->535|1885->881|1951->938|1990->939|2442->1355|2462->1366|2522->1404|2893->1739|2913->1750|2973->1788|3344->2123|3364->2134|3424->2172|3797->2514
                    LINES: 19->1|25->1|26->4|27->5|27->5|27->5|31->9|31->9|31->9|33->11|33->11|33->11|36->14|36->14|36->14|43->21|43->21|43->21|58->36|58->36|58->36|69->47|69->47|69->47|80->58|80->58|80->58|93->71
                    -- GENERATED --
                */
            