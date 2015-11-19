
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
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

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<footer>
        <div class="container">
            <div class="social text-center">
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-dribbble"></i></a>
                <a href="#"><i class="fa fa-flickr"></i></a>
                <a href="#"><i class="fa fa-github"></i></a>
            </div>

            <div class="clear"></div>
            <!--CLEAR FLOATS-->
        </div>
    </footer>
    <!--/.page-section-->
    <section class="copyright">
        <div class="container">
            <div class="row">
            <div class="col-md-6 panel" style="background: #000;margin-bottom:0px !important">
						<div class="panel-body">
							<p class="simplenav">
								<a href="#top">Home</a> | 
								<a href="#howItWorks">How It Works</a> |
								<a href="#courses">Courses</a> |
								<a href="#aboutUs">About Us</a>
							</p>
						</div>
					</div>
                <div class="col-sm-12 text-center">
                    ©  <a href="http://e-gurukul.in">e-gurukul.</a> All rights reserved
                </div>
            </div>
            <!-- / .row -->
        </div>
    </section>
    <a href="#top" class="topHome"><i class="fa fa-chevron-up fa-2x"></i></a>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Sat Nov 14 18:43:37 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/footer.scala.html
                  HASH: ae9efc39adb5d568f7ee9bd94d247ca9a0451929
                  MATRIX: 829->0
                  LINES: 32->1
                  -- GENERATED --
              */
          