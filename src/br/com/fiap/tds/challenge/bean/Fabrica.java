package br.com.fiap.tds.challenge.bean;

public class Fabrica implements Interface{

	private String id;
	private String marca;
	private String uf;

	public Fabrica() {
		super();
	}

	public Fabrica(String id, String marca, String uf) {
		super();
		this.id = id;
		this.marca = marca;
		this.uf = uf;
	}

	public String getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getUf() {
		return uf;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public void incluir() {
		// TODO Auto-generated method stub
		
	}

}
