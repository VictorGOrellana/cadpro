<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Produto</title>
</head>
<body>
	<DIV id="gg_grp_tela" style="position: relative;">

		<h1>Inclus�o Produto</h1>
	<FORM action="incProduto" method="post">
		<DIV id="grp_codproduto"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_codproduto" style="position: relative;">Cod.
				Produto</DIV>
			<DIV id="txt_codproduto" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="text" maxlenght="20" name="codProduto" />
			</DIV>
		</DIV>
		<DIV id="grp_descricao"
			style="margin-right: 490px;;; position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_descricao" style="position: relative;">Descri��o
			</DIV>
			<DIV id="txt_descricao" style="position: relative; margin-top: 2px;">
				<INPUT size="70" type="text" maxlenght="70" name="descricao" />
			</DIV>
		</DIV>
		<DIV id="grp_codunidade"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_codunidade" style="position: relative;">Cod.
				Unidade</DIV>
			<DIV id="txt_codunidade" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="1" name="codUnidade" />
			</DIV>
		</DIV>
		<DIV id="grp_codtipo"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_codtipo" style="position: relative;">Cod. Tipo</DIV>
			<DIV id="txt_codtipo" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="1" name="codTipo" />
			</DIV>
		</DIV>
		<DIV id="grp_precocusto"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_precocusto" style="position: relative;">Preco de
				Custo</DIV>
			<DIV id="txt_precocusto" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="10" name="precoCusto" />
			</DIV>
		</DIV>
		<DIV id="grp_precovenda"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_precovenda" style="position: relative;">Preco de
				Venda</DIV>
			<DIV id="txt_precovenda" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="10" name="precoVenda" />
			</DIV>
		</DIV>
		<DIV id="grp_quantidade"
			style="position: relative; margin-top: 30px; margin-left: 20px; display: inline-block;">
			<DIV id="lbl_quantidade" style="position: relative;">
				Quantidade</DIV>
			<DIV id="txt_quantidade" style="position: relative; margin-top: 2px;">
				<INPUT size="12" type="number" maxlenght="20" name="quantidade" />
			</DIV>
		</DIV>
		<DIV id="grp_botoes" style="position: relative; margin-top: 20px;">
			<DIV id="btn_incluir"
				style="position: relative; margin-left: 50px; display: inline-block;">
				<FORM>
					<button type="submit">Incluir</button>
				</FORM>
			</DIV>
		</FORM>	
		
			<DIV id="btn_cancelar"
				style="position: relative; margin-left: 50px; display: inline-block;">
				<FORM>
					<button type= "button" onClick='location.href="acessoListarProdutos"'>Voltar</button>
				</FORM>
			</DIV>
		</DIV>
	</DIV>
</body>
</html>