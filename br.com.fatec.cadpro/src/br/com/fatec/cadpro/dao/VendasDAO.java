package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Vendas;

public interface VendasDAO {
	
	
	public static final String ADICIONAR_VENDA =" INSERT INTO TB_VENDAS (NUMEROVENDA, CODVEN, PARCELAS, VLRTOTAL, QUANTIDADE) VALUES ( ? , ? , ? , ? , ? , ? ) ;  ";
	public static final String EXCLUIR_VENDA =" DELETE FROM TB_VENDAS WHERE IDVENDA = ? ;";
	public static final String ALTERAR_VENDA =" UPDATE TB_VENDAS SET NUMEROVENDA = ? , CODVEN = ? , PARCELAS = ? , VLRTOTAL = ? , QUANTIDADE = ?  WHERE IDVENDA = ?  ";
	public static final String LISTAR_VENDA =" SELECT * FROM TB_VENDAS WHERE NUMEROVENDA = ? ; ";
	public static final String GET_VENDA =" SELECT * FROM TB_VENDAS WHERE IDVENDA = ? ; "; 
	
	public void adicionarVenda(Vendas vendas) throws GenericDAOException;
	public void excluirVenda(Vendas vendas) throws GenericDAOException;
	public void alterarVenda(Vendas vendas) throws GenericDAOException;
	public List<Vendas> listarVendas(Vendas vendas) throws GenericDAOException;
	public Vendas getVendas(Vendas vendas) throws GenericDAOException;
	
	
}
