package pm_SalesForce;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class EmpresaTest {

	Agenda agenda = new Agenda(2017);
	Produto produto = new Produto(Categoria.Habitacao);
	Empresa empresa = new Empresa("nomempresa", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"));
	Endereco endereco = new Endereco("rua", 0, "bairro", "cidade", "estado", "cep");
	Vendedor vendedor = new Vendedor("nome", LocalDate.now(),
			new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"), "cpf",
			new Empresa("nomempresa", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep")));
	Dia dia = new Dia(2, 25);
	Cliente cliente = new Cliente("cliente", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"));
	Atendimento atendimento = new Atendimento(10, 30,
			new Vendedor("joao", LocalDate.now(), new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"), "cpf",
					new Empresa("nomempresa", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"))),
			new Cliente("cliente", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep")),
			new Produto(Categoria.Habitacao));
	Atendimento primeiro = new Atendimento(10, 30,
			new Vendedor("joao", LocalDate.now(), new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"), "cpf",
					new Empresa("nomempresa", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"))),
			new Cliente("cliente", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep")),
			new Produto(Categoria.Habitacao));
	Empresa nova = new Empresa("nomempresa", "cnpj", new Endereco("rua", 0, "bairro", "cidade", "estado", "cep"));
	Endereco endereco2 = new Endereco("rua", 0, "bairro", "cidade", "estado", "cep");

	@Test
	public void testeEmpresa() {
		assertEquals(nova, empresa.getCliente("cnpj"));

	}
}