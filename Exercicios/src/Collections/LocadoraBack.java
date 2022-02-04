package Collections;

public class LocadoraBack {

	private String filme;
	private double preco;
	
	public LocadoraBack(String x, double y) {
		this.filme=x;
		this.preco=y;
	}
	

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Filme: "+this.filme+" Preço: "+this.preco+"\n";
	}

}
