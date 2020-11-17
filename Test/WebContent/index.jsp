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
      <form action = "loginaction" method = "post">
         User:<br/><input type = "text" name = "user"/><br/>
         Password:<br/><input type = "password" name = "password"/><br/>
         <input type = "submit" value = "Login"/>		
      </form>
 </body>


</html>