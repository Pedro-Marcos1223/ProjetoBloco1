package exerciciosFaceis;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		System.out.println("Digite o primeiro numero: ");
		A=leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		B=leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		C=leia.nextInt();
		System.out.println("Digite o quarto numero: ");
		D=leia.nextInt();
		
		diferenca=((A*B)-(C*D));
		
		System.out.println("A diferenca é: "+diferenca);
	}
}
