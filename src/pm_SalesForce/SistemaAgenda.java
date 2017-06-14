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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Label;

public class SistemaAgenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel tela;
	private JTextField nomeCliente;
	private JTextField nomeEmp;
	private JTextField cnpjCliente;
	private JTextField cnpjEmp;
	private JTextField ruaCliente;
	private JTextField ruaEmp;
	private JTextField numeroCliente;
	private JTextField numeroEmp;
	private JTextField estadoCliente;
	private JTextField estadoEmp;
	private JTextField cidadeCliente;
	private JTextField cidadeEmp;
	private JTextField bairroCliente;
	private JTextField bairroEmp;
	private JTextField cepCliente;
	private JTextField cepEmp;
	private JTextField cnpjEmpresa;
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
		setBounds(100, 100, 348, 506);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		tela.add(aba);

		/**
		 * Cadastro do cliente
		 */

		/**
		 * teste
		 * 
		 */

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
		 * Cadastro do cliente
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

	}

}
