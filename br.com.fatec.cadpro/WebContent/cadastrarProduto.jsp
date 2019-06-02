<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
    <h1>CADASTRAR PRODUTO</h1>

    <!-- Barra de Navegação Lateral -->
    <nav id="menu" class=" navbar-light ">
        <ul id="nav">
            <li>
                <a id="logo-menu" class="navbar-brand" href="index.html">
                    <img src="imagens/icon.png" width="45" height="30" class="d-inline-block align-top" alt="">
                    CadPro
                </a>
            </li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="index.html">Início</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendas.html">Vendas</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendedores.html">Vendedores</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="produtos.html">Produtos</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="relatorios.html">Relatórios</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="redireciona.html">Sair</a></li>
        </ul>
    </nav>

    <!-- Seção de Campos Produto -->
    <section>

        <label id="cod-produto">COD. PRODUTO</label>
        <input type="input" id="input-cod">
        <label id="desc-produto">DESCRIÇÃO</label>
        <input type="input" id="input-desc">
        <label id="coduni-produto">COD. UNIDADE</label>
        <input type="input" id="input-coduni">
        <label id="codtipo-produto">COD. TIPO</label>
        <input type="input" id="input-codtipo">
        <label id="precocusto-produto">PREÇO CUSTO</label>
        <input type="input" id="input-precocusto">
        <label id="precovenda-produto">PREÇO VENDA</label>
        <input type="input" id="input-precovenda">
        <label id="qntd-produto">QUANTIDADE</label>
        <input type="input" id="input-qntd">

    </section>
    <!-- Seção de Botões -->
    <button class="botao" id="cadastrar" onclick="window.location='produtos.html';">CADASTRAR</button>
    <button class="botao" id="cancelar" onclick="window.location='produtos.html';">CANCELAR</button>

</body>

</html>