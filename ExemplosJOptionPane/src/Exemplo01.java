import javax.swing.JOptionPane;

public class Exemplo01 {
	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null,"Mensagem","Titulo",JOptionPane.INFORMATION_MESSAGE);
		
		String nome = null;
		nome = JOptionPane.showInputDialog("Informe o seu nome");
		JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
		
	}
}
