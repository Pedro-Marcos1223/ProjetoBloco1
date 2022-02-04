package orientacaoObjeto;

public class Exercicio6Modulo {

	
	String titularConta;
	double saldo;
	String numeroConta; 
	String chavePix;
	boolean saldoEsgotado= true;
	
	public Exercicio6Modulo ()
	{
		this.titularConta="Pedro Pedro P P Pedro";
		this.saldo= 0.0;
		this.numeroConta="1774-066";
		this.chavePix="11 94108-5138";
	}
	
	public void informarTitular()
	{
		System.out.println("O Titular da conta é: "+titularConta);
	}
	
	public void informarSaldo()
	{
		System.out.println("O saldo atual da conta é de: "+saldo);
	}
	
	public void informarNumeroConta()
	{
		System.out.println("O numero da conta é de: "+numeroConta);
	}
	
	public void informarChavePix()
	{
		System.out.println("A chave pix ativada nessa conta é o celular: "+chavePix);
	}
	
	public void informarSaldot()
	{
		if(saldo<=0.0) {
			this.saldoEsgotado=true;
			System.out.println("Saldo esgotado? "+saldoEsgotado);
		} else {
			this.saldoEsgotado=false;
			System.out.println("Saldo esgotado? "+saldoEsgotado);
		}
	}
	
	
	
	
	
	
}
