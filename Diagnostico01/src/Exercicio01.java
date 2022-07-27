import java.util.*;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		double calculo = 0;
		String resultado = "a";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int x = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		int y = input.nextInt();
		
		if (x % 2 == 0) { // X = numero par
			calculo = x + y;
			resultado = "X = numero PAR. X + Y= ";
		} else if (x % 2 == 0 || y % 2 == 0) { // X ou Y = numero par
			calculo = x / y;
			resultado = "X ou Y é numero PAR. X / Y= ";
		} else { // X e Y = impares
			calculo = x * y;
			resultado = "X e Y sao numeros IMPARES. X * Y= ";
		}
		
		System.out.print(resultado);
		System.out.println(calculo);
	}
}
