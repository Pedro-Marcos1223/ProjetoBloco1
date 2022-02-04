package Heranca;

public class Cachorro extends Animal{

	private boolean farejar=true;
	private boolean daPata=true;
	
	
	public void farejando()
	{
		this.farejar=true;
		System.out.println("Farejando... Snif.. Snif...");
	}

	public void naoFarejando()
	{
		this.farejar=false;
		System.out.println(farejar);
	}
	
	public void dandoAPata()
	{
		this.daPata=true;
		System.out.println("Você pede para ele te dar a pata. Ele balança o rabo, e da a pata para você.");
	}
	
	public void naoDandoAPata()
	{
		this.daPata=false;
		System.out.println("Você pede a patinha, porem ele não entende. Ele esta te olhando com cara de confuso");
	}

	public boolean isFarejar() {
		return farejar;
	}

	public boolean isDaPata() {
		return daPata;
	}
	
	
}
