package Herança1;

public class Cachorro extends Animal {

	
	
	
	public void darAPata() {
		System.out.println("*Ele olha para você, balança o rabinho e te da a pata...*");
	}

	@Override 
	public void correndo() {
		System.out.println("Correndo sobre 4 patas ");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au au au au ");				
	}
	public void dormindo() {
		System.out.println(getNome()+" esta tirando um ronquinho...");
	}
}
