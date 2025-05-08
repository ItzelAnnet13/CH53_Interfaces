
public class Triangulo implements FigurasGeometricas{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
	//Constructor
	public Triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return (getBase() * getAltura())/2;
	}//calcular area
	
	public double calcularPerimetro() {
		return (getLado() * 3);
	}//calcular perimetro
	
	

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

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}

	
}
