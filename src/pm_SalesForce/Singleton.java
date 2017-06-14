package pm_SalesForce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	private static List<Empresa> grupoEmpresas;
	
	private Singleton() {
		grupoEmpresas = new ArrayList<Empresa>();
	}	
	
	/**
	 * Método para retorna instância da classe 
	 * @return
	 */

	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Método para adicionar uma nova empresa para utilizar o sistema
	 * @param empresa
	 */
	public void addEmpresa(Empresa empresa) {
		grupoEmpresas.add(empresa);
	}

	/**
	 * Método para buscar empresa cadastrada no sistema e retornar os dados dela
	 * ou null se não tiver cadastrada
	 * 
	 * @param cnpj
	 * @return Empresa
	 */
	public Empresa getEmpresa(String cnpj) {
		Iterator<Empresa> iter = grupoEmpresas.iterator();
		while (iter.hasNext()) {
			Empresa atual = iter.next();
			if (atual.getCnpj().equals(cnpj)) {
				return atual;
			}
		}
		return null;
	}
}
