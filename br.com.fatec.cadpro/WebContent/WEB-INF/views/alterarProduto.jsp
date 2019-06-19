<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import=" br.com.fatec.cadpro.entidades.Produto" %>
<c:import url="cabecalho.jsp"></c:import>
<body>
<section>
            <div class="container" >
			   
                <div class="row">
                    <div class="col-md-12">
                        <div class="tagline-message page-title text-center">
                            <h3>_</h3>
                            <ul class="breadcrumb">
                                <li><a href="javascript:void(0)"></a></li>
                                <li class="active"></li>
                            </ul>
                        </div>
                    </div><!-- end col --> 
                </div><!-- end row -->
            </div><!-- end container -->
        </section><!-- end section -->

	<% Produto prodAtual = (Produto) session.getAttribute("CADASTROBD"); %>
	<section class="section gb nopadtop">        
        <div class="container" >
          <div class="boxed boxedp4">
                    <div class="row">
                        
                            <div class="section-title text-center">
                                <h3>Vendas</h3>
                            </div><!-- end title -->
            </div>                
        <form>
                  <div class="row">
                    <div class="col-md-5 pr-1">
                      <div class="form-group">
                        <label>ID Produto</label>
                        <input type="text" class="form-control" name="idProduto" value="<%= prodAtual.getIdProduto() %>">
                      </div>
                    </div>
                    <div class="col-md-3 px-1">
                      <div class="form-group">
                        <label>Cod. Produto</label>
                        <input type="text" class="form-control" name="codProduto" value="<%= prodAtual.getCodProduto() %>">
                      </div>
                    </div>
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                        <label for="exampleInputEmail1">Descrição</label>
                        <input type="text" class="form-control" name="descricao" value="<%= prodAtual.getDescricao() %>">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>Cod. Unidade</label>
                        <input type="text" class="form-control" name="codUnidade" value="<%= prodAtual.getCodUnidade() %>" >
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <label>Cod. Tipo</label>
                        <input type="text" class="form-control" name="codTipo" value="<%= prodAtual.getCodTipo() %>">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label>Preco de Custo</label>
                        <input type="text" class="form-control" name="precoCusto" value="<%= prodAtual.getPrecoCusto() %>">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-4 pr-1">
                      <div class="form-group">
                        <label>Preco de Venda</label>
                        <input type="text" class="form-control" name="precoVenda" value="<%= prodAtual.getPrecoVenda() %>">
                      </div>
                    </div>
                    </div>
                    <div class="row">
                    <div class="col-md-4 px-1">
                      <div class="form-group">
                        <label>Quantidade</label>
                        <input type="text" class="form-control" name="quantidade" value="<%= prodAtual.getQuantidade() %>">
                      </div>
                    </div>
                   </div>
                  
                  <div class="row text-center">
                    <div class="update mx-auto">
                      <button type="submit" class="btn btn-primary btn-round">Alterar</button>
                          <button type="submit" class="btn btn-primary btn-round"type= "button" onClick='location.href="acessoListarProdutos"' >Voltar</button>
                    </div>
                  </div>  
                </form>
                </div>
                </div>
                </section>
<c:import url="footer.jsp"></c:import>