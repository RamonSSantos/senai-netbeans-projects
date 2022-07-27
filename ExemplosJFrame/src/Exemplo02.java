//Bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Classe Exemplo02 extendida do Jframe implementando ActionListener

public class Exemplo02 extends JFrame implements ActionListener {
	
	//Variaveis
	private JLabel lblEst, lblNome, lblSex, lblNiv, lblInt;
	private JTextField textNome;
	private ButtonGroup gruSex;
	private JRadioButton radMasc, radFem;
	private JComboBox cmbNiv;
	private JCheckBox chkIng, chkMat, chkPro, chkLog;
	private JButton btnGrav;
	
	//Iniciando o Exemplo02
	public Exemplo02() {
		setLayout(null);
		
		//Label Estudante
		lblEst = new JLabel("Estudante: ");
		lblEst.setForeground(Color.BLUE);
		lblEst.setBounds(120,5,100,20);
		add(lblEst);
		
		//Label Nome
		lblNome = new JLabel("Nome ");
		lblNome.setBounds(10,35,100,20);
		add(lblNome);
		
		//Text Nome
		textNome = new JTextField("");
		textNome.setBounds(10,65,300,20);
		add(textNome);
		
		//Label Sexo
		lblSex = new JLabel("Sexo: ");
		lblSex.setBounds(10,95,100,20);
		add(lblSex);
		
		//Radio Masculino
		radMasc = new JRadioButton("Masculino");
		radMasc.setBounds(10,125,120,20);
		radMasc.setForeground(Color.BLUE);
		radMasc.setBackground(Color.WHITE);
		radMasc.setSelected(true);
		
		//Radio Feminino
		radFem = new JRadioButton("Feminino");
		radFem.setBounds(200,125,120,20);
		radFem.setForeground(Color.BLUE);
		radFem.setBackground(Color.WHITE);
		
		//Grupo de Botoes
		gruSex = new ButtonGroup();
		gruSex.add(radMasc);
		gruSex.add(radFem);
		add(radMasc);
		add(radFem);
		
		//Label Nivel
		lblNiv = new JLabel("Nivel Estudantil: ");
		lblNiv.setBounds(10,155,200,20);
		add(lblNiv);
		
		//Combo Nivel
		cmbNiv = new JComboBox();
		cmbNiv.setBackground(Color.WHITE);
		cmbNiv.addItem("Ensino Basico Completo");
		cmbNiv.addItem("Ensino Medio Completo");
		cmbNiv.addItem("Ensino Superior Completo");
		cmbNiv.addItem("Doutorado e/ou Mestrado Completo");
		cmbNiv.setBounds(10,185,300,20);
		add(cmbNiv);
		
		//Label Interesses
		lblInt = new JLabel("Interesses: ");
		lblInt.setBounds(10,275,100,20);
		add(lblInt);
		
		//Check Ingles
		chkIng = new JCheckBox("Ingles");
		chkIng.setBounds(10,305,120,20);
		chkIng.setForeground(Color.BLUE);
		chkIng.setBackground(Color.WHITE);
		add(chkIng);
		
		//Check Matematica
		chkMat = new JCheckBox("Matematica");
		chkMat.setBounds(170,305,120,20);
		chkMat.setForeground(Color.BLUE);
		chkMat.setBackground(Color.WHITE);
		add(chkMat);
		
		//Check Programacao
		chkPro = new JCheckBox("Programacao");
		chkPro.setBounds(10,335,120,20);
		chkPro.setForeground(Color.BLUE);
		chkPro.setBackground(Color.WHITE);
		add(chkPro);
		
		//Check Logica
		chkLog = new JCheckBox("Logica");
		chkLog.setBounds(170,335,120,20);
		chkLog.setForeground(Color.BLUE);
		chkLog.setBackground(Color.WHITE);
		add(chkLog);
		
		//Botao OK
		btnGrav = new JButton("OK");
		btnGrav.setBounds(110,385,120,40);
		btnGrav.setMnemonic('0');
		btnGrav.setToolTipText("OK...");
		btnGrav.setForeground(Color.RED);
		btnGrav.addActionListener(this);
		add(btnGrav);
		
	}
	//Funcao responsaveis pelos cliques
	public void ActionPerformed(ActionEvent acesso) {
		String sSexo="";
		String sNivel="";
		String sExec="";
		Boolean bChave = true;
		
		//Se o acesso for via botao gravar-ok
		if(acesso.getSource() == btnGrav) {
			//Pegando o nivel de escolaridade
			sNivel=cmbNiv.getSelectedItem().toString();
			//Verificando os Radios
			if(radFem.isSelected())
				sSexo="F";
			if(radMasc.isSelected())
				sSexo="M";
			
			//Montando a frase que ser� mostrada
			sExec="Nome = '"+textNome.getText()+"'\n"+
				  "Sexo = '"+sSexo+"'\n"+
				  "Nivel = '"+sNivel+"'\n"+
				  "----------------------"+
				  "Interesses: \n"+
				  "Ingles? "+chkIng.isSelected()+"\n"+
				  "Matematica? "+chkMat.isSelected()+"\n"+
				  "Programacao? "+chkPro.isSelected()+"\n"+
				  "Logica? "+chkLog.isSelected()+"\n";
			
			//Mostrando a frase
			JOptionPane.showMessageDialog(null,sExec,"Atencao",1);
			
			//Se a chave for verdadeira, chama funcao limpaDados
			if(bChave) {
				limpaDados();
			}
			//Muda o foco do componente
			textNome.grabFocus();
		}	
	}
	//Funcao principal que ira criar a janela
	public static void main(String[] args) {
		
		Exemplo02 ex = new Exemplo02();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.getContentPane().setBackground(Color.WHITE);
		
		//Icone na mesma pasta do codigo fonte
		ex.setIconImage(new ImageIcon("ico.png").getImage());
		ex.setTitle("Estudantes...");
		
		//Tira o maximizar e a alteracao do tamanho
		ex.setResizable(false);
		ex.setSize(350,480);
		ex.setVisible(true);
		ex.setLocationRelativeTo(null);
	}
	//Funcao que limpa o programa e deixa ele como executado pela primeira vez
	private void limpaDados() {
		textNome.setText("");
		radMasc.setSelected(true);
		chkIng.setSelected(false);
		chkMat.setSelected(false);
		chkPro.setSelected(false);
		chkLog.setSelected(false);
		cmbNiv.setSelectedIndex(0);
	}
}