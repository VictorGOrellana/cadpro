package br.com.fatec.cadpro.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.dao.VendedorDAO;
import br.com.fatec.cadpro.dao.VendedorDAOImpl;
import br.com.fatec.cadpro.entidades.Vendedor;

@Controller
public class VendedorController {
	
	Vendedor vendedor = new Vendedor();
	VendedorDAO vDAO = new VendedorDAOImpl();

	@RequestMapping("/acessoAlterarVendedor")
	public String acessoAlterarVendedor(HttpServletRequest request ,Model model,  HttpServletResponse response) throws GenericDAOException {
		HttpSession session = request.getSession();
		Object s = session.getAttribute("CODVEN");
		vendedor.setCodVen(Integer.parseInt(s.toString()));
		
		Vendedor vendTela = vDAO.getVendedor(vendedor.getCodVen());
		
		session.setAttribute("CADASTROBD",vendTela);
		
		return "alterarVendedor";
	}

	@RequestMapping("/acessoCadastrarVendedor")
	public String acessoCadastrarVendedor() {
		return "incluirVendedor";
	}

	@RequestMapping("/acessoListarVendedores")
	public String acessoListarVendedores(HttpServletRequest request , HttpServletResponse response) throws GenericDAOException {
		
		List<Vendedor> lista = new ArrayList<Vendedor>();
		HttpSession session = request.getSession();
		
		lista=vDAO.listarVendedor(vendedor);
		
		session.setAttribute("LISTA",lista);
		return "vendedores";
	}
	
	@RequestMapping("/acessoExcluirVendedor")
	public String acessoExcluirVendedor(HttpServletRequest request ,Model model,  HttpServletResponse response) throws GenericDAOException {
		
		HttpSession session = request.getSession();
		Object s = session.getAttribute("CODVEN");
		vendedor.setCodVen(Integer.parseInt(s.toString()));
		
		Vendedor vendTela = vDAO.getVendedor(vendedor.getCodVen());
		
		session.setAttribute("CADASTROBD",vendTela);
		
		return "excluirVendedor";
	}	
	
	@RequestMapping("/excVendedor")
	public String excVendedro(@RequestParam("codVen") int codVen) {
		
		
		
		vendedor.setCodVen(codVen);
		
		vDAO.excluirVendedor(vendedor);
		
		return "excluirVendedor";
	}
	
	@RequestMapping("/incVendedor")
	public String incVendedor(@RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email,@RequestParam("senha") String senha, @RequestParam("porComissao") double porComissao) {

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
		vendedor.setSenha(senha);
		
		vendedor.setPorComissao(porComissao);
		
		vDAO.incluirVendedor(vendedor);
		
		return "incluirVendedor";
	}
	
	@RequestMapping("/altVendedor")
	public String altVendedor(@RequestParam("codVen") int codVen, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email, @RequestParam("porComissao") double porComissao) {
		
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
		
		vendedor.setPorComissao(porComissao);
		
		vDAO.atualizarVendedor(vendedor);
		
		return "alterarVendedor";
	}
	
	@RequestMapping("/lisVendedor")
	public String lisVendedor(@RequestParam("codVen") int codVen, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco,
								@RequestParam("bairro") String bairro, @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
								@RequestParam("cep") String cep, @RequestParam("cpf") String cpf, @RequestParam("rg") String rg, @RequestParam("fone") String fone,
								@RequestParam("email") String email, @RequestParam("porComissao") double porComissao) {
		
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

		vendedor.setPorComissao(porComissao);
		
		List<Vendedor> lista = vDAO.listarVendedor(vendedor);
		
		return "vendedores";
	}
	
	@RequestMapping("/getVendedor")
	public String getVendedor(@RequestParam("codVen") String codVen) {
		
		vendedor = vDAO.getVendedor(Integer.parseInt(codVen));
		
		return "vendas";
	}
	
	
}
