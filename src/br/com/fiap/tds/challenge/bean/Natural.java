package br.com.fiap.tds.challenge.bean;

import java.util.Date;

public class Natural extends Abastecimento {

	private String nmRecurso;
	
	private String tipoRecurso;
	
	private double qtGasta;
	
	private double vlGasto;
	
	

	public Natural() {
		super();
	}

	public Natural(int id, Date dtRegistro, String tipoRecurso, String nmFornecedor) {
		super(id, dtRegistro, tipoRecurso, nmFornecedor);
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

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}
	
	
}
