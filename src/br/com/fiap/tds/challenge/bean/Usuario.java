package br.com.fiap.tds.challenge.bean;

public class Usuario implements Interface{

	private String id;
	private String senha;

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

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}

}
