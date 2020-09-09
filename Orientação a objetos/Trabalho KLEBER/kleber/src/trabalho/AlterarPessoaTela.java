package trabalho;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarPessoaTela extends JFrame{
	private int id;
	private JTextField idTxt = new JTextField();
	private JTextField newNomeTxt;
	private JTextField newIdadeTxt;
	private JLabel idLbl = new JLabel("Id:");
	private JLabel newNomeLbl = new JLabel("Novo nome:");
	private JLabel newIdadeLbl = new JLabel("Nova Idade:");
	private JLabel alterarLbl = new JLabel("Alterar Pessoa");
	private JButton alterarBtn = new JButton("Alterar");
	public AlterarPessoaTela(Pessoa[] p) {
		super("Alterar");
		setLocationRelativeTo(null);
		setSize(500,300);
		alterarLbl.setHorizontalAlignment(SwingConstants.CENTER);
		alterarLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		idTxt.setEditable(false);
		idTxt.setColumns(10);
		newNomeTxt = new JTextField();
		newNomeTxt.setColumns(10);
		newIdadeTxt = new JTextField();
		newIdadeTxt.setColumns(10);
		
		alterarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newIdadeTxt.getText().length() != 0 && newNomeTxt.getText().length() != 0){
					for(int i=0;i<p.length;i++) {
						p[id-1] = new Pessoa(id, newNomeTxt.getText(), Integer.parseInt(newIdadeTxt.getText()));
						Tela.setVetor(p);
						JOptionPane.showMessageDialog(new JFrame(), "Alterado com sucesso.");
						dispose();
						break;
					
				}
				}
			}
		});
		
		JButton excluirBtn = new JButton("Excluir");
		excluirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<p.length;i++){
					if(p[i].getId() == id){
						p[i] = null;
						Tela.setVetor(p);
						JOptionPane.showMessageDialog(new JFrame(), "Excluido");
						dispose();
						break;
					}
				}
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alterarLbl, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(idLbl)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(newNomeLbl)
										.addComponent(newIdadeLbl))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(newIdadeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(newNomeTxt, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(alterarBtn, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
									.addGap(50)
									.addComponent(excluirBtn, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(alterarLbl, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(idLbl)
						.addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(newNomeLbl)
						.addComponent(newNomeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(newIdadeLbl)
						.addComponent(newIdadeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(alterarBtn)
						.addComponent(excluirBtn))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setVisible(true);
	}
	
	public void setId(int id) {
		this.id = id;
		idTxt.setText(Integer.toString(id));
	}
	
}
