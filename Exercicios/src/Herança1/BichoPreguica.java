package Herança1;

public class BichoPreguica extends Animal {

	@Override
	public void correndo() {
		System.out.println(getNome()+" *está subindo a arvore lentamente...*");
	}
	
	public void emitirSom() {
		System.out.println("NOS VAMOS VIVER!!!!!!!!!!!"
				+"\n"+"NOS VAMOR MORRER!!!!!!!!!");
	}
	
	public void dormindo() {
		System.out.println(getNome()+" *está dormindo em um galho alto*");
	}
}
