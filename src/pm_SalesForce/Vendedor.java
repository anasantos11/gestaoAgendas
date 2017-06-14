package pm_SalesForce;

import java.time.LocalDate;

public class Vendedor extends Pessoa{
		private Empresa empresa;
		
		public Vendedor(String nome, LocalDate nascimento, Endereco endereco, String cpf) {
			super(nome, nascimento, endereco, cpf);
			
		}

		@Override
		public String toString() {
			return "Vendedor: " + super.toString() + "\nEmpresa: " +  empresa.toString();	}
	
		
		
}
