/*
 * Dado un nº de segundos, convertir a hora en el formato HH:MM:SS
 * Ejemplo 4521 s -->  01:15:21
 * No se puede poner 1:15:21 siempre dos cifras para horas, minutos y segundos
 */


public class FormateadorHora {
	
	public static void main (String[] args) {
		
		if (args.length < 1) {
			System.out.println("Falta el argumento");
			return;
		}
		String sValorAFormatear = args[0];
		int    iValorAFormatear = Integer.parseInt(sValorAFormatear); 
		if (iValorAFormatear < 0) {
			System.out.printf("El valor %d no se puede formatear%n", iValorAFormatear);
			return;
		}
		int horas, minutos, segundos, resto;
		horas = iValorAFormatear / 3600;
		resto = iValorAFormatear % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		String sHoras = horas < 10 ? "0" + horas : "" +  horas   ;
		
		String sMinutos = "";
		if (minutos < 10) 
			sMinutos = "0" + minutos;
		else
			sMinutos = "" + minutos;
			
		String sSegundos = "" + segundos;
		if (segundos < 10)
			sSegundos = "0" + segundos;
		
		//System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		System.out.printf("%s:%s:%s%n", sHoras, sMinutos, sSegundos);
		
	}
}

