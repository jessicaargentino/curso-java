package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double raio, pi = 3.14159, area;

		System.out.print("Digite o valor do raio: ");
		raio = entrada.nextDouble();

		area = (pi * raio * raio);

		System.out.printf("A = %.4f", area);

		entrada.close();

	}

}
