package pm_SalesForce;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Empresa{
	private int id;
	private static int cont = 0;
	private List<Produto> listaProdutos;
	
	public Cliente(String nome, String cnpj, Endereco endereco){
		super(nome, cnpj, endereco);
		id = ++cont;
		setListaProdutos(new ArrayList<Produto>());
	}

	public int getId() {
		return id;
	}

	public static int getCont() {
		return cont;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\n" + super.toString();
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void addProduto(Produto p){
		getListaProdutos().add(p);
	}
	
}
