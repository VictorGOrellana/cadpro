<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
    <link rel="stylesheet" type="text/css" href="css/excluirVendedor.css">
</head>

<body>
    <h1>CADASTRAR VENDEDOR</h1>

    <!-- Barra de Navegação Lateral -->
    <nav id="menu" class=" navbar-light ">
        <ul id="nav">
            <li>
                <a id="logo-menu" class="navbar-brand" href="index.html">
                    <img src="imagens/icon.png" width="45" height="30" class="d-inline-block align-top" alt="">
                    CadPro
                </a>
            </li>
           <li><a id="link-menu" class="nav-link navbar-brand" href="index.jsp">Início</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendas.jsp">Vendas</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="vendedores.jsp">Vendedores</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="produtos.jsp">Produtos</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="relatorios.jsp">Relatórios</a></li>
            <li><a id="link-menu" class="nav-link navbar-brand" href="redireciona.jsp">Sair</a></li>
        </ul>
    </nav>

    <!-- Seção de Campos Vendedor -->
    <section>

        <label id="cod-vendedor">COD. VENDEDOR</label>
        <input type="input" id="input-cod">
        <label id="nome-vendedor">NOME</label>
        <input type="input" id="input-nome">
        <label id="endereco-vendedor">ENDEREÇO</label>
        <input type="input" id="input-endereco">
        <label id="bairro-vendedor">BAIRRO</label>
        <input type="input" id="input-bairro">
        <label id="cidade-vendedor">CIDADE</label>
        <input type="input" id="input-cidade">
        <label id="estado-vendedor">ESTADO</label>
        <input type="input" id="input-estado">
        <label id="cep-vendedor">CEP</label>
        <input type="input" id="input-cep">
        <label id="cpf-vendedor">CPF</label>
        <input type="input" id="input-cpf">
        <label id="rg-vendedor">RG</label>
        <input type="input" id="input-rg">
        <label id="fone-vendedor">FONE</label>
        <input type="input" id="input-fone">
        <label id="email-vendedor">E-MAIL</label>
        <input type="email" id="input-email">
        <label id="datanasc-vendedor">DATA NASCIMENTO</label>
        <input type="datetime" id="input-datanasc">
        <label id="datacad-vendedor">DATA CADASTRO</label>
        <input type="datetime" id="input-datacad">
        <label id="comissao-vendedor">PORC. COMISSÃO</label>
        <input type="input" id="input-comissao">
        <label id="senha-vendedor">SENHA</label>
        <input type="input" id="input-senha">

    </section>
    <!-- Seção de Botões -->
    <button class="botao" id="cadastrar" onclick="window.location='vendedores.jsp';">CADASTRAR</button>
    <button class="botao" id="cancelar" onclick="window.location='vendedores.jsp';">CANCELAR</button>

</body>

</html>