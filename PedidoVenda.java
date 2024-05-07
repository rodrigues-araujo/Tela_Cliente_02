package Tela;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class PedidoVenda {
	private int numeroPedido;
	private  LocalDate dataCriacao;
	private LocalDate dataEntrega;
	private String infoComplementares;
	private double frete;
	private int quantidadeProduto;
	private double descontoValor;
	private double totalPedido;
	private Cliente cliente;
	private Contato contatoResp;
	private Vendedor vendResp;
	private Transportadora transResp;
	private ArrayList<ItemPedido> itensCotacao;
	public PedidoVenda(int numeroPedido, LocalDate dataCriacao, LocalDate entrega, String infoComplementares,
			double frete, int quantidadeProduto, double descontoValor, double totalPedido, Cliente cliente,
			Contato contatoResp, Vendedor vendResp,Transportadora transResp, ArrayList<ItemPedido> ItensCotacao) 
	{
		
		this.numeroPedido = numeroPedido;
		this.dataCriacao = dataCriacao;
		this.dataEntrega = entrega;
		this.infoComplementares = infoComplementares;
		this.frete = frete;
		this.quantidadeProduto = quantidadeProduto;
		this.descontoValor = descontoValor;
		this.totalPedido = totalPedido;
		this.cliente = cliente;
		this.contatoResp = contatoResp;
		this.vendResp = vendResp;
		this.transResp = transResp;
		itensCotacao = new  ArrayList<ItemPedido>();
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getInfoComplementares() {
		return infoComplementares;
	}
	public void setInfoComplementares(String infoComplementares) {
		this.infoComplementares = infoComplementares;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getDescontoValor() {
		return descontoValor;
	}
	public void setDescontoValor(double descontoValor) {
		this.descontoValor = descontoValor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Contato getContatoResp() {
		return contatoResp;
	}
	public void setContatoResp(Contato contatoResp) {
		this.contatoResp = contatoResp;
	}
	public Vendedor getVendResp() {
		return vendResp;
	}
	public void setVendResp(Vendedor vendResp) {
		this.vendResp = vendResp;
	}
	public Transportadora getTransResp() {
		return transResp;
	}
	public void setTransResp(Transportadora transResp) {
		this.transResp = transResp;
	}
	public ArrayList<ItemPedido> getItemCotacao() {
		return itensCotacao;
	}
	public void setItemCotacao(ArrayList<ItemPedido> itensCotacao) {
		this.itensCotacao = itensCotacao;
	}
	public double getFrete() {
		return frete;
	}
	public double getTotalPedido() {
		return totalPedido;
	}
	
	 public void calcular(ArrayList<ItemPedido> itensPedido) {
	        double subtotal = 0.0;

	        for (ItemPedido item : itensPedido) {				 // Calcula o subtotal do pedido somando o total de cada item de pedido
	            subtotal += item.getTotal();
	        }

	        subtotal -= descontoValor; 							// Aplica o desconto, se houver

	     	calculaFrete(); 									// Calcula o frete

	       
	        totalPedido = subtotal + frete;						// Calcula o total do pedido (subtotal + frete)

	    }

	    public void calculaFrete() {
	    														//  O  frete seja calculado multiplicando a quantidade de produtos por um valor fixo de frete por produto
	        double valorFretePorProduto = 10.0;  				// Valor fixo do frete por produto
	        frete = quantidadeProduto * valorFretePorProduto;
	    }

	    															// Outros métodos, construtor e getters/setters omitidos para brevidade
	}
	

