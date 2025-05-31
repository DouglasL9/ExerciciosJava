import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int CodigoPeca1, QuantidadePecas1, CodigoPeca2, QuantidadePecas2;
		double ValorUnitario1, ValorUnitario2, ValorFinal;
		
		System.out.println("Código da 1° peça: ");
		CodigoPeca1 = scan.nextInt();
		
		System.out.println("Quantidade da 1° peça: ");
		QuantidadePecas1 = scan.nextInt();
		
		System.out.println("Valor unitario da 1° peça");
		ValorUnitario1 = scan.nextDouble();
		
		System.out.println("Código da 2° Peça: ");
		CodigoPeca2 = scan.nextInt();

		System.out.println("Quantidade da 2° Peça: ");
		QuantidadePecas2 = scan.nextInt();
		
		System.out.println("Valor unitario da 2° peça");
		ValorUnitario2 = scan.nextDouble();
		scan.close();
		
		ValorFinal = (QuantidadePecas1 * ValorUnitario1) + (QuantidadePecas2 * ValorUnitario2);
		
		System.out.printf("Valor a pagar: R$ %.2f", ValorFinal);
	}
}
