package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n, num1, num2;
		double divisao;

		System.out.print("Digite a quantidade de pares de números que serão lidos: ");
		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("\n%dº PAR:", i + 1);

			System.out.print("\nDigite o 1º valor: ");
			num1 = entrada.nextInt();

			System.out.print("Digite o 2º valor: ");
			num2 = entrada.nextInt();

			if (num2 == 0) {
				System.out.println("\nDivisão impossível!");
			} else {
				divisao = (double) num1 / num2;
				System.out.printf("\nResultado divisão: %.2f\n", divisao);
			}
		}

		entrada.close();

	}
}
