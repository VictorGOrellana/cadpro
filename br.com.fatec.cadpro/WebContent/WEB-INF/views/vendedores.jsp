<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fatec.cadpro.entidades.Vendedor , br.com.fatec.cadpro.dao.VendedorDAO , br.com.fatec.cadpro.dao.VendedorDAOImpl , java.util.List "   %>    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>VENDEDORES | CADPRO</title>
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
 <h1>VENDEDORES</h1>

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
        <table id="table-vendedores">
            <thead>
                <tr>
                    <th> COD. VENDEDOR </th>
                    <th> NOME </th>
                    <th> CPF </th>
               
                </tr>
            </thead>
            <tbody>
               
              
              <% 
              	VendedorDAO vDao = new  VendedorDAOImpl(); 
             	Vendedor v = new Vendedor();
             	v.setNome("");
              	List<Vendedor> vend = vDao.listarVendedor(v);
                          
              %>
              <% for (Vendedor ve : vend) { %>  
                <tr>
                    <td> <%= ve.getCodVen() %> </td>
                    <td><%= ve.getNome() %></td>
                    <td><%= ve.getCpf() %></td>
           	
                </tr>
                <% } %>
            </tbody>
        </table>
    </section>
    <section id="section-botoes">
        <button class="botao" id="cadastrar" onclick="window.location='cadastrarVendedor.html';">CADASTRAR</button>
        <button class="botao" id="alterar" onclick="window.location='alterarVendedor.html';">ALTERAR</button>
        <button class="botao" id="excluir" onclick="window.location='excluirVendedor.html';">EXCLUIR</button>
    </section>


</body>
</html>