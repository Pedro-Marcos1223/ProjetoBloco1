package introducao;

import java.util.Locale;
import java.util.Scanner;

public class exerciciosNelio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double area, raio;
	
		System.out.println("Digite aqui quanto vale o raio do seu circulo: ");
		raio=leia.nextDouble();
		area=3.14159*Math.pow(raio, 2);
		
		System.out.println("O valor da area é de "+area);
		
		leia.close();
	}
}
