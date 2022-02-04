package Quizz;

//Quizz gerencia as perguntas

public class Quizz {

	private int contador=0;
	
	private Pergunta perguntas [] = new Pergunta [2]; //Aqui que eu mudo a quantidade de perguntas do quizz
	private int respostas [] = new int  [2];
	
	public void adicionarPergunta(String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, int alternativaCorreta) {
		Pergunta perg = new Pergunta ();
		perg.setPergunta(pergunta);
		perg.setAlternativas(alternativa1, alternativa2, alternativa3, alternativa4);
		perg.setAlternativaCorreta(alternativaCorreta);
		
		perguntas[contador]=perg; 
		contador++;
	}
	
	public void exibirUltimaPergunta() {
		System.out.println(perguntas[perguntas.length-1].getPergunta());
		
	}
	
	public void listarPerguntas() {
		for(int x=0; x<perguntas.length;x++) {
			System.out.println(perguntas[x].getPergunta());
			
			String [] alternativas = perguntas[x].getAlternativas();
			for (int i = 0; i < alternativas.length; i++) {
				System.out.println(alternativas[i]);
			}
			System.out.println("\n");
		}
	}
	
}
