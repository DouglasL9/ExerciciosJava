import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double area;
		double pi = 3.14159;
		double raio = 0;
		
		System.out.println("Digite o raio do circulo");
		raio = scan.nextDouble();
		scan.close();

		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f",area);
		
	}
}
