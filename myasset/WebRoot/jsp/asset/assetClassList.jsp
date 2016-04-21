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
    <s:iterator value="assetClassList">
    <table border="1" cellspacing="0">
	    <tr><td>assetclassid</td><td><s:property value="assetclassid"/></td></tr>
	    <tr><td>assetclasscoding</td><td><s:property value="assetclasscoding" /></td></tr>
	    <tr><td>assetclassname</td><td><s:property value="assetclassname"/></td></tr>
	    <tr><td>iassetclassid</td><td><s:property value="iassetclassid"/></td></tr>
	    <tr><td>iassetclassname</td><td><s:property value="iassetclassname"/></td></tr>
	    <tr>
		    <td align="center"><a href="findAssetClass.action?assetclassid=<s:property value="assetclassid"/>">更新</a></td>
		    <td align="center"><a href="removeAssetClass.action?assetclassid=<s:property value="assetclassid"/>">删除</a></td>
	    </tr>
    </table>
    </s:iterator>
    <a href="/myasset/jsp/asset/addAssetClass.jsp">添加</a>

  </body>
</html>
