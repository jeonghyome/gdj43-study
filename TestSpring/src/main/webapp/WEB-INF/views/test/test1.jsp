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
	$("#btn").on("click", function() {
		$("#sendForm").submit();
	});
});
</script>
</head>
<body>
Hello World!!
<input type="button" value="버튼" id="btn" />
<form action="test2" id="sendForm">
	<input type="text" name="msg" /><br/>
	<input type="text" name="msg2" /><br/>
	<input type="checkbox" name="cb" value="1" />1
	<input type="checkbox" name="cb" value="2" />2
	<input type="checkbox" name="cb" value="3" />3
</form>
</body>
</html>