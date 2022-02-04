package orientacaoObjeto;

public class Exercicio5Modulo {

	String personagem;
	String cor;
	int tamanho;
	int numeroDeRodinhas;
	boolean freios=true;
	
	public Exercicio5Modulo() 
	{
		this.cor="Vermelho";
		this.personagem="Relampago Mcquen";
		this.tamanho=35;
		this.numeroDeRodinhas=6;
	}
	
	public void informarCor()
	{
		System.out.println("A cor do patinete é: "+cor);
	}
	
	public void informarPersonagem()
	{
		System.out.println("O patinete é do personagem: "+personagem);
	}
	
	public void informarTamanho()
	{
		System.out.println("O tamanho do patinete é: "+tamanho);
	}
	
	public void informarNumeroDeRodinhas()
	{
		System.out.println("O numero de rodinhas que o patinete tem é: "+numeroDeRodinhas);
	}
	
	public void freiosOn()
	{
		this.freios=true;
		System.out.println("UFAAAA... Você conseguiu freiar!");
	}
	
	public void freiosOff()
	{
		this.freios=false;
		System.out.println("FREIA ESSE PATINETE, VOCÊ ESTA EM UMA LADEIRA!!!!!!!!!!");
	}
	
}
