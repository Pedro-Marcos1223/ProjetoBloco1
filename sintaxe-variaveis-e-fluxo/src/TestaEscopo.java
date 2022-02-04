
public class TestaEscopo {

	public static void main(String[] args){
	
		int idade = 18;
		int quantidadeDePessoas = 2;
		boolean acompanhado;
		//boolean acompanhado = quantidadeDePessoas >= 2;
		
		if(quantidadeDePessoas >= 2) {
			 acompanhado = true;
					
		} else {
			
			 acompanhado = false;
					
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
// Você pode usar o && no lugar de || caso ele precise ter 18 anos e um acompanhante
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo ");
		} else {
			System.out.println("Você não pode entrar. ");
		}
	
	
	}

	
}