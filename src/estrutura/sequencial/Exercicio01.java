package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1, num2, soma;

		System.out.print("Digite o 1º valor: ");
		num1 = entrada.nextInt();

		System.out.print("Digite o 2º valor: ");
		num2 = entrada.nextInt();

		soma = (num1 + num2);
		System.out.println("SOMA = " + soma);

		entrada.close();
	}

}
