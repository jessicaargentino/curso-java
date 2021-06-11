package estrutura.condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigo, quantidade;
		double total = 0.0;
		
		System.out.print("Digite o código do item: ");
		codigo = entrada.nextInt();
		
		System.out.print("Digite a quantidade do item: ");
		quantidade = entrada.nextInt();
		
		if(codigo == 1) {
			total = (quantidade * 4.00);
		}else if(codigo == 2) {
			total = (quantidade * 4.50);
		}else if(codigo == 3) {
			total = (quantidade * 5.00);
		}else if(codigo == 4) {
			total = (quantidade * 2.00);
		}else if(codigo == 5) {
			total = (quantidade * 1.50);
		}else {
			System.out.println("Código inválido!");
		}
		
		System.out.printf("\nTotal: R$%.2f", total);
		
		entrada.close();

	}
}