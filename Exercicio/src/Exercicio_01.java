import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Numero1;
		int Numero2;
		
		System.out.println("Digite o 1° número");
		Numero1 = scan.nextInt();
		
		System.out.println("Digite o 2° número");
		Numero2 = scan.nextInt();
		scan.close();
		
		System.out.println("SOMA = "+ (Numero1 + Numero2));
		
	}
}
