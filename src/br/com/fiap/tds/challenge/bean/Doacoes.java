package br.com.fiap.tds.challenge.bean;

import java.time.LocalDate;


public class Doacoes implements Interface{

	private int id;

	private int qtRefeicoes;

	private String ufDoacao;

	private LocalDate dtDoacao;

	private Double vlInvestido;
	
	private String idFabrica;
	
	private String marca;

	public Doacoes() {
		super();
	}

	public Doacoes(int id, int qtRefeicoes, String ufDoacao, LocalDate dtDoacao, double vlInvestido) {
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

	public LocalDate getDtDoacao() {
		return dtDoacao;
	}

	public Double getVlInvestido() {
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

	public void setDtDoacao(LocalDate dtDoacao) {
		this.dtDoacao = dtDoacao;
	}

	public void setVlInvestido(double vlInvestido) {
		this.vlInvestido = vlInvestido;
	}

	
	public String getIdFabrica() {
		return idFabrica;
	}

	public void setIdFabrica(String idFabrica) {
		this.idFabrica = idFabrica;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}

}
