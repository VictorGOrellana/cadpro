package br.com.fatec.cadpro.dao;

import br.com.fatec.cadpro.entidades.ItensPedido;

public interface ItensPedidoDAO {

		public void adicionarItensPedido(ItensPedido iPedido)  throws GenericDAOException;
		public void excluirItensPedido(ItensPedido iPedido) throws GenericDAOException;
		public void alterarItensPedido(ItensPedido iPedido) throws GenericDAOException;
		public boolean existeFornecedorPorProduto(ItensPedido iPedido) throws  GenericDAOException;
		public boolean existeProdutoPorFornecedor(ItensPedido iPedido)throws  GenericDAOException; 
		
	
	
}
