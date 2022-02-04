package Heranca;

public class Cavalo extends Animal {

	private boolean empinar=true;
	private String atirarComArco;
	
	public void empinando()
	{
		this.empinar=true;
		System.out.println("Irrirrirrirririi!! *Seu cavalo esta empinando para arrancar* ");
	}
	
	public void naoEmpinando()
	{
		this.empinar=false;
		System.out.println("*Seu cavalo esta parado comendo grama...*");
	}
	
	public void atirandoArcos()
	{
		System.out.println("*Seu cavalo deixa pronto duas flechas no arco para atirar no alvo...*");
	}
	
}
