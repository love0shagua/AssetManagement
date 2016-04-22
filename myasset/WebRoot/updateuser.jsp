<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateuser.jsp' starting page</title>
    
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
  <s:set value="userinformation" name="user"></s:set>
    <s:form action="updateUser"  >
   <input name="userid" type="hidden" value="<%=request.getParameter("userid")%>">
    username:<input name="username"  value="<s:property value="userinformation.username"/>"></input></br>
    userpwd:<input name="userpwd"  value="<s:property value="userinformation.userpwd"/>"></input></br> <!-- 两种取值方法 -->
    userstate:<input name="userstate"  value="<s:property value="#user.userstate"/>"></input></br>
    usersex:<input name="usersex"  value="<s:property value="#user.usersex"/>"></input></br>

   <s:submit value="submit"></s:submit>
      
   </s:form>
  </body>
</html>
