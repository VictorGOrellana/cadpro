<%@page import="br.com.fatec.cadpro.controller.AlterarProdutoController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>PRODUTOS | CADPRO</title>
<meta charset="UTF-8">
<link rel="icon" href="./imagens/logo-icon.jpeg">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-grid.min.css">
<link rel="stylesheet" href="css/bootstrap-grid.min.css.map">
<link rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/bootstrap-reboot.min.css.map">
<link rel="stylesheet" href="css/bootstrap.min.css.map">
<link rel="stylesheet" type="text/css" href="css/produtos.css">
</head>

<body>
	<h1>PRODUTOS</h1>

	<!-- Barra de Navega��o Lateral -->
	<nav id="menu" class=" navbar-light ">
		<ul id="nav">
			<li><a id="logo-menu" class="navbar-brand" href="index.jsp">
					<img src="imagens/icon.png" width="45" height="30"
					class="d-inline-block align-top" alt=""> CadPro
			</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand" href="index">In�cio</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand"
				href="vendas">Vendas</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand"
				href="vendedores">Vendedores</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand"
				href="produtos">Produtos</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand"
				href="relatorios">Relat�rios</a></li>
			<li><a id="link-menu" class="nav-link navbar-brand"
				href="redireciona">Sair</a></li>
		</ul>
	</nav>

	<!-- Se��o de tabela -->
	<table id="tabela-produtos">
		<thead>
			<tr>
				<th>COD. PRODUTO</th>
				<th>NOME</th>
				<th>DESCRI��O</th>
				<th>PESO</th>
				<th>ESTOQUE</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th class="cod_vendedor">1</th>
				<td>Cano Tigre</td>
				<td>Cano PVC de 2 metros</td>
				<td>500 gramas</td>
				<td>500</td>
			</tr>
			<tr>
				<th class="cod_vendedor">2</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th class="cod_vendedor">3</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th class="cod_vendedor">4</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th class="cod_vendedor">5</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th class="cod_vendedor">6</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<th class="cod_vendedor">7</th>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</tbody>
		<button class="botao" id="cadastrar"
			onclick="window.location='cadastrarProduto.jsp';">CADASTRAR</button>
		<button class="botao" id="alterar" onclick="window.location='alterarProduto';">ALTERAR</button>
		<button class="botao" id="excluir"
			onclick="window.location='excluirProduto.jsp';">EXCLUIR</button>
	</table>
</body>

</html>