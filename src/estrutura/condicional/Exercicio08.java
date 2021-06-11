package estrutura.condicional;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double salario, imposto = 0.0;

		System.out.print("Digite o valor do seu salário: R$");
		salario = entrada.nextDouble();

		if (salario >= 0.0 && salario <= 2000.00) {
			imposto = 0.0;
		} else if(salario > 2000.00 && salario <= 3000.00) {
			imposto = ((salario - 2000.00) * 0.08);
		} else if(salario > 3000.00 && salario <= 4500.00) {
			imposto = ((salario - 3000.0) * 0.18 + 1000.0 * 0.08);
		} else {
			imposto = ((salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento de imposto!");
		}else {
			System.out.printf("R$%.2f", imposto);
		}

		entrada.close();

	}
}
