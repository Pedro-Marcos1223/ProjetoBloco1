package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
				int minutes, hours, seconds, secondsTotal;
				Scanner read = new Scanner(System.in);
				
				System.out.println("Write how many seconds the event took");
				secondsTotal=read.nextInt();
				
				hours=secondsTotal/3600;
				minutes=(secondsTotal%3600)/60;
				seconds=(secondsTotal%3600)%60;
				
				System.out.println("The event took "+hours+" hour's, "+minutes+" minutes, and "+seconds+" seconds.");
			
			}
	}

