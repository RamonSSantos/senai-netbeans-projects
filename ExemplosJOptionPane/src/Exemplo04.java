import javax.swing.JOptionPane;

public class Exemplo04 {
	public static void main(String[] args) {
		
		Object[] frutas = {" ","LARANJA","MORANGO","BANANA","MELANCIA"};
		
		Object selectedValue = JOptionPane.showInputDialog(null,"Escolha uma fruta","FRUTA",JOptionPane.INFORMATION_MESSAGE,null,frutas,frutas[0]);
	}
}
