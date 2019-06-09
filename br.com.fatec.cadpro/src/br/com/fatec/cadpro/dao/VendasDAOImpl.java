package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fatec.cadpro.entidades.Vendas;

public class VendasDAOImpl implements VendasDAO {
	
	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();
	
	@Override
	public void adicionarVenda(Vendas vendas) throws GenericDAOException {
		
		try {
			PreparedStatement ps = con.prepareStatement(ADICIONAR_VENDA);
			int i = 0; 
			ps.setInt(++i,vendas.getNumeroVenda());
			ps.setInt(++i,vendas.getCodVen());
			ps.setInt(++i,vendas.getParcelas());
			ps.setDouble(++i,vendas.getVlrTotal());
			ps.setInt(++i,vendas.getQuantidade());
						
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
		
	}

	@Override
	public void excluirVenda(Vendas vendas) throws GenericDAOException {
			
		
		
		
		try {
			PreparedStatement ps = con.prepareStatement(EXCLUIR_VENDA);
			int i = 0; 
			ps.setInt(++i,vendas.getIdVenda());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
		
		
	}

	@Override
	public void alterarVenda(Vendas vendas) throws GenericDAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vendas> listarVendas(Vendas vendas) throws GenericDAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendas getVendas(Vendas vendas) throws GenericDAOException {
		// TODO Auto-generated method stub
		return null;
	}

		
}
