package Herança1;

public class Principal {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Bolota");
		cachorro.setIdade(11);
		cachorro.setPeso(12.0);
		cachorro.status();
		cachorro.darAPata();
		cachorro.emitirSom();
		cachorro.dormindo();
		
		System.out.println();
		
		Cavalo cavalo = new Cavalo();
		
		cavalo.setNome("Bojack");
		cavalo.setIdade(27);
		cavalo.setPeso(200.0);
		cavalo.status();
		cavalo.emitirSom();
		cavalo.correndo();
		cavalo.dormindo();
		
		System.out.println();
		
		BichoPreguica preguica = new BichoPreguica ();
		
		preguica.setNome("Sid");
		preguica.setIdade(60000000);
		preguica.setPeso(70.0);
		preguica.status();
		preguica.emitirSom();
		preguica.correndo();
		preguica.dormindo();
	}

}
