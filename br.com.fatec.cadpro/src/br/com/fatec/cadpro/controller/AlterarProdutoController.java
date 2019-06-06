package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.ProdutoDAO;
import br.com.fatec.cadpro.dao.ProdutoDAOImpl;
import br.com.fatec.cadpro.entidades.Produto;

@Controller
public class AlterarProdutoController {

	
	@RequestMapping("/alterarProduto")
	public String mostrarAlterarProdutos() {
		return "alterarProduto";
	}
	
	
	@PostMapping("/alteraProd")
	public String alteraProd(
			@RequestParam("codProduto") String codProduto,
			@RequestParam("descricao") String descricao,
			@RequestParam("codUnidade") int codUnidade,
			@RequestParam("codTipo") int codTipo,
			@RequestParam("precoCusto") Double precoCusto,
			@RequestParam("precoVenda")Double precoVenda,
			@RequestParam("quantidade") int quantidade) throws GenericDAOException {
		
		Produto prod = new Produto();
		
		ProdutoDAO pDao = new ProdutoDAOImpl();
		
		prod.setCodProduto(codProduto);
		prod.setDescricao(descricao);
		prod.setCodUnidade(codUnidade);
		prod.setCodTipo(codTipo);
		prod.setPrecoCusto(precoCusto);
		prod.setPrecoVenda(precoVenda);
		prod.setQuantidade(quantidade);
		
			System.out.println("passemo ");
			//alterar depois pro metodo de alterar
			pDao.incluirProduto(prod);
			return "alterarProduto" ;
	
		
		
	}
	
}
