<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="css/public.css" type="text/css" rel="stylesheet">
        <link href="css/houtai.css" type="text/css" rel="stylesheet">
        <link href="css/smartMenu.css" type="text/css" rel="stylesheet">
        <title>校友网</title>
    </head>
    <body>
    	<div id="admin">
    		<div class="ad-menu" id="ad-menu">
                <div class="ad-logo"><img src="image/m-logo.png" height="120" width="100"></div>
                <div class="ad-list">
                    <ul>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic1"></em>用户管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="adduser.jsp" class="dd-item">添加用户<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="userList.action" class="dd-item">用户列表<span class="scm dd-ar"></span></a>         
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic2"></em>资产管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">添加资产<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">资产列表<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                        <div class="li-item"><em class="scm li-ico ic3"></em>部门管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">添加部门<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">部门列表<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <%-- <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>社区管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic5"></em>捐赠管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic6"></em>统计管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic7"></em>系统管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">校友高级搜索<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li> --%>
                    </ul>
                </div>
            </div>
    		<div class="ad-comment-box" id="ad-comment">
                <div class="ad-top-comment">
                    <div class="ad-message">
                     <%--    <div class="ad-top-left">
                            <div class="ad-change-btn"><a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a></div>
                            <div class="ad-search-box clear">
                                <div class="ad-search-sel">
                                    <select>
                                        <option>新闻类</option>
                                        <option>新闻吩咐道类</option>
                                        <option>新闻广告费类</option>
                                        <option>新闻苟富贵类</option>
                                    </select>
                                </div>
                                <div class="ad-search-cha">
                                    <input type="text" class="ad-search-input" placeholder="请输入你要查找的内容">
                                    <input type="submit" class="scm ad-search-btn" value=""> 
                                </div>
                            </div>
                        </div> --%>
                        <div class="ad-top-right">
                            <div class="ad-notice">
                                <ul>
                                    <li>
                                        <a href="javascript:;" class="scm nt1"><span class="scm nt-count dot">12</span></a>
                                    </li>
                                    <li>
                                        <a href="javascript:;" class="scm nt2"><span class="scm nt-count dot">12</span></a>
                                    </li>
                                    <li>
                                        <a href="javascript:;" class="scm nt3"><span class="scm nt-count dot">12</span></a>
                                    </li>
                                </ul>
                            </div>
                            <div class="ad-welcom">
                                <div class="ad-wel-img"><img src="image/min_logo.png" height="36" width="36"></div>
                                <div class="ad-wel-text">
                                    <div class="font-wel">欢迎您！<strong>李春华</strong></div>
                                    <div class="font-wel"><a href="javascript:;"><strong>【退出】</strong></a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- <div class="ad-main-nav-box">
                        <ul id="breadcrumbs-three">
                            <li title="首页"><a href="javascript:;" class="dot">首页</a></li>
                        </ul>
                        <a href="javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
                        <div class="ad-main-wraper .J_menuItems">
                            <ul class="ad-main-list" id="ad-main">
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a J_mainRight next"></a>
                    </div> -->
                   <!--  <div class="ad-sub-nav-box content-tabs">
                        <div class="ad-sub-record">历史记录</div>
                        <a href="javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
                        <div class="ad-sub-wraper page-tabs J_menuTabs">
                            <ul class="ad-sub-list page-tabs-content">
                                <li class="active J_menuTab" data-id="index_v0.html">首页</li>
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
                    </div> -->
                </div>
                <div class="ad-main-comment J_mainContent" id="ad-iframe">
                    <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id="index_v0.html" seamless></iframe>
                </div>
    		</div>
    	</div>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/contabs.js"></script>
        <script type="text/javascript" src="js/maintabs.js"></script>
        <script type="text/javascript" src="js/jquery-smartMenu-min.js"></script>
        <script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $(".ad-menu").niceScroll({cursorborder:"0 none",cursorcolor:"#1a1a19",cursoropacitymin:"0",boxzoom:false});
            })
        </script>
    </body>
</html>