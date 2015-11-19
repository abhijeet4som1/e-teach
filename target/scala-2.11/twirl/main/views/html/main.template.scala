
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
	"""),_display_(/*10.3*/header()),format.raw/*10.11*/("""
	"""),format.raw/*11.2*/("""<div id="#top"></div>
	<section id="home">
		<div class="overlay">
			<div class="banner-container">
				<div class="container banner-content">
					<div id="da-slider" class="da-slider">
						<div class="da-slide">
							<h2>1-to-1 Teaching Solution</h2>
							<p>Bored of regular school/college class style of
								teaching,want a personal guidance for you?</p>
							<a href="/studentZone" class="da-link">Read more</a>
							<div class="da-img"></div>
						</div>
						<div class="da-slide">
							<h2>Do you have passion in teaching?</h2>
							<p>Connect with students and start and start your teaching
								classes now.</p>
							<a href="/tutorZone" class="da-link">Read more</a>
							<div class="da-img"></div>
						</div>
						<nav class="da-arrows">
							<span class="da-arrows-prev"></span> <span class="da-arrows-next"></span>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="introText">
		<div class="container">
			<div class="text-center">
				<h1>Join I-Teach 1 to 1 teaching solution</h1>
				<div>
					<div class="row">
						<div class="col-md-3 col-sm-6 introbox">
							<div class="cuadro_intro_hover "
								style="background-color: #cccccc;">
								<p style="text-align: center;">
									<img src=""""),_display_(/*49.21*/routes/*49.27*/.Assets.versioned("images/pic-5.jpg")),format.raw/*49.64*/("""" class="img-responsive" alt="">
								</p>
								<div class="caption">
									<div class="blur"></div>
									<div class="caption-text">
										<h3>Expert tutors</h3>
										<p>Search and connect with the best teachers.</p>
										<a class="btn btn-default" href="#"><i
											class="fa fa-thumbs-up"></i>&nbsp;Go!</a>
									</div>
								</div>
							</div>

						</div>
						<div class="col-md-3  col-sm-6 introbox">
							<div class="cuadro_intro_hover "
								style="background-color: #cccccc;">
								<p style="text-align: center;">
									<img src=""""),_display_(/*67.21*/routes/*67.27*/.Assets.versioned("images/ebook.jpg")),format.raw/*67.64*/("""" class="img-responsive" alt="">
								</p>
								<div class="caption">
									<div class="blur"></div>
									<div class="caption-text">
										<h3>Best teaching materials</h3>
										<p>Best teaching materials at your finger-point.</p>
										<a class="btn btn-default" href="#"><i
											class="fa fa-thumbs-up"></i>&nbsp;Go!</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-3  col-sm-6 introbox">
							<div class="cuadro_intro_hover "
								style="background-color: #cccccc;">
								<p style="text-align: center; background-color: #fff">
									<img src=""""),_display_(/*84.21*/routes/*84.27*/.Assets.versioned("images/pic-6.png")),format.raw/*84.64*/("""" class="img-responsive" alt=""
										style="margin-left: 12%;">
								</p>
								<div class="caption">
									<div class="blur"></div>
									<div class="caption-text">
										<h3>Test yourself</h3>
										<p>Test yourself with regular tests and assignments.</p>
										<a class="btn btn-default" href="#"><i
											class="fa fa-thumbs-up"></i>&nbsp;Go!</a>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-3  col-sm-6 introbox">
							<div class="cuadro_intro_hover "
								style="background-color: #cccccc;">
								<p style="text-align: center;">
									<img src=""""),_display_(/*102.21*/routes/*102.27*/.Assets.versioned("images/doubt.jpg")),format.raw/*102.64*/("""" class="img-responsive" alt="">
								</p>
								<div class="caption">
									<div class="blur"></div>
									<div class="caption-text">
										<h3>Ask Doubts</h3>
										<p>Clarify your doubts from the best tutor available.</p>
										<a class=" btn btn-default" href="#"><i
											class="fa fa-thumbs-up"></i>&nbsp;Go!</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>
	<!--Package-->
	<section id="howItWorks" class="secPad" style="margin-bottom: 120px">
		<div class="container">
			<div class="heading text-center">
				<!-- Heading -->
				<h2>How It works</h2>
				<p>Live 1-To-1 tutoring, watch live sessions at I-Teach</p>
			</div>
			<div class="howitworksleftDiv">
				<div class="row">
					<div class="col-sm-3 fiftyWidth">
						<div class="panel panel-danger text-center">
							<div class="panel-heading">
								<h3>Student</h3>
							</div>
							<ul class="list-group">
								<li class="list-group-item"><i class="fa fa-user floatLeft"></i>Register</li>
								<li class="list-group-item">Search courses<i
									class="fa fa-eye floatRight"></i></li>
								<li class="list-group-item"><i
									class="fa fa-search floatLeft"></i>Search tutor</li>
								<li class="list-group-item">Connect to tutor and start
									learning<i class="fa fa-book floatRight"></i>
								</li>
								<li class="list-group-item"><a class="btn btn-primary"
									href="studentPage.jsp#joinUs">Register Now!</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3 fiftyWidth">
						<div class="panel panel-danger text-center">
							<div class="panel-heading">
								<h3>Teacher</h3>
							</div>
							<ul class="list-group">
								<li class="list-group-item"><i
									class="fa fa-user floatRight"></i>Register</li>
								<li class="list-group-item">List your availability<i
									class="fa fa-calendar floatLeft"></i></li>
								<li class="list-group-item"><i
									class="fa fa-thumbs-o-up floatRight"></i>Accept student request</li>
								<li class="list-group-item">Start your classes<i
									class="fa fa-laptop floatLeft"></i></li>
								<li class="list-group-item"><a class="btn btn-primary"
									href="teachersPage.jsp#joinUs">Register Now!</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div>
				<iframe class="videoFrame"
					src="http://www.youtube.com/embed/XGSy3_Czz8k"></iframe>
			</div>
			<div style="clear: both; margin-top: 5%;">
				<ul class="list-group">
					<li class="list-group-item listItem"><i class="fa fa-user"></i>&nbsp;&nbsp;110+
						Students</li>
					<li class="list-group-item listItem"><i class="fa fa-user-md"></i>&nbsp;&nbsp;12
						Expert Teachers</li>
					<li class="list-group-item listItem"><i class="fa fa-clock-o"></i>&nbsp;&nbsp;1024
						hours Sessions finished</li>
				</ul>
			</div>
		</div>
	</section>
	<!--Quote-->
	<section id="quote" class="bg-parlex">
		<div class="parlex-back">
			<div class="container secPad text-center">
				<h2>"It does not matter how slowly you go, as long as you does
					not stop."</h2>
				<h3>-Confucius</h3>
			</div>
			<!--/.container-->
		</div>
	</section>

	<!--Price Table-->
	<section id="courses" class="secPad white">
		<div class="container">
			<div class="heading text-center">
				<!-- Heading -->
				<h2>Courses offered</h2>
				<p>Monthly Tuitions, Exam preparation and Technical courses</p>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-cogs fa-2x"></i>
						<div class="text">
							<h3>
								8<sup>th</sup> - 12<sup>th</sup>
							</h3>
							Science, Mathematics, Physics etc.<br />
							<br />
							<br />
							<br />
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-certificate fa-2x"></i>
						<div class="text">
							<h3>IIT JEE/AIEEE</h3>
							Entrance preparation, Physics, Chemistry and Mathematics.<br />
							<br />
							<br />
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-leaf fa-2x"></i>
						<div class="text">
							<h3>HTML5/CSS3</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
							eiusmod tempor incididunt ut labore et dolore magna aliqua.
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
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
							eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-quote-right fa-2x"></i>
						<div class="text">
							<h3>Data Base</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
							eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-arrows fa-2x"></i>
						<div class="text">
							<h3>Mobile App Dev</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
							eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!--About-->
	<section id="aboutUs" class="secPad">
		<div class="container">

			<div class="heading text-center">
				<!-- Heading -->
				<h2>About Us</h2>
				<p>About us text goes here</p>
			</div>
			<div class="row">
				<div class="col-md-4">
					<img src=""""),_display_(/*290.17*/routes/*290.23*/.Assets.versioned("images/1.jpg")),format.raw/*290.56*/("""" alt="" class="img-responsive img-thumbnail">
				</div>
				<div class="col-md-8">
					<p>Sed ut perspiciatis unde omnis iste natus error sit
						voluptatem accusantium doloremque laudantium, totam rem aperiam,
						eaque ipsa quae ab illo inventore veritatis et quasi architecto
						beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia
						voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur
						magni dolores eos qui ratione voluptatem sequi nesciunt. Neque
						porro quisquam est, qui dolorem ipsum quia dolor sit amet,
						consectetur, adipisci velit, sed quia non numquam eius modi
						tempora incidunt ut labore et dolore magnam aliquam quaerat
						voluptatem.</p>
					<blockquote class="blockquote-1">
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Integer posuere erat a ante. Anim pariatur cliche reprehenderit,
							enim eiusmod high life accusamus terry richardson ad squid</p>
						<small>Someone famous in <cite title="Source Title">Source
								Title</cite></small>
					</blockquote>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="carousel slide" data-ride="carousel"
						id="quote-carousel">
						<!-- Bottom Carousel Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#quote-carousel" data-slide-to="0"
								class="active"></li>
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
											<img class="img-circle" src=""""),_display_(/*332.42*/routes/*332.48*/.Assets.versioned("images/person_1.png")),format.raw/*332.88*/(""""
												style="width: 100px; height: 100px;">
										</div>
										<div class="col-sm-9">
											<p>Neque porro quisquam est qui dolorem ipsum quia dolor
												sit amet, consectetur, adipisci velit!</p>
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
											<img class="img-circle" src=""""),_display_(/*348.42*/routes/*348.48*/.Assets.versioned("images/person_2.png")),format.raw/*348.88*/(""""
												style="width: 100px; height: 100px;">
										</div>
										<div class="col-sm-9">
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Etiam auctor nec lacus ut tempor. Mauris.</p>
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
											<img class="img-circle" src=""""),_display_(/*364.42*/routes/*364.48*/.Assets.versioned("images/person_3.png")),format.raw/*364.88*/(""""
												style="width: 100px; height: 100px;">
										</div>
										<div class="col-sm-9">
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Ut rutrum elit in arcu blandit, eget pretium nisl
												accumsan. Sed ultricies commodo tortor, eu pretium mauris.</p>
											<small>Someone famous</small>
										</div>
									</div>
								</blockquote>
							</div>
						</div>

						<!-- Carousel Buttons Next/Prev -->
						<a data-slide="prev" href="#quote-carousel"
							class="left carousel-control"><i class="fa fa-chevron-left"></i></a>
						<a data-slide="next" href="#quote-carousel"
							class="right carousel-control"><i class="fa fa-chevron-right"></i></a>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!--Contact -->
	<section id="contactUs" class="page-section secPad">
		<div class="container">

			<div class="row">
				<div class="heading text-center">
					<!-- Heading -->
					<h2>Let's Keep In Touch!</h2>
					<p>Sign up and get a free sessions now</p>
				</div>
			</div>

			<div class="row mrgn30">

				<form method="post" action="" id="contactfrm" role="form">

					<div class="col-sm-4">
						<div class="form-group">
							<label for="name">Name</label> <input type="text"
								class="form-control" name="name" id="name"
								placeholder="Enter name"
								title="Please enter your name (at least 2 characters)">
						</div>
						<div class="form-group">
							<label for="email">Email</label> <input type="email"
								class="form-control" name="email" id="email"
								placeholder="Enter email"
								title="Please enter a valid email address">
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<label for="comments">Comments</label>
							<textarea name="comment" class="form-control" id="comments"
								cols="3" rows="5" placeholder="Enter your message…"
								title="Please enter your message (at least 10 characters)"></textarea>
						</div>
						<button name="submit" type="submit" class="btn btn-lg btn-primary"
							id="submit">Submit</button>
						<div class="result"></div>
					</div>
				</form>
				<div class="col-sm-4">
					<h4>Address:</h4>
					<address>
						WebThemez Company<br> 134 Stilla. Tae., 414515<br>
						Leorislon, SA 02434-34534 USA <br>
					</address>
					<h4>Phone:</h4>
					<address>
						12345-49589-2<br>
					</address>
				</div>
			</div>
		</div>
		<!--/.container-->
	</section>
	"""),_display_(/*446.3*/homePageFloatingMenu()),format.raw/*446.25*/(""" """),_display_(/*446.27*/footer()),format.raw/*446.35*/("""
"""),format.raw/*447.1*/("""</body>
</html>
"""),_display_(/*449.2*/requiredAssetsJS()),format.raw/*449.20*/("""
"""),format.raw/*450.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*451.31*/("""{"""),format.raw/*451.32*/("""
		"""),format.raw/*452.3*/("""$(".changeJoinUs").bind("click", function() """),format.raw/*452.47*/("""{"""),format.raw/*452.48*/("""
			"""),format.raw/*453.4*/("""$("#topDivJoinUs").css("top", "0px");
		"""),format.raw/*454.3*/("""}"""),format.raw/*454.4*/(""");
	"""),format.raw/*455.2*/("""}"""),format.raw/*455.3*/(""");
</script>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Nov 14 18:43:38 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/main.scala.html
                  HASH: 7dc13a15bc9c980af07bfde7801c400f1623a697
                  MATRIX: 743->1|853->16|880->17|954->66|979->71|1014->81|1053->100|1080->101|1123->118|1152->126|1181->128|2493->1413|2508->1419|2566->1456|3185->2048|3200->2054|3258->2091|3912->2718|3927->2724|3985->2761|4647->3395|4663->3401|4722->3438|10531->9219|10547->9225|10602->9258|12457->11085|12473->11091|12535->11131|13082->11650|13098->11656|13160->11696|13713->12221|13729->12227|13791->12267|16321->14770|16365->14792|16395->14794|16425->14802|16454->14803|16498->14820|16538->14838|16567->14839|16658->14901|16688->14902|16719->14905|16792->14949|16822->14950|16854->14954|16922->14994|16951->14995|16983->14999|17012->15000
                  LINES: 27->1|32->1|33->2|37->6|37->6|38->7|38->7|39->8|41->10|41->10|42->11|80->49|80->49|80->49|98->67|98->67|98->67|115->84|115->84|115->84|133->102|133->102|133->102|321->290|321->290|321->290|363->332|363->332|363->332|379->348|379->348|379->348|395->364|395->364|395->364|477->446|477->446|477->446|477->446|478->447|480->449|480->449|481->450|482->451|482->451|483->452|483->452|483->452|484->453|485->454|485->454|486->455|486->455
                  -- GENERATED --
              */
          