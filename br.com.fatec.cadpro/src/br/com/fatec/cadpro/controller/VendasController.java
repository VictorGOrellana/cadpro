package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendasController {
	
	@RequestMapping("/vendas")
	public String  mostrarVendas(){
	return "vendas";
		
	}
	
	@RequestMapping("/alterarVendedor")
	public String showAlteraVendedor() {
		return "alterarVendedor";
	}
	
	@RequestMapping("/cadastrarProduto")
	public String showCadProdutos() {
	return "cadastrarProduto";
	}
	
	@RequestMapping("/cadastrarVendedor")
	public String showCadVendedor() {
		return "cadastrarVendedor";
	}
	
	@RequestMapping("/excluirProduto")
	public String showExcProduto() {
		return "excluirProduto";
		
	}
	
	@RequestMapping("/btnTeste")
	public String showind() {
	System.out.println("CHERO");
		return "oi";

	}

	@RequestMapping("/vendedores")
	public String showVend() {
		return "vendedores";
	}
	


}
