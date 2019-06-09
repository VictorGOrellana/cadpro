package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendasController {
	
	@RequestMapping("/vendas")
	public String  mostrarVendas(){
	return "vendas";
		
	}
	
	@RequestMapping("/excluirVenda")
	public String exluirVendas(){
		return "excluirVenda";
	}
	
	@RequestMapping("/alterarVenda")
	public String alterarVendas(){
		return "alterarVenda";
	}
	
	@RequestMapping("/efetuarVenda")
	public String efetuarVenda() {
		return "efetuarVenda";
	}
	
	
	
	


}
