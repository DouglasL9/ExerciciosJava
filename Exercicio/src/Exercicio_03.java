import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A, B, C, D;
		int DiferencaProduto;
		
		System.out.print("Digite o 1° valor: ");
		A = scan.nextInt();
		System.out.print("Digite o 2° valor: ");
		B = scan.nextInt();
		System.out.print("Digite o 3° valor: ");
		C = scan.nextInt();
		System.out.print("Digite o 4° valor: ");
		D = scan.nextInt();
		scan.close();
		
		DiferencaProduto = (A*B - C*D);
		
		System.out.println("DIFERENÇA = "+ DiferencaProduto);
	}
}
