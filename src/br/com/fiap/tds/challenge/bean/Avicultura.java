package br.com.fiap.tds.challenge.bean;

import java.time.LocalDate;


public class Avicultura implements Interface {

	private boolean ovoCaipira;

	private boolean livreGaiola;

	private LocalDate dtValidade;

	private int qtLotes;

	private double vlUnitario;

	private String tipoRecurso;
	
	public int Id;
	
	public Avicultura(boolean ovoCaipira, boolean livreGaiola, LocalDate dtValidade, int qtLotes, double vlUnitario,
			String tipoRecurso, int Id) {
		super();
		this.ovoCaipira = ovoCaipira;
		this.livreGaiola = livreGaiola;
		this.dtValidade = dtValidade;
		this.qtLotes = qtLotes;
		this.vlUnitario = vlUnitario;
		this.tipoRecurso = tipoRecurso;
		this.Id = Id;
	}
	


	public Avicultura() {
		// TODO Auto-generated constructor stub
	}



	public boolean isOvoCaipira() {
		return ovoCaipira;
	}


	public void setOvoCaipira(boolean ovoCaipira) {
		this.ovoCaipira = ovoCaipira;
	}


	public boolean isLivreGaiola() {
		return livreGaiola;
	}


	public void setLivreGaiola(boolean livreGaiola) {
		this.livreGaiola = livreGaiola;
	}


	public LocalDate getDtValidade() {
		return dtValidade;
	}


	public void setDtValidade(LocalDate dtValidade) {
		this.dtValidade = dtValidade;
	}


	public int getQtLotes() {
		return qtLotes;
	}


	public void setQtLotes(int qtLotes) {
		this.qtLotes = qtLotes;
	}


	public double getVlUnitario() {
		return vlUnitario;
	}


	public void setVlUnitario(double vlUnitario) {
		this.vlUnitario = vlUnitario;
	}


	public String getTipoRecurso() {
		return tipoRecurso;
	}


	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}
	


	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}
	}