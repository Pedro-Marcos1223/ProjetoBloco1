package exercicios2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int x=0, somaMenor=0, somaMaior=0; 
		Scanner leia = new Scanner(System.in);
		
		while(x!=-99) {
			System.out.println("\nDigite sua idade: ");
			x=leia.nextInt();
			System.out.println();
			
					if(x<=21 && x>0) {
						somaMenor++;
						System.out.println("Sua idade é: "+x);
						System.out.println("pessoas com menos de 21 anos: "+somaMenor);
					}else if(x>=50) {
						somaMaior++;
						System.out.println("Sua idade é"+x);
						System.out.println("pessoas com mais de 50 anos: "+somaMaior);
					}else {
						System.out.println("Sua idade é"+x);
					}
					
		}
		System.out.println("Fim do programa.");
	}
}
