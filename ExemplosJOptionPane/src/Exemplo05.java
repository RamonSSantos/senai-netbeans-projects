import javax.swing.JOptionPane;

public class Exemplo05 {
	public static void main(String[] args) {
		int total = 0;
		String[] number = {"","",""};
		int[] num = {0,0,0};
		
		for (int x = 0;x < num.length; x++) {
			int y = x + 1;
			number[x] = JOptionPane.showInputDialog("Digite o numero " + y);
			
			num[x] = Integer.parseInt(number[x]);
			total = total + num[x];
		}
		JOptionPane.showMessageDialog(null,"A soma dos numeros é: " + total, "Resultado total",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
