package orientacaoObjeto;

public class Exercicio4Modulo {

	String nome; 
	String codigoDeFuncionario;
	double salario;
	int horasTrabalhadas;
	
	public Exercicio4Modulo()
	{
		this.nome="Jo�o";
		this.codigoDeFuncionario="197-22";
		this.salario=3000.0;
		this.horasTrabalhadas=160;
	}
	
	public void informarNome() {
		System.out.println("O nome do funcionario �: "+nome);
	}
	
	public void informarCodigoDeFuncionario() {
		System.out.println("O codigo de funcionario �: "+codigoDeFuncionario);
	}
	
	public void informarSalario() {
		System.out.println("O salario do funcionario �: "+salario);
	}
	
	public void informarHorasTrabalhadas() {
		System.out.println("As horas trabalhadas por mes desse funcionario s�o: "+horasTrabalhadas);
	}
	
	
	
	
	
}
