package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x, y;

		System.out.print("Digite a coordenada x: ");
		x = entrada.nextInt();

		System.out.print("Digite a coordenada y: ");
		y = entrada.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("\nPrimeiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("\nSegundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("\nTerceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("\nQuarto quadrante");
			}

			System.out.print("\nDigite a coordenada x: ");
			x = entrada.nextInt();

			System.out.print("Digite a coordenada y: ");
			y = entrada.nextInt();

		}

		entrada.close();

	}
}
