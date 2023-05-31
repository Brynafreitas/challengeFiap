package br.com.fiap.tds.challenge.bean;

import java.util.Date;

public abstract class Abastecimento implements Interface{

	private int id;

	private Date dtRegistro;

	private String tipoRecurso;

	private String nmFornecedor;

	public Abastecimento() {
		super();
	}

	public Abastecimento(int id, Date dtRegistro, String tipoRecurso, String nmFornecedor) {
		super();
		this.id = id;
		this.dtRegistro = dtRegistro;
		this.tipoRecurso = tipoRecurso;
		this.nmFornecedor = nmFornecedor;
	}

	public int getId() {
		return id;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public String getTipoRecurso() {
		return tipoRecurso;
	}

	public String getNmFornecedor() {
		return nmFornecedor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	public void setNmFornecedor(String nmFornecedor) {
		this.nmFornecedor = nmFornecedor;
	}

}
