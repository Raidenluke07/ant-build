<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
    <hr>
    <s:form action="hello">

        <s:textfield name="username" label="Username" />
        <s:password name="password" label="Password" />
        <s:textarea name="comments" label="Comments" rows="5" cols="40" />

   
        <s:submit value="Submit" />
        
  
        <input type="reset" value="Reset" />
    </s:form>
</body>
</html>
