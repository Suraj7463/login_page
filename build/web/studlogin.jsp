<%-- 
    Document   : studlogin
    Created on : 25 Nov, 2022, 2:36:58 PM
    Author     : suraj dudhabhate
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(img/dev.jpg);background-size: cover;background-attachment: fixed">
        <div class="container">
            
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3 style='margin-top: 10px;'class='center-align'>Login here !!</h3>
                            <h5 id="msg" class="center-align"></h5>
                            <div class="form center-align" >
                                <form action="loginpage" method="get" id="myform">
                                    <input type="email" name="email" placeholder="enter your email" />
                                    <input type="password" name="Password" placeholder="enter your password" />
                                    
                                    
   
                                    <button type="submit" class="btn center-align"style="background-color: #1565c0 blue darken-3">Login</button>
                                 </form>


                            </div>
                            <div class="loader center-align" style="margin-top: 10px; display: none">
                                

                                <div class="preloader-wrapper active">
                                  <div class="spinner-layer spinner-red-only">
                                    <div class="circle-clipper left">
                                      <div class="circle"></div>
                                    </div><div class="gap-patch">
                                      <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                      <div class="circle"></div>
                                    </div>
                                  </div>
                                </div>
                                <h5>Please wait...</h5>

  
                                
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
        
        </div>
        <script
            <script
                src="https://code.jquery.com/jquery-3.6.0.min.js"
                integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
                crossorigin="anonymous"></script>
<!--                <script>
                    $(document).ready(function () { 
                            console.log("page is ready......")
                            $("#myform").on('submit',function(event){
                                event.preventDefault();
                                var f= $(this).serialize();
                              
                                console.log(f);
                                $(".loader").show();
                                $(".form").hide();
                                
                                $.ajax({
                                    url:"loginpage",
                                    data: f,
                                    type:'get',
                                    success: function(data,textStatus, jqXHR){
                                        console.log(data);
                                        console.log("success.......")
                                        $(".loader").hide();
                                        $(".form").show();
                                        if (data.trim() === 'done')
                                        {
                                            $('#msg').html("Successfully Registered !!")
                                            $("#msg").addClass('green-text')
                                        } else
                                        {
                                            $('#msg').html("Something went wrong on server !!")
                                            $("#msg").addClass('red-text')
                                        }
                                    },
                                    error: function (jqXHR, textStatus, errorThrown){
                                        console.log(data);
                                        console.log("error.......")
                                        $(".loader").hide();
                                        $(".form").show();
                                        $('#msg').html("Something went wrong on server !!")
                                        $("#msg").addClass('red-text')
                                    }
                                    
                                    
                                })
                            })
                        })
                </script>
     -->
    </body>
</html>

