package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.entidades.Produto;

public interface ProdutoDAO {
		
	public static final String INSERIR_PRODUTO =" INSERT INTO TB_PRODUTO ( CODPRODUTO , DESCRICAO , CODUNIDADE , "
			+ "CODTIPO , PRECOCUSTO , PRECOVENDA , QUANTIDADE) VALUES ( ? ,? ,? ,? ,? ,? ,? );  ";
	
	public static final String LISTAR_PRODUTO = "SELECT * FROM TB_PRODUTO ";
	
	public static final String EXCLUIR_PRODUTO = " DELETE FROM TB_PRODUTO WHERE IDPRODUTO = ? ;";

	public static final String ALTERAR_PRODUTO = " UPDATE TB_PRODUTO SET "
			+ "	CODPRODUTO = ? , "
			+ " DESCRICAO = ? ,"
			+ " CODUNIDADE = ? , "
			+ " CODTIPO = ? , "
			+ " PRECOCUSTO = ? ,"
			+ " PRECOVENDA = ? , "
			+ " QUANTIDADE = ?  WHERE IDPRODUTO = ? ; ";
	
	public static final String GET_PRODUTO ="SELECT * FROM TB_PRODUTO WHERE IDPRODUTO = ? ; "; 
	
	
	public void incluirProduto(Produto produto)throws GenericDAOException;
	public void excluirProduto(Produto produto)throws GenericDAOException;
	public void atualizarProduto(Produto produto)throws GenericDAOException;
	public List<Produto> listarProdutos(Produto produto)throws GenericDAOException;
	public Produto getProduto(Produto produto)throws GenericDAOException;
	
	
}
