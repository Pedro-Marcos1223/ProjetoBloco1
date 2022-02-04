
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais ");

		int idade = 18;
		int quantidadeDePessoas = 1;
		boolean acompanhado = quantidadeDePessoas >= 2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
// Você pode usar o && no lugar de || caso ele precise ter 18 anos e um acompanhante
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo ");
		} else {
			System.out.println("Você não pode entrar. ");
		}
	}

}
