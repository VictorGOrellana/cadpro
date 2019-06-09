<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="menu-bar.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/paginas_com_tabela.css">
<body>
    <!-- Seção de tabela -->

    <section id="section-tabela">
        <table id="table-vendas">
            <thead id="thead-vendas">
                <tr>
                    <th> COD. VENDA </th>
                    <th> VENDEDOR </th>
                    <th> DATA </th>
                    <th> VALOR TOTAL </th>
                    <th> BOTOES </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th class="cod_vendedor">000001</th>
                    <td>Joelma Mendes</td>
                    <td>25/10/2018</td>
                    <td>R$1530</td>
                    <td>   <form action="acessoAlterarVenda" method="post"> <button style=" top: -10px; "class="botao" id="alterar" type="submit">Alterar</button> </form> </td>
                </tr>
               
            </tbody>
        </table>
    </section>
    <section id="section-botoes">
    
     <form action="acessoEfetuarVenda" method="post">
        <button class="botao" id="efetuar-venda" type="submit">EFETUAR VENDA</button>
      </form> 
    
       <form action="acessoExcluirVenda" method="post"> 
        <button class="botao" id="excluir" type="submit">EXCLUIR</button>
        </form>
        
    </section>
</body>
</html>