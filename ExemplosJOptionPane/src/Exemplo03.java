import javax.swing.JOptionPane;

public class Exemplo03 {
	public static void main(String[] args) {
		
		String numero1,numero2;
		int num1,num2,total;
		
		numero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		numero2 = JOptionPane.showInputDialog("Digite o segundo  número");
		
		num1 = Integer.parseInt(numero1);
		num2 = Integer.parseInt(numero2);
		total = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros é: " + total, "Resultado total",JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
		
	}
}
