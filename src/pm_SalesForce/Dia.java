package pm_SalesForce;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dia {
	private LocalDate data;
	private List<Atendimento> listaAtendimentos;
	
	Dia (int a, int d){
		setData(a,d);
		setListaAtendimentos( new ArrayList<Atendimento>());
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(int a, int d) {
		this.data = LocalDate.ofYearDay(a, d);
	}

	public List<Atendimento> getListaAtendimentos() {
		return listaAtendimentos;
	}

	public void setListaAtendimentos(List<Atendimento> listaAtendimentos) {
		this.listaAtendimentos = listaAtendimentos;
	}
	
	public boolean criarAtendimento(int h, int m, Vendedor v, Cliente c, Produto p){
		boolean atdExiste = false;
		boolean status = false;
		for(Atendimento i : getListaAtendimentos()){
			if(h == i.getHorario().getHour() && m == i.getHorario().getMinute()){
				atdExiste = true;
			}
		}
		if (!atdExiste){
			Atendimento atd = new Atendimento (LocalTime.of(h, m), v, c, p);
			listaAtendimentos.add(atd);
			status = true;
		}
		
		// criar jOptionPane informando que ja existe um atendimento no mesmo horario quando status for false
		
		return status;
		
	}
}
