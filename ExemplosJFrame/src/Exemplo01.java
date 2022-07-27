import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exemplo01 extends JFrame {
	public Exemplo01() {
		
		setSize(400, 400);
		setTitle("Texto");
		
		JPanel painel = new JPanel();
		painel.setLayout(null);
		
		JLabel label = new JLabel();
		label = new JLabel("Hello World");
		painel.add(label);
		label.setBounds(150, 10, 100, 10);
		add(painel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		Exemplo01 exemplo = new Exemplo01();
	}
}
