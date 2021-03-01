<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<div style="background-color:#00008b;color:#ffffff;height:20px;padding:5ps;">
자바 JSP 시험
<c:if test="${!empty userDTO }">
<span style="float:right;">
<a style="color:white;" >${userDTO.userName}</a>
<a style="color:white;" href="Logout">로그아웃</a>
</span>

</c:if>

</div>