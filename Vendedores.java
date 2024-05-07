package Tela;
import java.util.ArrayList;
public class Vendedores {
	private ArrayList<Vendedor> vendedoresAtivos;

	public Vendedores(ArrayList<Vendedor> vendedoresAtivos) {
	
		
		vendedoresAtivos = new ArrayList<Vendedor>();
	}

	public ArrayList<Vendedor> getVendedoresAtivos() {
		return vendedoresAtivos;
	}

	public void setVendedores(ArrayList<Vendedor> vendedoresAtivos) {
		this.vendedoresAtivos = vendedoresAtivos;
	}
	
	
}
