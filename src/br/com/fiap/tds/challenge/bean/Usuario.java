package br.com.fiap.tds.challenge.bean;

public class Usuario implements Interface{

	private String id;
	private String senha;
	private String idFabrica;
	private String marca;

	public Usuario() {
		super();
	}

	public Usuario(String id, String senha) {
		super();
		this.id = id;
		this.senha = senha;
	}

	public String getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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


