package orientacaoObjeto;

public class Exercicio3Modulo {

	String produto;
	double valor;
	String fichaTecnica;
	boolean ligado= true;
	
	public Exercicio3Modulo()
	{
		this.produto="JBL-8000";
		this.valor=1500.0;
		this.fichaTecnica="Audio Bpm +3000";
		this.ligado=true;
	}
	public void informarProduto()
	{
		System.out.println("O produto é: "+produto);
	}
	
	public void informarValor()
	{
		System.out.println("O valor do produto é: "+valor);
	}
	
	public void informarFichaTecnica()
	{
		System.out.println("FICHA TECNICA: "+"\n"+fichaTecnica);
	}
	
	public void ligadando()
	{
		this.ligado=true;
		System.out.println("LIGANDO... \r\n"+" Então viaja de avião, mó' princesa, mó' pressão\r\n"
				+ "Só vapo, vapo do malvadão, oh\r\n"
				+ "Ela joga beijo, faz carão, de quatro, de quatro, que tesão\r\n"
				+ "Vai com calma, meu coração, oh");
	}
	
	public void desligando()
	{
		this.ligado=false;
		System.out.println("Desligando...");
	}
	
	
}
