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
	$("#backBtn").on("click", function() {
		history.back();
	});
});
</script>
</head>
<body>
${param.dan}단<br/>
<hr/>
${gugu}<br/>
<hr/>
<input type="button" id="backBtn" value="Back" /><br/>
</body>
</html>