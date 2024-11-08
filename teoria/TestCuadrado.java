
public class TestCuadrado {
	
	public static void main (String[] args) {
		//creamos un cuadrado usando el constructor por defecto (5)
		Cuadrado cuadrado1 = new Cuadrado();
		//mostramos el valor del lado
		System.out.printf("Lado del cuadrado %d\n", cuadrado1.getLado());
		//cambiamos el lado para que sea el doble del actual ( 2 * ...)
		cuadrado1.setLado(cuadrado1.getLado() * 2);
		//mostramos el valor del lado
		System.out.printf("Lado del cuadrado %d\n", cuadrado1.getLado());
		System.out.printf("Área del cuadrado %d y perímetro %d\n",
					cuadrado1.getArea(), cuadrado1.getPerimetro());

		System.out.println("============================");
		//creamos un cuadrado usando el constructor y el lado va a ser 10
		Cuadrado cuadrado2 = new Cuadrado(10);
		//mostramos el valor del lado
		System.out.printf("Lado del cuadrado %d\n", cuadrado2.getLado());
		//cambiamos el lado para que sea el doble del actual ( 2 * ...)
		cuadrado2.setLado(cuadrado2.getLado() * 2);
		//mostramos el valor del lado
		System.out.printf("Lado del cuadrado %d\n", cuadrado2.getLado());
		System.out.printf("Área del cuadrado %d y perímetro %d\n",
					cuadrado2.getArea(), cuadrado2.getPerimetro());
		System.out.println("============================");
		Cuadrado cuadrado = new Cuadrado(3);
		System.out.println(cuadrado.toString());
		System.out.println(cuadrado); //es lo mismo, va a buscar un método toString()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

