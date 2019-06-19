package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<Vendas> listaVendas = new ArrayList<Vendas>();
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_VENDA);
			ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Vendas v = new Vendas();
				v.setCodVen(rs.getInt("CODVEN"));
				v.setIdVenda(rs.getInt("IDVENDA"));
				v.setNumeroVenda(rs.getInt("NUMEROVENDA"));
				v.setParcelas(rs.getInt("PARCELAS"));
				v.setQuantidade(rs.getInt("QUANTIDADE"));
				v.setVlrTotal(rs.getDouble("VLRTOTAL"));
				listaVendas.add(v);
				
				}
				
				return listaVendas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
		
	}
	
//	List<Vendedor> lv = new ArrayList<Vendedor>();
//	try {
//		
//		PreparedStatement ps = con.prepareStatement(LISTAR_VENDEDOR);
//	
//		ResultSet rs = ps.executeQuery();
//
//		while (rs.next()) {
//			Vendedor v = new Vendedor();
//			v.setCodVen(rs.getInt("CODVEN"));
//			v.setNome(rs.getString("NOME"));
//			v.setEndereco(rs.getString("ENDERECO"));
//			v.setBairro(rs.getString("BAIRRO"));
//			v.setCidade(rs.getString("CIDADE"));
//			v.setEstado(rs.getString("ESTADO"));
//			v.setCep(rs.getString("CEP"));
//			v.setCpf(rs.getString("CPF"));
//			v.setRg(rs.getString("RG"));
//			v.setFone(rs.getString("FONE"));
//			v.setEmail(rs.getString("E_MAIL"));
//			v.setDataCad(rs.getDate("DATA_CAD"));
//			v.setDataNasc(rs.getDate("DATA_NASC"));
//			v.setPorComissao(rs.getDouble("PORC_COMISSAO"));
//			lv.add(v);
//		}
//
//	} catch (SQLException e) {
//
//		e.printStackTrace();
//	}
//	return lv;
//}


	@Override
	public Vendas getVendas(Vendas vendas) throws GenericDAOException {
		// TODO Auto-generated method stub
		return null;
	}

		
}
