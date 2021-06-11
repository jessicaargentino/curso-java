package estrutura.condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int inicio, termino, duracao;

		System.out.print("Digite a hora de início do jogo: ");
		inicio = entrada.nextInt();

		System.out.print("Digite a hora de término do jogo: ");
		termino = entrada.nextInt();

		if (inicio < termino) {
			duracao = (termino - inicio);
		} else {
			duracao = ((24 - inicio) + termino);
		}

		System.out.println("\nO JOGO DUROU " + duracao + " HORA(S)");

		entrada.close();

	}
}
