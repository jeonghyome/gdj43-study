<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- param : 이전 페이지에서 넘어오는 정보중 키가 일치하는 것을 가져온다. -->
${param.msg}<br/>
${csend}<br/><!-- controller에서 보낸 것은 param 없이 사용 가능  -->
${rsend}<br/>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
		</tr>
	</thead>
	<tbody>
		<!-- items : 순차데이터를 하나씩 꺼내서 가져온다. -->
		<c:forEach var="data" items="${board}">
			<tr>
				<td>${data.no}</td>
				<td>${data.title}</td>
				<td>${data.writer}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>