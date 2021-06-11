package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.print("Digite o valor de A: ");
		A = entrada.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		B = entrada.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		C = entrada.nextDouble();
		
		areaTriangulo = ((A * C)/2);
		areaCirculo = (3.14159 * Math.pow(C, 2));
		areaTrapezio = (((A + B)*C)/2);
		areaQuadrado = (Math.pow(B, 2));
		areaRetangulo = (A * B);
		
		System.out.printf("\nTRIÂNGULO: %.3f" , areaTriangulo);
		System.out.printf("\nCÍRCULO: %.3f" , areaCirculo);
		System.out.printf("\nTRAPÉZIO: %.3f" , areaTrapezio);
		System.out.printf("\nQUADRADO: %.3f" , areaQuadrado);
		System.out.printf("\nRETÂNGULO: %.3f" , areaRetangulo);
		
		entrada.close();

	}

}
