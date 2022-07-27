import java.util.*;
public class Exercicio02 {
	public static void main(String[] args) {
		System.out.print("CARDAPIO - ");
		
		double soma = 0;
		
		double[] valor = {3, 2.50, 2.50, 1, 3};
		String[] item = {"Hamburgueres", "Cheeseburgueres", "Batatas Fritas", "Refrigerantes", "Milkshakes"};
		int[] Quantidade = {0, 0, 0, 0, 0};
		double[] VlQuant = {0, 0, 0, 0, 0};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("TABELA DE PREÇOS");
		System.out.print("\n");
		
		for (int v = 0; v < valor.length; ++v) {
			System.out.println(item[v] + "\t - R$ " + valor[v]);
		}
		
		System.out.println("\n");
		
		for (int v = 0; v < valor.length; ++v) {
				
				System.out.print("Quantos " + item[v] + " voce deseja consumir? ");
				Quantidade[v] = input.nextInt();
				
				VlQuant[v] = valor[v] * Quantidade[v];
				
				soma = soma + VlQuant[v];
		}
		System.out.println("\nO valor final do pedido = R$ " + soma);
	}
}
