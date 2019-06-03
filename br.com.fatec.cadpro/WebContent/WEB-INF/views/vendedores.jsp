<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <title>VENDEDORES | CADPRO</title>
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
    <h1>VENDEDORES</h1>

    <!-- Barra de Navega��o Lateral -->
    <nav id="menu" class=" navbar-light ">
        <ul id="nav">
            <li>
                <a id="logo-menu" class="navbar-brand" href="index.jsp">
                    <img src="imagens/icon.png" width="45" height="30" class="d-inline-block align-top" alt="">
                    CadPro
                </a>
            </li>
             <li><a id="link-menu" class="nav-link navbar-brand" href="index.jsp">In�cio</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendas.jsp">Vendas</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendedores.jsp">Vendedores</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="produtos.jsp">Produtos</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="relatorios.jsp">Relat�rios</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="redireciona.jsp">Sair</a></li>
        </ul>
    </nav>

    <!-- Sel��o de Relat�rios -->
    <label id="nome-vendedor">NOME VENDEDOR</label>
    <input type="input" id="input-nome">

    <!-- Se��o de calend�rio -->
    <section>
        <label id="data-relatorio">DATA</label>
        <input type="date" id="input-data">
    </section>

    <!-- Combo box -->
    <select id="combo-vendedor">
        <option value="funcao">Selecione a fun��o</option>
        <option value="comissao">COMISS�O</option>
        <option value="vendas">VENDAS</option>
    </select>

    <!-- Bot�es -->
    <button class="botao" id="gerar">GERAR RELAT�RIO</button>
</body>

</html>