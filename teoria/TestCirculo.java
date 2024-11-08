
public class TestCirculo {
	
	public static void main (String[] args) {
		
		Circulo circulo1 = new Circulo();
		System.out.printf("Circulo 1 de radio %d\n", circulo1.getRadio());
		circulo1.setRadio(8);
		System.out.printf("Circulo 1 de radio %d\n", circulo1.getRadio());
		System.out.printf("Circulo 1 de área %.2f\n", circulo1.getArea());
		System.out.printf("Circulo 1 de longitud %.2f\n", circulo1.getPerimetro());
		
		System.out.println("=======================");
		Circulo circulo2 = new Circulo();
		System.out.printf("Circulo 2 de radio %d\n", circulo2.getRadio());
		circulo2.setRadio(18);
		System.out.printf("Circulo 2 de radio %d\n", circulo2.getRadio());
		System.out.printf("Circulo 2 de área %.2f\n", circulo2.getArea());
		System.out.printf("Circulo 2 de longitud %.2f\n", circulo2.getPerimetro());


	}
}

