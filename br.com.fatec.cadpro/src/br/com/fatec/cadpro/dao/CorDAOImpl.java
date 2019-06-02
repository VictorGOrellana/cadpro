package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fatec.cadpro.entidades.Cor;
import br.com.fatec.cadpro.dao.GenericDAOException;


public class CorDAOImpl implements CorDAO {

	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();

	@Override
	public void adicionarCor(Cor cor) throws GenericDAOException {
		
		try {
		PreparedStatement ps = con.prepareStatement(ADICIONAR_COR);
		ps.setString(1,cor.getCor());
		ps.executeUpdate();
		ps.close();
		}  catch (SQLException e) {
			throw new GenericDAOException(e);
		}
	}

	@Override
	public void excluirCor(Cor cor) throws GenericDAOException   {
		
		try {	
		PreparedStatement ps = con.prepareStatement(EXCLUIR_COR);
		ps.setInt(1,cor.getCodCor());
		ps.executeUpdate();
		ps.close();
	}  catch (SQLException e) {
		throw new GenericDAOException(e);
	}

	}

}
