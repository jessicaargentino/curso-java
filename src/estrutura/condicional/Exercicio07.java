package estrutura.condicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double x, y;

		System.out.print("Digite o 1º valor: ");
		x = entrada.nextDouble();

		System.out.print("Digite o 2º valor: ");
		y = entrada.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else if (x == 0.0) {
			System.out.println("Eixo X");
		} else if (y == 0.0) {
			System.out.println("Eixo Y");
		}

		entrada.close();
	}

}
