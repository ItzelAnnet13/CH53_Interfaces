
public class Rectangulo implements FigurasGeometricas{
	private String nombre;
	private double base;
	private double altura;
	
	//constructor
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	

	//perimetro
	public double calcularPerimetro() {
		return ((2*getBase()) + (2*getAltura()));
	}	
	//area
	public double calcularArea() {
		return (getBase() * getAltura());
	}

	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	//toString
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}

	
	
	
}
