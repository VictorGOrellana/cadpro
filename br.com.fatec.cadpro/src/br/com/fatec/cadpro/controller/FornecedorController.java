package br.com.fatec.cadpro.controller;

import br.com.fatec.cadpro.dao.FornecedorDAO;
import br.com.fatec.cadpro.dao.FornecedorDAOImpl;
import br.com.fatec.cadpro.dao.GenericDAOException;
import br.com.fatec.cadpro.entidades.Fornecedor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FornecedorController {

    @RequestMapping("/fornecedores")
    public ModelAndView mostraFornecedores(){
        return new ModelAndView("fornecedores");
    }

    @RequestMapping("/alterarFornecedores")
    public ModelAndView alterarFornecedores(){
        return new ModelAndView("alterarFornecedores");
    }

    @RequestMapping("/cadastrarFornecedores")
    public ModelAndView cadastrarFornecedores(){
        return new ModelAndView("cadastrarFornecedores");
    }

    @RequestMapping("/excluirFornecedores")
    public ModelAndView excluirFornecedores(){
        return new ModelAndView("excluirFornecedores");
    }

    @RequestMapping("/alteraFornecedores")
    public ModelAndView alteraFornecedor(
            @RequestParam("codFornecedor") int codFornecedor, @RequestParam("nome") String nome,
            @RequestParam("cnpj") String cnpj, @RequestParam("endereco") String endereco,
            @RequestParam("cep") String cep, @RequestParam("bairro") String bairro,
            @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
            @RequestParam("fone") String fone, @RequestParam("email") String email) throws GenericDAOException {

        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fDao = new FornecedorDAOImpl();

        fornecedor.setCodFornecedor(codFornecedor);
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setCep(cep);
        fornecedor.setBairro(bairro);
        fornecedor.setCidade(cidade);
        fornecedor.setEstado(estado);
        fornecedor.setFone(fone);
        fornecedor.setEmail(email);

        fDao.atualizarFornecedor(fornecedor);

        return new ModelAndView("alterarFornecedores");
    }

    @RequestMapping("/cadastraFornecedores")
    public ModelAndView cadastraFornecedor(
            @RequestParam("codFornecedor") int codFornecedor, @RequestParam("nome") String nome,
            @RequestParam("cnpj") String cnpj, @RequestParam("endereco") String endereco,
            @RequestParam("cep") String cep, @RequestParam("bairro") String bairro,
            @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
            @RequestParam("fone") String fone, @RequestParam("email") String email) throws GenericDAOException {

        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fDao = new FornecedorDAOImpl();

        fornecedor.setCodFornecedor(codFornecedor);
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setCep(cep);
        fornecedor.setBairro(bairro);
        fornecedor.setCidade(cidade);
        fornecedor.setEstado(estado);
        fornecedor.setFone(fone);
        fornecedor.setEmail(email);

        fDao.incluirFornecedor(fornecedor);

        return new ModelAndView("excluirFornecedores");
    }

    @RequestMapping("/excluiFornecedores")
    public ModelAndView excluiFornecedor(
            @RequestParam("codFornecedor") int codFornecedor, @RequestParam("nome") String nome,
            @RequestParam("cnpj") String cnpj, @RequestParam("endereco") String endereco,
            @RequestParam("cep") String cep, @RequestParam("bairro") String bairro,
            @RequestParam("cidade") String cidade, @RequestParam("estado") String estado,
            @RequestParam("fone") String fone, @RequestParam("email") String email) throws GenericDAOException {

        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fDao = new FornecedorDAOImpl();

        fornecedor.setCodFornecedor(codFornecedor);
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setCep(cep);
        fornecedor.setBairro(bairro);
        fornecedor.setCidade(cidade);
        fornecedor.setEstado(estado);
        fornecedor.setFone(fone);
        fornecedor.setEmail(email);

        fDao.excluirFornecedor(fornecedor);

        return new ModelAndView("cadastrarFornecedores");
    }


}
