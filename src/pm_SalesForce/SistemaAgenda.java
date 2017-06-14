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
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class SistemaAgenda extends JFrame {

	private JPanel tela;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
		tela = new JPanel();
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela);
		tela.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		tela.add(aba);
		
		JPanel agenda = new JPanel();
		aba.addTab("Agenda", null, agenda, null);
		GridBagLayout gbl_agenda = new GridBagLayout();
		gbl_agenda.columnWidths = new int[]{186, 46, 0};
		gbl_agenda.rowHeights = new int[]{14, 0};
		gbl_agenda.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_agenda.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		agenda.setLayout(gbl_agenda);
		
		JLabel labelNome = new JLabel("Raz\u00E3o Social: ");
		GridBagConstraints gbc_labelNome = new GridBagConstraints();
		gbc_labelNome.insets = new Insets(0, 0, 0, 5);
		gbc_labelNome.gridx = 0;
		gbc_labelNome.gridy = 0;
		agenda.add(labelNome, gbc_labelNome);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		agenda.add(textField, gbc_textField);
		textField.setColumns(20);
		
		JPanel cadastroCliente = new JPanel();
		aba.addTab("Cadastro Cliente", null, cadastroCliente, null);
		cadastroCliente.setLayout(new BoxLayout(cadastroCliente, BoxLayout.X_AXIS));
	}

}
