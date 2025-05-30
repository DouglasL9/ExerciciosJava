import java.util.Locale;

public class Tipos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int y = 32;
		double x = 64.64;
		double z = 3.1434;
		
		System.out.println("'Y' vale: "+ y);
		System.out.println("'X' vale: "+ x);
		System.out.printf("'Z' vale: %.2f%n", z);
		System.out.println("Olá Mundo!");
	}

}
