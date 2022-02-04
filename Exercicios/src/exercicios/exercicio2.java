package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int age, ageYears=0, ageMonths=0, ageDays=0;
		Scanner read = new Scanner(System.in);
		System.out.println("Write your age in days: ");
		age=read.nextInt();
		
		ageYears= age/365;
		ageMonths= (age%365)/30;
		ageDays= (age%365)%30;
		
		System.out.println("Your age in years is: "+ageYears);
		System.out.println("Your age in months is: "+ageMonths);
		System.out.println("Your age in days is: "+ageDays);
	}

}
