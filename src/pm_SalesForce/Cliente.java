/**
 * Classe com dados de um cliente pessoa jurídica com metodos para 
 * verificar os produtos adquiridos, adicionar produtos 
 */
package pm_SalesForce;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Empresa {
	private int id;
	private static int cont = 0;
	private List<Produto> listaProdutos;
	
	/**
	 * Construtor da classe Cliente
	 * @param nome
	 * @param cnpj
	 * @param endereco
	 */
	public Cliente(String nome, String cnpj, Endereco endereco) {
		super(nome, cnpj, endereco);
		id = ++cont;
		setListaProdutos(new ArrayList<Produto>());
	}
	
	/**
	 * Pegar id do cliente
	 * @return ID
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * Pegar lista de Produtos do cliente
	 * @return Lista de Produtos
	 */
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	/**
	 * Enviar lista de produtos do cliente
	 * @param listaProdutos
	 */

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	/**
	 * Adicionar novo produto para o cliente
	 * @param p
	 */
	public void addProduto(Produto p) {
		getListaProdutos().add(p);
	}
	
	/**
	 * Imprimir dados do cliente
	 */

	@Override
	public String toString() {
		return "Id: " + id + "\n" + super.toString();
	}

}
