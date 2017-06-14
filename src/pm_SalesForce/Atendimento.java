package pm_SalesForce;

import java.time.LocalTime;

public class Atendimento {
	private LocalTime horario;
	private Vendedor vendedor;
	private Cliente cliente;
	private Produto produto;
	
	Atendimento (int h, int m, Vendedor v, Cliente c, Produto p){
		setHorario(h,m);
		setVendedor(v);
		setCliente(c);
		setProduto(p);
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(int h , int m) {
		this.horario = LocalTime.of(h, m);
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
	
	public String printAtendimento(){
		String atd = "";
		atd = "Horario: "+getHorario().toString() +"\n"+"Cliente: "+getCliente().getNome()+"\n"+"Vendedor: "+getVendedor().getNome()+"\n"+
		"Produto: "+getProduto().getCategoria().toString()+"\n"+"Valor: "+getProduto().getValor()+"\n";
		return atd;
	}
	
}
