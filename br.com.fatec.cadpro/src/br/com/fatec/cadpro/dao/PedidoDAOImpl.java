package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.entidades.Pedido;

public class PedidoDAOImpl implements PedidoDAO {
	
	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();

	public void incluirPedido(Pedido pedido)throws GenericDAOException  {
		
			try {
				int i =0; 
				PreparedStatement ps = con.prepareStatement(INSERIR_PEDIDO);
				ps.setInt(++i,pedido.getCodCli());
				ps.setInt(++i,pedido.getCodVen());
				ps.setDate(++i,(Date) pedido.getDataEmissao());
				ps.setDouble(++i, pedido.getVlrTotal());
				ps.setString(++i, pedido.getSituacao());
				ps.setString(++i,pedido.getObservacao());
				ps.executeUpdate();
				ps.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new GenericDAOException(e);
			}
				
			
	}

	public void excluirPedido(Pedido pedido)throws GenericDAOException {
		
		 try {
			int i =0; 
			PreparedStatement ps = con.prepareStatement(EXCLUIR_PEDIDO);
			ps.setInt(++i, pedido.getNumPedido());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		}
		 
		
		
		
		
	}

	public void atualizarPedido(Pedido pedido) throws GenericDAOException {
	
		PreparedStatement ps;
		try {
			int i = 0; 
			ps = con.prepareStatement(ALTERAR_PEDIDO);
			ps.setDouble(++i, pedido.getVlrTotal());
			ps.setString(++i, pedido.getSituacao());
			ps.setString(++i,pedido.getObservacao());
			ps.setInt(++i,pedido.getNumPedido());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		} 
		
		
		
	}

	public List<Pedido> listarPedidos(Pedido pedido)throws GenericDAOException {
		ArrayList<Pedido> listaDePedidos = new ArrayList<Pedido>();
		
		try {
			int i =0;
			PreparedStatement ps = con.prepareStatement(LISTAR_PEDIDO);
			ps.setInt(++i,pedido.getCodVen());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pedido p = new Pedido();
					p.setNumPedido(rs.getInt("NUMPEDIDO"));
					p.setCodCli(rs.getInt("CODCLI"));
					p.setCodVen(rs.getInt("CODVEN"));
					p.setDataEmissao(rs.getDate("DATAEMISSAO"));
					p.setObservacao(rs.getString("OBSERVACAO"));
					p.setSituacao(rs.getString("SITUACAO"));
					p.setVlrTotal(rs.getDouble("VLRTOTAL"));
					listaDePedidos.add(p);
				
			}
			
			return listaDePedidos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		}
	}

	public Pedido getPedido(Pedido pedido) throws GenericDAOException{
		
		try {
			int i =0; 
			PreparedStatement ps = con.prepareStatement(GET_PEDIDO);
			ps.setInt(++i ,pedido.getNumPedido());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Pedido p = new Pedido();
					p.setNumPedido(rs.getInt("NUMPEDIDO"));
					p.setCodCli(rs.getInt("CODCLI"));
					p.setCodVen(rs.getInt("CODVEN"));
					p.setDataEmissao(rs.getDate("DATAEMISSAO"));
					p.setObservacao(rs.getString("OBSERVACAO"));
					p.setSituacao(rs.getString("SITUACAO"));
					p.setVlrTotal(rs.getDouble("VLRTOTAL"));
					
					return p;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		}
		return null;
	}


	
	
}
