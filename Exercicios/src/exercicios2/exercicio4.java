package exercicios2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int pessoa=0, x=0, personalidade=0,idade=0, pessoaCalma=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0,
				pessoasNervosas40=0, pessoasCalmas18=0;
		
		Scanner leia = new Scanner(System.in);
		while(x<150) 
		{
			x++;
			System.out.println("Quantos anos você tem? ");
			idade=leia.nextInt();
			
			System.out.println("Digite 1 se você for do sexo feminino.");
			System.out.println("Digite 2 se você for do sexo masculino.");
			System.out.println("Digite 3 se você for de outro sexo.");
			pessoa=leia.nextInt();
			System.out.println();
			
				if(pessoa==1)
				{
					System.out.println("Digite 1 se você for uma pessoa calma");
					System.out.println("Digite 2 se você for uma pessoa nervosa");
					System.out.println("Digite 3 se você for uma pessoa agressiva");
					personalidade=leia.nextInt();
						
						if(personalidade==1)
						{
							pessoaCalma++;
								if(idade<=18)
								{
									pessoasCalmas18++;
								}
							System.out.println("Tudo, bem. Pesquisa respondida");
						}else if(personalidade==2)
						{
							mulheresNervosas++;
							System.out.println("Tudo, bem. Pesquisa respondida");
								
								if(idade>=40)
								{
									pessoasNervosas40++;
								}
						}else if(personalidade==3)
						{
							System.out.println("Tudo, bem. Pesquisa respondida");
						}else{
							System.out.println("Digite 1, 2 ou 3...");
						}
						
				}else if(pessoa==2)
				{
					System.out.println("Digite 1 se você for uma pessoa calma");
					System.out.println("Digite 2 se você for uma pessoa nervosa");
					System.out.println("Digite 3 se você for uma pessoa agressiva");
					personalidade=leia.nextInt();
						
						if(personalidade==1)
						{
							pessoaCalma++;
								if(idade<=18)
								{
									pessoasCalmas18++;
								}
							System.out.println("Tudo, bem. Pesquisa respondida");
						}else if(personalidade==2)
						{
							System.out.println("Tudo, bem. Pesquisa respondida");
								if(idade>=40)
								{
									pessoasNervosas40++;
								}
						}else if(personalidade==3)
						{
						homensAgressivos++;
						System.out.println("Tudo, bem. Pesquisa respondida");
						}else{
							System.out.println("Digite 1, 2 ou 3...");
						}
						
				}else if(pessoa==3)
				{
					System.out.println("Digite 1 se você for uma pessoa calma");
					System.out.println("Digite 2 se você for uma pessoa nervosa");
					System.out.println("Digite 3 se você for uma pessoa agressiva");
					personalidade=leia.nextInt();
					
						if(personalidade==1)
						{
						pessoaCalma++;
						outrosCalmos++;
								if(idade<=18)
								{
									pessoasCalmas18++;
								}
						System.out.println("Tudo, bem. Pesquisa respondida");
						}else if(personalidade==2)
						{
							System.out.println("Tudo, bem. Pesquisa respondida");	
								if(idade>=40)
								{
									pessoasNervosas40++;
								}
						}else if(personalidade==3)
						{
							System.out.println("Tudo, bem. Pesquisa respondida");
						}else{
							System.out.println("Digite 1, 2 ou 3...");
						}
						
				}else
				{
					System.out.println("Digite 1, 2 ou 3...");
				}
				
		}
			System.out.println("O numero de pessoas calmas é: "+pessoaCalma);
			System.out.println("O numero de mulheres nervosas é: "+mulheresNervosas);
			System.out.println("O numero de homens agressivos é: "+homensAgressivos);
			System.out.println("O numero de outros calmos é: "+outrosCalmos);
			System.out.println("O numero de pessoas nervosas com mais de 40 anos é: "+pessoasNervosas40);
			System.out.println("O numero de pessoas calmas com menos de 18 anos é: "+pessoasCalmas18);
	}
}
