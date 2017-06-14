package pm_SalesForce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {
	private static final Aplicacao INSTANCE = new Aplicacao();
	private static List<Empresa> grupoEmpresas;

	private Aplicacao() {
		grupoEmpresas = new ArrayList<Empresa>();
	}

	public static Aplicacao getInstance() {
		return INSTANCE;
	}

	public static void addEmpresa(Empresa empresa) {
		grupoEmpresas.add(empresa);
	}

	public static Empresa getEmpresa(String cnpj) {
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
