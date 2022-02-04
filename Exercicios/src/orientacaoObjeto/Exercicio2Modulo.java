package orientacaoObjeto;

public class Exercicio2Modulo {

	String companhia;
	int quantidadeDePessoas;
	String numeroDoVoo;
	
	
	
	public Exercicio2Modulo()
	{
		this.companhia="Gol";
		this.quantidadeDePessoas=200;
		this.numeroDoVoo="109-22";
	}
	
	public void informarCompanhia()
	{
		System.out.println("A companhia area é a "+companhia);
	}
	
	public void informarQuantidadePessoas()
	{
		System.out.println("A quantidade de pessoas presentes no voo é de: "+quantidadeDePessoas);
	}
	
	public void informarNumeroVoo()
	{
		System.out.println("O numero do voo é: "+numeroDoVoo);
	}
	
}
