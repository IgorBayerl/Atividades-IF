package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTxt = new JTextField();;

	int id = 0;
	public static Pessoa[] p = new Pessoa[20];
	JLabel pessoaLbl = new JLabel("Pessoa");
	private JLabel nomeLbl = new JLabel("Nome");
	private JTextField idadeTxt = new JTextField();
	private JLabel idadeLbl= new JLabel("Idade");
	private JButton cadastrarBtn = new JButton("Cadastrar");
	private JButton listaBtn = new JButton("Listar");
	private JTable table = new JTable();
	private DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Idade"
			}
		);

	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		table.setModel(tableModel); 
		setLocationRelativeTo(null);
		pessoaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pessoaLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int linha = table.getSelectedRow();
				int id =  Integer.parseInt(table.getModel().getValueAt(linha, 0).toString());
				AlterarPessoaTela frame = new AlterarPessoaTela(p);
				frame.setId(id);
			}
		});
		nomeTxt.setColumns(10);
				
		idadeTxt.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(pessoaLbl, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(listaBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(idadeLbl)
										.addComponent(nomeLbl))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(idadeTxt, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(cadastrarBtn, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addComponent(nomeTxt, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)))
								.addComponent(scrollPane))))
					.addContainerGap())
		);
		cadastrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<p.length;i++) {
					if(p[i]==null) {
						p[i] = new Pessoa(i+1, nomeTxt.getText(), Integer.parseInt(idadeTxt.getText()));
						JOptionPane.showMessageDialog(new JFrame(), "Cadastrado com sucesso.");
						break;
					}
				}
			}
		});
		listaBtn.addActionListener(new ActionListener() {
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
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(pessoaLbl, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(nomeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nomeLbl))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(idadeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(idadeLbl))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cadastrarBtn)
					.addGap(18)
					.addComponent(listaBtn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		

		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
	public static void setVetor(Pessoa[] pessoas){
		p = pessoas;
	}
}