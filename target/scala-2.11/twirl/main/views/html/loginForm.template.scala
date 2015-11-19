
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class loginForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<form data-toggle="validator" role="form" action="/login" method="post" name="login-form" id="login-form">
	<div class="form-group">
	    <label for="userName" class="control-label">Login</label>
	    <div class="input-group">
	    <input type="text" name="userName" class="form-control" id="userName" placeholder="Username or email" required>
	    <div class="input-group-addon"><i class="fa fa-user"></i></div>
	    </div>
	    <div class="help-block with-errors"></div>
  	</div>
	<div class="form-group" id="login-password-group">
		<label for="password">Password</label>
		<div class="input-group">
			<input type="password" name="password" class="form-control" id="password" placeholder="&#149;&#149;&#149;&#149;&#149;&#149;&#149;&#149;" required>
			<div class="input-group-addon"><i class="fa fa-lock"></i></div>
		</div>
		<div class="help-block"></div>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" name="rememberMe" value="remember"> Remember me
		</label>
	</div>
	<button type="submit" class="btn btn-primary">Log In</button>
	<a href="#" class="pull-right">Lost your password?</a>
</form>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object loginForm extends loginForm_Scope0.loginForm
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 06:08:05 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/loginForm.scala.html
                  HASH: 4d90aea7a6c50620dc954532d484ba9398e5d2ed
                  MATRIX: 835->0
                  LINES: 32->1
                  -- GENERATED --
              */
          