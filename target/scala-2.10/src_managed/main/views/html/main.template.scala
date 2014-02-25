
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/record.css"))),format.raw/*9.96*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script language="javascript" type="text/javascript">
			$(function()"""),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
				$("#emailLogin").click(function()"""),format.raw/*15.38*/("""{"""),format.raw/*15.39*/("""
					$("#usernameinf").text("邮箱：");
					$("#name").attr("name","email");
				"""),format.raw/*18.5*/("""}"""),format.raw/*18.6*/(""");
				$("#nameLogin").click(function()"""),format.raw/*19.37*/("""{"""),format.raw/*19.38*/("""
					$("#usernameinf").text("用户名：");
					$("#name").attr("name","name");
				"""),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");
				$("#provice").click(function()"""),format.raw/*23.35*/("""{"""),format.raw/*23.36*/("""
					var provices=new Array("吉林省","辽宁省");
				"""),format.raw/*25.5*/("""}"""),format.raw/*25.6*/(""");
				$("#name").blur(function()"""),format.raw/*26.31*/("""{"""),format.raw/*26.32*/("""
					var name=$(this).val();
					var isname=/^[a-zA-Z][a-zA-Z0-9_]"""),format.raw/*28.39*/("""{"""),format.raw/*28.40*/("""4,15"""),format.raw/*28.44*/("""}"""),format.raw/*28.45*/("""$/;
					
					if(!isname.test(name))"""),format.raw/*30.28*/("""{"""),format.raw/*30.29*/("""
						$("#nameMsg").text("用户名无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*33.6*/("""}"""),format.raw/*33.7*/("""
					$("#nameMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*35.5*/("""}"""),format.raw/*35.6*/(""");
				$("#password-main").blur(function()"""),format.raw/*36.40*/("""{"""),format.raw/*36.41*/("""
					var password=$(this).val();
					var ispassword=/^[a-zA-Z]\w"""),format.raw/*38.33*/("""{"""),format.raw/*38.34*/("""5,17"""),format.raw/*38.38*/("""}"""),format.raw/*38.39*/("""$/;
					if(!ispassword.test(password))"""),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""
						$("#passwordMainMsg").text("密码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*42.6*/("""}"""),format.raw/*42.7*/("""
					$("#passwordMainMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*44.5*/("""}"""),format.raw/*44.6*/(""");
				
				$("#password-confirm").blur(function()"""),format.raw/*46.43*/("""{"""),format.raw/*46.44*/("""
					var password=$(this).val();
					var ispassword=/^[a-zA-Z]\w"""),format.raw/*48.33*/("""{"""),format.raw/*48.34*/("""5,17"""),format.raw/*48.38*/("""}"""),format.raw/*48.39*/("""$/;
					if(!ispassword.test(password))"""),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
						$("#passwordConfirmMsg").text("密码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*52.6*/("""}"""),format.raw/*52.7*/("""
					var firstPassword=$("#password-main").val();
					if(password!=firstPassword)"""),format.raw/*54.33*/("""{"""),format.raw/*54.34*/("""
						$("#passwordConfirmMsg").text("两次密码输入需一致").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*57.6*/("""}"""),format.raw/*57.7*/("""
					$("#passwordConfirmMsg").text("输入正确").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*59.5*/("""}"""),format.raw/*59.6*/(""");
				$("#email").blur(function()"""),format.raw/*60.32*/("""{"""),format.raw/*60.33*/("""
					var email=$(this).val();
					var isemail=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
					if(!isemail.test(email))"""),format.raw/*63.30*/("""{"""),format.raw/*63.31*/("""
						$("#emailMsg").text("邮箱无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*66.6*/("""}"""),format.raw/*66.7*/("""
					$("#emailMsg").text("可以使用").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""");
				$("#phone").blur(function()"""),format.raw/*69.32*/("""{"""),format.raw/*69.33*/("""
					var phone=$(this).val();
					var isphone=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d"""),format.raw/*71.83*/("""{"""),format.raw/*71.84*/("""8"""),format.raw/*71.85*/("""}"""),format.raw/*71.86*/("""$/;
					if(!isphone.test(phone))"""),format.raw/*72.30*/("""{"""),format.raw/*72.31*/("""
						$("#phoneMsg").text("号码无效").removeClass("trueMsg").addClass("errorMsg");
						return;
					"""),format.raw/*75.6*/("""}"""),format.raw/*75.7*/("""
					$("#phoneMsg").text("号码有效").removeClass("errorMsg").addClass("trueMsg");
				"""),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""");
				
				$().ready(function()"""),format.raw/*79.25*/("""{"""),format.raw/*79.26*/("""
					var $obj=$('#recordmain #service-status');
					$obj.each(function(i)"""),format.raw/*81.27*/("""{"""),format.raw/*81.28*/("""
						var status=$(this).text().trim();
						if(status=="预约中")"""),format.raw/*83.24*/("""{"""),format.raw/*83.25*/("""
							$(this).parent().addClass("row1");
						"""),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""else"""),format.raw/*85.12*/("""{"""),format.raw/*85.13*/("""
							$(this).parent().addClass('row2');
						"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""
					"""),format.raw/*88.6*/("""}"""),format.raw/*88.7*/(""");
				"""),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""");
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/(""")
			var timer = null;
			var i=5;
			function success()"""),format.raw/*93.22*/("""{"""),format.raw/*93.23*/("""
				timer=window.setInterval(showTimes,1000);
				window.setTimeout("go()",6000);
					
					if(i==0)"""),format.raw/*97.14*/("""{"""),format.raw/*97.15*/("""
						clearInterval(timer);
					"""),format.raw/*99.6*/("""}"""),format.raw/*99.7*/("""
					
				"""),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""
			function go( ) """),format.raw/*102.19*/("""{"""),format.raw/*102.20*/("""//定义函数
	            window.location="findAll";//页面跳转
	    	 """),format.raw/*104.8*/("""}"""),format.raw/*104.9*/("""
			function showTimes()"""),format.raw/*105.24*/("""{"""),format.raw/*105.25*/("""
					document.getElementById("times").innerHTML=i;
					i--;
				"""),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
			function torecordview()"""),format.raw/*109.27*/("""{"""),format.raw/*109.28*/("""
				alert("a to..");
				window.location=""""),_display_(Seq[Any](/*111.23*/controllers/*111.34*/.record.routes.Records.recordview)),format.raw/*111.67*/("""";
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/("""	
         </script>
    </head>
    <body>
        """),_display_(Seq[Any](/*116.10*/content)),format.raw/*116.17*/("""
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
                    DATE: Mon Feb 24 17:04:03 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/main.scala.html
                    HASH: 9c953d422d7f43c87686fcc020330cc4bd7a3ddf
                    MATRIX: 560->1|684->31|772->84|798->89|895->151|909->157|975->201|1066->257|1080->263|1137->299|1229->355|1244->361|1300->395|1397->456|1412->462|1466->494|1527->519|1542->525|1609->570|1749->682|1778->683|1844->721|1873->722|1979->801|2007->802|2074->841|2103->842|2209->921|2237->922|2302->959|2331->960|2405->1007|2433->1008|2494->1041|2523->1042|2619->1110|2648->1111|2680->1115|2709->1116|2774->1153|2803->1154|2929->1253|2957->1254|3066->1336|3094->1337|3164->1379|3193->1380|3287->1446|3316->1447|3348->1451|3377->1452|3444->1491|3473->1492|3606->1598|3634->1599|3751->1689|3779->1690|3857->1740|3886->1741|3980->1807|4009->1808|4041->1812|4070->1813|4137->1852|4166->1853|4302->1962|4330->1963|4441->2046|4470->2047|4611->2161|4639->2162|4759->2255|4787->2256|4849->2290|4878->2291|5032->2418|5061->2419|5187->2518|5215->2519|5325->2602|5353->2603|5415->2637|5444->2638|5585->2751|5614->2752|5643->2753|5672->2754|5733->2787|5762->2788|5888->2887|5916->2888|6026->2971|6054->2972|6114->3004|6143->3005|6246->3080|6275->3081|6367->3145|6396->3146|6472->3195|6500->3196|6532->3200|6561->3201|6637->3250|6665->3251|6698->3257|6726->3258|6760->3265|6788->3266|6821->3272|6849->3273|6933->3329|6962->3330|7092->3432|7121->3433|7182->3467|7210->3468|7249->3479|7278->3480|7326->3499|7356->3500|7444->3560|7473->3561|7526->3585|7556->3586|7650->3652|7679->3653|7735->3680|7765->3681|7846->3725|7867->3736|7923->3769|7957->3775|7986->3776|8076->3829|8106->3836
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|35->14|35->14|36->15|36->15|39->18|39->18|40->19|40->19|43->22|43->22|44->23|44->23|46->25|46->25|47->26|47->26|49->28|49->28|49->28|49->28|51->30|51->30|54->33|54->33|56->35|56->35|57->36|57->36|59->38|59->38|59->38|59->38|60->39|60->39|63->42|63->42|65->44|65->44|67->46|67->46|69->48|69->48|69->48|69->48|70->49|70->49|73->52|73->52|75->54|75->54|78->57|78->57|80->59|80->59|81->60|81->60|84->63|84->63|87->66|87->66|89->68|89->68|90->69|90->69|92->71|92->71|92->71|92->71|93->72|93->72|96->75|96->75|98->77|98->77|100->79|100->79|102->81|102->81|104->83|104->83|106->85|106->85|106->85|106->85|108->87|108->87|109->88|109->88|110->89|110->89|111->90|111->90|114->93|114->93|118->97|118->97|120->99|120->99|122->101|122->101|123->102|123->102|125->104|125->104|126->105|126->105|129->108|129->108|130->109|130->109|132->111|132->111|132->111|133->112|133->112|137->116|137->116
                    -- GENERATED --
                */
            