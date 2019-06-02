package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fatec.cadpro.entidades.Login;

public class LoginDAOImpl implements LoginDAO {

	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();
	@Override
	public boolean loginUsuario(Login login) throws GenericDAOException{
			
		
		try {
			int i = 0 ; 
			PreparedStatement ps = con.prepareStatement(LOGIN);
			
			ps.setString(++i, login.getSenhaVend());
			ps.setString(++i, login.getCpf());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;	
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return false;
				
		
		
	}

		
				
}
