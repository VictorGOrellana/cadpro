package br.com.fatec.cadpro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.LoginDAO;
import br.com.fatec.cadpro.dao.LoginDAOImpl;
import br.com.fatec.cadpro.entidades.Login;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String abrirTela() {
		return "login";
	}
	
	@RequestMapping("/logar")
	public String getLogin(@RequestParam("cpf") String cpf, @RequestParam("senha") String senha, HttpSession session) {
			
			Login log = new Login(); 
			
			log.setCpf(cpf);
			log.setSenhaVend(senha);
			
			LoginDAO lDao = new LoginDAOImpl(); 
			
			try {
				
				if(lDao.loginUsuario(log)) {
					session.setAttribute("usuarioLogado", log);
					return "index";
				}
			} catch (GenericDAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "ERRO";
			
			
			
	}
	
	
}
