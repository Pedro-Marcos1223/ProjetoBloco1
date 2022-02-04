package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b, c, r, s, d;
		
		System.out.println("Write the value of A");
		a=read.nextInt();
		System.out.println("Write the value of B");
		b=read.nextInt();
		System.out.println("Write the value of C");
		c=read.nextInt();
		
		r=((a+b)*(a+b));
		s=((b+c)*(b+c));
		d=(r+s)/2;
		
		System.out.println("The value of the equation is: "+d);
;	}
}
