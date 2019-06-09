package br.com.fatec.cadpro.entidades;

public class Vendas {

	private int idVenda;
	private int numeroVenda;
	private int codVen;
	private int parcelas;
	private double vlrTotal;	
	private int quantidade;
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getNumeroVenda() {
		return numeroVenda;
	}
	public void setNumeroVenda(int numeroVenda) {
		this.numeroVenda = numeroVenda;
	}
	public int getCodVen() {
		return codVen;
	}
	public void setCodVen(int codVen) {
		this.codVen = codVen;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
