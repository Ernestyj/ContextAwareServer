<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title><s:text name="HelloWorld"/></title>
  </head>  
  <body>
    <s:form action="helloAction">
    	<s:text name="请输入姓名："/>
    	<s:textfield name="userName" size="22"/>
    	<s:submit value="确定"/>&nbsp;
    	<s:reset value="重置"/>
    </s:form>
	<s:if test="hasFieldErrors()">
		<s:fielderror/>
	</s:if> 
  </body>
</html>
