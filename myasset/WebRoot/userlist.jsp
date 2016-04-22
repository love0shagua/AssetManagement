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
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
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
    <s:iterator value="users">
    <table border="1" cellspacing="0">
    <tr><td>userid</td><td><s:property value="userid"/></td></tr>
    <tr><td>username</td><td><s:property value="username" /></td></tr>
    <tr><td>userpwd</td><td><s:property value="userpwd"/></td></tr>
    <tr><td>userstate</td><td><s:property value="userstate"/></td></tr>
    <tr><td>usersex</td><td><s:property value="usersex"/></td></tr>
    <tr><td align="center">
    <a href="getUser.action?userid=<s:property value="userid" /> ">更新</a></td>
    
    <td align="center">
   
     <a href='<s:url action="deleteUser"><s:param name="userid" value="userid"></s:param></s:url>'>删除</a>
    
    </td>
   </tr>
    </table>
    </s:iterator>
  </body>
</html>
