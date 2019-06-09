package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Vendedor;

public class VendedorDAOImpl implements VendedorDAO {

	ConnectionSingleton conSing = ConnectionSingleton.getInstancy();
	Connection con = conSing.getcon();

	public void incluirVendedor(Vendedor vendedor) {
		try {
			int i = 0; 
			PreparedStatement ps = con.prepareStatement(INSERIR_VENDEDOR);
			ps.setString(++i, vendedor.getNome());
			ps.setString(++i, vendedor.getEndereco());
			ps.setString(++i, vendedor.getBairro());
			ps.setString(++i, vendedor.getCidade());
			ps.setString(++i, vendedor.getEstado());
			ps.setString(++i, vendedor.getCep());
			ps.setString(++i, vendedor.getCpf());
			ps.setString(++i, vendedor.getRg());
			ps.setString(++i, vendedor.getFone());
			ps.setString(++i, vendedor.getEmail());
			ps.setDate(++i, (Date) vendedor.getDataCad());
			ps.setDate(++i, (Date) vendedor.getDataNasc());
			ps.setDouble(++i, vendedor.getPorComissao());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void atualizarVendedor(Vendedor vendedor) {
		try {

			PreparedStatement ps = con.prepareStatement(ALTERAR_VENDEDOR);
			int i = 0; 
			
			ps.setInt(++i, vendedor.getCodVen());
			ps.setString(++i, vendedor.getNome());
			ps.setString(++i, vendedor.getEndereco());
			ps.setString(++i, vendedor.getBairro());
			ps.setString(++i, vendedor.getCidade());
			ps.setString(++i, vendedor.getEstado());
			ps.setString(++i, vendedor.getCep());
			ps.setString(++i, vendedor.getCpf());
			ps.setString(++i, vendedor.getRg());
			ps.setString(++i, vendedor.getFone());
			ps.setString(++i, vendedor.getEmail());
			ps.setDate(++i, (Date) vendedor.getDataCad());
			ps.setDate(++i, (Date) vendedor.getDataNasc());
			ps.setDouble(++i, vendedor.getPorComissao());
			ps.setInt(++i,vendedor.getCodVen());
			
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Vendedor> listarVendedor(Vendedor vendedor) {
		List<Vendedor> lv = new ArrayList<Vendedor>();
		try {
			
			PreparedStatement ps = con.prepareStatement(LISTAR_VENDEDOR);
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vendedor v = new Vendedor();
				v.setCodVen(rs.getInt("CODVEN"));
				v.setNome(rs.getString("NOME"));
				v.setEndereco(rs.getString("ENDERECO"));
				v.setBairro(rs.getString("BAIRRO"));
				v.setCidade(rs.getString("CIDADE"));
				v.setEstado(rs.getString("ESTADO"));
				v.setCep(rs.getString("CEP"));
				v.setCpf(rs.getString("CPF"));
				v.setRg(rs.getString("RG"));
				v.setFone(rs.getString("FONE"));
				v.setEmail(rs.getString("E_MAIL"));
				v.setDataCad(rs.getDate("DATA_CAD"));
				v.setDataNasc(rs.getDate("DATA_NASC"));
				v.setPorComissao(rs.getDouble("PORC_COMISSAO"));
				lv.add(v);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return lv;
	}

	public Vendedor getVendedor(String codVendedor) {
		Vendedor v = new Vendedor();
		try {
			int i = 0;
			PreparedStatement ps = con.prepareStatement(getVendedor);
			ps.setString(++i, codVendedor);

			ResultSet rs = ps.executeQuery();

			v.setCodVen(rs.getInt("CODVEN"));
			v.setNome(rs.getString("NOME"));
			v.setEndereco(rs.getString("ENDERECO"));
			v.setBairro(rs.getString("BAIRRO"));
			v.setCidade(rs.getString("CIDADE"));
			v.setEstado(rs.getString("ESTADO"));
			v.setCep(rs.getString("CEP"));
			v.setCpf(rs.getString("CPF"));
			v.setRg(rs.getString("RG"));
			v.setFone(rs.getString("FONE"));
			v.setEmail(rs.getString("E_MAIL"));
			v.setDataCad(rs.getDate("DATA_CAD"));
			v.setDataNasc(rs.getDate("DATA_NASC"));
			v.setPorComissao(rs.getDouble("PORC_COMISSAO"));

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return v;
	}

	public void excluirVendedor(Vendedor vendedor) {
		try {
			int i = 0; 
			PreparedStatement ps = con.prepareStatement(EXCLUIR_VENDEDOR);
			ps.setInt(++i, vendedor.getCodVen());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
