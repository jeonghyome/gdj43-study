<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#backBtn").on("click", function() {
		// history.back() : 방문기록 바로 전단계로 이동
		// history.go(개수) : 해당 개수만큼 방문기록 이동
		// history.go(-1)
		history.back();
	});
});
</script>
</head>
<body>
${param.msg}단
<input type="button" value="뒤로가기" id="backBtn" />
<br/>
<%-- 받아온 숫자를 이용하여 구구단 출력 --%>
<c:forEach	var="i" begin="1" end="9" step="1">
${param.msg} * ${i} = ${param.msg * i}<br/>
</c:forEach>
</body>
</html>