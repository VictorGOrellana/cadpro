package br.com.fatec.cadpro.controller;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.ProdutoDAO;
import br.com.fatec.cadpro.dao.ProdutoDAOImpl;
import br.com.fatec.cadpro.entidades.Produto;

public class llooiiuu {

	
	public static void main(String[] args) throws GenericDAOException {
			
		Produto prod = new Produto();
		ProdutoDAO pDao = new ProdutoDAOImpl();
		
		prod.setIdProduto(1);
		prod = pDao.getProduto(prod);
		System.out.println(prod.getDescricao());
		
	}
}
