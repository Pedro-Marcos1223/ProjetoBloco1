package Heran�a1;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Com licen�a senhor, aceitaria uma x�cara de ch�??"
				+ " *Diz "+getNome()+"*");
	}
	
	public void dormindo() {
		System.out.println(getNome()+" *Est� dormindo em p�* Zzzzzzzzzzz...");
	}
	
	public void correndo() {
		System.out.println("*Pocoto pocoto pocoto pocoto pocoto...*");
	}
}
