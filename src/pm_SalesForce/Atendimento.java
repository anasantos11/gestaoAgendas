package pm_SalesForce;

import java.time.LocalTime;

public class Atendimento {
	private LocalTime horario;
	private Vendedor vendedor;
	private Cliente cliente;
	
	Atendimento (int h, int m, Vendedor v, Cliente c){
		setHorario(h,m);
		setVendedor(v);
		setCliente(c);
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
	
	public String printAtendimento(){
		String atd = "";
		atd = "Horario: "+getHorario().toString() +"\n"+"Cliente: "+getCliente().getNome()+"\n"+"Vendedor: "+getVendedor().getNome()+"\n";
		return atd;
	}
}
