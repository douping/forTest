
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/designer/mycss.css"))),format.raw/*8.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
        <script language="javascript" type="text/javascript">
			$(function()"""),format.raw/*13.16*/("""{"""),format.raw/*13.17*/("""
				$("#emailLogin").click(function()"""),format.raw/*14.38*/("""{"""),format.raw/*14.39*/("""
					$("#usernameinf").text("邮箱：");
					$("#name").attr("name","email");
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/(""");
				$("#nameLogin").click(function()"""),format.raw/*18.37*/("""{"""),format.raw/*18.38*/("""
					$("#usernameinf").text("用户名：");
					$("#name").attr("name","name");
				"""),format.raw/*21.5*/("""}"""),format.raw/*21.6*/(""");
				$("#provice").click(function()"""),format.raw/*22.35*/("""{"""),format.raw/*22.36*/("""
					var provices=new Array("吉林省","辽宁省");
				"""),format.raw/*24.5*/("""}"""),format.raw/*24.6*/(""");
				$("#name").blur(function()"""),format.raw/*25.31*/("""{"""),format.raw/*25.32*/("""
					var name=$(this).val();
					var isname=/^[a-zA-Z][a-zA-Z0-9_]"""),format.raw/*27.39*/("""{"""),format.raw/*27.40*/("""4,15"""),format.raw/*27.44*/("""}"""),format.raw/*27.45*/("""$/;
					
					if(!isname.test(name))"""),format.raw/*29.28*/("""{"""),format.raw/*29.29*/("""
						$("#nameMsg").text("用户名无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*32.6*/("""}"""),format.raw/*32.7*/("""
					$("#nameMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*34.5*/("""}"""),format.raw/*34.6*/(""");
				$("#password-main").blur(function()"""),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""
					var password=$(this).val();
					var ispassword=/^[a-zA-Z]\w"""),format.raw/*37.33*/("""{"""),format.raw/*37.34*/("""5,17"""),format.raw/*37.38*/("""}"""),format.raw/*37.39*/("""$/;
					if(!ispassword.test(password))"""),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
						$("#passwordMainMsg").text("密码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*41.6*/("""}"""),format.raw/*41.7*/("""
					$("#passwordMainMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""");
				
				$("#password-confirm").blur(function()"""),format.raw/*45.43*/("""{"""),format.raw/*45.44*/("""
					var password=$(this).val();
					var ispassword=/^[a-zA-Z]\w"""),format.raw/*47.33*/("""{"""),format.raw/*47.34*/("""5,17"""),format.raw/*47.38*/("""}"""),format.raw/*47.39*/("""$/;
					if(!ispassword.test(password))"""),format.raw/*48.36*/("""{"""),format.raw/*48.37*/("""
						$("#passwordConfirmMsg").text("密码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*51.6*/("""}"""),format.raw/*51.7*/("""
					var firstPassword=$("#password-main").val();
					if(password!=firstPassword)"""),format.raw/*53.33*/("""{"""),format.raw/*53.34*/("""
						$("#passwordConfirmMsg").text("两次密码输入需一致").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*56.6*/("""}"""),format.raw/*56.7*/("""
					$("#passwordConfirmMsg").text("输入正确").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""");
				$("#email").blur(function()"""),format.raw/*59.32*/("""{"""),format.raw/*59.33*/("""
					var email=$(this).val();
					var isemail=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
					if(!isemail.test(email))"""),format.raw/*62.30*/("""{"""),format.raw/*62.31*/("""
						$("#emailMsg").text("邮箱无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*65.6*/("""}"""),format.raw/*65.7*/("""
					$("#emailMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""");
				$("#phone").blur(function()"""),format.raw/*68.32*/("""{"""),format.raw/*68.33*/("""
					var phone=$(this).val();
					var isphone=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d"""),format.raw/*70.83*/("""{"""),format.raw/*70.84*/("""8"""),format.raw/*70.85*/("""}"""),format.raw/*70.86*/("""$/;
					if(!isphone.test(phone))"""),format.raw/*71.30*/("""{"""),format.raw/*71.31*/("""
						$("#phoneMsg").text("号码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*74.6*/("""}"""),format.raw/*74.7*/("""
					$("#phoneMsg").text("号码有效").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""");
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/(""")
			var timer = null;
			var i=5;
			function success()"""),format.raw/*80.22*/("""{"""),format.raw/*80.23*/("""
				timer=window.setInterval(showTimes,1000);
				window.setTimeout("go()",6000);
					
					if(i==0)"""),format.raw/*84.14*/("""{"""),format.raw/*84.15*/("""
						clearInterval(timer);
					"""),format.raw/*86.6*/("""}"""),format.raw/*86.7*/("""
					
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
			function go( ) """),format.raw/*89.19*/("""{"""),format.raw/*89.20*/("""//定义函数
	            window.location="findAll";//页面跳转
	    	 """),format.raw/*91.8*/("""}"""),format.raw/*91.9*/("""
			function showTimes()"""),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""
					document.getElementById("times").innerHTML=i;
					i--;
				"""),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""
			function torecordview()"""),format.raw/*96.27*/("""{"""),format.raw/*96.28*/("""
				alert("a to..");
				window.location=""""),_display_(Seq[Any](/*98.23*/controllers/*98.34*/.record.routes.Records.recordview)),format.raw/*98.67*/("""";
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/("""	
         </script>
    </head>
    <body>
        """),_display_(Seq[Any](/*103.10*/content)),format.raw/*103.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 20 10:47:48 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/main.scala.html
                    HASH: 883b005e163255f9ea1f28058fa767443ffc70af
                    MATRIX: 560->1|684->31|772->84|798->89|895->151|909->157|975->201|1066->257|1080->263|1135->297|1232->358|1247->364|1301->396|1362->421|1377->427|1444->472|1584->584|1613->585|1679->623|1708->624|1814->703|1842->704|1909->743|1938->744|2044->823|2072->824|2137->861|2166->862|2240->909|2268->910|2329->943|2358->944|2454->1012|2483->1013|2515->1017|2544->1018|2609->1055|2638->1056|2764->1155|2792->1156|2901->1238|2929->1239|2999->1281|3028->1282|3122->1348|3151->1349|3183->1353|3212->1354|3279->1393|3308->1394|3441->1500|3469->1501|3586->1591|3614->1592|3692->1642|3721->1643|3815->1709|3844->1710|3876->1714|3905->1715|3972->1754|4001->1755|4137->1864|4165->1865|4276->1948|4305->1949|4446->2063|4474->2064|4594->2157|4622->2158|4684->2192|4713->2193|4867->2320|4896->2321|5022->2420|5050->2421|5160->2504|5188->2505|5250->2539|5279->2540|5420->2653|5449->2654|5478->2655|5507->2656|5568->2689|5597->2690|5723->2789|5751->2790|5861->2873|5889->2874|5922->2880|5950->2881|6034->2937|6063->2938|6193->3040|6222->3041|6283->3075|6311->3076|6349->3087|6377->3088|6424->3107|6453->3108|6540->3168|6568->3169|6620->3193|6649->3194|6742->3260|6770->3261|6825->3288|6854->3289|6934->3333|6954->3344|7009->3377|7042->3383|7070->3384|7160->3437|7190->3444
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|35->14|35->14|38->17|38->17|39->18|39->18|42->21|42->21|43->22|43->22|45->24|45->24|46->25|46->25|48->27|48->27|48->27|48->27|50->29|50->29|53->32|53->32|55->34|55->34|56->35|56->35|58->37|58->37|58->37|58->37|59->38|59->38|62->41|62->41|64->43|64->43|66->45|66->45|68->47|68->47|68->47|68->47|69->48|69->48|72->51|72->51|74->53|74->53|77->56|77->56|79->58|79->58|80->59|80->59|83->62|83->62|86->65|86->65|88->67|88->67|89->68|89->68|91->70|91->70|91->70|91->70|92->71|92->71|95->74|95->74|97->76|97->76|98->77|98->77|101->80|101->80|105->84|105->84|107->86|107->86|109->88|109->88|110->89|110->89|112->91|112->91|113->92|113->92|116->95|116->95|117->96|117->96|119->98|119->98|119->98|120->99|120->99|124->103|124->103
                    -- GENERATED --
                */
            