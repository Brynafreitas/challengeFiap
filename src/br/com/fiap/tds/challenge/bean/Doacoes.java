package br.com.fiap.tds.challenge.bean;

import java.util.Date;

public class Doacoes implements Interface{

	private int id;

	private int qtRefeicoes;

	private String ufDoacao;

	private Date dtDoacao;

	private double vlInvestido;

	public Doacoes() {
		super();
	}

	public Doacoes(int id, int qtRefeicoes, String ufDoacao, Date dtDoacao, double vlInvestido) {
		super();
		this.id = id;
		this.qtRefeicoes = qtRefeicoes;
		this.ufDoacao = ufDoacao;
		this.dtDoacao = dtDoacao;
		this.vlInvestido = vlInvestido;
	}

	public int getId() {
		return id;
	}

	public int getQtRefeicoes() {
		return qtRefeicoes;
	}

	public String getUfDoacao() {
		return ufDoacao;
	}

	public Date getDtDoacao() {
		return dtDoacao;
	}

	public double getVlInvestido() {
		return vlInvestido;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQtRefeicoes(int qtRefeicoes) {
		this.qtRefeicoes = qtRefeicoes;
	}

	public void setUfDoacao(String ufDoacao) {
		this.ufDoacao = ufDoacao;
	}

	public void setDtDoacao(Date dtDoacao) {
		this.dtDoacao = dtDoacao;
	}

	public void setVlInvestido(double vlInvestido) {
		this.vlInvestido = vlInvestido;
	}

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}

}
