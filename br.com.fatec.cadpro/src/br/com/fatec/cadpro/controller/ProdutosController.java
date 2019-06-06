package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos")
	public String mostrarProdutos() {
		return "produtos";
	}
}
