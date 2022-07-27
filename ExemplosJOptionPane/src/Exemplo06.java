import javax.swing.JOptionPane;

public class Exemplo06 {
	public static void main(String[] args) {
		
		int totalA = 0, totalB = 0;
		int[] playA = {0,0,0}, playB = {0,0,0};
		String[] numberA = {"","",""}, numberB = {"","",""};
		String nomeA,nomeB = null;
		
		nomeA = JOptionPane.showInputDialog(null,"Jogador 01, Qual o seu nome?");
		nomeB = JOptionPane.showInputDialog(null,"Jogador 02, Qual o seu nome?");
		
		for (int x = 0;x < playA.length; x++) {
			
				int z = x + 1;
				
				numberA[x] = JOptionPane.showInputDialog("Jogador " + nomeA + " Digite o numero " + z);
				playA[x] = Integer.parseInt(numberA[x]);
				totalA = totalA + playA[x];	
				
				numberB[x] = JOptionPane.showInputDialog("Jogador " + nomeB + " Digite o numero " + z);
				playB[x] = Integer.parseInt(numberB[x]);
				totalB = totalB + playB[x];	
		}
		
		JOptionPane.showMessageDialog(null,"Jogador " + nomeA + " A soma dos numeros é: " + totalA, "Resultado total Jogador " + nomeA,JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Jogador " + nomeB + " A soma dos numeros é: " + totalB, "Resultado total Jogador " + nomeB,JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
