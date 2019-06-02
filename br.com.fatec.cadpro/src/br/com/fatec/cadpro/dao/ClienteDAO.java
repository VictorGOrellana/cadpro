package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Cliente;
import br.com.fatec.cadpro.dao.GenericDAOException;


public interface ClienteDAO {
	
	public static final String INSERIR_CLIENTE = " INSERT INTO TB_CLIENTE ( NOME , ENDERECO , BAIRRO , CIDADE ," +
			" ESTADO , CEP , CPFCNPJ , FONE , EMAIL , DATACAD ) VALUES ( ? , ? , ? ,? ,? ,? ,? ,? ,? ,? ); ";
	
	
	public static final String EXCLUIR_CLIENTE = " DELETE FROM TB_CLIENTE WHERE CODCLI = ? ;";
	
	
	public static final String ALTERAR_CLIENTE = " UPDATE TB_CLIENTE   " +
			"SET  NOME  = ? , " +
			"	  ENDERECO = ? , " +
			"	  BAIRRO = ? , " +
			"	  CIDADE = ? , " +
			"     ESTADO = ? , " +
			"	  CEP = ? , " +
			"	  CPFCNPJ = ? , " +
			"     FONE = ? , " +
			"     EMAIL = ?  WHERE CODCLI = ? ;";	
	
	
	public static final String  LISTAR_CLIENTE = "SELECT  CODCLI ,  NOME , ENDERECO , BAIRRO , CIDADE ," +
			"  ESTADO , CEP , CPFCNPJ , FONE , EMAIL , DATACAD  FROM TB_CLIENTE WHERE NOME LIKE ? ";
	
	public static final String  getCliente = " SELECT  CODCLI ,  NOME , ENDERECO , BAIRRO , CIDADE ," +
			"  ESTADO , CEP , CPFCNPJ , FONE , EMAIL , DATACAD  FROM TB_CLIENTE WHERE CODCLI = ? ;"; 
	
	
	public void incluirCliente(Cliente cliente) throws GenericDAOException;
	public void excluirCliente(Cliente cliente) throws GenericDAOException;
	public void atualizarCliente(Cliente cliente)throws GenericDAOException;
	public List<Cliente> listarClientes(Cliente cliente) throws GenericDAOException;
	public Cliente getCliente(Cliente cliente) throws GenericDAOException;
		
	
	
}
