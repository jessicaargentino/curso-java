package estrutura.condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int A, B;

		System.out.print("Digite o valor de A: ");
		A = entrada.nextInt();

		System.out.print("Digite o valor de B: ");
		B = entrada.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("\nSão múltiplos");
		} else {
			System.out.println("\nNão são múltiplos");
		}

		entrada.close();
	}

}
