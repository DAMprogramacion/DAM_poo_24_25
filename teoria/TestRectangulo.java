import java.util.Scanner;

public class TestRectangulo {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangulo rectangulo = new Rectangulo();
		
		System.out.println("Dame la altura del rectángulo:");
		float altura = sc.nextFloat();
		rectangulo.setAltura(altura);
		
		System.out.println("Dame la base del rectángulo:");
		float base = sc.nextFloat();
		rectangulo.setBase(base);
		
		System.out.printf("Rectángulo de altura %.2f y base %.2f%n", 
							rectangulo.getAltura(), rectangulo.getBase());
		System.out.printf("Rectángulo de área %.2f y perímetro %.2f%n",
							rectangulo.getArea(), rectangulo.getPerimetro());
	}
}

