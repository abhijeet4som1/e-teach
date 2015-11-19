
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tutorPage_Scope0 {
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

class tutorPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html lang="en">
<head>
<title>"""),_display_(/*6.9*/title),format.raw/*6.14*/("""</title>
"""),_display_(/*7.2*/requiredAssetsCSS()),format.raw/*7.21*/("""
"""),format.raw/*8.1*/("""</head>
<body>
"""),_display_(/*10.2*/tutorHeader()),format.raw/*10.15*/("""
"""),format.raw/*11.1*/("""<div id="#top"></div>
    <section id="home">
    	<div id="slides">
			<div class="slides-container">
				<img src=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("images/banner-bg.jpg")),format.raw/*15.63*/("""" alt="" />
				<img src=""""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("images/banner-bg2.jpg")),format.raw/*16.64*/("""" alt="" />
				<img src=""""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("images/banner-bg3.gif")),format.raw/*17.64*/("""" alt="" />
			</div>
			<div class="tint">
				<div class="welcome text-center">
					<h1>Do you have passion in teaching?</h1>
					<p>join Us as teacher now</p>
					<i class="fa fa-angle-down"></i>
				</div>
			</div>
		</div>
		<div id="rooms">
			<div class="container text-center">
				<div class="row no-fade">
					<div class="col-sm-4">
						<div class="box background background1">
							<h3>Select Courses</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("images/icon-soother.png")),format.raw/*36.69*/("""" alt="" />
						</div>
						<div class="arrow background background1"></div>
					</div>
					<div class="col-sm-4">
						<div class="box background background2">
							<h3>List Availability</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*46.19*/routes/*46.25*/.Assets.versioned("images/icon-bear.png")),format.raw/*46.66*/("""" alt="" />
						</div>
						<div class="arrow background background2"></div>
					</div>
					<div class="col-sm-4">
						<div class="box background background3">
							<h3>Start Classes</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("images/icon-horse.png")),format.raw/*56.67*/("""" alt="" />
						</div>
						<div class="arrow background background3"></div>
					</div>
				</div>
			</div>
		</div>
		
    </section>
    
    <!--Price Table-->
    <section id="courses" class="secPad white">
    <div class="container" style="margin-bottom: 2em;">
         <div class="heading text-center">
                <!-- Heading -->
                <h2>Courses You Can Teach</h2>
                <p>Monthly Tuitions, Exam preparation and Technical courses</p>
            </div>
         	<div class="row">
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-cogs fa-2x"></i>
						<div class="text">
							<h3>8<sup>th</sup> - 12<sup>th</sup></h3>
							Science, Mathematics, Physics etc.<br/><br/><br/><br/>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-certificate fa-2x"></i>
						<div class="text">
							<h3>IIT JEE/AIEEE</h3>
							Entrance preparation, Physics, Chemistry and Mathematics.<br/><br/><br/>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-leaf fa-2x"></i>
						<div class="text">
							<h3>HTML5/CSS3</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-tachometer fa-2x"></i>
						<div class="text">
							<h3>Web Designing</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-quote-right fa-2x"></i>
						<div class="text">
							<h3>Data Base</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-arrows fa-2x"></i>
						<div class="text">
							<h3>Mobile App Dev</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
			</div>
         </div>      
   </section>
    
    <!--About-->
    <section id="tutors" class="secPad">
    <div class="container" style="margin-top: -2em;">
       <!-- Our courses titile -->
        <div class="heading text-center">
                <!-- Heading -->
                <h2>Our Tutors</h2>
                <p>Monthly Tuitions, Exam preparation and Technical courses</p>
            </div>
        <!-- End Our courses titile -->

        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourTutors_content" style="margin-top: -3em;">
              <!-- Start Tutors nav -->
              <ul class="tutors_nav">
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*155.34*/routes/*155.40*/.Assets.versioned("images/author.jpg")),format.raw/*155.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*175.34*/routes/*175.40*/.Assets.versioned("images/author.jpg")),format.raw/*175.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*195.34*/routes/*195.40*/.Assets.versioned("images/author.jpg")),format.raw/*195.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*215.34*/routes/*215.40*/.Assets.versioned("images/author.jpg")),format.raw/*215.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li >
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*235.34*/routes/*235.40*/.Assets.versioned("images/author.jpg")),format.raw/*235.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*255.34*/routes/*255.40*/.Assets.versioned("images/author.jpg")),format.raw/*255.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>                                             
              </ul>
            </div>
          </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="carousel slide" data-ride="carousel" id="quote-carousel">
                    <!-- Bottom Carousel Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#quote-carousel" data-slide-to="0" class="active"></li>
                        <li data-target="#quote-carousel" data-slide-to="1" class=""></li>
                        <li data-target="#quote-carousel" data-slide-to="2" class=""></li>
                    </ol>

                    <!-- Carousel Slides / Quotes -->
                    <div class="carousel-inner">
                        <!-- Quote 1 -->
                        <div class="item active">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*293.71*/routes/*293.77*/.Assets.versioned("images/person_1.png")),format.raw/*293.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>My passion to teach students completes here!</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 2 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*307.71*/routes/*307.77*/.Assets.versioned("images/person_2.png")),format.raw/*307.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam auctor nec lacus ut tempor. Mauris.</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 3 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*321.71*/routes/*321.77*/.Assets.versioned("images/person_3.png")),format.raw/*321.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut rutrum elit in arcu blandit, eget pretium nisl accumsan. Sed ultricies commodo tortor, eu pretium mauris.</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                    </div>

                    <!-- Carousel Buttons Next/Prev -->
                    <a data-slide="prev" href="#quote-carousel" class="left carousel-control"><i class="fa fa-chevron-left"></i></a>
                    <a data-slide="next" href="#quote-carousel" class="right carousel-control"><i class="fa fa-chevron-right"></i></a>
                </div>
            </div>
        </div>
        <!-- End Our courses content -->
      </div> 
    </section>

	<!--Contact -->
    <section id="joinUs" class="page-section secPad">
        <div class="container">
        <div class="heading text-center">
                <!-- Heading -->
                <h2 style="color:#000;">Join Us</h2>
                <p>start earning now!</p>
            </div>
				<div class="row">
					<div class="col-sm-6">
						<h1 class="h1header"><b>Log In</b></h1>
						<h3>Already a Member? Log in here.</h3>
						<div id="loginFormContainer">
							"""),_display_(/*355.9*/loginForm()),format.raw/*355.20*/("""
						"""),format.raw/*356.7*/("""</div>
					</div>
					<div class="col-sm-6">
						<h1 class="h1header"><b>Register</b></h1>
						<h3>Do not have an account? Register here.</h3>
						<div id="registerFormContainer">
							"""),_display_(/*362.9*/RegisterForm("TUTOR")),format.raw/*362.30*/("""
						"""),format.raw/*363.7*/("""</div>
					</div>
				</div>
			</div>
    </section>
    """),_display_(/*368.6*/tutorFooter()),format.raw/*368.19*/("""
"""),format.raw/*369.1*/("""</body>
</html>
"""),_display_(/*371.2*/requiredAssetsJS()),format.raw/*371.20*/("""
"""),format.raw/*372.1*/("""<script type="text/javascript">
$( document ).ready(function() """),format.raw/*373.32*/("""{"""),format.raw/*373.33*/("""
	"""),format.raw/*374.2*/("""initializingTutor();
"""),format.raw/*375.1*/("""}"""),format.raw/*375.2*/(""");
</script>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object tutorPage extends tutorPage_Scope0.tutorPage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 06:08:05 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/tutorPage.scala.html
                  HASH: 75da6412e5bf5894eda2213c9b6d641b322bb385
                  MATRIX: 753->1|863->16|890->17|964->66|989->71|1024->81|1063->100|1090->101|1132->117|1166->130|1194->131|1339->249|1354->255|1416->296|1470->323|1485->329|1548->371|1602->398|1617->404|1680->446|2367->1106|2382->1112|2447->1156|2909->1591|2924->1597|2986->1638|3444->2069|3459->2075|3522->2117|6845->5412|6861->5418|6921->5456|7983->6490|7999->6496|8059->6534|9121->7568|9137->7574|9197->7612|10223->8610|10239->8616|10299->8654|11326->9653|11342->9659|11402->9697|12428->10695|12444->10701|12504->10739|14488->12695|14504->12701|14567->12741|15370->13516|15386->13522|15449->13562|16306->14391|16322->14397|16385->14437|17950->15975|17983->15986|18018->15993|18241->16189|18284->16210|18319->16217|18406->16277|18441->16290|18470->16291|18514->16308|18554->16326|18583->16327|18675->16390|18705->16391|18735->16393|18784->16414|18813->16415
                  LINES: 27->1|32->1|33->2|37->6|37->6|38->7|38->7|39->8|41->10|41->10|42->11|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|67->36|67->36|67->36|77->46|77->46|77->46|87->56|87->56|87->56|186->155|186->155|186->155|206->175|206->175|206->175|226->195|226->195|226->195|246->215|246->215|246->215|266->235|266->235|266->235|286->255|286->255|286->255|324->293|324->293|324->293|338->307|338->307|338->307|352->321|352->321|352->321|386->355|386->355|387->356|393->362|393->362|394->363|399->368|399->368|400->369|402->371|402->371|403->372|404->373|404->373|405->374|406->375|406->375
                  -- GENERATED --
              */
          