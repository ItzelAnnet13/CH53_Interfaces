
public class Trapecio implements FigurasGeometricas{
	private String nombre;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseM;
	private double baseMay;
	private double alturaTra;
	
	//constructor
	public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double baseM, double baseMay,
			double alturaTra) {
		super();
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseM = baseM;
		this.baseMay = baseMay;
		this.alturaTra = alturaTra;
	}
	
	
	//perimetro trapecio
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getLado3() + getLado4());
	}
	//area trapecio
	public double calcularArea() {
		return (getAlturaTra() * (getBaseMay() + getBaseM()))/2;
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getBaseM() {
		return baseM;
	}

	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}

	public double getBaseMay() {
		return baseMay;
	}

	public void setBaseMay(double baseMay) {
		this.baseMay = baseMay;
	}

	public double getAlturaTra() {
		return alturaTra;
	}

	public void setAlturaTra(double alturaTra) {
		this.alturaTra = alturaTra;
	}


	
	//toString
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseM=" + baseM + ", baseMay=" + baseMay + ", alturaTra=" + alturaTra + "]";
	}
	
	
	
}
