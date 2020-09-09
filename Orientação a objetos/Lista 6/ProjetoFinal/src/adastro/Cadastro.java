package adastro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class Cadastro {

	private JFrame frame;
	private JTextField textField_NAME;
	private JTextField textField_AGE;
	private JTable txtTabela;

	/**
	 * Launch the application.
	 */
	int id = 0;
	public static Pessoa[] p = new Pessoa[20];
	private DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"ID", "Nome", "Idade"
			}
		);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setFont(new Font("Agency FB", Font.PLAIN, 12));
		frame.setBounds(100, 100, 451, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome :");
		lblNewLabel.setBounds(21, 45, 39, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade :");
		lblNewLabel_1.setBounds(21, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_NAME = new JTextField();
		textField_NAME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ALGUMACOISA");
			}
		});
		textField_NAME.setBounds(66, 42, 263, 20);
		frame.getContentPane().add(textField_NAME);
		textField_NAME.setColumns(10);
		
		textField_AGE = new JTextField();
		textField_AGE.setBounds(66, 70, 263, 20);
		frame.getContentPane().add(textField_AGE);
		textField_AGE.setColumns(10);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableModel.setRowCount(0);
				for(int i=0;i<p.length;i++) {
					if(p[i]!=null) {
						Object[] a = new Object[3];
						a[0] = Integer.toString(p[i].getId());
						a[1] = p[i].getNome();
						a[2] = p[i].getIdade();
						tableModel.addRow(a);
					}
				}
			}
		});
		btnListar.setBounds(21, 149, 399, 23);
		frame.getContentPane().add(btnListar);
		
		JButton btnNewButton_1 = new JButton("CADASTRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("CADASTRO");
				
				
				for(int i = 0 ; i < p.length ; i++ ) {
					if(p[i]==null) {
						p[i] = new Pessoa(i+1, textField_NAME.getText(), Integer.parseInt(textField_AGE.getText()));
						break;
					}
				}
				

			}
		});
		btnNewButton_1.setBounds(21, 101, 400, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("CADASTRO DE PESSOAS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 11, 445, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Cadastro.class.getResource("/img/pessoaa.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(340, 31, 80, 68);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		scrollPane.setBounds(21, 183, 399, 175);
		frame.getContentPane().add(scrollPane);
		
		txtTabela = new JTable();
		txtTabela.setModel(tableModel);
		scrollPane.setViewportView(txtTabela);
		txtTabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int linha = txtTabela.getSelectedRow();
				int id =  Integer.parseInt(txtTabela.getModel().getValueAt(linha, 0).toString());
				Alterar frame = new Alterar( p );
				frame.setVisible(true);
				frame.setId(id);
			}
		});
		txtTabela.setToolTipText("");
	}
	public static void setVetor(Pessoa[] pessoas){
		p = pessoas;
	}
}
