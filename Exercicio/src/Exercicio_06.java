import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159, AreaTriangulo, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo;
		
		System.out.println("Insira o valror de 'A'");
		A = scan.nextDouble();
		System.out.println("Insira o valror de 'B'");
		B = scan.nextDouble();
		System.out.println("Insira o valror de 'C'");
		C = scan.nextDouble();
		scan.close();
		
		AreaTriangulo = (A * C) / 2;
		AreaCirculo = pi * Math.pow(C, 2);
		AreaTrapezio = ((A+B) * C )/ 2;
		AreaQuadrado = Math.pow(B, 2);
		AreaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", AreaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", AreaRetangulo);
	}

}
