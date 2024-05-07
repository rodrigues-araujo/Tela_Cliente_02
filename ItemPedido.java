package Tela;

public class ItemPedido {
		private Produto prod;
		private double descontoPorcento;
		private double descontoRS;
		private int quantidade;
		private double total;
		public ItemPedido(Produto prod, double descontoPorcento, double descontoRS, int quantidade, double total) {
			this.prod = prod;
			this.descontoPorcento = descontoPorcento;
			this.descontoRS = descontoRS;
			this.quantidade = quantidade;
			this.total = total;
		}
		public Produto getProd() {
			return prod;
		}
		public void setProd(Produto prod) {
			this.prod = prod;
		}
		public double getDescontoPorcento() {
			return descontoPorcento;
		}
		public void setDescontoPorcento(double descontoPorcento) {
			this.descontoPorcento = descontoPorcento;
		}
		public double getDescontoRS() {
			return descontoRS;
		}
		public void setDescontoRS(double descontoRS) {
			this.descontoRS = descontoRS;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getTotal() {
			return total;
		}
		
		public void calcularTotal() {
	        							// Calcula o valor total sem desconto, Calcula o desconto em porcentagem, Calcula o valor total com descontos aplicados, Define o valor total deste item
				
	        double precoUnitario = prod.getPreco();
	        double totalSemDesconto = precoUnitario * quantidade;																								
	        double descontoPorcentoTotal = totalSemDesconto * (descontoPorcento / 100);																											 
	        double totalComDesconto = totalSemDesconto - descontoRS - descontoPorcentoTotal;	   																														
	        this.total = totalComDesconto;
		}	
		// Método para adicionar um produto a este item do pedido
	    public void adicionar(Produto produto) {
	        setProd(produto); 				// Define o novo produto
	        calcularTotal(); 				// Recalcula o valor total com o novo produto
	    }


	 // metod para remover o produto do item pedido

	    public void remover() {
	    	setProd(null); 					// remove o produto associado
	    	setQuantidade(0);				// Define a quantidade como zero
	    	setDescontoPorcento(0);			 // Define o desconto em porcentagem zero
	    	setDescontoRS(0); 				// Define o desconto em reais como zero
	    	this.total = 0;					//// Total definido como zero ao remover o produto
	    	
	    }







}		


