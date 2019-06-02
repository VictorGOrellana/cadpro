package br.com.fatec.cadpro.dao;

import br.com.fatec.cadpro.entidades.TipoProduto;

public interface TipoProdutoDAO {

		public void inserirTipoProduto(TipoProduto tProduto)throws  GenericDAOException;
		public void excluirTipoProduto(TipoProduto tProduto)throws  GenericDAOException;
}
