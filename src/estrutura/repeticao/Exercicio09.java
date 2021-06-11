package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;

		System.out.print("Digite um valor: ");
		n = entrada.nextInt();

		System.out.print("Divisores: ");
		for (int divisores = 1; divisores <= n; divisores++) {

			if (n % divisores == 0) {
				System.out.print(divisores + " ");
			}
		}
		
		entrada.close();

	}
}
