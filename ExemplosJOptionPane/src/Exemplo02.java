import javax.swing.JOptionPane;

public class Exemplo02 {
	public static void main(String[] args) {
		String nome = null;
		int resposta;
		
		nome = JOptionPane.showInputDialog(null,"Qual o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null,"O seu nome é " + nome + "?");
		
		if (resposta == JOptionPane.YES_OPTION) { //Verificar se o usuário clicou em YES
			JOptionPane.showMessageDialog(null,"O seu nome é " + nome);
		} else {
			JOptionPane.showMessageDialog(null,"O seu nome nao é " + nome);
		}
	}
}
