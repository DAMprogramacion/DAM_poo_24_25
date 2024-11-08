
public record Persona (String nombre, int edad) {
	
	//método que devuelva un boolean si es mayor o menor de edad
	public boolean esMayorEdad() {
		return edad >= 18;
	}	
	@Override
	public String toString() {
		return String.format("%s,%d", nombre, edad);
	}
}

/*public class Persona {
	private String nombre;
	private int edad;
	........
	constructor o constructores
	public Person(String nombre, int edad) {
		this.nombre = nombre;
		this.edad   = edad;
	}
	getters
	......
	public int getEdad() {
		return edad;
	}
	no ponemos setters porque son inmutabñes
	toString
*/
