/**
 * Classe com dados para gerar ficha de atendimento de uma empresa 
 * com intuito de atender algum cliente a partir de um vendedor 
 * Possui método para imprimir os dados do atendimento
 */
package pm_SalesForce;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
	private LocalTime horario;
	private LocalDate data;
	private Vendedor vendedor;
	private Cliente cliente;
	private Produto produto;

	/**
	 * Construtor da classe Atendimento
	 * 
	 * @param horario
	 * @param v
	 * @param c
	 * @param p
	 */

	Atendimento(LocalTime horario,LocalDate data, Vendedor v, Cliente c, Produto p) {
		setHorario(horario);
		setVendedor(v);
		setCliente(c);
		setProduto(p);
	}

	/**
	 * Pegar horário do atendimento
	 * 
	 * @return horario
	 */

	public LocalTime getHorario() {
		return horario;
	}

	/**
	 * Enviar horário de atendimento
	 * 
	 * @param horario
	 */
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	
	/**
	 * Pegar data do atendimento
	 * @return data
	 */

	public LocalDate getData() {
		return data;
	}
	/**
	 * Enviar data atendimento
	 * @param data
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * Pegar vendedor do atendimento
	 * 
	 * @return vendedor
	 */

	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * Enviar vendedor do atendimento
	 * 
	 * @param vendedor
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * Pegar cliente do atendimento
	 * 
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Enviar cliente do atendimento
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Pegar produto do atendimento
	 * @return produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * Enviar produto do atendimento
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * Imprimir dados do atendimento
	 * @return dados atendimento
	 */
	
	public String printAtendimento() {
		String atd = "";
		atd = "Dados ficha de atendimento: " + "\n" + "Vendedor Responsável: " + getVendedor().getNome() + "\n"
				+ "Horário: " + getHorario().toString() + "\n" + getCliente().toString() + "\n" + "Produto: " + "\n"
				+ getProduto().toString();
		return atd;
	}

}
