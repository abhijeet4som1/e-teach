/**
 * function to initialize the student page.
 */
function studentPageInitialize(){
	initilizingSlides();	
	//setting form submit method for register.
	$("#register-form").submit(function(e)
			{
			    var postData = $(this).serializeArray();
			    var formURL = $(this).attr("action");
			    $.ajax(
			    {
			        url : formURL,
			        type: "POST",
			        data : postData,
			        success:function(data, textStatus, jqXHR) 
			        {
			            //data: return data from server
			        	alert(data);
			        },
			        error: function(jqXHR, textStatus, errorThrown) 
			        {
			        	handleFormSubmitError(jqXHR.responseText);
			        }
			    });
			    e.preventDefault(); //STOP default action
			    e.unbind(); //unbind. to stop multiple form submit.
			});
}

/**
 * initializing slides for the student and tutor page.
 */
function initilizingSlides(){
	$('#slides').superslides({
		play: 5000,
		animation_speed: 2000,
		animation: 'fade',
		pagination: false
	});
	
	$('.tutors_nav').slick({
		  dots: true,	  
		  infinite: true,
		  speed: 300,
		  slidesToShow: 5,
		  arrows:false,  
		  slidesToScroll: 1,
		  slide: 'li',
		  responsive: [
		    {
		      breakpoint: 1024,
		      settings: {
		        slidesToShow: 3,
		        slidesToScroll: 3,
		        infinite: true,
		        arrows:false
		      }
		    },
		    {
		      breakpoint: 600,
		      settings: {
		        slidesToShow: 2,
		        slidesToScroll: 2
		      }
		    },
		    {
		      breakpoint: 480,
		      settings: {
		        slidesToShow: 1,
		        slidesToScroll: 1
		      }
		    }
		    // You can unslick at a given breakpoint now by adding:
		    // settings: "unslick"
		    // instead of a settings object
		  ]
		});
}

/**
 * Initializing tutor page.
 */
function initializingTutor(){
	initilizingSlides();
}