package Heranca;

public class ObjetoAnimais {

	public static void main(String [] args) {
		
		Cachorro p1 = new Cachorro();
		Cavalo p2 = new Cavalo();
		Preguica p3 = new Preguica();
		
		
		p1.setNome("Bolota");
		p1.setIdade(11);
		p1.setSom("Auuuuuuuuuuuuu!!!");
		p1.status();
		p1.farejando();
		p1.naoDandoAPata();
		
		System.out.println();
		
		p2.setNome("Juan");
		p2.setIdade(24);
		p2.setSom("Irrirrirrirrirrirrinnn!!");
		p2.status();
		p2.atirandoArcos();
		p2.empinando();
		
		System.out.println();
		
		p2.setNome("Sid");
		p2.setIdade(60000000);
		p2.setSom("\n"+"A gente vai viver!!!!!!! \n"+"A gente vai morrer!!!!!!!!!");
		p2.status();
		p3.escalando();
		p3.dormindo();
	}
}
