<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登录系统</title>
<s:head/>
</head>
<body>
<%@include file="header.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
Please input username and password<br />
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="processLogin">
	<s:textfield name="manager.name" label="Username"/>
	<s:textfield name="manager.pass" label="Password"/>
	<s:textfield name="vercode" label="Validation Code"/>
	<tr><td colspan="2">
	<s:submit value="Login" theme="simple"/><s:reset  theme="simple" value="Reset"/>
	</td></tr>
</s:form>
</div>
Validation Code：<img name="d" src="authImg">
</td>
</tr>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
