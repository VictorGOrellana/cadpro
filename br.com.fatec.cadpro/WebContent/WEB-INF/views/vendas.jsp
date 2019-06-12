<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

  <section class="section gb nopadtop">
            <div class="container">
                <div class="boxed boxedp4">
                    <div class="row">
                        
                            <div class="section-title text-center">
                                <h3>Vendas</h3>
                            </div><!-- end title -->
                            
                           <div class="table table-responsive">
                             <table class="table table-bordered">
                                <thead>
                                   <tr>
                                       <th> C�digo </th>
                                       <th> Vendedor </th>
                                       <th> Parcelas </th>
                                       <th> Valor Total </th>
									   <th> Op��o </th>
                                   </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                   		<form>
                                        <td>000001</th>
                                        <td>Joelma Mendes</td>
                                        <td>5</td>
                                        <td>R$1530</td>
										<td align="center">
											  <button type="button" class="btn btn-default" onClick="location.href='acessoAlterarVenda'" value ="submit">Alterar</button>
		                              		  <button type="button" class="btn btn-default" onClick="location.href='acessoExcluirVenda'" id="proximo" >Excluir</button>
										</form>
										</td>	
									
                                    </tr> 								
                                </tbody>
                             </table>
                             
                             <div>
		                             <button class="btn btn-default" id="anterior" onCLick='location.href="acessoCadastrarProduto"'>Incluir</button>
		             </div>
<!--						 	<div>
		                             <button class="btn btn-default" id="anterior" disabled>Anterior</button>
		                             <span id="numeracao"></span>
		                             <button class="btn btn-default" id="proximo" disabled>Pr�ximo</button>
	                            </div>
                           </div>
                       <!-- end col -->
                    </div><!-- end row -->
                </div><!-- end container -->
            </div>
            </div>
        </section>
        <script src="..js/vendas.js"></script>
</body>        
<c:import url="footer.jsp"></c:import>