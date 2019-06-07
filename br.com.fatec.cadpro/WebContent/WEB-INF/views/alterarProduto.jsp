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
    <link rel="stylesheet" type="text/css" href="css/manipulacaoProduto.css">
<meta charset="ISO-8859-1">


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
    <form id="section-cadastrar-produto" class="form-row">

        <div class="col">
            <label id="id-produto">ID PRODUTO</label>
            <input type="number" id="idProduto">
        </div>
        <div class="col">
            <label id="cod-produto">COD. PRODUTO</label>
            <input type="text" id="codProduto">
        </div>
        <div class="col">
            <label id="desc-produto">DESCRIÇÃO</label>
            <input type="text" id="descricao">
        </div>
        <div class="col">
            <label id="coduni-produto">COD. UNIDADE</label>
            <input type="number" id="codUnidade">
        </div>
        <div class="col">
            <label id="codtipo-produto">COD. TIPO</label>
            <input type="number" id="codTipo">
        </div>
        <div class="col">
            <label id="precocusto-produto">PREÇO CUSTO</label>
            <input type="number" id="precoCusto">
        </div>
        <div class="col">
            <label id="precovenda-produto">PREÇO VENDA</label>
            <input type="number" id="precoVenda">
        </div>
        <div class="col">
            <label id="qntd-produto">QUANTIDADE</label>
            <p><input type="number" id="quantidade">
        </div>
    </form>
    <!-- Seção de Botões -->
    <section id="section-botoes">
        <button class="botao" id="alterar" onclick="window.location='produtos.html';">ALTERAR</button>
        <button class="botao" id="cancelar" onclick="window.location='produtos.html';">CANCELAR</button>
    </section>
</body>
</html>