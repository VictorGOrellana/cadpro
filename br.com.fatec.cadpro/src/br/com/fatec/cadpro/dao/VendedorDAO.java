package br.com.fatec.cadpro.dao;

import java.util.List;
import br.com.fatec.cadpro.entidades.Vendedor;

public interface VendedorDAO {
	public static final String INSERIR_VENDEDOR = " INSERT INTO TB_VENDEDOR ( NOME , ENDERECO , BAIRRO , CIDADE ," +
			" ESTADO , CEP , CPF , RG , FONE, EMAIL , DATACAD , DATANASC , PORCCOMISSAO ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ?"
			+ " , ? , ? , ? ); ";
	
	public static final String EXCLUIR_VENDEDOR = " DELETE FROM TB_VENDEDOR WHERE CODVEN = ? ;";
	
	public static final String ALTERAR_VENDEDOR = " UPDATE TB_VENDEDOR  " +
			"SET  NOME  = ? , " +
			"	  ENDERECO = ? , " +
			"	  BAIRRO = ? , " +
			"	  CIDADE = ? , " +
			"     ESTADO = ? , " +
			"	  CEP = ? , " +
			"	  CPF = ? , " +
			"     RG = ? , " +
			"     FONE = ? , " +
			"     EMAIL = ? , " +
			"     DATACAD = ? , " +
			"     DATANASC = ? , " +
			"     PORCCOMISSAO = ? "
			+ "   WHERE CODVEN = ? ;";	 
	
	public static final String  LISTAR_VENDEDOR = "SELECT  * FROM TB_VENDEDOR ; ";
	
	
	public static final String  getVendedor = "SELECT  CODVEN , NOME , ENDERECO , BAIRRO , CIDADE , ESTADO , CEP , CPF , RG , FONE, EMAIL ,"
			+ "										 DATACAD , DATANASC , PORCCOMISSAO FROM TB_VENDEDOR	WHERE CODVEN = ? ; ";
	
	
	public void incluirVendedor(Vendedor vendedor);
	public void atualizarVendedor(Vendedor vendedor);
	public void excluirVendedor(Vendedor vendedor);
	public List<Vendedor> listarVendedor(Vendedor vendedor);
	public Vendedor getVendedor(String codVendedor);
}
