package adastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField Name;
	private JTextField Age;
	private int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Alterar frame = new Alterar();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param p 
	 */
	public Alterar(Pessoa[] p) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 441, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Exclude = new JButton("Excluir pessoa");
		Exclude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<p.length;i++){
					if(p[i].getId() == id){
						p[i] = null;
						Cadastro.setVetor(p);
						dispose();
						break;
					}
				}
				
			}
		});
		Exclude.setBounds(20, 189, 163, 23);
		contentPane.add(Exclude);
		
		JButton Confirm = new JButton("Confirmar");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Name.getText().length() != 0 && Age.getText().length() != 0){
					for(int i=0;i<p.length;i++) {
						p[id-1] = new Pessoa(id, Name.getText(), Integer.parseInt(Age.getText()));
						Cadastro.setVetor(p);
						dispose();
						break;
					
				}
				}
			}
		});
		Confirm.setBounds(241, 189, 163, 23);
		contentPane.add(Confirm);
		
		ID = new JTextField();
		ID.setEnabled(false);
		ID.setBounds(95, 55, 309, 20);
		contentPane.add(ID);
		ID.setColumns(10);
		
		Name = new JTextField();
		Name.setBounds(95, 86, 309, 20);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Age = new JTextField();
		Age.setBounds(95, 117, 309, 20);
		contentPane.add(Age);
		Age.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id:");
		lblNewLabel.setBounds(20, 58, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Novo nome:");
		lblNewLabel_1.setBounds(20, 89, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nova idade:");
		lblNewLabel_2.setBounds(20, 120, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ALTERAR PESSOA");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 414, 33);
		contentPane.add(lblNewLabel_3);
	}
	public void setId(int id) {
		this.id = id;
		ID.setText(Integer.toString(id));
	}

}
