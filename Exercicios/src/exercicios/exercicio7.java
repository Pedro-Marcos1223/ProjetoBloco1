package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=read.nextInt();
		System.out.println("Enter the second number");
		b=read.nextInt();
		System.out.println("Enter the third number");
		c=read.nextInt();
		System.out.println("Enter the fourth number");
		d=read.nextInt();
		System.out.println("Enter the fifth number");
		e=read.nextInt();
		System.out.println("Enter the sixth number");
		f=read.nextInt();
		
		x=(((c*e)-(b*f))/((a*e)-(b*d)));
		y=(((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.println("The value of equation X is: "+x);
		System.out.println("The value of equation Y is: "+y);
	}
}
