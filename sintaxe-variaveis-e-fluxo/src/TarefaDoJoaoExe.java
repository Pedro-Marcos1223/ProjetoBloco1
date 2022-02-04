
public class TarefaDoJoaoExe {

	public static void main(String[] args) {

		double salario = 3500.0;
		

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A dedução de valor de Ir é de $142,00 ");
		} else if (salario >= 2800.0 && salario <= 3751.0) {
			System.out.println("A dedução de valor de Ir é de $350,00 ");
		} else if  (salario >= 3751.0 && salario <= 4664.0) {
			System.out.println("A dedução de valor de Ir é de $636,00");
		}

		System.out.println(salario);

	}

}
