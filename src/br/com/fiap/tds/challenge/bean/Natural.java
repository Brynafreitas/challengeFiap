package br.com.fiap.tds.challenge.bean;

import java.time.LocalDate;

public class Natural extends Abastecimento{

	private String nmRecurso;
	
	private String tipoRecurso;
	
	private double qtGasta;
	
	private double vlGasto;
	
	private int id;

	public Natural() {
		super();
	}

	public Natural(LocalDate dtRegistro, String tipoRecurso, String nmFornecedor) {
	    super(dtRegistro, tipoRecurso, nmFornecedor);
	}

	public Natural(String nmRecurso, String tipoRecurso, double qtGasta, double vlGasto, int id) {
		super();
		this.nmRecurso = nmRecurso;
		this.tipoRecurso = tipoRecurso;
		this.qtGasta = qtGasta;
		this.vlGasto = vlGasto;
		this.id = id;
	}

	public String getNmRecurso() {
		return nmRecurso;
	}

	public String getTipoRecurso() {
		return tipoRecurso;
	}

	public double getQtGasta() {
		return qtGasta;
	}

	public double getVlGasto() {
		return vlGasto;
	}

	public void setNmRecurso(String nmRecurso) {
		this.nmRecurso = nmRecurso;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	public void setQtGasta(double qtGasta) {
		this.qtGasta = qtGasta;
	}

	public void setVlGasto(double vlGasto) {
		this.vlGasto = vlGasto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}
	
	
}
