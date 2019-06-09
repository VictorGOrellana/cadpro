package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.ProdutoDAO;
import br.com.fatec.cadpro.dao.ProdutoDAOImpl;
import br.com.fatec.cadpro.entidades.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos")
	public String mostrarProdutos() {
		return "produtos";
	}

	@RequestMapping("/excluirProduto")
	public String showExcProduto() {
		return "excluirProduto";
	}

	@RequestMapping("/cadastrarProduto")
	public String showCadProdutos() {
		return "cadastrarProduto";
	}

	@RequestMapping("/alterarProduto")
	public String mostrarAlterarProdutos() {
		return "alterarProduto";
	}

	@PostMapping("/incluirProd")
	public String incluirProd(@RequestParam("codProduto") String codProduto,
			@RequestParam("descricao") String descricao, @RequestParam("codUnidade") int codUnidade,
			@RequestParam("codTipo") int codTipo, @RequestParam("precoCusto") Double precoCusto,
			@RequestParam("precoVenda") Double precoVenda, @RequestParam("quantidade") int quantidade)
			throws GenericDAOException {

		Produto prod = new Produto();

		ProdutoDAO pDao = new ProdutoDAOImpl();

		prod.setCodProduto(codProduto);
		prod.setDescricao(descricao);
		prod.setCodUnidade(codUnidade);
		prod.setCodTipo(codTipo);
		prod.setPrecoCusto(precoCusto);
		prod.setPrecoVenda(precoVenda);
		prod.setQuantidade(quantidade);

		
		// alterar depois pro metodo de alterar
		pDao.incluirProduto(prod);
		
		return "incluirProduto";

	}

	@PostMapping("/alteraProd")
	public String alteraProd(@RequestParam("codProduto") String codProduto, @RequestParam("descricao") String descricao,
			@RequestParam("codUnidade") int codUnidade, @RequestParam("codTipo") int codTipo,
			@RequestParam("precoCusto") Double precoCusto, @RequestParam("precoVenda") Double precoVenda,
			@RequestParam("quantidade") int quantidade, Model model) throws GenericDAOException {

		Produto prod = getProd(codProduto);
		
		ProdutoDAO pDao = new ProdutoDAOImpl();
		prod = pDao.getProduto(prod);
		

		
		// alterar depois pro metodo de alterar
		pDao.atualizarProduto(prod);
		return "alterarProduto";

	}

	@PostMapping("/excluirProd")
	public String excluirProd(@RequestParam("codProduto") String codProduto, Model model) throws GenericDAOException {
		
		Produto prod = new Produto();

		ProdutoDAO pDao = new ProdutoDAOImpl();

		prod.setCodProduto(codProduto);
		pDao.excluirProduto(prod);

	//	model.addAttribute("codProduto", codProduto);
		
		
		return "excluirProduto";
		
	}
	

	@PostMapping("/listarProd")
	public String listarProd(@RequestParam("descricao") String descricao) throws GenericDAOException {
		
		Produto prod = new Produto();

		ProdutoDAO pDao = new ProdutoDAOImpl();

		prod.setCodProduto(descricao);
		pDao.listarProdutos(prod);
		
		return descricao;
		
		
		
		
	}
	
	@PostMapping("/getProd")
	public Produto getProd(@RequestParam("codProduto") String codProduto) throws GenericDAOException {
		
		Produto prod = new Produto();

		ProdutoDAO pDao = new ProdutoDAOImpl();

		prod.setCodProduto(codProduto);
		pDao.getProduto(prod);
		
		
		
		
		
		return prod;
		
		
		
		
	}
	
	

	
	
	
	
	
}
