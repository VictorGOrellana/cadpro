<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fatec.cadpro.dao.LoginDAOImpl"%>
<%@ page import="br.com.fatec.cadpro.dao.LoginDAO"%>
<%@ page import="br.com.fatec.cadpro.entidades.Login"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Login | CADPRO</title>
<meta charset="UTF-8">
<link rel="icon" href="./imagens/logo-icon.jpeg">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-grid.min.css">
<link rel="stylesheet" href="css/bootstrap-grid.min.css.map">
<link rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/bootstrap-reboot.min.css.map">
<link rel="stylesheet" href="css/bootstrap.min.css.map">
<link rel="stylesheet" type="text/css" href="css/login.css">
<!-- Script para mascara de CPF -->
<script type="text/javascript">
	function fMasc(objeto, mascara) {
		obj = objeto
		masc = mascara
		setTimeout("fMascEx()", 1)
	}
	function fMascEx() {
		obj.value = masc(obj.value)
	}
	function mCPF(cpf) {
		cpf = cpf.replace(/\D/g, "")
		cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
		cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
		cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2")
		return cpf
	}
</script>
<meta charset="ISO-8859-1">
</head>
<body>
	<!-- Se��o de login -->
	<section>
		<form action="logar" method='post'>
		<img src="imagens/logo-index.png">
		<
		<div class="form-group">
			<label for="">Digite seu CPF</label>
			<p>
				<input type="text" name="cpf" onkeydown="javascript: fMasc( this, mCPF );" placeholder="Ex.: 000.000.000-00" maxlength="14" required id="idCpf">
			</p>
			<small id="emailHelp" class="form-text text-muted">Digite somente os n�meros.</small>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Digite sua Senha</label>
			<p>
				<input type="password" placeholder="**********" maxlength="12"	required id="idPass" name="senha">
			</p>
		</div>
		<p>
			<button type="submit" class="btn btn-primary" >Entrar</button>
		</p>
		</form>
	</section>

	<!-- Se��o para Rodap� -->
	<footer>
		<a>&copy; Garotos de Programa 2019</a>
	</footer>



</body>
</html>