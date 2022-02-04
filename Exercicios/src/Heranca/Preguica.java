package Heranca;

public class Preguica extends Animal{

	private boolean dorme=true;
	private String escalar;
	
	
	public void dormindo()
	{
		this.dorme=true;
		System.out.println("*Dormindo* Zzzzzzzzzzzzz!!!");
	}
	
	public void naoDormindo()
	{
		this.dorme=false;
		System.out.println("*Ele está acordado...*");
	}
	
	public void escalando()
	{
		System.out.println("Escalando a arvore....................................");
	}
}
