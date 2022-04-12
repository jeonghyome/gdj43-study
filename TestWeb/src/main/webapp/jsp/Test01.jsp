<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello World!!
<!-- c:out ==> 출력용 -->
<c:out value="Hi"></c:out>
<!-- c:set ==> 변수선언 -->
<c:set var="a" value="11"></c:set>

<!-- c:if test ==> test에 있는 조건이 true이면 실행
	단건 조건
 -->
<c:if test="${a > 10}">
(●'◡'●)
</c:if>
<!-- else if ~~ else
	 choose : 복수 조건에 대한 조건처리
 -->
<c:choose>
	<c:when test="${a > 10}">
		a는 10보다 크다
	</c:when>
	<c:otherwise>
		a는 10보다 작거나 같다
	</c:otherwise>
</c:choose>
<%-- JSP주석 --%>
<%-- var : 변수선언, begin : 시작값, end : 종료값, step : 증감값 --%>
<%-- varStatus의 index : 순차데이터일 경우 인덱스번호. 아닐경우 숫자 var의 숫자 --%>
<c:forEach var="i" begin="1" end="10" step="1" varStatus="status">
	<c:choose>
	<%-- el에서 같다 : eq, 다르다 : ne --%>
		<c:when test="${status.count % 2 eq 0 }">
			<b>${i},${status.index},${status.count}</b><br/>			
		</c:when>
		<c:otherwise>		
			${i},${status.index},${status.count}<br/>
		</c:otherwise>
	</c:choose>
</c:forEach>
<!-- c:import ==> 해당 페이지의 내용(HTML)을 해당 위치에 넣겠다. -->
<c:import url="Test02.jsp">
	<%-- c:param ==> import페이지에 해당 키(name)로 값(entity 또는 value속성)을 전송 --%>
	<c:param name="msg">메시지전송!</c:param>
</c:import>
</body>
</html>