
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
object updateUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Users,Form[scala.Tuple7[String, scala.Tuple2[String, String], String, String, String, scala.Tuple2[String, String], String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:Users,registerForm:Form[(String,(String,String),String,String,String,(String,String),String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("updateInfo")/*5.20*/{_display_(Seq[Any](format.raw/*5.21*/("""
	<div class="updateuser-content">
	<div class="registerForm">
		<h2>注册用户</h2>
		
		"""),_display_(Seq[Any](/*10.4*/form(routes.User.toregister)/*10.32*/{_display_(Seq[Any](format.raw/*10.33*/("""
			<table>
			<tr>
				<td align="right"><label id="usernameinf">用户名：</label></td>
				<td><input class="base-input" id="name" name="name" disabled="disabled" value=""""),_display_(Seq[Any](/*14.85*/user/*14.89*/.name)),format.raw/*14.94*/(""""></td>
				<td><span id="nameMsg"></span></td>
			</tr>
			<tr>
				<td align="right"><label id="label">密码：</label></td>
				<td><input type="password" class="base-input" id="password-main" name="password.main" value=""""),_display_(Seq[Any](/*19.99*/user/*19.103*/.password)),format.raw/*19.112*/(""""></td>
				<td><span id="passwordMainMsg"></span></td>
			</tr>
			<tr>
				<td align="right"><label>确认密码：</label></td>
				<td><input type="password" class="base-input" id="password-confirm" name="password.confirm"></td>
				<td><span id="passwordConfirmMsg"></span></td>
			</tr>
			<tr>
	            <td align="right"><label>email：</label></td>        
	            <td class="width70"><input name="email" type="text" class="base-input" value=""""),_display_(Seq[Any](/*29.93*/user/*29.97*/.email)),format.raw/*29.103*/("""" /></td>
	            <td><span id="emailMsg"></span></td>
	        </tr>
	        <tr>
	            <td align="right"><label>手机号码：</label></td>        
	            <td class="width70"><input name="phone" id="phone" class="base-input" value=""""),_display_(Seq[Any](/*34.92*/user/*34.96*/.phone)),format.raw/*34.102*/(""""/></td>
	            <td><span id="phoneMsg"></span></td>
	        </tr>
	        <tr>
	            <td align="right"><label>性别：</label></td>        
	            <td class="width70"><input type="radio" name="sex" value="0" />男
	            <input type="radio" name="sex" value="1">女</td>
	        </tr>
	        <tr>
	        	<td colspan="2">
	        	<select id="provice" name="city.first">
	        		<option>--选择省份--</option>
	        	</select>
	        	<select id="citys" name="city.second">
	        		<option>--选择城市--</option>
	        	</select>
	        	</td>
	        </tr>
	        <tr>
	        	<td align="right"><label>自我介绍：</label></td>
	        	<td rowspan="1"><textarea name="intro" rows="4" cols="22"></textarea></td>
	        </tr>
			<tr>
				<td colspan="2"><input type="submit" class="submit" value="注册">
				</td>
			</tr>
		</table>
		<div class="otheruser">
			
		</div>
		""")))})),format.raw/*64.4*/("""
		</div>
</div>
""")))})))}
    }
    
    def render(user:Users,registerForm:Form[scala.Tuple7[String, scala.Tuple2[String, String], String, String, String, scala.Tuple2[String, String], String]]): play.api.templates.HtmlFormat.Appendable = apply(user,registerForm)
    
    def f:((Users,Form[scala.Tuple7[String, scala.Tuple2[String, String], String, String, String, scala.Tuple2[String, String], String]]) => play.api.templates.HtmlFormat.Appendable) = (user,registerForm) => apply(user,registerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 26 10:21:03 CST 2014
                    SOURCE: E:/PD/playtest/forTest/app/views/updateUser.scala.html
                    HASH: e386e01b8e8f6d832f4d05e37fc0f870b35f16ce
                    MATRIX: 710->1|957->101|985->156|1022->159|1048->177|1086->178|1211->268|1248->296|1287->297|1495->469|1508->473|1535->478|1796->703|1810->707|1842->716|2337->1175|2350->1179|2379->1185|2665->1435|2678->1439|2707->1445|3674->2381
                    LINES: 20->1|26->1|27->4|28->5|28->5|28->5|33->10|33->10|33->10|37->14|37->14|37->14|42->19|42->19|42->19|52->29|52->29|52->29|57->34|57->34|57->34|87->64
                    -- GENERATED --
                */
            