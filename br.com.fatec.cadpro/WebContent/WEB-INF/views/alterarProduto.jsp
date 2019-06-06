<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
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
    <link rel="stylesheet" type="text/css" href="css/excluirProduto.css">
</head>
<body>
 <h1>ALTERAR PRODUTO</h1>

    <!-- Barra de Navegação Lateral -->
    <nav id="menu" class=" navbar-light ">
        <ul id="nav">
            <li>
                <a id="logo-menu" class="navbar-brand" href="index">
                    <img src="imagens/icon.png" width="45" height="30" class="d-inline-block align-top" alt="">
                    CadPro
                </a>
            </li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="index">Início</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendas">Vendas</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendedores">Vendedores</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="produtos">Produtos</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="relatorios">Relatórios</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="redireciona">Sair</a></li>
        </ul>
    </nav>

    <!-- Seção de Campos Produto -->
    <section>

        <label id="cod-produto">COD. PRODUTO</label>
        <input type="input" id="input-cod" name="input-cod">
        <label id="desc-produto">DESCRIÇÃO</label>
        <input type="input" id="input-desc" name="input-desc">
        <label id="coduni-produto">COD. UNIDADE</label>
        <input type="input" id="input-coduni" name="input-coduni">
        <label id="codtipo-produto">COD. TIPO</label>
        <input type="input" id="input-codtipo" name="input-codtipo">
        <label id="precocusto-produto">PREÇO CUSTO</label>
        <input type="input" id="input-precocusto" name="input-precocusto">
        <label id="precovenda-produto">PREÇO VENDA</label>
        <input type="input" id="input-precovenda" name="input-precovenda">
        <label id="qntd-produto">QUANTIDADE</label>
        <input type="input" id="input-qntd" name="input-qntd">

    </section>
    <!-- Seção de Botões -->
   	  <form action="alteraProd" method="post">
     	<button class="botao" id="alterar" type="submit">ALTERAR</button>
 		<button class="botao" id="cancelar" onclick="btnTeste">CANCELAR</button>
  	  </form>
	
</body>
</html>