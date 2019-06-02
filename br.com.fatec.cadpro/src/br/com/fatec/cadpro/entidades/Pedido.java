package br.com.fatec.cadpro.entidades;

import java.util.Date;

public class Pedido {
 
	private int numPedido; 
	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	private int codCli;
	private int codVen;
	private Date dataEmissao;
	private double vlrTotal;
	private String situacao;
	private String observacao;
	


	public int getCodCli() {
		return codCli;
	}
	
	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}
	public int getCodVen() {
		return codVen;
	}
	public void setCodVen(int codVen) {
		this.codVen = codVen;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
	
}
