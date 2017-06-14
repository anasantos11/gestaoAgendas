package pm_SalesForce;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	private Produto produto;
	private Agenda agenda;

	public Empresa(String nome, String cnpj, Endereco endereco) {
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCnpj: " + cnpj + "\nEndereço: " + endereco.toString();
	}
	
	
}
