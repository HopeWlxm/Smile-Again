<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>Custom Form Elements - Vali Admin</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="/css/main.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css">
  </head>
  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <%@include file="commons/header.jsp" %>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <%@include file="commons/left.jsp" %>
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-edit"></i> Custom Form Elements</h1>
          <p>Customized form elements</p>
        </div>
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item">Forms</li>
          <li class="breadcrumb-item"><a href="#">Custom Componants</a></li>
        </ul>
      </div>
      <div class="row">
        <div class="col-md-6">
          <div class="tile">
            <h3 class="tile-title">Animated Checkbox and Radio Buttons</h3>
            <!--Radio Button Markup-->
            <div class="animated-radio-button">
              <label>
                <input type="radio"><span class="label-text">Radio Button</span>
              </label>
            </div>
            <!--Checkbox Markup-->
            <div class="animated-checkbox">
              <label>
                <input type="checkbox"><span class="label-text">Checkbox</span>
              </label>
            </div>
            <h4>Disabled state</h4>
            <div class="animated-radio-button">
              <label>
                <input type="radio" disabled=""><span class="label-text">Radio Button</span>
              </label>
            </div>
            <div class="animated-checkbox">
              <label>
                <input type="checkbox" disabled=""><span class="label-text">Checkbox</span>
              </label>
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="tile">
            <h3 class="tile-title">Animated Toggle Button</h3>
            <div class="row">
              <div class="col-md-6">
                <p><b>Toggle Button</b></p>
                <div class="toggle">
                  <label>
                    <input type="checkbox"><span class="button-indecator"></span>
                  </label>
                </div>
                <div class="toggle lg">
                  <label>
                    <input type="checkbox"><span class="button-indecator"></span>
                  </label>
                </div>
                <h5>Disabled state</h5>
                <div class="toggle">
                  <label>
                    <input type="checkbox" disabled=""><span class="button-indecator"></span>
                  </label>
                </div>
              </div>
              <div class="col-md-6">
                <p><b>Fliping Toggle Button</b></p>
                <div class="toggle-flip">
                  <label>
                    <input type="checkbox"><span class="flip-indecator" data-toggle-on="ON" data-toggle-off="OFF"></span>
                  </label>
                </div>
                <h5>Disabled state</h5>
                <div class="toggle-flip">
                  <label>
                    <input type="checkbox" disabled=""><span class="flip-indecator" data-toggle-on="ON" data-toggle-off="OFF"></span>
                  </label>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="clearfix"></div>
        <div class="col-md-6">
          <div class="tile">
            <div class="tile-title-w-btn">
              <h3 class="title">Select2</h3>
              <p><a class="btn btn-primary icon-btn" href="https://select2.github.io/examples.html" target="_blank"><i class="fa fa-file"></i>Docs</a></p>
            </div>
            <div class="tile-body">
              <p>This plugin can be used to convert select element into advanced componant.</p>
              <h4>Demo</h4>
              <select class="form-control" id="demoSelect" multiple="">
                <optgroup label="Select Cities">
                  <option>Ahmedabad</option>
                  <option>Surat</option>
                  <option>Vadodara</option>
                  <option>Rajkot</option>
                  <option>Bhavnagar</option>
                  <option>Jamnagar</option>
                  <option>Gandhinagar</option>
                  <option>Nadiad</option>
                  <option>Morvi</option>
                  <option>Surendranagar</option>
                  <option>Junagadh</option>
                  <option>Gandhidham</option>
                  <option>Veraval</option>
                  <option>Ghatlodiya</option>
                  <option>Bharuch</option>
                  <option>Anand</option>
                  <option>Porbandar</option>
                  <option>Godhra</option>
                  <option>Navsari</option>
                  <option>Dahod</option>
                  <option>Botad</option>
                  <option>Kapadwanj</option>
                </optgroup>
              </select>
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="tile">
            <div class="tile-title-w-btn">
              <h3 class="title">Date Picker</h3>
              <p><a class="btn btn-primary icon-btn" href="http://bootstrap-datepicker.readthedocs.org/en/stable/options.html" target="_blank"><i class="fa fa-file"></i>Docs</a></p>
            </div>
            <div class="tile-body">
              <p>This plugin can be used to let the user select the date in a convinient way.</p>
              <h4>Demo</h4>
              <input class="form-control" id="demoDate" type="text" placeholder="Select Date">
            </div>
          </div>
        </div>
      </div>
    </main>
    <!-- Essential javascripts for application to work-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/popper.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/main.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="/js/plugins/pace.min.js"></script>
    <!-- Page specific javascripts-->
    <script type="text/javascript" src="/js/plugins/bootstrap-datepicker.min.js"></script>
    <script type="text/javascript" src="/js/plugins/select2.min.js"></script>
    <script type="text/javascript" src="/js/plugins/bootstrap-datepicker.min.js"></script>
    <script type="text/javascript">
      $('#sl').click(function(){
      	$('#tl').loadingBtn();
      	$('#tb').loadingBtn({ text : "Signing In"});
      });
      
      $('#el').click(function(){
      	$('#tl').loadingBtnComplete();
      	$('#tb').loadingBtnComplete({ html : "Sign In"});
      });
      
      $('#demoDate').datepicker({
      	format: "dd/mm/yyyy",
      	autoclose: true,
      	todayHighlight: true
      });
      
      $('#demoSelect').select2();
    </script>
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
  </body>
</html>