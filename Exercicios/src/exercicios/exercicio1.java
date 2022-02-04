package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int ageYears, ageMonth, ageDays, total=0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Write your age in years");
		ageYears=read.nextInt();
		System.out.println("Write your age in months");
		ageMonth=read.nextInt();
		System.out.println("Write your age in days");
		ageDays=read.nextInt();
	
		total+=(ageYears*365);
		total+=(ageMonth*30);
		total+=ageDays;
		
		System.out.println("Your age in days is "+total);
		
	}
}
