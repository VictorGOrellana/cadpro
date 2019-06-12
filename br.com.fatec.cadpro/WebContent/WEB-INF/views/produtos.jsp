<%@page import="java.util.ArrayList , java.util.List, br.com.fatec.cadpro.entidades.Produto" %>"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="br.com.fatec.cadpro.entidades.Vendedor , br.com.fatec.cadpro.dao.VendedorDAO , br.com.fatec.cadpro.dao.VendedorDAOImpl , java.util.List "%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="cabecalho.jsp"></c:import>

<%
	List<Produto> lista = (List<Produto>)session.getAttribute("LISTA"); %>

<section>
	<div class="container">

		<div class="row">
			<div class="col-md-12">
				<div class="tagline-message page-title text-center">
					<h3>_</h3>
					<ul class="breadcrumb">
						<li><a href="javascript:void(0)"></a></li>
						<li class="active"></li>
					</ul>
				</div>
			</div>
			<!-- end col -->
		</div>
		<!-- end row -->
	</div>
	<!-- end container -->
</section>
<!-- end section -->

<section class="section gb nopadtop">
	<div class="container">
		<div class="boxed boxedp4">
			<div class="row">

				<div class="section-title text-center">
					<h3>Produtos</h3>
				</div>
				<!-- end title -->

				<div class="table-responsive">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>ID.Produto</th>
								<th>Código</th>
								<th>Descrição</th>
								<th>Valor Venda</th>
								<th>Opção</th>
							</tr>
						</thead>
						<tbody>


						<% for ( Produto p : lista ) {%>
							<tr>
								<td><%= p.getIdProduto() %></td>
								<td><%= p.getCodProduto() %></td>
								<td><%= p.getDescricao() %></td>
								<td><%= p.getPrecoVenda() %></td>
								<td align="center">
									<button type="button" class="btn btn-default" onClick='location.href="acessoAlterarProduto"' id="anterior">Alterar</button>
									<button type="button" class="btn btn-default" onCLick='location.href="acessoExcluirProdutos"'id="proximo">Excluir</button>
								</td>
							</tr>
						 <% } %>
						</tbody>
					</table>
					<div>
		                             <button class="btn btn-default" id="anterior" onCLick='location.href="acessoCadastrarProduto"'>Incluir</button>
		             </div>
					
					<!--						 	
		                             <span id="numeracao"></span>
		                             <button class="btn btn-default" id="proximo" disabled>Próximo</button>
	                            </div>
                           </div>
                       <!-- end col -->
				</div>
				<!-- end row -->
			</div>
			<!-- end container -->
		</div>
	</div>
</section>


<c:import url="footer.jsp"></c:import>