
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RegisterForm_Scope0 {
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

class RegisterForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userType:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<form data-toggle="validator" role="form" action="/register" method="post">
  <div class="form-group">
    <label for="userName" class="control-label">User Name</label>
    <div class="input-group">
    <input type="text" name="userName" class="form-control" id="userName" placeholder="User Name" required>
    <div class="input-group-addon"><i class="fa fa-user"></i></div>
    </div>
    <div class="help-block with-errors"></div>
  </div>
  <div class="form-group">
    <label for="inputEmail" class="control-label">Email</label>
    <div class="input-group">
    <input type="email" name="emailAddress" class="form-control" id="inputEmail" placeholder="Email" data-error="Bruh, that email address is invalid" required>
    <div class="input-group-addon"><i class="fa fa-envelope"></i></div>
    </div>
    <div class="help-block with-errors"></div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="control-label">Password</label>
    <div class="input-group">
    <input type="password" name="password" data-minlength="6" class="form-control" id="inputPassword" placeholder="&#149;&#149;&#149;&#149;&#149;&#149;&#149;&#149;" required>
      <div class="input-group-addon"><i class="fa fa-lock"></i></div>
    </div>
    <div class="help-block">Minimum of 6 characters</div>
  </div>
  <div class="form-group">
    <label for="inputPasswordConfirm" class="control-label">Confirm</label>
    <div class="input-group">
    <input type="password" name="cnfrmPassword" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="&#149;&#149;&#149;&#149;&#149;&#149;&#149;&#149;" required>
      <div class="input-group-addon"><i class="fa fa-lock"></i></div>   
     </div>
   <div class="help-block with-errors"></div>
  </div>
  <input type="hidden" name="userType" value=""""),_display_(/*35.48*/userType),format.raw/*35.56*/("""">
  <div class="form-group">
    <button type="submit" class="btn btn-primary">Register</button>
  </div>
</form>"""))
      }
    }
  }

  def render(userType:String): play.twirl.api.HtmlFormat.Appendable = apply(userType)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userType) => apply(userType)

  def ref: this.type = this

}


}

/**/
object RegisterForm extends RegisterForm_Scope0.RegisterForm
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 06:08:05 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/RegisterForm.scala.html
                  HASH: 57660d8deba01816e7fca96f1a49ec9ebbe7695f
                  MATRIX: 759->1|871->18|898->19|2798->1892|2827->1900
                  LINES: 27->1|32->1|33->2|66->35|66->35
                  -- GENERATED --
              */
          