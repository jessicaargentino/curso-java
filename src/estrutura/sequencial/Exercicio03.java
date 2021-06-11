package estrutura.sequencial;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.print("Digite o valor de A: ");
		A = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = entrada.nextInt();
		
		System.out.print("Digite o valor de C: ");
		C = entrada.nextInt();
		
		System.out.print("Digite o valor de D: ");
		D = entrada.nextInt();
		
		diferenca = ((A * B) - (C * D));
		
		System.out.println("\nDIFERENÇA = " + diferenca);

		entrada.close();

	}

}
