package pm_SalesForce;

import java.util.ArrayList;
import java.util.List;
import java.time.Year;

public class Agenda {
	private Year ano;
	private List<Dia> calendario; // = new ArrayList<Dia>();
	
	Agenda(int a){
		setAno(a);
		if(!ano.isLeap()){
			setCalendario(new ArrayList<Dia>());
			for(int i = 1; i <= 365; i++){
				Dia dia = new Dia(ano.getValue(),i);
				calendario.add(dia);
			}
		}
		else{
			setCalendario(new ArrayList<Dia>());
			for(int i = 1; i <= 366; i++){
				Dia dia = new Dia(ano.getValue(),i);
				calendario.add(dia);
			}
		}
		
	}

	public int getAno() {
		return ano.getValue();
	}

	public void setAno(int a) {
		this.ano = Year.of(a);
	}

	public List<Dia> getCalendario() {
		return calendario;
	}

	public void setCalendario(List<Dia> calendario) {
		this.calendario = calendario;
	}
	
	public String atdVendedor(Vendedor v){
		String atdAgendados = "";
		for(Dia i : calendario){
			for(Atendimento a : i.getListaAtendimentos()){
				if( v.getNome() == a.getVendedor().getNome()){
					atdAgendados += a.printAtendimento();
				}
			}
		}
		return atdAgendados;
	}
	
}

