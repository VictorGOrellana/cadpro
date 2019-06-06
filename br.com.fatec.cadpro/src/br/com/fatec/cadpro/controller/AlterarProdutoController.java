package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/alteraProd")
	public void alteraProd(@RequestParam("input-cod") String codProduto,
			@RequestParam("input-desc") String descricao 
			,@RequestParam("input-coduni") int codUnidade
			, @RequestParam("input-codtipo") int codTipo,
			@RequestParam("input-precocusto") Double precoCusto,
			@RequestParam("input-precovenda")Double precoVenda,
			@RequestParam("input-qntd") int quantidade) throws GenericDAOException {
		
		Produto prod = new Produto();
		
		ProdutoDAO pDao = new ProdutoDAOImpl();
		
		prod.setCodProduto(codProduto);
		prod.setDescricao(descricao);
		prod.setCodUnidade(codUnidade);
		prod.setCodTipo(codTipo);
		prod.setPrecoCusto(precoCusto);
		prod.setPrecoVenda(precoVenda);
		prod.setQuantidade(quantidade);
		
		
			pDao.atualizarProduto(prod);
	
		@Res
		
	}
	
}
