/**
 *<p>Clase que define objetos Rectangulo</p>
 *<p>Esos objetos tienen dos atributos que son la altura y la base
 *ambos definen un rectángulo, y los tipos son float</p>
 *@author Manuel Molino
 *@version 1.0 
 */
public class Rectangulo {
	
	private float altura;
	private float base;
	
	/**
	 * Getter para el atributo altura
	 * @return devuelve el valor del atributo altura
	 */ 
	public float getAltura() {
		return altura;
	}
	
	/**
	 * Getter para el atributo base
	 * @return devuelve el valor del atributo base
	 */ 
	public float getBase() {
		return base;
	}
	
	/**
	 * Setter para cambiar el valor del atributo altura
	 * @param altura establece el nuevo valor de la altura
	 */ 
	public void setAltura(float altura){
		this.altura = altura;
	}
	
	/**
	 * Setter para cambiar el valor del atributo base
	 * @param base establece el nuevo valor de la base
	 */
	public void setBase(float base){
		this.base = base;
	}
	
	/**
	 * Método que nos calcula el valor del área de un rectángulo
	 * @return devuelve el valor de la superfice del rectángulo
	 */
	public float getArea() {
		return base * altura;
	}
	
	/**
	 * Método que nos calcula el valor del perímetro de un rectángulo
	 * @return devuelve el valor del perímetro del rectángulo
	 */
	public float getPerimetro() {
		return base * 2 + altura * 2;
	}
	
	
	
	
}

