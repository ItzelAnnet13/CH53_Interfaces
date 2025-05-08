
public class Romboide implements FigurasGeometricas{
	private String nombre;
	private double baseRomboide;
	private double alturaRomboide;
	
	//constructor
	public Romboide(String nombre, double baseRomboide, double alturaRomboide) {
		super();
		this.nombre = nombre;
		this.baseRomboide = baseRomboide;
		this.alturaRomboide = alturaRomboide;
	}
	
	
	//perimetro romboide
	public double calcularPerimetro() {
		return ((2*getBaseRomboide()) + (2*getAlturaRomboide()));
	}
	// area
	public double calcularArea() {
		return (getBaseRomboide() * getAlturaRomboide());
	}
	

	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getBaseRomboide() {
		return baseRomboide;
	}


	public void setBaseRomboide(double baseRomboide) {
		this.baseRomboide = baseRomboide;
	}


	public double getAlturaRomboide() {
		return alturaRomboide;
	}


	public void setAlturaRomboide(double alturaRomboide) {
		this.alturaRomboide = alturaRomboide;
	}


	//toString
	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", baseRomboide=" + baseRomboide + ", alturaRomboide=" + alturaRomboide
				+ "]";
	}	
	
	
}
