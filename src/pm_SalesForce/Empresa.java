/**
 * Classe com dados para uma empresa, lista dos vendedores e clientes.
 * Métodos para cadastrar vendedores e clientes
 */
package pm_SalesForce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private List<Vendedor> listaVendedores;
	private List<Cliente> listaClientes;
	private Produto produto;
	private Agenda agenda;
	/**
	 * Construtor da classe Pessoa
	 * @param nome
	 * @param cnpj
	 * @param endereco
	 */
	public Empresa(String nome, String cnpj, Endereco endereco) {
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
		listaClientes = new ArrayList<Cliente>();
		listaVendedores = new ArrayList<Vendedor>();
	}
	
	/**
	 * Método para cadastrar cliente na empresa
	 * @param cliente
	 */
	public void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	/**
	 * Método para pegar determinado cliente da empresa
	 * @param cnpj
	 * @return Cliente 
	 */
	public Cliente getCliente(String cnpj) {
		Iterator<Cliente> iter = listaClientes.iterator();
		while (iter.hasNext()) {
			Cliente atual = iter.next();
			if (atual.getCnpj().equals(cnpj)) {
				return atual;
			}
		}

		return null;
	}
	/**
	 * Método para cadastrar vendedor
	 * @param vendedor
	 */
	public void cadastrarVendedor(Vendedor vendedor) {
		listaVendedores.add(vendedor);
	}
	/**
	 * Método para pegar determinado vendedor da empresa
	 * @param cpf
	 * @return Vendedor
	 */
	public Vendedor getVendedor(String cpf) {
		Iterator<Vendedor> iter = listaVendedores.iterator();
		while (iter.hasNext()) {
			Vendedor atual = iter.next();
			if (atual.getCpf().equals(cpf)) {
				return atual;
			}
		}

		return null;
	}
	/**
	 * Pegar nome da Empresa
	 * @return Razao Social
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Enviar nome da empresa
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Pegar cnpj da empresa
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * Enviar cnpj da empresa 
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * Pegar endereço da empresa
	 * @return
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * Enviar endereço da empresa
	 * @param endereco
	 */

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * Pegar produto da empresa
	 * @return
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * Enviar produto da empresa
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * Pegar Agenda da empresa
	 * @return
	 */
	public Agenda getAgenda() {
		return agenda;
	}
	/**
	 * Enviar agenda da empresa
	 * @param agenda
	 */
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	/**
	 * Imprimir dados da empresa
	 */
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCnpj: " + cnpj + "\nEndereço: " + endereco.toString();
	}

}
