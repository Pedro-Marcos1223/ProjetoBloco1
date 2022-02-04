package Collections;

public class ExemploProfessor {

	private String titulo;
	private int tempo;
	
	public ExemploProfessor(String x, int y) {
		this.titulo=x;
		this.tempo=y;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return "Titulo: "+this.titulo+", "+this.tempo+" min";
	}
	
}
