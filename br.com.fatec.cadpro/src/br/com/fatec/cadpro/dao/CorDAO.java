package br.com.fatec.cadpro.dao;

import br.com.fatec.cadpro.entidades.Cor;
import br.com.fatec.cadpro.dao.GenericDAOException;

public interface CorDAO {

	public static final String ADICIONAR_COR =" INSERT INTO TB_COR ( COR ) VALUES ( ? );  ";
	public static final String EXCLUIR_COR = " DELETE FROM TB_COR WHERE CODCOR = ? ; ";
		
				public void adicionarCor(Cor cor) throws  GenericDAOException; 
				public void excluirCor(Cor cor) throws  GenericDAOException; 
				
}
;