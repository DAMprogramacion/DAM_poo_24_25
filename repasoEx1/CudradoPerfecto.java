/*
 * Generar números aleatorios
 * Hasta que sean tres cuadrados perfectos
 * 2 no es perfecto porque su raíz no es entera
 * 3 tampoco
 * 4 si, su raíz es 2
 * 5 tampoco
 * ......
 * 9 si, su raíz es 3
 */


public class CudradoPerfecto {
	
	public static void main (String[] args) {
		int contador = 0;
		do{
			int aleatorio = (int) (Math.random() * 100) + 1;
			if (esCuadradoPerfecto(aleatorio)) { 
				System.out.println(aleatorio);
				dibujar(aleatorio);
				contador++;
			}
		} while (contador < 5);
	}
	
	public static void dibujar(int numero) {
		int lineas = (int) Math.sqrt(numero);
		for (int i = 1 ; i <= numero; i++) {
			System.out.print("*");
			if (i % lineas == 0)
				System.out.println();
		}
	}
	
	public static boolean esCuadradoPerfecto(int numero) {
		
		double raiz  = Math.sqrt(numero); //ejemplo 
		int truncado = (int) raiz;
		return truncado == raiz;
	}
	
	
	
}

