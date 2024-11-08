
public class TestPersona {
	
	public static void main (String[] args) {
		Persona persona1 = new Persona("joaquin medina", 45);
		//Persona persona2 = new Persona(31, "joaquina medina"); orden de parámetros incorrecto
		/*System.out.printf("%S: %d años%n", persona1.getNombre(), 
			persona1.getEdad()); no funciona, los getter son nombre() y edad() */
		/*System.out.printf("%S: %d años%n",
		    persona1.nombre, persona1.edad); nombre y edad son atributos, nombre() y edad() son los getters*/
		System.out.printf("%S: %d años%n", persona1.nombre(), persona1.edad());
		System.out.println(persona1);
		System.out.printf("%s ¿es mayor de edad? %B%n", 
			persona1.nombre(), persona1.esMayorEdad());

	}
}

