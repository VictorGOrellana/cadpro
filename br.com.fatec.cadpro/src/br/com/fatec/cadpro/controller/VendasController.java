package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendasController {
	
	@RequestMapping("/vendas")
	public String  mostrarVendas(){
	return "vendas";
		
	}
	
	
	


}
