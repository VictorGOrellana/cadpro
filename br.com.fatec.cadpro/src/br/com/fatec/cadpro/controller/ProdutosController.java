package br.com.fatec.cadpro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.ProdutoDAO;
import br.com.fatec.cadpro.dao.ProdutoDAOImpl;
import br.com.fatec.cadpro.entidades.Produto;

@Controller
public class ProdutosController {
	Produto prod = new Produto();
	ProdutoDAO pDao = new ProdutoDAOImpl();

	@RequestMapping("/acessoListarProdutos")
	public String acessoListarProdutos(HttpServletRequest request , HttpServletResponse response) throws GenericDAOException {
		
		List<Produto> lista = new ArrayList<Produto>();
		HttpSession session = request.getSession();
		
		 lista = pDao.listarProdutos(prod);
		
		session.setAttribute("LISTA",lista);
		return "produtos";
	}

	@RequestMapping("/acessoExcluirProdutos")
	public String acessoExcluirProdutos() {
		return "excluirProduto";
	}

	@RequestMapping("/acessoCadastrarProduto")
	public String acessoCadastrarProduto() {
		return "incluirProduto";
	}

	@RequestMapping("/acessoAlterarProduto")
	public String acessoAlterarProduto(HttpServletRequest request ,Model model,  HttpServletResponse response) throws GenericDAOException {
		HttpSession session = request.getSession();
		
		 Object s = session.getAttribute("IDPRODUTO");
		
		prod.setIdProduto(Integer.parseInt(s.toString()));
		 
			
		Produto prodTela =  getProd(prod.getIdProduto());
		 
		 
		session.setAttribute("CADASTROBD",prod);
		
		
		
		
		return "alterarProduto";
	}

	
	
	
	@PostMapping("/incProduto")
	public String incProduto(@RequestParam("codProduto") String codProduto,
			@RequestParam("descricao") String descricao, @RequestParam("codUnidade") int codUnidade,
			@RequestParam("codTipo") int codTipo, @RequestParam("precoCusto") Double precoCusto,
			@RequestParam("precoVenda") Double precoVenda, @RequestParam("quantidade") int quantidade ,Model model)
			throws GenericDAOException {

		

		prod.setCodProduto(codProduto);
		prod.setDescricao(descricao);
		prod.setCodUnidade(codUnidade);
		prod.setCodTipo(codTipo);
		prod.setPrecoCusto(precoCusto);
		prod.setPrecoVenda(precoVenda);
		prod.setQuantidade(quantidade);

		
		// alterar depois pro metodo de alterar
		pDao.incluirProduto(prod);
		
		
		
		
		return "acessoListarProdutos";
		
		

	}

	@PostMapping("/altProduto")
	public String altProduto(@RequestParam("codProduto") String codProduto, @RequestParam("descricao") String descricao,
			@RequestParam("codUnidade") int codUnidade, @RequestParam("codTipo") int codTipo,
			@RequestParam("precoCusto") Double precoCusto, @RequestParam("precoVenda") Double precoVenda,
			@RequestParam("quantidade") int quantidade, Model model) throws GenericDAOException {


	
		pDao.atualizarProduto(prod);
		return "alterarProduto";

	}

	@PostMapping("/excProduto")
	public String excProduto(@RequestParam("codProduto") String codProduto, Model model) throws GenericDAOException {


		prod.setCodProduto(codProduto);
		pDao.excluirProduto(prod);

	//	model.addAttribute("codProduto", codProduto);
		
		
		return "excluirProduto";
		
	}
	

	@PostMapping("/lisProduto")
	public List<Produto> lisProduto(Model model) throws GenericDAOException {
		List<Produto> lista = new ArrayList<Produto>();

		
		pDao.listarProdutos(prod);
		
		model.addAttribute("LISTA", lista);
		return lista;
		
		
		
		
	}
	
	@PostMapping("/getProd")
	public Produto getProd(int idProduto) throws GenericDAOException {
		
		prod.setIdProduto(idProduto);
			
		prod = pDao.getProduto(prod);
		
		
		
		
		
		return prod;
		
		
		
		
	}
	
		
	
}
