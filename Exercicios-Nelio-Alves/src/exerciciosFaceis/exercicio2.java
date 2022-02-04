package exerciciosFaceis;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas, horasExtras;
		double salario, salarioExtra, salarioTotal;
		
		System.out.println("Digite seu numero de funcionario: ");
		numeroFuncionario=leia.nextInt();		
		System.out.println();
		System.out.println("Digite seu numero de horas trabalhdas: ");
		horasTrabalhadas=leia.nextInt();		
		System.out.println();
		
		salario=horasTrabalhadas*10.0;
		
			if(horasTrabalhadas>50) {
				System.out.println("Voce trabalhou mais que 50 horas, você ira receber 20 reais por hora extra.");
				horasExtras=horasTrabalhadas-50;
				salarioExtra=horasExtras*20;
				salarioTotal=salarioExtra+salario;
				System.out.println();
				System.out.println("Seu codigo de funcionario é: "+numeroFuncionario);
				System.out.println("Suas horas trabalhadas foram: "+horasTrabalhadas);
				System.out.println("E o seu salario é: "+salario);
				System.out.println("Suas horas extras trabalhadas foram: "+horasExtras);
				System.out.println("E o seu salario adicional pelas horas extras foi de: "+salarioExtra);
				System.out.println();
				System.out.println("Seu salario total é: "+salarioTotal);
			}else {
				System.out.println("Seu codigo de funcionario é: "+numeroFuncionario);
				System.out.println("Suas horas trabalhadas foram: "+horasTrabalhadas);
				System.out.println("E o seu salario é: "+salario);
			}
			
		leia.close();
	}
}
