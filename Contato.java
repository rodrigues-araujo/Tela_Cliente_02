package Tela;

public class Contato {
	public String nome;
	public String telefone;
	public Contato() {}

	public Contato(String nome, String telefone) {
	
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return telefone;
	}

	public void setEmail(String email) {
		this.telefone = email;
	}
}
