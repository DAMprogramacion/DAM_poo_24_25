
public class Circulo {
	
	//atributos
	private int radio;
	
	//métodos
	//getters
	public int getRadio(){
		return radio;
	}
	//setters
	/*public void setRadio(int r) {
		radio = r;
	}*/
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	//método que devuelva el área del círculo: PI x radio²
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	//método que devuelva el perímetro del círculo: 2 x PI x radio
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	
	
	
	
	
	
	
}
