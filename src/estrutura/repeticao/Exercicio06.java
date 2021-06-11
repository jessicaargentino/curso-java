package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, mediaPonderada;

		System.out.print("Digite a quantidade de casos de teste: ");
		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("\nCASO %d:", i + 1);

			System.out.print("\nDigite o 1º valor: ");
			num1 = entrada.nextDouble();

			System.out.print("Digite o 2º valor: ");
			num2 = entrada.nextDouble();

			System.out.print("Digite o 3º valor: ");
			num3 = entrada.nextDouble();

			mediaPonderada = ((num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10.0);

			System.out.println("\nMédia ponderada: " + mediaPonderada);
		}

		entrada.close();

	}
}
