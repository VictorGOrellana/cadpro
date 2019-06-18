<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import=" br.com.fatec.cadpro.entidades.Produto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Excluir Produto</title>
</head>
<body>
		<%
			Produto prodAtual = (Produto) session.getAttribute("CADASTROBD");
		%>

	<DIV id="gg_grp_tela" style="position: relative;">

		<h1>Exclusão Produto</h1>

		
		<form action="excProduto" method="post">
			<DIV id="grp_idproduto"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_idproduto" style="position: relative;">ID Produto
				</DIV>
				<DIV id="txt_idproduto" style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="text" name="idProduto"
						value="<%=prodAtual.getIdProduto()%>" readonly="readonly" />
				</DIV>
			</DIV>

			<DIV id="grp_codproduto"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_codproduto" style="position: relative;">Cod.
					Produto</DIV>
				<DIV id="txt_codproduto"
					style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="text"  name="codProduto"
						readonly="readonly" value="<%=prodAtual.getCodProduto()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_descricao"
				style="margin-right: 490px;;; position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_descricao" style="position: relative;">Descrição
				</DIV>
				<DIV id="txt_descricao" style="position: relative; margin-top: 2px;">
					<INPUT size="70" type="text"  name="descricao"
						readonly="readonly" value="<%=prodAtual.getDescricao()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_codunidade"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_codunidade" style="position: relative;">Cod.
					Unidade</DIV>
				<DIV id="txt_codunidade"
					style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="number"  name="codUnidade"
						readonly="readonly" value="<%=prodAtual.getCodUnidade()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_codtipo"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_codtipo" style="position: relative;">Cod. Tipo</DIV>
				<DIV id="txt_codtipo" style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="number"  name="codTipo"
						readonly="readonly" value="<%=prodAtual.getCodTipo()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_precocusto"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_precocusto" style="position: relative;">Preco de
					Custo</DIV>
				<DIV id="txt_precocusto"
					style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="number"  name="precoCusto"
						readonly="readonly" value="<%=prodAtual.getPrecoCusto()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_precovenda"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_precovenda" style="position: relative;">Preco de
					Venda</DIV>
				<DIV id="txt_precovenda"
					style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="number"  name="precoVenda"
						readonly="readonly" value="<%=prodAtual.getPrecoVenda()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_quantidade"
				style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
				<DIV id="lbl_quantidade" style="position: relative;">
					Quantidade</DIV>
				<DIV id="txt_quantidade"
					style="position: relative; margin-top: 2px;">
					<INPUT size="12" type="number"  name="quantidade"
						readonly="readonly" value="<%=prodAtual.getQuantidade()%>" />
				</DIV>
			</DIV>
			<DIV id="grp_botoes" style="position: relative; margin-top: 20px;">
				<DIV id="btn_excluir"
					style="position: relative; margin-left: 50px; display: inline-block;">
					<button type="submit">Excluir</button>
				</DIV>
</form>


				<DIV id="btn_cancelar"
					style="position: relative; margin-left: 50px; display: inline-block;">
					<FORM>
						<button type="button"
							onClick='location.href="acessoListarProdutos"'>Voltar</button>
					</FORM>
				</DIV>
			</DIV>
		
	</DIV>
</body>
</html>