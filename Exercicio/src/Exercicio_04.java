import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int NumeroFuncionario;
		double HorasTrabalhadas;
		double ValorHora;
		double salario;

		System.out.println("Número do Funcionário: ");
		NumeroFuncionario = scan.nextInt();

		System.out.println("Horas trabalhadas: ");
		HorasTrabalhadas = scan.nextDouble();

		System.out.println("Valor hora trabalhada: ");
		ValorHora = scan.nextDouble();
		scan.close();

		salario = (HorasTrabalhadas * ValorHora);

		System.out.println("Number = "+ NumeroFuncionario);
		System.out.printf("Salary = U$ %.2f", salario);
	}
}
