<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fatec.cadpro.entidades.Vendedor , br.com.fatec.cadpro.dao.VendedorDAO , br.com.fatec.cadpro.dao.VendedorDAOImpl , java.util.List "   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:import url="cabecalho.jsp"></c:import>
<%
	List<Vendedor> lista = (List<Vendedor>)session.getAttribute("LISTA"); %>
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

 <section class="section gb nopadtop">
            <div class="container">
                <div class="boxed boxedp4">
                    <div class="row">
                        
                            <div class="section-title text-center">
                                <h3>Vendedores</h3>
                            </div><!-- end title -->
                            
                           <div class="table-responsive">
                             <table class="table table-bordered">
                                <thead>
                                   <tr>
                                       <th> Código </th>
                                       <th> Nome </th>
                                       <th> CPF </th>
                                       <th> Opção </th>
                                  </tr>
                                </thead>
                                 <tbody>
               
              
              
              <% for (Vendedor ve : lista) { %>
              	<% session.setAttribute("CODVEN",ve.getCodVen()); %>  
                <tr>
                    <td> <%= ve.getCodVen() %> </td>
                    <td><%= ve.getNome() %></td>
                    <td><%= ve.getCpf() %></td>
           	        <td align="center"><button type="button"class="btn btn-default" onClick='location.href="acessoAlterarVendedor"' id="anterior">Alterar</button>
		                               <button class="btn btn-default" onClick='location.href="acessoExcluirVendedor"' id="proximo" >Excluir</button>
					</td>	
                </tr>
                <% } %>
            </tbody>
                             </table>
                            <div>
		                             <button class="btn btn-default" id="anterior" onCLick='location.href="acessoCadastrarVendedor"'>Incluir</button>
		             </div>
<!--						 	<div>
		                             <button class="btn btn-default" id="anterior" disabled>Anterior</button>
		                             <span id="numeracao"></span>
		                             <button class="btn btn-default" id="proximo" disabled>Próximo</button>
	                            </div>
                           </div>
                       <!-- end col -->
                    </div><!-- end row -->
                </div><!-- end container -->
            </div>
            </div>
        </section>
    
    
<c:import url="footer.jsp"></c:import>