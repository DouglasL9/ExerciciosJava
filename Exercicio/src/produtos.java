import java.util.Locale;
import java.util.Scanner;

public class produtos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String x;
		x = scan.next();
//		x = scan.next(); recebe uma string
//		scan.nextInt(); recebe numero inteiro
//		scan.nextDouble(); recebe numero com ponto flutuante
		
		System.out.println("Você digitou: " + x);
		scan.close();
		
//		String product1 = "Computer";
//		String product2 = "Office Desck";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		System.out.println("Products:");
//		System.out.printf("%s, which price is $%.2f%n", product1, price1);
//		System.out.printf("%s, Which price is $%.2f%n%n", product2, price2);
//		System.out.printf("Record: %d years old, code: %d and gender: %s%n%n", age, code, gender);
//		System.out.printf("Measure with eight decimal places: %f%n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
//		System.out.printf("US decimal point: %.3f", measure);
	}

}
