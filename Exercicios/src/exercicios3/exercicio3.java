package exercicios3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int linha;
		int coluna;
		int x = 0;
		int y = 0;

		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 6; coluna++) {
				System.out.println("Digite um numero: ");
				n1[linha][coluna] = leia.nextInt();
				x = n1[linha][coluna];
				n2[linha][coluna] = leia.nextInt();
				y = n2[linha][coluna];

				m1[linha][coluna] = x + y;
				m2[linha][coluna] = x - y;

			}

		}
		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 6; coluna++) {

				System.out.print(m1[linha][coluna] + "\t");

			}

			System.out.println("\n");

		}
		for (linha = 0; linha < 4; linha++) {

			for (coluna = 0; coluna < 6; coluna++) {

				System.out.print(m2[linha][coluna] + "\t");

			}

			System.out.println("\n");

		}

	}
}