<%-- 
    Document   : mainPage
    Created on : Sep 21, 2017, 11:20:12 PM
    Author     : 715060
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:import url="/includes/header.html"/>
   
        <h1>Main Page</h1>
        Hello, ${username}     <a href ="mainpagelogout">Logout</a>

<c:import url="/includes/footer.html"/>
