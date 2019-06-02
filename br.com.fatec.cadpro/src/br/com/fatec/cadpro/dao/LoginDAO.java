package br.com.fatec.cadpro.dao;

import br.com.fatec.cadpro.entidades.Login;

public interface LoginDAO {
	
		
		public static final String LOGIN =" SELECT CPF , SENHAVEND FROM TB_VENDEDOR  WHERE SENHAVEND = ? AND CPF = ?  ";
	

			public boolean loginUsuario(Login login) throws GenericDAOException;
			
				
			
}
