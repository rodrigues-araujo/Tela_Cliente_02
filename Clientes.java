package Tela;
import java.util.ArrayList;
public class Clientes {
	private ArrayList<Cliente> clientesAtivos;

	public Clientes() {}
	
	public Clientes(ArrayList<Cliente> clientes) {
		
		clientesAtivos = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientesAtivos;
	}

	
}
