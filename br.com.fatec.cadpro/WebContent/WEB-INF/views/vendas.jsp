<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>VENDAS | CADPRO</title>
    <meta charset="UTF-8">
    <link rel="icon" href="./imagens/logo-icon.jpeg">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="css/bootstrap-grid.min.css.map">
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css.map">
    <link rel="stylesheet" href="css/bootstrap.min.css.map">
    <link rel="stylesheet" type="text/css" href="css/paginas_com_tabela.css">
</head>
<body>
 <h1>VENDAS</h1>

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

    <!-- Seção de tabela -->

    <section id="section-tabela">
        <table id="table-vendas">
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
               
            </tbody>
        </table>
    </section>
    <section id="section-botoes">
     <form action="efetuarVenda" method="post">
        <button class="botao" id="efetuar-venda" type="submit">EFETUAR VENDA</button>
      </form> 
      <form action="alterarVenda" method="post">
        <button class="botao" id="alterar" type="submit">ALTERAR</button>
       </form>
       <form action="excluirVenda" method="post"> 
        <button class="botao" id="excluir" type="submit">EXCLUIR</button>
        </form>
        
    </section>
</body>
</html>