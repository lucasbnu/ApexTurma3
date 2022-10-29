<%@page import="DAO.ClientesDAO"%>
<%@page import="DTO.ClientesDTO"%>
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
  ClientesDTO cliente = new ClientesDTO();
  ClientesDAO DAO = new ClientesDAO();
  String id = request.getParameter("id_cliente");
  String nome = request.getParameter("nome_cliente");
  String idade = request.getParameter("idade");
  String Situacao = request.getParameter("situacao");
  

  cliente.setIdade( Integer.parseInt(idade) );
  cliente.setAtivo(  Integer.valueOf(Situacao) );
  cliente.setNome_cliente(nome);
  
  if (id.equals("-1")){
	 DAO.Insere(cliente);
  }else{
	  cliente.setId_cliente( Integer.parseInt(id) );
	  DAO.atualizaCliente(cliente);
  }
  response.sendRedirect("cadastroCliente.jsp");

%>
</body>
</html>