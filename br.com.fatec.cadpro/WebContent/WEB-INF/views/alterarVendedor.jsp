	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import=" br.com.fatec.cadpro.entidades.Vendedor" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Vendedor</title>
</head>
<body>
	<DIV id="gg_grp_tela" style="position: relative;">

		<h1>Alterar Vendedor</h1>
		
		<% Vendedor vendAtual = (Vendedor) session.getAttribute("CADASTROBD"); %>
	<form action="altVendedor" method="post">	
		<DIV id="grp_codven"
			style="position: relative; margin-top: 30px; margin-left: 20px;">
			<DIV id="lbl_codven" style="position: relative;">Cod. Vendedor
			</DIV>
			<DIV id="txt_codven" style="position: relative; margin-top: 2px;">
				<INPUT size="10" type="text" maxlenght="30" name="codVen" value="<%= vendAtual.getCodVen() %>"
					readonly="readonly" />
			</DIV>
		</DIV>


		<DIV id="grp_nome"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_nome" style="position: relative;">Nome</DIV>
			<DIV id="txt_nome" style="position: relative; margin-top: 2px;">
				<INPUT size="60" type="text" maxlenght="100" name="nome" value="<%= vendAtual.getNome() %>"/>
			</DIV>
		</DIV>
		<DIV id="grp_endereco"
			style="margin-right: 490px; position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_endereco" style="position: relative;">Endereco</DIV>
			<DIV id="txt_endereco" style="position: relative; margin-top: 2px;">
				<INPUT size="100" type="text" maxlenght="100" name="endereco" value="<%= vendAtual.getEndereco() %>" />
			</DIV>
		</DIV>
		<DIV id="grp_bairro"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_bairro" style="position: relative;">Bairro</DIV>
			<DIV id="txt_bairro" style="position: relative; margin-top: 2px;">
				<INPUT size="35" type="text" maxlenght="40" name="bairro" value="<%= vendAtual.getBairro() %>" />
			</DIV>
		</DIV>
		<DIV id="grp_cidade"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_cidade" style="position: relative;">Cidade</DIV>
			<DIV id="txt_cidade" style="position: relative; margin-top: 2px;">
				<INPUT size="40" type="text" maxlenght="40" name="cidade" value="<%= vendAtual.getCidade() %>" />
			</DIV>
		</DIV>
		<DIV id="grp_estado"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_estado" style="position: relative;">Estado</DIV>
			<DIV id="txt_estado" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="text" maxlenght="10" name="estado" value="<%= vendAtual.getEstado()  %>"/>
			</DIV>
		</DIV>
		<DIV id="grp_cep"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_cep" style="position: relative;">CEP</DIV>
			<DIV id="txt_cep" style="position: relative; margin-top: 2px;">
				<INPUT size="20" type="number" maxlenght="10" name="cep" value="<%= vendAtual.getCep() %>" />
			</DIV>
		</DIV>
		<DIV id="grp_cpf"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_cpf" style="position: relative;">CPF</DIV>
			<DIV id="txt_cpf" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="text" maxlenght="20" name="cpf" value="<%= vendAtual.getCpf() %>" />
			</DIV>
		</DIV>
		<DIV id="grp_rg"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_rg" style="position: relative;">RG</DIV>
			<DIV id="txt_rg" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="text" maxlenght="20" name="rg" value="<%= vendAtual.getRg() %>"/>
			</DIV>
		</DIV>

		<DIV id="grp_cpf"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_cpf" style="position: relative;">Fone</DIV>
			<DIV id="txt_cpf" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="20" name="fone" value="<%= vendAtual.getFone() %>"/>
			</DIV>
		</DIV>
		<DIV id="grp_email"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_email" style="position: relative;">E-Mail</DIV>
			<DIV id="txt_email" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="text" maxlenght="20" name="email"  value="<%= vendAtual.getEmail() %>"/>
			</DIV>
		</DIV>



		<DIV id="grp_comissao"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_comissao" style="position: relative;">
				Porcentagem ComissĂ£o</DIV>
			<DIV id="txt_comissao" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="20" name="porComissao"value="<%= vendAtual.getPorComissao() %>" />
			</DIV>
		</DIV>


		<DIV id="grp_botoes" style="position: relative; margin-top: 20px;">
			<DIV id="btn_incluir"
				style="position: relative; margin-left: 50px; display: inline-block;">
				<FORM>
					<button type="submit">Alterar</button>
				</FORM>
			</DIV>
	</form>
			<DIV id="btn_cancelar"
				style="position: relative; margin-left: 50px; display: inline-block;">
				<FORM>
					<button onClick='location.href="acessoListarVendedores"'>Voltar</button>
				</FORM>
			</DIV>
		</DIV>
	</DIV>
</body>
</html>