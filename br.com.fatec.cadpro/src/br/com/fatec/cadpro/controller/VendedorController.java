package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendedorController {

	@RequestMapping("/alterarVendedor")
	public String showAlteraVendedor() {
		return "alterarVendedor";
	}

	@RequestMapping("/cadastrarVendedor")
	public String showCadVendedor() {
		return "cadastrarVendedor";
	}

	@RequestMapping("/vendedores")
	public String showVend() {
		return "vendedores";
	}
}
