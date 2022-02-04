package exercicios2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int numero, soma=0;
		
		do
		{
			System.out.printf("Digite um numero\n");
			numero=leia.nextInt();
			
			soma+=numero;
			
		}while(numero!=0);
		
		System.out.println("Soma= "+soma);	
	}
}