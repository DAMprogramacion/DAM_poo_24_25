//documentamos
/**
 * <p>Clase cuadrado, para trabajar la figura geométrica cuadrado</p>
 * <p>Proveé de dos constructores, uno por defecto que inicializa el lado a un valor de 5
 * y otro que inicializa el valor del lado</p>
 * <p>También tenemos los correspondientes getters y setters</p>
 * <p>Hay dos métodos, uno para calcular el área y otro para el perímetro</p>
 * @author Manuel Molino
 * @version 1.0
 */ 
public class Cuadrado {
	//atributo lado que se inicializa a 5
	private int lado = 5;
	//constructor por defecto -no tiene parámetros ni cuerpo-
	/**
	 * Constructor por defecto
	 */ 
	public Cuadrado () {}
	
	//constructor que inicialice el lado
	/**
	 * Constructor inicializa el lado del cuadrado
	 * @param lado valor del lado del cuadrado
	 */ 
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	
	//getters y setters
	/**
	 * Getter para obtener el valor del lado
	 * @return devuelve el valor del lado
	 */ 
	public int getLado() {
		return lado;
	}
	
	/**
	 * Setter para cambiar el valor del lado
	 * @param lado nuevo valor del lado
	 */ 
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	//método que nos devuelva el área
	/**
	 * Método que calcula el área de un cuadrado: lado²
	 * @return la superficie del cuadrado
	 */ 
	public int getArea() {
		return lado * lado;
	}
	
	//método que nos devuelva el perímetro
	/**
	 * <p>Método que devuelve el perímetro del cuadrado:</p> 
	 * <p>lado + lado + lado + lado</p>
	 * @return la longitud del perímetro del cuadrado
	 */ 
	public int getPerimetro() {
		return 4 * lado;
	}
	
	/**
	 * Método toString, sobreescrito de clase Object
	 * formato de salida:
	 * <p>Cuandrado de lado: <em>lado</em></p>
	 * <p>Área: <em>area</em></p>
	 * <p>Perímetro: <em>perimetro</em></p>
	 * @return la cadena como se ha indicado anteriormente
	 */ 	
	@Override
	public String toString() {
		/*return "Cuadrado de lado " + lado + '\n' 
				+ "Área: " + getArea() + '\n'
				+ "Perímetro: " + getPerimetro();*/
		return String.format("Cuadrado de lado: %d%nÁrea: %d%nPerímetro: %d", 
					lado, getArea(), getPerimetro());
	}
	
	
	
	
}

