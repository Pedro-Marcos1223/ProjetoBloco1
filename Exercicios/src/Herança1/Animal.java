package Herança1;

public class Animal {

	private String nome;
	private int idade;
	private double peso;
	private String som;
	private String dormir;
	private String correr;
	
	
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void status() {
		System.out.println("Nome: "+getNome()+"\n"+"Idade: "+getIdade()+"\n"+"Peso: "+getPeso()+"Kg");
	}
	public void emitirSom() {
		System.out.println("Som generico");
	}
	public void dormindo() {
		System.out.println("Dormindo...");
	}

	public void correndo() {
		System.out.println("corrida generica");
	}
	
	
	
	
}
