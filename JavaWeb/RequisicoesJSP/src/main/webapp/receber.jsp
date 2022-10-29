<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   String nome = request.getParameter("nome");
   String idade = request.getParameter("idade");
   
   out.print("Seu nome é: "+nome);
   out.print("<br>");
   out.print("Sua idade é: "+idade);
   out.print("<br>");   
   out.print("<a href='index.jsp' class='button'>voltar</a>");
   
   %>
</body>
</html>