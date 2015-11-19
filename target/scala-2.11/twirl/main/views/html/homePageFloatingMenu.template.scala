
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homePageFloatingMenu_Scope0 {
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

class homePageFloatingMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div id="wrapper">
  <div id="topDivJoinUs" class="cart-tab visible">		
    <a href="#" title="View your shopping cart" class="cart-link">
      <img alt="Join US" src=""""),_display_(/*4.32*/routes/*4.38*/.Assets.versioned("images/join_us.png")),format.raw/*4.77*/("""" width="70%" style="margin-left:0.5em;">
    </a>
    <div class="cart">
      <div class="cart-items">
        <ul>
          <li class="clearfix">
          <a href="/studentZone"><div style="float:left;padding-top:1em;margin-right:2em;">
           <h4>Student</h4>
           </div>
          	
            <img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.versioned("images/student.jpg")),format.raw/*14.69*/("""" class="productimg" width="30%"></a>
          </li>
 
          <li class="clearfix">
          <a href="/tutorZone"><img src=""""),_display_(/*18.43*/routes/*18.49*/.Assets.versioned("images/teacher.gif")),format.raw/*18.88*/("""" class="productimg" width="40%">
            <h4>Teacher</h4></a>
          </li>
        </ul>
      </div><!-- end .cart-items -->
 	  <div style="float:right;margin-top: -0.9em;"><a href="#" class="checkout">Login</a>
      <a href="#" class="checkout">Register</a></div>
    </div><!-- end .cart -->
  </div><!-- end .cart-tab -->
  </div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object homePageFloatingMenu extends homePageFloatingMenu_Scope0.homePageFloatingMenu
              /*
                  -- GENERATED --
                  DATE: Sat Nov 14 18:43:38 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/homePageFloatingMenu.scala.html
                  HASH: 0f69ad295dff2754621fc0b45380e1990394d787
                  MATRIX: 857->0|1053->170|1067->176|1126->215|1476->538|1491->544|1551->583|1708->713|1723->719|1783->758
                  LINES: 32->1|35->4|35->4|35->4|45->14|45->14|45->14|49->18|49->18|49->18
                  -- GENERATED --
              */
          