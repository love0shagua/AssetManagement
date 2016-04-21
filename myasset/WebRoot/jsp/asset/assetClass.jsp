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
    
    <title>My JSP 'addAsset.jsp' starting page</title>
    
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
    <s:form action="updateAssetClass"  >
   	<input name="userid" type="hidden" value="<%=request.getParameter("userid")%>">
    assetclassid:<input name="assetclassid"  value="<s:property value="assetclass.assetclassid"/>"></input></br>
    assetclasscoding:<input name="assetclasscoding"  value="<s:property value="assetclass.assetclasscoding"/>"></input></br> <!-- 两种取值方法 -->
    assetclassname:<input name="assetclassname"  value="<s:property value="assetclass.assetclassname"/>"></input></br>
    iassetclassid:<input name="iassetclassid"  value="<s:property value="assetclass.iassetclassid"/>"></input></br>
    iassetclassname:<input name="iassetclassname"  value="<s:property value="assetclass.iassetclassname"/>"></input></br>
   	<s:submit value="submit"></s:submit>
   	</s:form>
    

  </body>
</html>
