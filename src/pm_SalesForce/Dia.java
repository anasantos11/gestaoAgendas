/**
 * Classe que possui a lista de atendimentos que foram realizados em um determinado dia
 * com método para criar atendimento se já não tiver cadastrado um com os mesmos dados
 */
package pm_SalesForce;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dia {
	private LocalDate data;
	private List<Atendimento> listaAtendimentos;

	/**
	 * Construtor da classe dia
	 * 
	 * @param a
	 * @param d
	 */
	Dia(int a, int d) {
		setData(a, d);
		setListaAtendimentos(new ArrayList<Atendimento>());
	}
	/**
	 * Pegar data 
	 * @return
	 */
	public LocalDate getData() {
		return data;
	}
	/**
	 * Enviar data
	 * @param a
	 * @param d
	 */

	public void setData(int a, int d) {
		this.data = LocalDate.ofYearDay(a, d);
	}
	
	/**
	 * Pegar Lista de atendimento
	 * @return Lista de atendimentos
	 */
	public List<Atendimento> getListaAtendimentos() {
		return listaAtendimentos;
	}
	/**
	 * Enviar lista de atendimentos
	 * @param listaAtendimentos
	 */
	public void setListaAtendimentos(List<Atendimento> listaAtendimentos) {
		this.listaAtendimentos = listaAtendimentos;
	}
	
	/**
	 * Método para criar atendimento 
	 * @param horas
	 * @param minutos
	 * @param vendedor
	 * @param cliente
	 * @param produto
	 * @return boolean status (gerado ou nao o atendimento)
	 */
	public boolean criarAtendimento(LocalDate data, int h, int m, Vendedor v, Cliente c, Produto p) {
		boolean atdExiste = false;
		boolean status = false;
		for (Atendimento i : getListaAtendimentos()) {
			if (h == i.getHorario().getHour() && m == i.getHorario().getMinute()) {
				atdExiste = true;
			}
		}
		if (!atdExiste) {
			Atendimento atd = new Atendimento(LocalTime.of(h, m), data, v, c, p);
			listaAtendimentos.add(atd);
			status = true;
		}

		// criar jOptionPane informando que ja existe um atendimento no mesmo
		// horario quando status for false

		return status;

	}
}
