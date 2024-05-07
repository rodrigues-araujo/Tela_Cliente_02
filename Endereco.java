package Tela;

public class Endereco {
	private String cep;
	private String uf;
	private String municipio;
	private String logradouro;
	private String complemento;
	private String bairro;
	public Endereco() {}
	public Endereco(String cep, String uf, String municipio, String logradouro, String complemento, String bairro) {
	
		this.cep = cep;
		this.uf = uf;
		this.municipio = municipio;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
