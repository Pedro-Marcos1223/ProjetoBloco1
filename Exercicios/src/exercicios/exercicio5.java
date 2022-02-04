package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int note1, note2, note3, avarege=0;
		
		System.out.println("Type the first note");
		note1=read.nextInt();
		System.out.println("Type the second note");
		note2=read.nextInt();
		System.out.println("Type the third note");
		note3=read.nextInt();
		
		avarege=(note1+note2+note3)/3;
		
		System.out.println("The avarege of student's is: "+avarege);
		
		
	}
}
