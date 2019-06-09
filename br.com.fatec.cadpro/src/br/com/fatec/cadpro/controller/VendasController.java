package br.com.fatec.cadpro.controller;

import org.springframework.stereotype.Controller;
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
		
	
	
		
		
		
		venda.setNumeroVenda(numeroVenda);
		venda.setCodVen(codVen);		
//		venda.setParcelas(parcelas);
		venda.setVlrTotal(vlrTotal);
		venda.setQuantidade(quantidade);
		
		vDao.adicionarVenda(venda);
		
		
		return "vendas";
	};
	
	
	
	private int validadorParcelado(String parcelas) {
		return 0;
	}

}
