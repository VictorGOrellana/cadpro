<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <title>VENDAS | CADPRO</title>
    <meta charset="UTF-8">
    <link rel="icon" href="./imagens/logo-icon.jpeg">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="css/bootstrap-grid.min.css.map">
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css.map">
    <link rel="stylesheet" href="css/bootstrap.min.css.map">
    <link rel="stylesheet" type="text/css" href="css/vendas.css">
</head>

<body>
   <h1>VENDAS</h1>

    <!-- Barra de Navegação Lateral -->
    <nav id="menu" class=" navbar-light ">
        <ul id="nav">
            <li>
                <a id="logo-menu" class="navbar-brand" href="index.html">
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

    <!-- Seção de tabela -->

    <table id="tabela-vendas">
        <thead id="thead-vendas">
            <tr>
                <th> COD. VENDA </th>
                <th> VENDEDOR </th>
                <th> DATA </th>
                <th> VALOR TOTAL </th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th class="cod_vendedor">000001</th>
                <td>Joelma Mendes</td>
                <td>25/10/2018</td>
                <td>R$1530</td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <th class="cod_vendedor"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
        <button class="botao-venda" id="efetuar-venda" onclick="window.location='efetuarVenda.jsp';">EFETUAR VENDA</button>
        <button class="botao-venda" id="alterar" onclick="window.location='alterarVenda.jsp';">ALTERAR</button>
        <button class="botao-venda" id="excluir" onclick="window.location='excluirVenda.jsp';">EXCLUIR</button>
    </table>
    </body>
</html>