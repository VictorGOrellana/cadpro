package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.entidades.Pedido;

public interface PedidoDAO {
	
	public static final String INSERIR_PEDIDO=" INSERT INTO TB_PEDIDO (	CODCLI , CODVEN , DATAEMISSAO , VLRTOTAL , SITUACAO , OBSERVACAO )"
			+ "VALUES ( ? , ? , ? , ? , ? , ? ); ";
	public static final String LISTAR_PEDIDO =" SELECT NUMPEDIDO ,  CODCLI , CODVEN , DATAEMISSAO , VLRTOTAL , SITUACAO , OBSERVACAO FROM TB_PEDIDO WHERE CODVEN = ? ";

	public static final String EXCLUIR_PEDIDO = " DELETE FROM TB_PEDIDO  WHERE NUMPEDIDO = ?  "; 
	
	public static final String ALTERAR_PEDIDO = " UPDATE TB_PEDIDO"
			+ " SET VLRTOTAL = ?  , "
			+ " SITUACAO = ? , "
			+ " OBSERVACAO = ?  WHERE NUMPEDIDO = ? ;";
	
	public static final String GET_PEDIDO = "SELECT * FROM TB_PEDIDO WHERE NUMPEDIDO = ? "; 
	
	
	

		public void incluirPedido(Pedido pedido)throws GenericDAOException;
		public void excluirPedido(Pedido pedido)throws GenericDAOException;
		public void atualizarPedido(Pedido pedido)throws GenericDAOException;
		public List<Pedido> listarPedidos(Pedido pedido)throws GenericDAOException;
		public Pedido getPedido(Pedido pedido)throws GenericDAOException;
		
	
}
