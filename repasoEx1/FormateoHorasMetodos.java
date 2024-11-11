import java.util.Scanner;
/**
 * <p>Clase para formatear horas como un cronómetro</p>
 * <p>Igual que el ejercicio anterior, pero usando Scanner y métodos</p>
 * <p>Un método para solicitar el valor</p>
 * <p>Un método para formatearEnDosDígitos</p>
 * <p>Un método para mostrar en consola con el formato HH:MM:SS</p>
 * @author Manuel Molino
 * @version 1.1
 */
public class FormateoHorasMetodos {
	
	private FormateoHorasMetodos() {}
	
	public static void main (String[] args) {
		int valor  = solicitarValor();
		System.out.printf("Formateando %d segundos....\n", valor);
		int horas = valor / 3600;
		int resto = valor % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		String sHoras    = formatearEnDosDígitos(horas);
		String sMinutos  = formatearEnDosDígitos(minutos);
		String sSegundos = formatearEnDosDígitos(segundos);
		mostrarFechaEnConsola(sHoras, sMinutos, sSegundos);
	}
	/**
	 * Método que muestra en consola los datos
	 * @param sHoras son las horas con dos dígitos
	 * @param sMinutos son los mintuos con dos dígitos
	 * @param sSegundos son los segundos con dos dígitos 
	 */
	public static void mostrarFechaEnConsola(String sHoras, String sMinutos, String sSegundos) {
		System.out.printf("%s:%s:%s%n", sHoras, sMinutos, sSegundos);
	}
	/**
	 * <p>Método que formatea los dígitos en dos cifras</p>
	 * <p>Si nos llega 2 devuelve 02</p>
	 * <p>Si nos llega 20 devuelve 20</p>
	 * @param valor el valor a digital
	 * @return el valor formateado en dos dígitos.
	 */ 
	public static String formatearEnDosDígitos(int valor) {
		String sValor = valor < 10 ? "0" + valor : "" +  valor;
		return sValor;
	}
	
	/**
	 * Método que solicita un número entero
	 * <p>Si es negativo se vuelve a solicitar</p>
	 * @return el valor entero leído en consola
	 */
	public static int solicitarValor() {
		Scanner sc = new Scanner(System.in);
		int valor = -1;
		do {
			System.out.println("Introduce los segundos a formatear:");
			valor = sc.nextInt();
		} while (valor < 0);
		
		sc.close();
		return valor;
	}
}

