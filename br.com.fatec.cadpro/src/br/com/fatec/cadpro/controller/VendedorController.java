package br.com.fatec.cadpro.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.VendedorDAO;
import br.com.fatec.cadpro.dao.VendedorDAOImpl;
import br.com.fatec.cadpro.entidades.Vendedor;

@Controller
public class VendedorController {
	
	Vendedor vendedor = new Vendedor();
	VendedorDAO vDAO = new VendedorDAOImpl();

	@RequestMapping("/acessoAlterarVendedor")
	public String acessoAlterarVendedor() {
		return "alterarVendedor";
	}

	@RequestMapping("/acessoCadastrarVendedor")
	public String acessoCadastrarVendedor() {
		return "cadastrarVendedor";
	}

	@RequestMapping("/acessoListarVendedores")
	public String acessoListarVendedores() {
		return "vendedores";
	}
	
	
	
	@RequestMapping("/excVendedor")
	public String excVendedro(@RequestParam("codVen") int codVen) {
		
		
		
		vendedor.setCodVen(codVen);
		
		vDAO.excluirVendedor(vendedor);
		
		return "excluirVendedor";
	}
	
	@RequestMapping("/incVendedor")
	public String incVendedor(@RequestParam("codVen") int codVen, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email, @RequestParam("dataCad") Date dataCad, @RequestParam("dataNasc") Date dataNasc, @RequestParam("porComissao") double porComissao) {
		
		vendedor.setCodVen(codVen);
		vendedor.setNome(nome);
		vendedor.setEndereco(endereco);
		vendedor.setBairro(bairro);
		vendedor.setCidade(cidade);
		vendedor.setEstado(estado);
		vendedor.setCep(cep);
		vendedor.setCpf(cpf);
		vendedor.setRg(rg);
		vendedor.setFone(fone);
		vendedor.setEmail(email);
		vendedor.setDataCad(dataCad);
		vendedor.setDataNasc(dataNasc);
		vendedor.setPorComissao(porComissao);
		
		vDAO.incluirVendedor(vendedor);
		
		return "cadastrarVendedor";
	}
	
	@RequestMapping("/altVendedor")
	public String altVendedor(@RequestParam("codVen") int codVen, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email, @RequestParam("dataCad") Date dataCad, @RequestParam("dataNasc") Date dataNasc, @RequestParam("porComissao") double porComissao) {
		
		vendedor.setCodVen(codVen);
		vendedor.setNome(nome);
		vendedor.setEndereco(endereco);
		vendedor.setBairro(bairro);
		vendedor.setCidade(cidade);
		vendedor.setEstado(estado);
		vendedor.setCep(cep);
		vendedor.setCpf(cpf);
		vendedor.setRg(rg);
		vendedor.setFone(fone);
		vendedor.setEmail(email);
		vendedor.setDataCad(dataCad);
		vendedor.setDataNasc(dataNasc);
		vendedor.setPorComissao(porComissao);
		
		vDAO.atualizarVendedor(vendedor);
		
		return "alterarVendedor";
	}
	
	@RequestMapping("/lisVendedor")
	public String lisVendedor(@RequestParam("codVen") int codVen, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email, @RequestParam("dataCad") Date dataCad, @RequestParam("dataNasc") Date dataNasc, @RequestParam("porComissao") double porComissao) {
		
		vendedor.setCodVen(codVen);
		vendedor.setNome(nome);
		vendedor.setEndereco(endereco);
		vendedor.setBairro(bairro);
		vendedor.setCidade(cidade);
		vendedor.setEstado(estado);
		vendedor.setCep(cep);
		vendedor.setCpf(cpf);
		vendedor.setRg(rg);
		vendedor.setFone(fone);
		vendedor.setEmail(email);
		vendedor.setDataCad(dataCad);
		vendedor.setDataNasc(dataNasc);
		vendedor.setPorComissao(porComissao);
		
		List<Vendedor> lista = vDAO.listarVendedor(vendedor);
		
		return "vendedores";
	}
	
	@RequestMapping("/getVendedor")
	public String getVendedor(@RequestParam("codVen") String codVen) {
		
		vendedor = vDAO.getVendedor(codVen);
		
		return "vendas";
	}
	
	
}
