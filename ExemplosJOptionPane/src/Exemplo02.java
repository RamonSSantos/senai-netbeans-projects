import javax.swing.JOptionPane;

public class Exemplo02 {
	public static void main(String[] args) {
		String nome = null;
		int resposta;
		
		nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null,"O seu nome � " + nome + "?");
		
		if (resposta == JOptionPane.YES_OPTION) { //Verificar se o usu�rio clicou em YES
			JOptionPane.showMessageDialog(null,"O seu nome � " + nome);
		} else {
			JOptionPane.showMessageDialog(null,"O seu nome nao � " + nome);
		}
	}
}
