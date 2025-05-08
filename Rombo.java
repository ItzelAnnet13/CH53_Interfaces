
public class Rombo implements FigurasGeometricas{
	private String nombre;
	private double ladoRombo;
	private double diagonalMenor;
	private double diagonalMayor;
	
	//constructor
	public Rombo(String nombre, double ladoRombo, double diagonalMenor, double diagonalMayor) {
		super();
		this.nombre = nombre;
		this.ladoRombo = ladoRombo;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	
	
	
	//perimetro
	public double calcularPerimetro() {
		return (4 * getLadoRombo());
	}
	//area
	public double calcularArea() {
		return (getDiagonalMayor() * getDiagonalMenor())/2;
	}

	
	//getteras and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLadoRombo() {
		return ladoRombo;
	}

	public void setLadoRombo(double ladoRombo) {
		this.ladoRombo = ladoRombo;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}



	//toString
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", ladoRombo=" + ladoRombo + ", diagonalMenor=" + diagonalMenor
				+ ", diagonalMayor=" + diagonalMayor + "]";
	}


	
}
