package estrutura.repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {

			System.out.print("Digite sua senha: ");
			senha = entrada.nextInt();

			if (senha != 2002) {
				System.out.println("\nSenha inválida!\n");
			} else {
				System.out.println("\nAcesso permitido!\n");
			}
		}
		entrada.close();

	}

}