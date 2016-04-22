<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
  <meta charset="UTF-8" /> 
  <title>Particleground demo</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/style.css" />
  <script type='text/javascript' src='js/jquery-1.11.1.min.js'></script>
  <script type='text/javascript' src='js/jquery.particleground.min.js'></script>
  <script type='text/javascript' src='js/demo.js'></script>
</head> 

<body>

<div id="particles">
  <div class="intro">
    <h1>Particleground</h1>
    <p>A jQuery plugin for snazzy background particle systems</p>
  </div>
</div>



</body> 
</html>
