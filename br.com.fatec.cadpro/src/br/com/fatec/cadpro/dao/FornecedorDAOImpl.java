package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Fornecedor;
import br.com.fatec.cadpro.dao.GenericDAOException;

public class FornecedorDAOImpl implements FornecedorDAO{
	
	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();

	public void incluirFornecedor(Fornecedor fornecedor) throws GenericDAOException {
		
		try {
			
			PreparedStatement ps = con.prepareStatement(INSERIR_FORNECEDOR);
			ps.setString(1,fornecedor.getNome());
			ps.setString(2,fornecedor.getCnpj());
			ps.setString(3,fornecedor.getEndereco());
			ps.setString(4,fornecedor.getCep());
			ps.setString(5,fornecedor.getBairro());
			ps.setString(6,fornecedor.getCidade());
			ps.setString(7,fornecedor.getEstado());
			ps.setString(8,fornecedor.getFone());
			ps.setString(9,fornecedor.getEmail());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			
			throw new GenericDAOException(e);
		
		} 
		
	}

	public void excluirFornecedor(Fornecedor fornecedor)throws GenericDAOException {
		try {
			
			PreparedStatement ps = con.prepareStatement(EXCLUIR_FORNECEDOR);
			ps.setInt(1,fornecedor.getCodFornecedor());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
			
		} 
		
	}

	public void atualizarFornecedor(Fornecedor fornecedor) throws GenericDAOException{
		
		try {
			
			PreparedStatement ps = con.prepareStatement(ALTERAR_FORNECEDOR);
			ps.setInt(1,fornecedor.getCodFornecedor());
			ps.setString(2,fornecedor.getNome());
			ps.setString(3,fornecedor.getCnpj());
			ps.setString(4,fornecedor.getEndereco());
			ps.setString(5,fornecedor.getCep());
			ps.setString(6,fornecedor.getBairro());
			ps.setString(7,fornecedor.getCidade());
			ps.setString(8,fornecedor.getEstado());
			ps.setString(9,fornecedor.getFone());
			ps.setString(10,fornecedor.getEmail());
			
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		} 
		
	}

	public List<Fornecedor> listarFornecedor(Fornecedor fornecedor) throws GenericDAOException{
		List<Fornecedor> lf = new ArrayList<Fornecedor>();
		try {
			
			PreparedStatement ps = con.prepareStatement(LISTAR_FORNECEDOR);
			ps.setString(1,fornecedor.getNome());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()){
				 Fornecedor f = new Fornecedor();
				 	f.setCodFornecedor(rs.getInt("CODFORNECEDOR"));
				 	f.setNome(rs.getString("NOME"));
				 	f.setCnpj(rs.getString("CNPJ"));
				 	f.setEndereco(rs.getString("ENDERECO"));
				 	f.setBairro(rs.getString("BAIRRO"));
				 	f.setCidade(rs.getString("CIDADE"));
				 	f.setEmail(rs.getString("EMAIL"));
				 	f.setFone(rs.getString("FONE"));
				 	f.setCep(rs.getString("CEP"));
				 	f.setEstado(rs.getString("ESTADO"));
				 	lf.add(f);
			}
			
		} catch (SQLException e) {
			
			throw new GenericDAOException(e);
		} 
		return lf;
	}

	public Fornecedor getFornecedor(String codFornecedor)throws GenericDAOException{
		Fornecedor f = new Fornecedor();
		try {
			
			PreparedStatement ps = con.prepareStatement(getFornecedor);
			ps.setString(1,codFornecedor);
			ResultSet rs = ps.executeQuery();
			
				 	f.setCodFornecedor(rs.getInt("CODFORNECEDOR"));
				 	f.setNome(rs.getString("NOME"));
				 	f.setCnpj(rs.getString("CNPJ"));
				 	f.setEndereco(rs.getString("ENDERECO"));
				 	f.setBairro(rs.getString("BAIRRO"));
				 	f.setCidade(rs.getString("CIDADE"));
				 	f.setEmail(rs.getString("EMAIL"));
				 	f.setFone(rs.getString("FONE"));
				 	f.setCep(rs.getString("CEP"));
				 	f.setEstado(rs.getString("ESTADO"));
				 	
		} catch (SQLException e) {
			
			throw new GenericDAOException(e);
		} 
		return f;
	}
	

}
