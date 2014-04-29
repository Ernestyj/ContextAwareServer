<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" info="This is for test."%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Test page</title>
    
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
    This is my JSP page. <br>
    <form id="login" method="post" action="forwardtest.jsp">
    	<input type="text" name="username"/>
    	<input type="submit" value="login"/>
    </form>
    <%-- <jsp:forward page="forwardtest.jsp">
    	<jsp:param name="age" value="22"/></jsp:forward> --%>
  </body>
</html>
