
public class Cuadrado implements FigurasGeometricas{
	private String nombre;
	private double lado;

	//constructor
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	
	//perimetro
	public double calcularPerimetro() {
		return (getLado() * 4);
	}
	//area
	public double calcularArea(){
		return (getLado() * getLado());
	}

	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	
	//toString
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}

	
}
