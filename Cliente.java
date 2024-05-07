package Tela;
import java.util.ArrayList;
public class Cliente {
	private String nome;
	private String cpf_cnpj;
	private ArrayList<Contato> contatos;
	private Endereco endereco;
	private String telefone;
	public Cliente () {}
	public Cliente(String nome, String cpf_cnpj, ArrayList<Contato> contato, Endereco endereco, String telefone) {
		
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.contatos = contato;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public ArrayList<Contato> getContato() {
		return contatos;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contatos = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
