<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery/jquery-1.12.4"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#goBtn").on("click", function() {
		if($.trim($("#dan").val()) == ""){
			alert("입력하세요");
		}else if(isNaN($("#dan").val() * 1)){
			alert("숫자를 입력하세요");
			$("#dan").val("");
			$("#dan").focus();
		}else{
			$("#sendForm").submit();
		}
	});
});
</script>
</head>
<body>
<form action="test4" id="sendForm">
	<input type="text" id="dan" name="dan" />
	<input type="button" value="Go" id="goBtn" /> 
</form>
</body>
</html>