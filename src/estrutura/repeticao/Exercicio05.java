package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n, x, in = 0, out = 0;

		System.out.print("Digite a quantidade de números que serão lidos: ");
		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Digite o %d valor: ", i + 1);
			x = entrada.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println("\n" + in + " in");
		System.out.println(out + " out");

		entrada.close();

	}
}
