package exercicios3;

import java.util.Random;

public class exercicio2 {
	public static void main(String[] args) {
		
		int []dado = new int [10];
		int soma=0;
		int contador=0;
		int maior=0;
		int x;
		float media=0;
		
		Random gerador = new Random();
		
		System.out.println("Dados lançados: ");
		
		for(x=0;x<10;x++) {
			
			dado[x] = gerador.nextInt(6)+1;
			
			System.out.println(dado[x]);
			
			soma+=dado[x];
				
			if(maior<=dado[x]) {
				maior=dado[x];
					
			}
	}
		for(x=0;x<10;x++) {
			if(maior==dado[x]) {
				contador++;
			}
		}
		media=soma/10;
		System.out.println("A media da soma dos dados é: "+media);
		System.out.println("O maior dado foi: "+maior);
		System.out.println("A quantidade de vezes que esse maior dado apareceu foi: "+contador);
}
}
