package br.com.fiap.tds.challenge.bean;

import java.time.LocalDate;


public abstract class Abastecimento implements Interface{

	private int id;

	private LocalDate dtRegistro;

	private String tipoRecurso;

	private String nmFornecedor;
	
	private String idFabrica;
	
	private String marca;

	public Abastecimento() {
		super();
	}

	public Abastecimento(int id, LocalDate dtRegistro, String tipoRecurso, String nmFornecedor) {
		super();
		this.id = id;
		this.dtRegistro = dtRegistro;
		this.tipoRecurso = tipoRecurso;
		this.nmFornecedor = nmFornecedor;
	}
	
	public Abastecimento(LocalDate dtRegistro, String tipoRecurso, String nmFornecedor) {
		super();
		this.dtRegistro = dtRegistro;
		this.tipoRecurso = tipoRecurso;
		this.nmFornecedor = nmFornecedor;
	}

	public int getId() {
		return id;
	}

	public LocalDate getDtRegistro() {
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

	public void setDtRegistro(LocalDate dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	public void setNmFornecedor(String nmFornecedor) {
		this.nmFornecedor = nmFornecedor;
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
	

}
