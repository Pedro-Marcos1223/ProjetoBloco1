package exercicios3;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
	int vet[][] = new int [3][3];
	int l;
	int c;
	int soma=0;
	int somaTotal=0;
	
		for(l=0;l<3;l++) {
			
			for(c=0;c<3;c++) {
				
				System.out.println("Digite um numero");
				vet[l][c]= leia.nextInt();
				
				somaTotal=vet[0][0]+vet[0][1]+vet[0][2]+vet[1][0]+vet[1][1]+vet[1][2]+vet[2][0]+vet[2][1]+vet[2][2];
				soma=vet[0][0]+vet[1][1]+vet[2][2];
			}
		}
		System.out.println("A soma total das casas da matriz é: "+somaTotal);
		System.out.println("A soma total da diagonal principal da matriz é: "+soma);
	}
}
