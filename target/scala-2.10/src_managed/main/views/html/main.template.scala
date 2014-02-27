
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
import org.bson.types.ObjectId
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
				//根据状态设置行背景色
				$().ready(function()"""),format.raw/*79.25*/("""{"""),format.raw/*79.26*/("""
					var $obj=$('#recordmain #service-status');
					$obj.each(function(i)"""),format.raw/*81.27*/("""{"""),format.raw/*81.28*/("""
						var status=$(this).text().trim();
						if(status=="预约中")"""),format.raw/*83.24*/("""{"""),format.raw/*83.25*/("""
							$(this).parent().addClass("row1");
						"""),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""else if(status=="已过期")"""),format.raw/*85.30*/("""{"""),format.raw/*85.31*/("""
							$(this).parent().addClass('row2');
						"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""else if(status=="已消费")"""),format.raw/*87.30*/("""{"""),format.raw/*87.31*/("""
							$(this).parent().addClass('row3');
						"""),format.raw/*89.7*/("""}"""),format.raw/*89.8*/("""else if(status=="已取消")"""),format.raw/*89.30*/("""{"""),format.raw/*89.31*/("""
							$(this).parent().addClass('row4');
						"""),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""
					"""),format.raw/*92.6*/("""}"""),format.raw/*92.7*/(""");
				"""),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""");
				
				
			"""),format.raw/*96.4*/("""}"""),format.raw/*96.5*/(""")
			//页面跳转
				function toPage(page)"""),format.raw/*98.26*/("""{"""),format.raw/*98.27*/("""
					document.getElementById("page").value=page;
					var pages=document.getElementById("page").value;
					var i=parseInt(page);
					var current="currentpage"+pages;
					window.location="/recordmain/"+i+"#";
				"""),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
				//下一页
				function toNextPage()"""),format.raw/*106.26*/("""{"""),format.raw/*106.27*/("""
					var totalPages=document.getElementById("totalPage").value;
					var currentPage=document.getElementById("page").value;
					if(totalPages==currentPage)"""),format.raw/*109.33*/("""{"""),format.raw/*109.34*/("""
						return;
					"""),format.raw/*111.6*/("""}"""),format.raw/*111.7*/("""
					var i=parseInt(currentPage)+1;
					toPage(i);
				"""),format.raw/*114.5*/("""}"""),format.raw/*114.6*/("""
				//上一页
				function toUpPage()"""),format.raw/*116.24*/("""{"""),format.raw/*116.25*/("""
					var totalPages=document.getElementById("totalPage").value;
					var currentPage=document.getElementById("page").value;
					if(1==currentPage)"""),format.raw/*119.24*/("""{"""),format.raw/*119.25*/("""
						return;
						"""),format.raw/*121.7*/("""}"""),format.raw/*121.8*/("""
					var i=parseInt(currentPage)-1;
					toPage(i);
				"""),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""
				
         </script>
    </head>
    <body>
        """),_display_(Seq[Any](/*129.10*/content)),format.raw/*129.17*/("""
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
                    DATE: Thu Feb 27 08:35:05 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/main.scala.html
                    HASH: d53f72f4c240b5679dd28986ae61f17b48e653cf
                    MATRIX: 591->1|715->31|803->84|829->89|926->151|940->157|1006->201|1097->257|1111->263|1168->299|1260->355|1275->361|1331->395|1428->456|1443->462|1497->494|1558->519|1573->525|1640->570|1780->682|1809->683|1875->721|1904->722|2010->801|2038->802|2105->841|2134->842|2240->921|2268->922|2333->959|2362->960|2436->1007|2464->1008|2525->1041|2554->1042|2650->1110|2679->1111|2711->1115|2740->1116|2805->1153|2834->1154|2960->1253|2988->1254|3097->1336|3125->1337|3195->1379|3224->1380|3318->1446|3347->1447|3379->1451|3408->1452|3475->1491|3504->1492|3637->1598|3665->1599|3782->1689|3810->1690|3888->1740|3917->1741|4011->1807|4040->1808|4072->1812|4101->1813|4168->1852|4197->1853|4333->1962|4361->1963|4472->2046|4501->2047|4642->2161|4670->2162|4790->2255|4818->2256|4880->2290|4909->2291|5063->2418|5092->2419|5218->2518|5246->2519|5356->2602|5384->2603|5446->2637|5475->2638|5616->2751|5645->2752|5674->2753|5703->2754|5764->2787|5793->2788|5919->2887|5947->2888|6057->2971|6085->2972|6157->3016|6186->3017|6289->3092|6318->3093|6410->3157|6439->3158|6515->3207|6543->3208|6593->3230|6622->3231|6698->3280|6726->3281|6776->3303|6805->3304|6881->3353|6909->3354|6959->3376|6988->3377|7064->3426|7092->3427|7125->3433|7153->3434|7187->3441|7215->3442|7258->3458|7286->3459|7351->3496|7380->3497|7624->3713|7653->3714|7718->3750|7748->3751|7934->3908|7964->3909|8012->3929|8041->3930|8126->3987|8155->3988|8218->4022|8248->4023|8425->4171|8455->4172|8504->4193|8533->4194|8618->4251|8647->4252|8741->4309|8771->4316
                    LINES: 20->1|23->1|29->7|29->7|30->8|30->8|30->8|31->9|31->9|31->9|32->10|32->10|32->10|33->11|33->11|33->11|34->12|34->12|34->12|36->14|36->14|37->15|37->15|40->18|40->18|41->19|41->19|44->22|44->22|45->23|45->23|47->25|47->25|48->26|48->26|50->28|50->28|50->28|50->28|52->30|52->30|55->33|55->33|57->35|57->35|58->36|58->36|60->38|60->38|60->38|60->38|61->39|61->39|64->42|64->42|66->44|66->44|68->46|68->46|70->48|70->48|70->48|70->48|71->49|71->49|74->52|74->52|76->54|76->54|79->57|79->57|81->59|81->59|82->60|82->60|85->63|85->63|88->66|88->66|90->68|90->68|91->69|91->69|93->71|93->71|93->71|93->71|94->72|94->72|97->75|97->75|99->77|99->77|101->79|101->79|103->81|103->81|105->83|105->83|107->85|107->85|107->85|107->85|109->87|109->87|109->87|109->87|111->89|111->89|111->89|111->89|113->91|113->91|114->92|114->92|115->93|115->93|118->96|118->96|120->98|120->98|126->104|126->104|128->106|128->106|131->109|131->109|133->111|133->111|136->114|136->114|138->116|138->116|141->119|141->119|143->121|143->121|146->124|146->124|151->129|151->129
                    -- GENERATED --
                */
            