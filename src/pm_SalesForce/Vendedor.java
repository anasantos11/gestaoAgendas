package pm_SalesForce;

import java.time.LocalDate;

public class Vendedor extends Pessoa{
		private Empresa empresa;
		
		public Vendedor(String nome, LocalDate nascimento, Endereco endereco, String cpf, Empresa empresa) {
			super(nome, nascimento, endereco, cpf);
			setEmpresa(empresa);
		}

		@Override
		public String toString() {
			return "Vendedor: " + super.toString() + "\nEmpresa: " +  empresa.toString();	}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
	
		
		
}
