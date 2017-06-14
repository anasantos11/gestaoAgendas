package pm_SalesForce;

import java.time.LocalTime;

public class Atendimento {
	private LocalTime horario;
	private Vendedor vendedor;
	private Cliente cliente;
	private Produto produto;

	Atendimento(LocalTime horario, Vendedor v, Cliente c, Produto p) {
		setHorario(horario);
		setVendedor(v);
		setCliente(c);
		setProduto(p);
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String printAtendimento() {
		String atd = "";
		atd = "Dados ficha de atendimento: " + "\n" + "Vendedor Responsável: " + getVendedor().getNome() + "\n"
				+ "Horário: " + getHorario().toString() + "\n" + getCliente().toString() + "\n" + "Produto: "
				+ getProduto().getCategoria().toString() + "\n" + "Valor: " + getProduto().getValor() + "\n";
		return atd;
	}

}
