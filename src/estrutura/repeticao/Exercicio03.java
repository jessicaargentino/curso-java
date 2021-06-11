package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, codigo = 0;

		while (codigo != 4) {

			System.out.println("1 - Álcool | 2 - Gasolina | 3 - Diesel");
			System.out.print("Digite o código do tipo de combustível abastecido: ");
			codigo = entrada.nextInt();

			if (codigo == 1) {
				alcool++;
				System.out.println();
			} else if (codigo == 2) {
				gasolina++;
				System.out.println();
			} else if (codigo == 3) {
				diesel++;
				System.out.println();
			} else if(codigo == 4) {
				System.out.println("\nMuito obrigada!");
			} else {
				System.out.println("\nCódigo inválido, tente novamente!\n");
			}
		}
		
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		entrada.close();

	}
}
