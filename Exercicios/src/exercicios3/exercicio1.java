package exercicios3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int	vet[] = new int [5], maior=0;
		
		for(int x=0;x<5;x++) {
			System.out.println();
			System.out.println("Digite um numero: ");
			vet[x]=leia.nextInt();
			System.out.println();
			System.out.println("Você digitou: "+vet[x]);
			if(vet[x]> maior) {
			maior=vet[x];
			}
			
		}
		System.out.println();
		System.out.println("O maior numero digitado foi: "+maior);
		
		leia.close();
	}
}
