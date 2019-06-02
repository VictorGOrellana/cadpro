package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Cliente;
import br.com.fatec.cadpro.dao.GenericDAOException;

public class ClienteDAOImpl implements ClienteDAO {

	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();
	
	public void incluirCliente(Cliente cliente) throws GenericDAOException {
			 
			
		try { 
			PreparedStatement ps = con.prepareStatement(INSERIR_CLIENTE);
			ps.setString(1,cliente.getNome());
			ps.setString(2,cliente.getEndereco());
			ps.setString(3,cliente.getBairro());
			ps.setString(4,cliente.getCidade());
			ps.setString(5,cliente.getEstado());
			ps.setString(6,cliente.getCep());
			ps.setString(7,cliente.getCpfCnpj());
			ps.setString(8,cliente.getFone());
			ps.setString(9,cliente.getEmail());
			ps.setDate(10, (Date) cliente.getDataCad());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
			
		 	
}
		
		


	public void excluirCliente(Cliente cliente) throws GenericDAOException  {
		
		try {
		
			PreparedStatement ps = con.prepareStatement(EXCLUIR_CLIENTE);
			ps.setInt(1, cliente.getCodCli()); 
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new GenericDAOException(e);
		}
	}

	public void atualizarCliente(Cliente cliente) throws GenericDAOException {
		
		try {
			PreparedStatement ps = con.prepareStatement(ALTERAR_CLIENTE);
			
			// parametros para alteração do cliente. 
			ps.setString(1,cliente.getNome());
			ps.setString(2,cliente.getEndereco());
			ps.setString(3,cliente.getBairro());
			ps.setString(4,cliente.getCidade());
			ps.setString(5,cliente.getEstado());
			ps.setString(6,cliente.getCep());
			ps.setString(7,cliente.getCpfCnpj());
			ps.setString(8,cliente.getFone());
			ps.setString(9,cliente.getEmail());
			
			// parametro WHERE da query
						ps.setInt(10,cliente.getCodCli());
		
			ps.executeUpdate();
			ps.close();
	} catch (SQLException e) {
		throw new GenericDAOException(e);
	}
			
			
	
	}

	public List<Cliente> listarClientes(Cliente cliente) throws GenericDAOException {
		ArrayList<Cliente> listaDeCliente = new ArrayList<Cliente>();	
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_CLIENTE);
			ps.setString(1, cliente.getNome()); 
			ResultSet rs = ps.executeQuery();
		 while (rs.next()){
			 Cliente cli = new Cliente(); 
			 	cli.setCodCli(rs.getInt("CODCLI"));
			 	cli.setNome(rs.getString("NOME"));
			 	cli.setEndereco(rs.getString("ENDERECO"));
			 	cli.setBairro(rs.getString("BAIRRO"));
			 	cli.setCidade(rs.getString("CIDADE"));
			 	cli.setEstado(rs.getString("ESTADO"));
			 	cli.setCep(rs.getString("CEP"));
			 	cli.setCpfCnpj(rs.getString("CPFCNPJ"));
			 	cli.setFone(rs.getString("FONE"));
			 	cli.setEmail(rs.getString("EMAIL"));
			 	cli.setDataCad(rs.getDate("DATACAD"));
			 listaDeCliente.add(cli);
			 	
			 	
		 }
		}
		catch (SQLException e) {
				throw new GenericDAOException(e);
			}
		
		
		
		return listaDeCliente;
	}

	public Cliente getCliente(Cliente cliente) throws GenericDAOException {
	 try {
			PreparedStatement ps = con.prepareStatement(LISTAR_CLIENTE);
			ps.setInt(1, (cliente.getCodCli() + '%')); 
			ResultSet rs = ps.executeQuery();
		 if (rs.next()){
			 Cliente cli = new Cliente(); 
			 	cli.setCodCli(rs.getInt("CODCLI"));
			 	cli.setNome(rs.getString("NOME"));
			 	cli.setEndereco(rs.getString("ENDERECO"));
			 	cli.setBairro(rs.getString("BAIRRO"));
			 	cli.setCidade(rs.getString("CIDADE"));
			 	cli.setEstado(rs.getString("ESTADO"));
			 	cli.setCep(rs.getString("CEP"));
			 	cli.setCpfCnpj(rs.getString("CPFCNPJ"));
			 	cli.setFone(rs.getString("FONE"));
			 	cli.setEmail(rs.getString("EMAIL"));
			 	cli.setDataCad(rs.getDate("DATACAD"));
			 
			 	return cli;
		 }
	 }
	 catch (SQLException e) {
				throw new GenericDAOException(e);
			}
	
		return null;

	}
}





	