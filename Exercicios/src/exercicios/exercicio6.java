package exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		
		System.out.println("Type the first number: ");
		x1=read.nextDouble();
		System.out.println("Type the second number: ");
		y1=read.nextDouble();
		System.out.println("Type the third number: ");
		x2=read.nextDouble();
		System.out.println("Type the fourth number: ");
		y2=read.nextDouble();
		
		
		d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.println("The value of the equation is: "+d);
	}
}
