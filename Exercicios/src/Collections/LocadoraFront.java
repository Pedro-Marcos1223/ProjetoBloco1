package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class LocadoraFront {

	public static void main(String[] args) {

		LocadoraBack  filme1 = new LocadoraBack("Sherek 5", 25.0);
		LocadoraBack  filme2 = new LocadoraBack("Barbie 2", 12.0);
		LocadoraBack  filme3 = new LocadoraBack("Meu Malvado Favorito", 9.0);
		LocadoraBack  filme4 = new LocadoraBack("Hora de Aventura Obsidian", 20.0);
		LocadoraBack  filme5 = new LocadoraBack("Koe no Katachi ", 25.0);
		LocadoraBack  filme6 = new LocadoraBack("Kimetsu no Yaiba mugen ressha-hen", 35.0);
		LocadoraBack  filme7 = new LocadoraBack("Harry potter e o Enigma do Principe", 20.0);
		LocadoraBack  filme8 = new LocadoraBack("Veloses e Furiosos desafio em Tokyo", 30.0);
		LocadoraBack  filme9 = new LocadoraBack("Aranha-Verso", 40.0);

		ArrayList<LocadoraBack> conteudo = new ArrayList<>();
		
		conteudo.add(filme1);
		conteudo.add(filme2);
		conteudo.add(filme3);
		conteudo.add(filme4);
		
		
		System.out.println("Quantidade de filmes em catalogo: "+ conteudo.size());
		System.out.println("Filmes para alugar: \n"+conteudo);
		System.out.println("-----------------------------------------------------------------");
		conteudo.remove(1);
		conteudo.remove(2);
		
		conteudo.add(filme5);
		conteudo.add(filme6);
		conteudo.add(filme7);
		conteudo.add(filme8);
		conteudo.add(filme9);
		
		System.out.println();
		System.out.println("Quantidade de filmes em catalogo: "+ conteudo.size());
		System.out.println("Lista atualizada de filmes para alugar: \n"+conteudo);
		System.out.println();
		System.out.println("Filmes removidos: \n"+filme2+filme4);
		System.out.println("-----------------------------------------------------------------");
	}

}
