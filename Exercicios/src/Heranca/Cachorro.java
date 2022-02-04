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
		System.out.println("Voc� pede para ele te dar a pata. Ele balan�a o rabo, e da a pata para voc�.");
	}
	
	public void naoDandoAPata()
	{
		this.daPata=false;
		System.out.println("Voc� pede a patinha, porem ele n�o entende. Ele esta te olhando com cara de confuso");
	}

	public boolean isFarejar() {
		return farejar;
	}

	public boolean isDaPata() {
		return daPata;
	}
	
	
}
