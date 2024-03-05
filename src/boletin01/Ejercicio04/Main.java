package boletin01.Ejercicio04;

public class Main {

	public static void main(String[] args) {
		
		Articulo art = new Articulo("Jamón", 30, 12);
		
		System.out.println(art.informacion());
		System.out.println("PVP: " + art.getPVP() + " €");
		System.out.println("PVP con descuento: " + art.getPVPDescuento(50) + " €");
		System.out.println(art.vender(45));
		// Aqui comprobaría que no se puedan almacenar cantidades negativas
		art.almacenar(12);
		System.out.println(art.informacion());
	}
	
}
