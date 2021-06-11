package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n, fatorial = 1;

		System.out.print("Digite um valor: ");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {

			fatorial = fatorial * i;
		}

		System.out.println("Fatorial: " + fatorial);

		entrada.close();

	}
}
