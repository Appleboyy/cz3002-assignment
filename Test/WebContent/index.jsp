<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<meta charset="UTF-8">
<title>Login Page </title>
</head>
<body>
<s:form action = "login"> 
<s:textfield label ="Login User ID" key = "userID" />
<s:password label ="Password" key = "password" />
<s:submit />

</s:form>


</body>
</html>