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
    <link rel="stylesheet" type="text/css" href="css/manipulacao_vendas.css">
</head>
<body>
  <h1>EFETUAR VENDA</h1>

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

    <!-- Seção das vendas -->
   <form action="incVenda" method="post">
    <form id="section-efetuar-vendas" class="form-row">
        <div class="col">
       
        </div>
        <div class="col">
            <label id="labelnum-venda">Número da Venda: </label>
            <input type="text" id="num-venda" name="numeroVenda">
        </div>
        <div class="col">
            <label id="labelvendedor-venda">Vendedor: </label>
            <input type="text" id="vendedor-venda" name="codVen">
        </div>
        <div class="col">
            <label id="parcvendedor-venda">Parcelamento: </label>
            <select id="parc-vendedor" name="parcelas">
                <option value="funcao">Selecione o método</option>
                <option value="avista">Á VISTA </option>
                <option value="parcelado1">PARCELADO 2X</option>
                <option value="parcelado2">PARCELADO 3X</option>
                <option value="parcelado3">PARCELADO 4X</option>
                <option value="parcelado4">PARCELADO 5X</option>
            </select>
        </div>
        <div class="col">
            <label id="cod-item">Cod. Item: </label>
            <input type="text" id="item-venda">
        </div>
        <div class="col">
            <label id="qntd-item">Quantidade: </label>
            <input type="text" id="qntd-venda">
            
        </div>
        <div style="display: inline-block">
        <button class="botao-add" id="add-venda">ADD</button>
        </div>
        <div>
            <label id="total-item">Total: </label>
            <input type="text" id="total-venda" placeholder="R$XXX,XX">
        </div>
        <div id="section-tabela">
            <table id="table-vendas">
                <thead>
                    <tr>
                        <th> ITEM </th>
                        <th> QUANTIDADE </th>
                        <th> VALOR </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th class="cod_item">1</th>
                        <td></td>
                        <td>Cano PVC de 2 metros</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </form>
    
        <button class="botao" id="finalizar-venda" type="submit">FINALIZAR</button>
    </form>
        <button class="botao" id="cancelar-venda" onclick="window.location='vendas.html';">CANCELAR</button>
  
</body>
</html>