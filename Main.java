
public class Main {

	public static void main(String[] args) {
//		Triangulo t1 = new Triangulo("Equilatero", 20, 10, 15);	
//		Triangulo t = new Triangulo("Triangulo T", 200, 100, 250);
		
		FigurasGeometricas[] figuras = {
				new Triangulo("Triangulo Equilatero", 200, 100, 250),
				new Cuadrado("Cuadrado", 55),
				new Rectangulo("Rectangulo", 155, 100),
				new Rombo ("Rombo", 67, 39, 28),
				new Romboide ("Romboide", 354, 75),
				new Trapecio ("Trapecio", 60, 46, 80, 46, 23, 12, 30)
		};
		
//		Main.imprimirCalculos(figuras);
		for (FigurasGeometricas figura : figuras) {
            imprimirCalculos(figura); 
        }
		
	}//main
	
	public static void imprimirCalculos(FigurasGeometricas figuras) {
	    System.out.println(figuras);
	    System.out.println("+------------------------------");
	    System.out.println("| El área del [" + figuras.getNombre() + "]");
	    System.out.println("| es " + figuras.calcularArea());
	    System.out.println("| El perímetro de [" + figuras.getNombre() + "]");
	    System.out.println("| es " + figuras.calcularPerimetro());
	    System.out.println("+-------------------------------");
	}

}
