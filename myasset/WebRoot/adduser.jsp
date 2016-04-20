<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="addUser">
    <s:textfield name="userinformation.department" label="department"></s:textfield>
    <s:textfield name="userinformation.roletype" label="roletype"></s:textfield>
    <s:textfield name="userinformation.username" label="username"></s:textfield>
    <s:textfield name="userinformation.userpwd" label="userpwd"></s:textfield>
    <s:textfield name="userinformation.userstate" label="userstate"></s:textfield>
    <s:textfield name="userinformation.usersex" label="usersex"></s:textfield>
    <s:submit value="submit"></s:submit>
    </s:form>
  </body>
</html>
