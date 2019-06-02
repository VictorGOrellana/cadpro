package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.entidades.Produto;

public class ProdutoDAOImpl implements ProdutoDAO {
	
	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();

	public void incluirProduto(Produto produto) throws GenericDAOException {
		try {
			int i =0; 
			PreparedStatement ps = con.prepareStatement(INSERIR_PRODUTO);
			ps.setString(++i,produto.getCodProduto());
			ps.setString(++i,produto.getDescricao());
			ps.setInt(++i, produto.getCodUnidade());
			ps.setInt(++i, produto.getCodTipo());
			ps.setDouble(++i, produto.getPrecoCusto());
			ps.setDouble(++i,produto.getPrecoVenda());
			ps.setInt(++i,produto.getQuantidade());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
		
	}

	public void excluirProduto(Produto produto)throws GenericDAOException {
		 
		try {
			int i = 0 ; 
			PreparedStatement ps = con.prepareStatement(EXCLUIR_PRODUTO);
			ps.setInt(++i,produto.getIdProduto());
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
		
	}

	public void atualizarProduto(Produto produto)throws GenericDAOException {
		try {
			int i =0; 
			PreparedStatement ps = con.prepareStatement(ALTERAR_PRODUTO);
			ps.setString(++i,produto.getCodProduto());
			ps.setString(++i,produto.getDescricao());
			ps.setInt(++i, produto.getCodUnidade());
			ps.setInt(++i, produto.getCodTipo());
			ps.setDouble(++i, produto.getPrecoCusto());
			ps.setDouble(++i,produto.getPrecoVenda());
			ps.setInt(++i,produto.getQuantidade());
			ps.setInt(++i,produto.getIdProduto());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
		
		
	}

	public List<Produto> listarProdutos(Produto produto)throws GenericDAOException {
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		try {
			int i = 0; 
			PreparedStatement ps = con.prepareStatement(LISTAR_PRODUTO);
			ps.setString(++i,produto.getDescricao());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
					p.setIdProduto(rs.getInt("IDPRODUTO"));
					p.setCodProduto(rs.getString("CODPRODUTO"));
					p.setDescricao(rs.getString("DESCRICAO"));
					p.setCodUnidade(rs.getInt("CODUNIDADE"));
					p.setCodTipo(rs.getInt("CODTIPO"));
					p.setPrecoCusto(rs.getDouble("PRECOCUSTO"));
					p.setPrecoVenda(rs.getDouble("PRECOVENDA"));
					p.setQuantidade(rs.getInt("QUANTIDADE"));
					listaDeProdutos.add(p);
				
			}
			
			return listaDeProdutos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		} 
	}
	
	public Produto getProduto(Produto produto)throws GenericDAOException {
		try {
			int i = 0; 
			PreparedStatement ps = con.prepareStatement(LISTAR_PRODUTO);
			ps.setString(++i,produto.getDescricao());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
					p.setIdProduto(rs.getInt("IDPRODUTO"));
					p.setCodProduto(rs.getString("CODPRODUTO"));
					p.setDescricao(rs.getString("DESCRICAO"));
					p.setCodUnidade(rs.getInt("CODUNIDADE"));
					p.setCodTipo(rs.getInt("CODTIPO"));
					p.setPrecoCusto(rs.getDouble("PRECOCUSTO"));
					p.setPrecoVenda(rs.getDouble("PRECOVENDA"));
					p.setQuantidade(rs.getInt("QUANTIDADE"));
				
					
					return p; 
				
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GenericDAOException(e);
		} 		
		
		return null;
	}
	

	}


	
	
	
