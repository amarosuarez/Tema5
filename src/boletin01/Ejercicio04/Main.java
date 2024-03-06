package boletin01.Ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde se almacenará el nombre
		String nombre = "";
		
		// Variable donde se almacenará el precio
		double precio = 0.0;
		
		// Variable donde se almacenará la cantidad de stock
		int stock = 0;
		
		// Variable donde se almacenará el descuento
		int descuento = 0;
		
		// Variable donde se almacenará si el usuario quiere salir o no
		char escape;
		
		// Variable donde se almacenará la elección del usuario
		int eleccion = 0;
		
		// Variable donde se almacenará las unidades a vender o a almacenar
		int unidades = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le preguntamos el nombre y lo almacenamos
		System.out.println("¿Cuál es el nombre del artículo?");
		nombre = sc.nextLine();
		
		// Le preguntamos el precio y lo almacenamos
		System.out.println("¿Cuál es su precio?");
		precio = sc.nextDouble();
		
		// Le preguntamos el stock y lo almacenamos
		System.out.println("¿Cuántas unidades hay?");
		stock = sc.nextInt();
		
		// Creamos el objeto
		Articulo art = new Articulo(nombre, precio, stock);
		
		do {
			// Le preguntamos que desea hacer y lo almacenamos
			System.out.println(
					"¿Qué desea hacer?\n" + 
					"1. Mostrar información\n" +
					"2. Mostrar precio de venta (PVP)\n" + 
					"3. Mostrar pvp con descuento\n" +
					"4. Comprar unidades\n" +
					"5. Almacenar unidades"
				);
			eleccion = sc.nextInt();
			
			switch (eleccion) {
				case 1:
					// Mostramos la informacón del artículo
					System.out.println(art);
				break;
				case 2:
					// Mostramos el pvp
					System.out.println("El PVP es: " + art.getPVP() + " €");
					break;
				case 3:
					// Le preguntamos por el descuento
					System.out.println("¿Cuánto descuento tiene? (Ej: 10)");
					descuento = sc.nextInt();
					
					// Mostramos el pvp con descuento
					System.out.println("El precio con el " + descuento + "% de descuento es: " + 
							art.getPVPDescuento(descuento) + " €");
					break;
				case 4:
					// Le preguntamos por las unidades
					System.out.println("¿Cuántos quiere vender?");
					unidades = sc.nextInt();
					
					// Mostramos si se ha podido vender o no
					System.out.println(art.vender(unidades) ? "Venta completada" : "Hubo un fallo en la venta");
					break;
				case 5:
					// Le preguntamos por las unidades
					System.out.println("¿Cuántos quiere almacenar?");
					unidades = sc.nextInt();
					
					// Almacenamos las unidades
					art.almacenar(unidades);
					System.out.println("Almacenado correctamente");
					break;
			}
			
			// Le preguntamos si desea continuar o no
			System.out.println("¿Deseas salir? (S para salir, otro para continuar)");
			escape = sc.next().toLowerCase().charAt(0);
			
			// Limpiamos el scanner
			sc.nextLine();
		} while (escape != 's');
		
		System.out.println("¡Hasta luego!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
