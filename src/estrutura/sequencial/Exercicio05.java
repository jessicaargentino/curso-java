package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double valor1, valor2, valorTotal;
		
		System.out.println("PEÇA 1:");
		System.out.print("Código: ");
		cod1 = entrada.nextInt();
		System.out.print("Quantidade: ");
		quant1 = entrada.nextInt();
		System.out.print("Valor unitário: ");
		valor1 = entrada.nextDouble();
		
		System.out.println("\nPEÇA 2:");
		System.out.print("Código: ");
		cod2 = entrada.nextInt();
		System.out.print("Quantidade: ");
		quant2 = entrada.nextInt();
		System.out.print("Valor unitário: ");
		valor2 = entrada.nextDouble();
		
		valorTotal = (quant1 *  valor1 + (quant2 *  valor2));
		
		System.out.print("\nCÓDIGO PEÇAS: " + cod1 + " " + cod2);
		System.out.printf("\nVALOR A PAGAR: R$%.2f", valorTotal);
		entrada.close();

	}

}
