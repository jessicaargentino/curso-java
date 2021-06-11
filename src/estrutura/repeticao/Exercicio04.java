package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor;

		System.out.print("Digite o valor desejado: ");
		valor = entrada.nextInt();

		for (int n = 1; n <= valor; n++) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		}

		entrada.close();

	}
}
