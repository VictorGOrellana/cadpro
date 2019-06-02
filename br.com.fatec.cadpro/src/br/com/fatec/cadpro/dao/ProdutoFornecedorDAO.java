package br.com.fatec.cadpro.dao;

import br.com.fatec.cadpro.entidades.ProdutoFornecedor;

public interface ProdutoFornecedorDAO {
		
				public void inserirProdForn(ProdutoFornecedor prodForn)throws  GenericDAOException; 
				public void excluirProdForn(ProdutoFornecedor prodForn)throws  GenericDAOException;
				
}
