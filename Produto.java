package Tela;

public class Produto {
	private String nome;
	private String marca;
	private String categoria;
	private double preco;
	public Produto(String nome, String marca, String categoria, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
