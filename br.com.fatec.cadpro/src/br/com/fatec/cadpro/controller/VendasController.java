package br.com.fatec.cadpro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.VendasDAO;
import br.com.fatec.cadpro.dao.VendasDAOImpl;
import br.com.fatec.cadpro.entidades.Vendas;

@Controller
public class VendasController {
	
	VendasDAO vDao = new VendasDAOImpl();
	Vendas venda = new Vendas();
	
	
	
	/**
	 * 
	 * Métodos que chamam páginas
	 */
	
	@RequestMapping("/acessoListarVendas")
	public String  acessoTelaListarVendas(HttpServletRequest request , HttpServletResponse response) throws GenericDAOException{
		List<Vendas> lista = new ArrayList<Vendas>();
		HttpSession session = request.getSession();
		
		lista = vDao.listarVendas(venda);
		
		session.setAttribute("LISTA",lista);
		
		return "vendas";
		
	}
	
	@RequestMapping("/acessoExcluirVenda")
	public String acessoTelaExluirVendas(){
		return "excluirVenda";
	}
	
	@RequestMapping("/acessoAlterarVenda")
	public String acessoTelaAlterarVendas(){
		return "alterarVenda";
	}
	
	@RequestMapping("/acessoEfetuarVenda")
	public String acessoTelaEfetuarVenda() {
		return "efetuarVenda";
	}
	
	
	/**
	 * Métodos de manipulação
	 * @throws GenericDAOException 
	 */
	
	@RequestMapping("/excVenda")
	public String excluir(@RequestParam int idVenda) throws GenericDAOException{
		
		venda.setIdVenda(idVenda);
		vDao.excluirVenda(venda);

		return "vendas";
	}
	
	@RequestMapping("incVenda")
	public String adiciona(@RequestParam("numeroVenda") int numeroVenda, @RequestParam("codVen") int codVen 
			, @RequestParam("parcelas") String parcelas ,@RequestParam("vlrTotal") double vlrTotal,
			@RequestParam("quantidade") int quantidade ) throws GenericDAOException {

		
		int parcela = validadorParcelado(parcelas);
		
		
		venda.setNumeroVenda(numeroVenda);
		venda.setCodVen(codVen);		
		venda.setParcelas(parcela);
		venda.setVlrTotal(vlrTotal);
		venda.setQuantidade(quantidade);
		
		vDao.adicionarVenda(venda);
		
		
		return "vendas";
	};
	
	@RequestMapping("altVenda")
	public String alterar(@RequestParam("idVenda") int idVenda, Model model ) throws GenericDAOException {
		
	
		venda.setIdVenda(idVenda);	
		venda = vDao.getVendas(venda); 
		
		
		model.addAttribute("numeroVenda", venda.getIdVenda());
		model.addAttribute("codVen", venda.getCodVen());
		model.addAttribute("parcela", venda.getParcelas());
		model.addAttribute("vlrTotal", venda.getVlrTotal());
		model.addAttribute("quantidade", venda.getQuantidade());
		
		vDao.alterarVenda(venda);
		
		return "vendas";
	}
	
	private int validadorParcelado(String parcelas) {
		if(parcelas.equals("avista")) {
			return 0;
		}
		
		if(parcelas.equals("parcelado1")) {
			return 2;
		}
		
		if(parcelas.equals("parcelado2")) {
			return 3;
		}
		if(parcelas.equals("parcelado3")) {
			return 4;
		}
		if(parcelas.equals("parcelado4")) {
			return 5;
		}
		
		return 0;
	}

}
