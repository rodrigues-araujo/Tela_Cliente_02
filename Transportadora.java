package Tela;

public class Transportadora {
	private String nome;
	private Contato contatoResp;
	public Transportadora(String nome, Contato contatoResp) {
		this.nome = nome;
		contatoResp = new Contato();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato getContatoResp() {
		return contatoResp;
	}
	public void setContatoResp(Contato contatoResp) {
		this.contatoResp = contatoResp;
	}
	
	
}
