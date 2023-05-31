package br.com.fiap.tds.challenge.bean;

import java.util.Date;

public class Avicultura extends Abastecimento {

	private boolean ovoCaipira;

	private boolean livreGaiola;

	private Date dtValidade;

	private int qtLotes;

	private double vlUnitario;

	private String tipoRecurso;

	public Avicultura() {
		super();
	}

	public Avicultura(int id, Date dtRegistro, String tipoRecurso, String nmFornecedor) {
		super(id, dtRegistro, tipoRecurso, nmFornecedor);
	}

	public Avicultura(boolean ovoCaipira, boolean livreGaiola, Date dtValidade, int qtLotes, double vlUnitario,
			String tipoRecurso) {
		super();
		this.ovoCaipira = ovoCaipira;
		this.livreGaiola = livreGaiola;
		this.dtValidade = dtValidade;
		this.qtLotes = qtLotes;
		this.vlUnitario = vlUnitario;
		this.tipoRecurso = tipoRecurso;
	}

	public boolean isOvoCaipira() {
		return ovoCaipira;
	}

	public boolean isLivreGaiola() {
		return livreGaiola;
	}

	public Date getDtValidade() {
		return dtValidade;
	}

	public int getQtLotes() {
		return qtLotes;
	}

	public double getVlUnitario() {
		return vlUnitario;
	}

	public String getTipoRecurso() {
		return tipoRecurso;
	}

	public void setOvoCaipira(boolean ovoCaipira) {
		this.ovoCaipira = ovoCaipira;
	}

	public void setLivreGaiola(boolean livreGaiola) {
		this.livreGaiola = livreGaiola;
	}

	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}

	public void setQtLotes(int qtLotes) {
		this.qtLotes = qtLotes;
	}

	public void setVlUnitario(double vlUnitario) {
		this.vlUnitario = vlUnitario;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}

}
