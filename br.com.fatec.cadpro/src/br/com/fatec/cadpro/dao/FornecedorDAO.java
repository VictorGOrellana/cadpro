package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Fornecedor;
import br.com.fatec.cadpro.dao.GenericDAOException;

public interface FornecedorDAO {
	
	public static final String INSERIR_FORNECEDOR = " INSERT INTO TB_FORNECEDOR ( NOME , CNPJ , ENDERECO , CEP ," +
			" BAIRRO , CIDADE , ESTADO , FONE , EMAIL ) VALUES ( ? , ? , ? ,? ,? ,? ,? ,? ,? ); ";
	
	public static final String EXCLUIR_FORNECEDOR = " DELETE FROM TB_FORNECEDOR WHERE CODFORNECEDOR = ? ;";
	
	
	public static final String ALTERAR_FORNECEDOR = " UPDATE TB_FORNECEDOR   " +
			"SET  NOME  = ? , " +
			"	  CNPJ = ? , " +
			"	  ENDERECO = ? , " +
			"	  CEP = ? , " +
			"     BAIRRO = ? , " +
			"	  CIDADE = ? , " +
			"	  ESTADO = ? , " +
			"     FONE = ? , " +
			"     EMAIL = ? WHERE CODFORNECEDOR = ? ;";	 
	
	public static final String  LISTAR_FORNECEDOR = "SELECT  CODFORNECEDOR , NOME , CNPJ , ENDERECO , CEP , BAIRRO , CIDADE ,"
			+ "									  ESTADO , FONE , EMAIL FROM TB_FORNECEDOR WHERE NOME LIKE ? ";
	; 
	
	public static final String  getFornecedor = "SELECT  CODFORNECEDOR , NOME , CNPJ , ENDERECO , CEP , BAIRRO , CIDADE , "
			+ "									ESTADO , FONE , EMAIL FROM TB_FORNECEDOR WHERE CODFORNECEDOR = ? ;"; 
	
	
	public void incluirFornecedor(Fornecedor fornecedor)throws GenericDAOException;
	public void excluirFornecedor(Fornecedor fornecedor)throws GenericDAOException;
	public void atualizarFornecedor(Fornecedor fornecedor)throws GenericDAOException;
	public List<Fornecedor> listarFornecedor(Fornecedor fornecedor)throws GenericDAOException;
	public Fornecedor getFornecedor(String codFornecedor)throws GenericDAOException;
}
