package orientacaoObjeto;

public class Exercicio7Modulo {

	private String nomeDoPaciente;
	private int idade; 
	private String condicao; 
	private double valorDaConsulta;
	private double valorDaCirurgia;
	private String nomeDoMedico;
	
	public Exercicio7Modulo ()
	{
		this.nomeDoPaciente="Joãozinho";
		this.nomeDoMedico="Marcos Pedro";
		this.idade=19;
		this.valorDaConsulta=300.0;
		this.valorDaCirurgia=3000.0;
		this.condicao="Miopia Degenerativa.";

	}
	
	public void informarNomeMedico()
	{
		System.out.println("O nome do medico é: "+nomeDoMedico);
	}
	
	public void informarNomePaciente()
	{
		System.out.println("O nome do paciente é: "+nomeDoPaciente);
	}
	
	public void informarIdade()
	{
		System.out.println("A idade do paciente é: "+idade);
	}
	
	public void informarCondicao()
	{
		System.out.println("A condição do paciente é: "+condicao);
	}
	
	public void informarValorConsulta()
	{
		System.out.println("O valor da consulta é de: "+valorDaConsulta);
	}
	
	public void informarValorCirugia()
	{
		System.out.println("O valor da cirurgia é de: "+valorDaCirurgia);
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
	
	
}
