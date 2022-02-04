package introducao;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2, resultado = 0;

		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo numero");
		numero2 = leia.nextInt();

		resultado = numero1 + numero2;

		System.out.println("NUMEROS DE ENTRADA: " + "\n" + numero1 + "		" + numero2);
		System.out.println();
		System.out.println("NUMERO DE SAIDA" + "\n" + resultado);
		leia.close();
	}
}
