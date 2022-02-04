package Herança1;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Com licença senhor, aceitaria uma xícara de chá??"
				+ " *Diz "+getNome()+"*");
	}
	
	public void dormindo() {
		System.out.println(getNome()+" *Está dormindo em pé* Zzzzzzzzzzz...");
	}
	
	public void correndo() {
		System.out.println("*Pocoto pocoto pocoto pocoto pocoto...*");
	}
}
