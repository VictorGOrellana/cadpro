package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@RequestMapping("/redireciona")
	public String logout() {
		return "redireciona";
	
	
}
}
