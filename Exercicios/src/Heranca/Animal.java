package Heranca;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private boolean correr=true;
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public boolean isCorrer() {
		return correr;
	}
	
	public void status()
	{
		System.out.println("Nome: "+getNome()+"\n"+"Idade: "+getIdade()+"\n"+"Som: "+getSom());
	}
	
}
