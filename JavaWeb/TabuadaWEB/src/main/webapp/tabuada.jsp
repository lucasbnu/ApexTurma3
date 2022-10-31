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
  int numero = Integer.parseInt(request.getParameter("numero"));
  int limite = Integer.parseInt(request.getParameter("limite"));
  int i = 1;
  String Calculo = "";
  while (i <= limite){
	  Calculo = numero + " X " + i + " = "+(numero * i);
      out.print(Calculo);
      out.print("<br>");
	  i++;
  }
  
  %>
</body>
</html>