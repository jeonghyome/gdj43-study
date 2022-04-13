<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./jquery/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	$("#sendBtn").on("click", function() {
		if($.trim($("[name='msg']").val()) == "") {
			alert("입력하세요.");
		} else if(isNaN($("[name='msg']").val() * 1)) {
			alert("숫자를 입력하세요.")
		} else {
			// submit() : 폼 실행
			$("#sendForm").submit();			
		}
	});
});
</script>
</head>
<body>
<!-- 
	form : 값 전달 및 이동용 태그
	action : 목적지
	method : 전송방식
	전송방식 get : 주소창에 키와 값을 포함하여 전송
	전송방식 post : 주소데이터 헤더에 키와 값을 포함하여 전송.
	주소데이터 헤더 : 서버에 요청 시 사용자의 브라우저, ip등 접속 정보를 포함하여 넘어가는 데이터로 사용자에게는 보이지 않음
	URL : 주소
	URI : 주소 + 정보
 -->
<form action="Test04.jsp" id="sendForm" method="post">
	<!-- name : 값 전달 시 키값으로 사용 -->
	<input type="text" name="msg" />
	<input type="button" value="전송" id="sendBtn" />
</form>
</body>
</html>