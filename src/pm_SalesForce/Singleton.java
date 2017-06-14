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

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void addEmpresa(Empresa empresa) {
		grupoEmpresas.add(empresa);
	}

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
