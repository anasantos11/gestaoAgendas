package pm_SalesForce;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Label;
import javax.swing.JFormattedTextField;

public class SistemaAgenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel tela;
	private JTextField nomeCliente;
	private JTextField nomeVendedor;
	private JTextField nomeEmp;
	private JTextField cnpjCliente;
	private JTextField cnpjEmp;
	private JTextField cpfVendedor;
	private JTextField ruaCliente;
	private JTextField ruaEmp;
	private JTextField ruaVendedor;
	private JTextField numeroCliente;
	private JTextField numeroEmp;
	private JTextField numeroVendedor;
	private JTextField estadoCliente;
	private JTextField estadoEmp;
	private JTextField estadoVendedor;
	private JTextField cidadeCliente;
	private JTextField cidadeEmp;
	private JTextField cidadeVendedor;
	private JTextField bairroCliente;
	private JTextField bairroEmp;
	private JTextField bairroVendedor;
	private JTextField cepCliente;
	private JTextField cepEmp;
	private JTextField cepVendedor;
	private JTextField cnpjEmpresa;
	private JTextField cnpjEmpVendedor;
	private JTextField cnpjEmpFicha;
	private JTextField cpfVendedorFicha;
	private JTextField horarioFicha;
	private JPanel cadastroEmpresa;
	private JLabel tituloCadastroEmpresa;
	private JLabel labelEstadoEmp;
	private JLabel labelCidadeEmp;
	private JLabel labelCepEmp;
	private JLabel labelBairroEmp;
	private JLabel labelNumeroEmp;
	private JLabel labelRuaEmp;
	private JLabel labelCnpjEmp;
	private JLabel labelNomeEmp;
	private JButton btnCadastrarEmp;
	private JButton btnCadastrarCliente;
	private JButton btnCadastrarVendedor;
	private JButton btnCadastrarAtendimento;
	private JLabel labelNascimentoCliente;
	private JTextField nascimentoVendedor;
	private JTextField cnpjClienteFicha;
	private Label labelCliente;
	private JTextField descricaoFicha;
	private JLabel lblDescrioProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaAgenda frame = new SistemaAgenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SistemaAgenda() {
		Singleton log = Singleton.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 506);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		tela.add(aba);

		cadastroEmpresa = new JPanel();
		aba.addTab("Cadastro de Empresa", null, cadastroEmpresa, null);
		cadastroEmpresa.setLayout(new MigLayout("", "[90px][198px,grow]",
				"[19px][20px][20px][20px][20px][20px][20px][20px][20px][27px][][][][][][]"));

		tituloCadastroEmpresa = new JLabel("CADASTRO DA EMPRESA");
		tituloCadastroEmpresa.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroEmpresa.add(tituloCadastroEmpresa, "cell 0 0 2 1,alignx center");

		labelNomeEmp = new JLabel("Raz\u00E3o Social: ");
		cadastroEmpresa.add(labelNomeEmp, "cell 0 2,alignx left,aligny center");

		nomeEmp = new JTextField();
		cadastroEmpresa.add(nomeEmp, "cell 1 2,growx,aligny center");
		nomeEmp.setColumns(20);

		labelCnpjEmp = new JLabel("CNPJ:");
		cadastroEmpresa.add(labelCnpjEmp, "cell 0 3,alignx left,aligny center");

		cnpjEmp = new JTextField();
		cadastroEmpresa.add(cnpjEmp, "cell 1 3,growx,aligny center");
		cnpjEmp.setColumns(10);

		labelRuaEmp = new JLabel("Rua:");
		cadastroEmpresa.add(labelRuaEmp, "cell 0 4,alignx left,aligny center");

		ruaEmp = new JTextField();
		cadastroEmpresa.add(ruaEmp, "cell 1 4,growx,aligny center");
		ruaEmp.setColumns(10);

		labelNumeroEmp = new JLabel("N\u00FAmero:");
		cadastroEmpresa.add(labelNumeroEmp, "cell 0 5,alignx left,aligny center");

		numeroEmp = new JTextField();
		cadastroEmpresa.add(numeroEmp, "cell 1 5,growx,aligny center");
		numeroEmp.setColumns(10);

		labelBairroEmp = new JLabel("Bairro:");
		cadastroEmpresa.add(labelBairroEmp, "cell 0 6,alignx left,aligny center");

		bairroEmp = new JTextField();
		cadastroEmpresa.add(bairroEmp, "cell 1 6,growx,aligny center");
		bairroEmp.setColumns(10);

		labelCepEmp = new JLabel("Cep:");
		cadastroEmpresa.add(labelCepEmp, "cell 0 7,alignx left,aligny center");

		cepEmp = new JTextField();
		cadastroEmpresa.add(cepEmp, "cell 1 7,growx,aligny center");
		cepEmp.setColumns(10);

		labelCidadeEmp = new JLabel("Cidade:");
		cadastroEmpresa.add(labelCidadeEmp, "cell 0 8,alignx left,aligny center");

		cidadeEmp = new JTextField();
		cadastroEmpresa.add(cidadeEmp, "cell 1 8,growx,aligny center");
		cidadeEmp.setColumns(10);

		labelEstadoEmp = new JLabel("Estado:");
		cadastroEmpresa.add(labelEstadoEmp, "cell 0 9,alignx left,aligny center");

		estadoEmp = new JTextField();
		cadastroEmpresa.add(estadoEmp, "cell 1 9,growx,aligny center");
		estadoEmp.setColumns(10);

		/**
		 * Cadastro da Empresa no sistema
		 */
		btnCadastrarEmp = new JButton("Cadastrar");
		btnCadastrarEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Cadastrar Empresa no sistema
				 */
				try {
					Empresa empProcurar = log.getEmpresa(cnpjEmp.getText());
					if (!(empProcurar == null)) {
						JOptionPane.showMessageDialog(null, "Sua empresa já está cadastrada no nosso sistema!",
								"Empresa já cadastrada no sistema", JOptionPane.WARNING_MESSAGE);
					} else {
						Endereco enderecoEmp = new Endereco(ruaEmp.getText(), Integer.parseInt(numeroEmp.getText()),
								bairroEmp.getText(), cidadeEmp.getText(), estadoEmp.getText(), cepEmp.getText());
						Empresa emp = new Empresa(nomeEmp.getText(), cnpjEmp.getText(), enderecoEmp);
						log.addEmpresa(emp);

						JOptionPane.showMessageDialog(null,
								"Empresa cadastrada com sucesso !!! \nAgora é só cadastrar os seus clientes para utilizar"
										+ "\no sistema de gestão de agendas\n"
										+ log.getEmpresa(cnpjEmp.getText()).toString());

						nomeEmp.setText(null);
						cnpjEmp.setText(null);
						ruaEmp.setText(null);
						numeroEmp.setText(null);
						bairroEmp.setText(null);
						cepEmp.setText(null);
						cidadeEmp.setText(null);
						estadoEmp.setText(null);
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Dados preenchidos com formato incorreto, tente novamente.",
							"Erro preenchimento formulário", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnCadastrarEmp.setForeground(new Color(0, 0, 128));
		btnCadastrarEmp.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroEmpresa.add(btnCadastrarEmp, "cell 1 14,growx,aligny top");

		JPanel cadastroCliente = new JPanel();
		aba.addTab("Cadastro Cliente", null, cadastroCliente, null);
		cadastroCliente.setLayout(new MigLayout("", "[90px][198px,grow]",
				"[19px][20px][20px][20px][20px][20px][20px][20px][20px][27px][][][][][][]"));

		JLabel tituloEmpresa = new JLabel("DADOS DA EMPRESA");
		tituloEmpresa.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(tituloEmpresa, "cell 0 0 2 1,alignx center");

		Label digiteCNPJ = new Label("Digite seu CNPJ:");
		digiteCNPJ.setFont(new Font("Tahoma", Font.BOLD, 13));
		cadastroCliente.add(digiteCNPJ, "cell 0 2");

		cnpjEmpresa = new JTextField();
		cadastroCliente.add(cnpjEmpresa, "cell 1 2,growx");
		cnpjEmpresa.setColumns(10);

		JLabel tituloCadastroCliente = new JLabel("CADASTRO DO CLIENTE");
		tituloCadastroCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(tituloCadastroCliente, "cell 0 4 2 1,alignx center,aligny top");

		JLabel labelNome = new JLabel("Raz\u00E3o Social: ");
		cadastroCliente.add(labelNome, "cell 0 5,alignx left,aligny center");

		nomeCliente = new JTextField();
		cadastroCliente.add(nomeCliente, "cell 1 5,growx,aligny center");
		nomeCliente.setColumns(20);

		JLabel labelCnpj = new JLabel("CNPJ:");
		cadastroCliente.add(labelCnpj, "cell 0 6,alignx left,aligny center");

		cnpjCliente = new JTextField();
		cadastroCliente.add(cnpjCliente, "cell 1 6,growx,aligny center");
		cnpjCliente.setColumns(10);

		JLabel labelRUA = new JLabel("Rua:");
		cadastroCliente.add(labelRUA, "cell 0 7,alignx left,aligny center");

		ruaCliente = new JTextField();
		cadastroCliente.add(ruaCliente, "cell 1 7,growx,aligny center");
		ruaCliente.setColumns(10);

		JLabel labelNumero = new JLabel("N\u00FAmero:");
		cadastroCliente.add(labelNumero, "cell 0 8,alignx left,aligny center");

		numeroCliente = new JTextField();
		cadastroCliente.add(numeroCliente, "cell 1 8,growx,aligny center");
		numeroCliente.setColumns(10);

		JLabel labelBairro = new JLabel("Bairro:");
		cadastroCliente.add(labelBairro, "cell 0 9,alignx left,aligny center");

		bairroCliente = new JTextField();
		cadastroCliente.add(bairroCliente, "cell 1 9,growx,aligny center");
		bairroCliente.setColumns(10);

		JLabel labelCep = new JLabel("Cep:");
		cadastroCliente.add(labelCep, "cell 0 10,alignx left,aligny center");

		cepCliente = new JTextField();
		cadastroCliente.add(cepCliente, "cell 1 10,growx,aligny center");
		cepCliente.setColumns(10);

		JLabel labelCidade = new JLabel("Cidade:");
		cadastroCliente.add(labelCidade, "cell 0 11,alignx left,aligny center");

		cidadeCliente = new JTextField();
		cadastroCliente.add(cidadeCliente, "cell 1 11,growx,aligny center");
		cidadeCliente.setColumns(10);

		JLabel labelEstado = new JLabel("Estado:");
		cadastroCliente.add(labelEstado, "cell 0 12,alignx left,aligny center");

		estadoCliente = new JTextField();
		cadastroCliente.add(estadoCliente, "cell 1 12,growx,aligny center");
		estadoCliente.setColumns(10);

		btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Pegar empresa cadastrada no sistema
				 */
				try {
					@SuppressWarnings("unused")
					int teste = Integer.parseInt(numeroCliente.getText());
					Empresa empresa = log.getEmpresa(cnpjEmpresa.getText());
					if (empresa == null) {
						JOptionPane.showMessageDialog(null,
								"Sua empresa não está cadastrada no sistema! \nVá até a aba 'Cadastro de Empresa' para usufruir das funcionalidades \noferecidas pelo nosso sistema.",
								"Sem acesso ao sistema", JOptionPane.WARNING_MESSAGE);
					} else {
						Endereco enderecoCliente = new Endereco(ruaCliente.getText(),
								Integer.parseInt(numeroCliente.getText()), bairroCliente.getText(),
								cidadeCliente.getText(), estadoCliente.getText(), cepCliente.getText());
						Cliente clienteEmpresa = new Cliente(nomeCliente.getText(), cnpjCliente.getText(),
								enderecoCliente);
						empresa.cadastrarCliente(clienteEmpresa);
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso !!! \n\n"
								+ empresa.getCliente(cnpjCliente.getText()).toString());
						cnpjEmpresa.setText(null);
						nomeCliente.setText(null);
						cnpjCliente.setText(null);
						ruaCliente.setText(null);
						numeroCliente.setText(null);
						bairroCliente.setText(null);
						cepCliente.setText(null);
						cidadeCliente.setText(null);
						estadoCliente.setText(null);

					}

				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Dados preenchidos com formato incorreto, tente novamente.",
							"Erro preenchimento formulário", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnCadastrarCliente.setForeground(new Color(0, 0, 128));
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(btnCadastrarCliente, "cell 1 15,growx,aligny top");

		JPanel cadastroVendedor = new JPanel();
		aba.addTab("Cadastro Vendedor", null, cadastroVendedor, null);
		cadastroVendedor.setLayout(new MigLayout("", "[90px][198px,grow]",
				"[19px][20px][20px][20px][20px][20px][20px][20px][20px][27px][][][][][][]"));

		JLabel tituloVendedor = new JLabel("DADOS DA EMPRESA");
		tituloVendedor.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroVendedor.add(tituloVendedor, "cell 0 0 2 1,alignx center");

		Label digiteCNPJEmp = new Label("Digite seu CNPJ:");
		digiteCNPJEmp.setFont(new Font("Tahoma", Font.BOLD, 13));
		cadastroVendedor.add(digiteCNPJEmp, "cell 0 2");

		cnpjEmpVendedor = new JTextField();
		cadastroVendedor.add(cnpjEmpVendedor, "cell 1 2,growx");
		cnpjEmpVendedor.setColumns(10);

		JLabel tituloCadastroVendedor = new JLabel("CADASTRO DO VENDEDOR");
		tituloCadastroVendedor.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroVendedor.add(tituloCadastroVendedor, "cell 0 4 2 1,alignx center,aligny top");

		JLabel labelNomeVendedor = new JLabel("Nome Completo:");
		cadastroVendedor.add(labelNomeVendedor, "cell 0 5,alignx left,aligny center");

		nomeVendedor = new JTextField();
		cadastroVendedor.add(nomeVendedor, "cell 1 5,growx,aligny center");
		nomeVendedor.setColumns(20);

		JLabel labelCpfVendedor = new JLabel("CPF:");
		cadastroVendedor.add(labelCpfVendedor, "cell 0 6,alignx left,aligny center");

		cpfVendedor = new JTextField();
		cadastroVendedor.add(cpfVendedor, "cell 1 6,growx,aligny center");
		cpfVendedor.setColumns(10);
		btnCadastrarVendedor = new JButton("Cadastrar");
		btnCadastrarVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Pegar empresa cadastrada no sistema
				 */
				try {
					@SuppressWarnings("unused")
					int teste = Integer.parseInt(numeroVendedor.getText());
					Empresa empresaVendedor = log.getEmpresa(cnpjEmpVendedor.getText());
					if (empresaVendedor == null) {
						JOptionPane.showMessageDialog(null,
								"Sua empresa não está cadastrada no sistema! \nVá até a aba 'Cadastro de Empresa' para usufruir das funcionalidades \noferecidas pelo nosso sistema.",
								"Sem acesso ao sistema", JOptionPane.WARNING_MESSAGE);
					} else {
						Endereco enderecoVendedor = new Endereco(ruaVendedor.getText(),
								Integer.parseInt(numeroVendedor.getText()), bairroVendedor.getText(),
								cidadeVendedor.getText(), estadoVendedor.getText(), cepVendedor.getText());

						String[] data = nascimentoVendedor.getText().split("/");
						int dia = Integer.parseInt(data[0]);
						int mes = Integer.parseInt(data[1]);
						int ano = Integer.parseInt(data[2]);
						Vendedor vendedorEmpresa = new Vendedor(nomeVendedor.getText(), LocalDate.of(ano, mes, dia),
								enderecoVendedor, cpfVendedor.getText(), empresaVendedor);
						empresaVendedor.cadastrarVendedor(vendedorEmpresa);
						JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso !!! \n\n"
								+ empresaVendedor.getVendedor(cpfVendedor.getText()).toString());
						cnpjEmpVendedor.setText(null);
						nomeVendedor.setText(null);
						cpfVendedor.setText(null);
						nascimentoVendedor.setText(null);
						ruaVendedor.setText(null);
						numeroVendedor.setText(null);
						bairroVendedor.setText(null);
						cepVendedor.setText(null);
						cidadeVendedor.setText(null);
						estadoVendedor.setText(null);

					}

				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null,
							"Dados preenchidos com formato incorreto, tente novamente. \n" + e2.getMessage(),
							"Erro preenchimento formulário", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		labelNascimentoCliente = new JLabel("Data de Nascimento:");
		cadastroVendedor.add(labelNascimentoCliente, "cell 0 7,alignx left");
		nascimentoVendedor = new JTextField();
		cadastroVendedor.add(nascimentoVendedor, "cell 1 7,growx");

		JLabel labelRuaVendedor = new JLabel("Rua:");
		cadastroVendedor.add(labelRuaVendedor, "cell 0 8,alignx left,aligny center");

		ruaVendedor = new JTextField();
		cadastroVendedor.add(ruaVendedor, "cell 1 8,growx,aligny center");
		ruaVendedor.setColumns(10);

		JLabel labelNumeroVendedor = new JLabel("N\u00FAmero:");
		cadastroVendedor.add(labelNumeroVendedor, "cell 0 9,alignx left,aligny center");

		numeroVendedor = new JTextField();
		cadastroVendedor.add(numeroVendedor, "cell 1 9,growx,aligny center");
		numeroVendedor.setColumns(10);

		JLabel labelBairroVendedor = new JLabel("Bairro:");
		cadastroVendedor.add(labelBairroVendedor, "cell 0 10,alignx left,aligny center");

		bairroVendedor = new JTextField();
		cadastroVendedor.add(bairroVendedor, "cell 1 10,growx,aligny center");
		bairroVendedor.setColumns(10);

		JLabel labelCepVendedor = new JLabel("Cep:");
		cadastroVendedor.add(labelCepVendedor, "cell 0 11,alignx left,aligny center");

		cepVendedor = new JTextField();
		cadastroVendedor.add(cepVendedor, "cell 1 11,growx,aligny center");
		cepVendedor.setColumns(10);

		JLabel labelCidadeVendedor = new JLabel("Cidade:");
		cadastroVendedor.add(labelCidadeVendedor, "cell 0 12,alignx left,aligny center");

		cidadeVendedor = new JTextField();
		cadastroVendedor.add(cidadeVendedor, "cell 1 12,growx,aligny center");
		cidadeVendedor.setColumns(10);

		JLabel labelEstadoVendedor = new JLabel("Estado:");
		cadastroVendedor.add(labelEstadoVendedor, "cell 0 13,alignx left,aligny center");

		estadoVendedor = new JTextField();
		cadastroVendedor.add(estadoVendedor, "cell 1 13,growx,aligny center");
		estadoVendedor.setColumns(10);
		btnCadastrarVendedor.setForeground(new Color(0, 0, 128));
		btnCadastrarVendedor.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroVendedor.add(btnCadastrarVendedor, "cell 1 15,growx,aligny top");

		// Ana

		JPanel atendimento = new JPanel();
		aba.addTab("Ficha Atendimento", null, atendimento, null);
		atendimento.setLayout(new MigLayout("", "[90px][198px,grow]",
				"[19px][20px][20px][20px][20px][20px][20px][20px][20px][27px][][][][][][]"));

		JLabel tituloAtendimento = new JLabel("FICHA DE ATENDIMENTO");
		tituloAtendimento.setFont(new Font("Tahoma", Font.BOLD, 15));
		atendimento.add(tituloAtendimento, "cell 0 0 2 1,alignx center");

		Label labelEmp = new Label("CNPJ da empresa:");
		labelEmp.setFont(new Font("Tahoma", Font.BOLD, 13));
		atendimento.add(labelEmp, "cell 0 2");

		cnpjEmpFicha = new JTextField();
		atendimento.add(cnpjEmpFicha, "cell 1 2,growx");
		cnpjEmpFicha.setColumns(10);

		Label labelVendedor = new Label("CPF do vendedor:");
		labelVendedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		atendimento.add(labelVendedor, "cell 0 3");

		cpfVendedorFicha = new JTextField();
		atendimento.add(cpfVendedorFicha, "cell 1 3,growx");
		cpfVendedorFicha.setColumns(10);
		cpfVendedor.setColumns(10);

		JComboBox<Categoria> produtoFicha = new JComboBox<Categoria>();
		produtoFicha.setModel(new DefaultComboBoxModel<>(Categoria.values()));
		atendimento.add(produtoFicha, "cell 1 9,growx,aligny center");

		btnCadastrarAtendimento = new JButton("Cadastrar");
		btnCadastrarAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Empresa empresaFicha = log.getEmpresa(cnpjEmpFicha.getText());

				if (!(empresaFicha == null)) {
					Vendedor vendedorFicha = empresaFicha.getVendedor(cpfVendedorFicha.getText());
					if (vendedorFicha == null) {
						JOptionPane.showMessageDialog(null,
								"Esse vendedor não está cadastrado na empresa " + empresaFicha.getNome() + " - "
										+ empresaFicha.getCnpj() + "! \n"
										+ "Vá até a aba 'Cadastro de Vendedor' para cadastrá-lo.",
								"Vendedor sem cadastro", JOptionPane.WARNING_MESSAGE);
					} else {
						Cliente clienteFicha = empresaFicha.getCliente(cnpjClienteFicha.getText());
						if (clienteFicha == null) {
							JOptionPane.showMessageDialog(null,
									"Esse cliente não está cadastrado na empresa " + empresaFicha.getNome() + " - "
											+ empresaFicha.getCnpj() + "! \n"
											+ "Vá até a aba 'Cadastro Cliente' para cadastrá-lo.",
									"Cliente sem cadastro", JOptionPane.WARNING_MESSAGE);
						} else {
							String[] horario = horarioFicha.getText().split(":");
							int hora = Integer.parseInt(horario[0]);
							int minuto = Integer.parseInt(horario[1]);
							Produto produto = new Produto(descricaoFicha.getText(), (Categoria) produtoFicha.getSelectedItem());
							Atendimento atendimento = new Atendimento(LocalTime.of(hora, minuto), vendedorFicha,
									clienteFicha, produto);
							JOptionPane.showMessageDialog(null,
									"Atendimento cadastrado com sucesso !!!\nEmpresa Responsável: "
											+ empresaFicha.getNome() + " - " + empresaFicha.getCnpj()
											+ atendimento.printAtendimento());

							cnpjEmpFicha.setText(null);
							cpfVendedorFicha.setText(null);
							cnpjClienteFicha.setText(null);
							horarioFicha.setText(null);
							descricaoFicha.setText(null);
						}
					}

				} else {
					JOptionPane.showMessageDialog(null,
							"Sua empresa não está cadastrada no nosso sistema! \nVá até a aba 'Cadastro de Empresa' para usufruir das funcionalidades \noferecidas pelo nosso sistema.",
							"Sem acesso ao sistema", JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		labelCliente = new Label("CNPJ do cliente");
		labelCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		atendimento.add(labelCliente, "cell 0 4");

		cnpjClienteFicha = new JTextField();
		atendimento.add(cnpjClienteFicha, "cell 1 4,growx");
		cnpjClienteFicha.setColumns(10);

		JLabel tituloFichaAtendimento = new JLabel("DADOS PARA AGENDAR ATENDIMENTO");
		tituloFichaAtendimento.setFont(new Font("Tahoma", Font.BOLD, 15));
		atendimento.add(tituloFichaAtendimento, "cell 0 6 2 1,alignx center,aligny top");

		JLabel labelHorarioAtendimento = new JLabel("Horário Atendimento:");
		atendimento.add(labelHorarioAtendimento, "cell 0 8,alignx left,aligny center");

		horarioFicha = new JTextField();
		atendimento.add(horarioFicha, "cell 1 8,growx,aligny center");
		horarioFicha.setColumns(20);

		JLabel labelProduto = new JLabel("Seguro:");
		atendimento.add(labelProduto, "cell 0 9,alignx left,aligny center");

		lblDescrioProduto = new JLabel("Descri\u00E7\u00E3o Produto: ");
		atendimento.add(lblDescrioProduto, "cell 0 10 1 4,alignx left");

		descricaoFicha = new JTextField();
		atendimento.add(descricaoFicha, "cell 1 10 1 4,grow");
		descricaoFicha.setColumns(10);

		btnCadastrarAtendimento.setForeground(new Color(0, 0, 128));
		btnCadastrarAtendimento.setFont(new Font("Tahoma", Font.BOLD, 15));
		atendimento.add(btnCadastrarAtendimento, "cell 1 15,growx,aligny top");

	}

}
