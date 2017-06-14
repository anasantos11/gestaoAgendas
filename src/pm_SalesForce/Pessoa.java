package pm_SalesForce;

import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private LocalDate nascimento;
	private Endereco endereco;
	private String cpf;
	
		
	public Pessoa(String nome, LocalDate nascimento, Endereco endereco, String cpf) {
		setNome(nome);
		setNascimento(nascimento);
		setEndereco(endereco);
		setCpf(cpf);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de nascimento: " + nascimento + "\nEndereco: " + endereco.toString() + "\nCpf: " + cpf;
	}
	
	
	
	
}
