
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object studentZoneHeader_Scope0 {
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

class studentZoneHeader extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="header">
        <div class="container">
            <nav class="navbar navbar-inverse" role="navigation">
                <div class="navbar-header">
                    <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="/" class="navbar-brand scroll-top logo"><b>I-Teach</b></a>
                </div>
                <!--/.navbar-header-->
                <div id="main-nav" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav" id="mainNav">
                        <li id="topHomeMenu" class="active"><a href="#home" class="scroll-link">Home</a></li>
                        <li><a href="#courses" class="scroll-link changeJoinUs">Courses</a></li>
                        <li><a href="#tutors" class="scroll-link changeJoinUs">Our Tutors</a></li>
                        <li><a href="#joinUs" class="scroll-link changeJoinUs">Login/Register</a></li> 
                    </ul>
                    
                </div>
                <!--/.navbar-collapse-->
            </nav>
            <!--/.navbar-->
        </div>
        <!--/.container-->
    </header>
    <!--/.header-->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object studentZoneHeader extends studentZoneHeader_Scope0.studentZoneHeader
              /*
                  -- GENERATED --
                  DATE: Sat Nov 14 18:43:38 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/studentZoneHeader.scala.html
                  HASH: 8d8737f76f528775e9fe2eef5c775c58e8c06887
                  MATRIX: 851->0
                  LINES: 32->1
                  -- GENERATED --
              */
          