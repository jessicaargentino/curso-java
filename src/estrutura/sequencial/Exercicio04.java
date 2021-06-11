package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, horas;
		double valorHora, salario;

		System.out.print("Digite seu número de funcionário: ");
		num = entrada.nextInt();

		System.out.print("Digite o número de horas trabalhadas: ");
		horas = entrada.nextInt();

		System.out.print("Digite o valor recebido por hora: ");
		valorHora = entrada.nextDouble();

		salario = (valorHora * horas);

		System.out.println("\nNUMBER = " + num);
		System.out.printf("SALARY = U$%.2f", salario);

		entrada.close();

	}

}
