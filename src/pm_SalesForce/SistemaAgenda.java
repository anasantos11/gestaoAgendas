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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 435);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		tela.add(aba);
		
		JPanel cadastroCliente = new JPanel();
		aba.addTab("Cadastro Cliente", null, cadastroCliente, null);
		cadastroCliente.setLayout(null);
		
		JLabel lblCadastroDoCliente = new JLabel("CADASTRO DO CLIENTE");
		lblCadastroDoCliente.setBounds(152, 0, 179, 19);
		lblCadastroDoCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(lblCadastroDoCliente);
		
		JLabel labelNome = new JLabel("Raz\u00E3o Social: ");
		labelNome.setBounds(33, 29, 90, 14);
		cadastroCliente.add(labelNome);
		
		nomeCliente = new JTextField();
		nomeCliente.setBounds(133, 26, 184, 20);
		cadastroCliente.add(nomeCliente);
		nomeCliente.setColumns(20);
		
		JLabel labelCnpj = new JLabel("CNPJ:");
		labelCnpj.setBounds(33, 55, 78, 14);
		cadastroCliente.add(labelCnpj);
		
		cnpjCliente = new JTextField();
		cnpjCliente.setBounds(133, 52, 184, 20);
		cadastroCliente.add(cnpjCliente);
		cnpjCliente.setColumns(10);
		
		JLabel labelRUA = new JLabel("Rua:");
		labelRUA.setBounds(33, 81, 45, 14);
		cadastroCliente.add(labelRUA);
		
		ruaCliente = new JTextField();
		ruaCliente.setBounds(133, 78, 184, 20);
		cadastroCliente.add(ruaCliente);
		ruaCliente.setColumns(10);
		
		JLabel labelNumero = new JLabel("N\u00FAmero");
		labelNumero.setBounds(33, 107, 52, 14);
		cadastroCliente.add(labelNumero);
		
		numeroCliente = new JTextField();
		numeroCliente.setBounds(133, 104, 184, 20);
		cadastroCliente.add(numeroCliente);
		numeroCliente.setColumns(10);
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setBounds(33, 133, 47, 14);
		cadastroCliente.add(labelBairro);
		
		bairroCliente = new JTextField();
		bairroCliente.setBounds(133, 130, 184, 20);
		cadastroCliente.add(bairroCliente);
		bairroCliente.setColumns(10);
		
		JLabel labelCep = new JLabel("Cep:");
		labelCep.setBounds(33, 159, 45, 14);
		cadastroCliente.add(labelCep);
		
		cepCliente = new JTextField();
		cepCliente.setBounds(133, 156, 184, 20);
		cadastroCliente.add(cepCliente);
		cepCliente.setColumns(10);
		
		JLabel labelCidade = new JLabel("Cidade");
		labelCidade.setBounds(33, 185, 50, 14);
		cadastroCliente.add(labelCidade);
		
		cidadeCliente = new JTextField();
		cidadeCliente.setBounds(133, 182, 184, 20);
		cadastroCliente.add(cidadeCliente);
		cidadeCliente.setColumns(10);
		
		JLabel labelEstado = new JLabel("Estado");
		labelEstado.setBounds(33, 211, 50, 14);
		cadastroCliente.add(labelEstado);
		
		estadoCliente = new JTextField();
		estadoCliente.setBounds(133, 208, 184, 20);
		cadastroCliente.add(estadoCliente);
		estadoCliente.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(133, 259, 184, 27);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco enderecoCliente = new Endereco(ruaCliente.getText(), Integer.parseInt(numeroCliente.getText()), bairroCliente.getText(), cidadeCliente.getText(), estadoCliente.getText(), cepCliente.getText());
				Empresa clienteEmpresa = new Empresa(nomeCliente.getText(), cnpjCliente.getText(), enderecoCliente);
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso !!! \n\n" +  clienteEmpresa.toString());
			}
		});
		btnCadastrar.setForeground(new Color(0, 0, 128));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastroCliente.add(btnCadastrar);
	}

}
