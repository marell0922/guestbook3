<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/jquery/jquery-1.9.0.js"></script>
<script type="text/javascript">
$(function(){
	$('#guestbook-delete').submit(function(event){
		console.log('submit')
		var password=$("input[type='password']").val();
		if(password==""){
			alert('비밀번호는 필수 입력 사항입니다.')
			return;
		}
	});
})
</script>
</head>
<body>
	<form id="guestbook-delete"method="post" action="${pageContext.servletContext.contextPath }/delete">
	<input type='hidden' name="no" value="${no }">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password" ></td>
			<td><input type="submit" value="확인"></td>
		</tr>
	</table>
	</form>
	<p><a href="${pageContext.servletContext.contextPath }">메인으로 돌아가기</a></p>
</body>
</html>