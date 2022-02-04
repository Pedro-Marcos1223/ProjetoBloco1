package Quizz;

//A classe pergunta armazena as informações referentes a uma pergunta

public class Pergunta {
	
	private String pergunta;
	private String alternativas [] = new String [4];
	private int alternativaCorreta;
	
	public void setAlternativas(String alternativa1, String alternativa2, String alternativa3, String alternativa4){
		alternativas [0] = alternativa1;
		alternativas [1] = alternativa2;
		alternativas [2] = alternativa3;
		alternativas [3] = alternativa4;
	}
	
	public String [] getAlternativas() {
		
		return alternativas;
	}
	
	public int getAlternativaCorreta() {
		return alternativaCorreta;
	}



	public void setAlternativaCorreta(int alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}



	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
}
