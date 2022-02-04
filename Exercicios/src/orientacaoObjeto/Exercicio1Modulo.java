package orientacaoObjeto;

public class Exercicio1Modulo {

	//Cliente
	
	String nome;
	String email;
	String cpf; 
	String rg;
	
	public Exercicio1Modulo()
	{
		this.nome="Pedro";
		this.email="pedrinhogamer22@hotmail.com";
		this.cpf="122.122.122-12";
		this.rg="12-122.122-2";
	}
	
	public void informarNome()
	{
		System.out.println("Digite seu nome: "+nome);
	}
	
	public void informarEmail()
	{
		System.out.println("Digite seu email: "+email);
	}
	
	public void informarCpf()
	{
		System.out.println("Digite seu cpf: "+cpf);
	}
	
	public void informarRg()
	{
		System.out.println("Digite seu Rg: "+rg);
	}
		
}
