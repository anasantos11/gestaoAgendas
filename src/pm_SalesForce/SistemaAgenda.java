package pm_SalesForce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Label;

public class SistemaAgenda extends JFrame {

	private JPanel tela;
	private JTextField nomeCliente;
	private JTextField cnpjCliente;
	private JTextField ruaCliente;
	private JTextField numeroCliente;
	private JTextField estadoCliente;
	private JTextField cidadeCliente;
	private JTextField bairroCliente;
	private JTextField cepCliente;
	private JTextField cnpjEmpresa;

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
		Aplicacao aplicacao = Aplicacao.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 506);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		tela.add(aba);

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

		/**
		 * Cadastro do cliente
		 */
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Pegar empresa cadastrada no sistema
				 */
				Empresa empresa = aplicacao.getEmpresa(cnpjEmpresa.getText());
				if (empresa == null) {
					JOptionPane.showMessageDialog(null,
							"Sua empresa não está cadastrada no sistema! \nVá até a aba 'Cadastro de Empresa' para usufruir das funcionalidades \noferecidas pelo nosso sistema.",
							"Sem acesso ao sistema", JOptionPane.WARNING_MESSAGE);
				} else {
					Endereco enderecoCliente = new Endereco(ruaCliente.getText(),
							Integer.parseInt(numeroCliente.getText()), bairroCliente.getText(), cidadeCliente.getText(),
							estadoCliente.getText(), cepCliente.getText());
					Cliente clienteEmpresa = new Cliente(nomeCliente.getText(), cnpjCliente.getText(), enderecoCliente);
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
			}
		});
		btnCadastrar.setForeground(new Color(0, 0, 128));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(btnCadastrar, "cell 1 15,growx,aligny top");
	}

}
