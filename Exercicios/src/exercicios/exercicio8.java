package exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		double factoryValue, consumerValue;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the vehicle's factory value: ");
		factoryValue= read.nextDouble();
		
		consumerValue=factoryValue+(factoryValue*0.28)+(factoryValue*0.45);
		
		System.out.println("The total value of the vehicle is: "+consumerValue);
		
		
		
	}
}
