package Collections;

import java.util.ArrayList;


public class ExemploProfessorPrincipal {

	public static void main(String[] args) {

		ExemploProfessor aula1 = new ExemploProfessor("Ben10", 20);
		ExemploProfessor aula2 = new ExemploProfessor("One piece ", 20);
		ExemploProfessor aula3 = new ExemploProfessor("No way home", 160);
		
		ArrayList<ExemploProfessor> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
	}

}
