package boletin02.ejercicio02;

import java.util.Scanner;

import boletin02.Lectura;
import boletin02.ejercicio01.ArrayAlumno;

public class Principal {
	
	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variable donde se almacenará el código
		int codigo = 0;
		
		// Variable donde se almacenará la descripción
		String descripcion = "";
		
		// Variable donde se almacenará el precio de compra
		double precioCompra = 0.0;
		
		// Variable donde se almacenará el precio de venta
		double precioVenta = 0.0;
		
		// Variable donde se almacenará el stock
		int stock = 0;
		
		// Variable dodne se almacenará la cantidad a añadir
		int cantidad = 0;
		
		// Variable donde se almacenará la elección del usuario
		int eleccion = 0;
		
		// Bucle para mostrar el menú hasta que el usuario seleccione salir
		do {
			// Mostramos el menú
			menu();
			
			// Leemos la elección del usuario
			eleccion = sc.nextInt();
			
			// Limpiamos el Scanner
			sc.nextLine();
			
			// Ejecutamos la elección
			switch (eleccion) {
			case 1:
				// Lista los artículos
				Gestisimal.listado();
				break;
				
			case 2:
				// Añadimos un artículo
				// Le preguntamos el código y lo leemos
				codigo = Lectura.preguntaInt("¿Cuál es el código del artículo?");
				
				// Le preguntamos la descripción y la leemos
				descripcion = Lectura.preguntaString("¿Cuál es la descripción del artículo?");
				
				// Le preguntamos el precio de compra y lo leemos
				precioCompra = Lectura.preguntaDouble("¿Cuál es el precio de compra?");
				
				// Le preguntamos el precio de venta y lo leemos
				precioVenta = Lectura.preguntaDouble("¿Cuál es el precio de venta?");
				
				// Le preguntamos el stock y lo leemos
				stock = Lectura.preguntaInt("¿Cuál es el stock?");
				
				// Comprobamos que aún hayan posiciones libres en el array
				if (Gestisimal.alta(codigo, descripcion, precioCompra, precioVenta, stock)) {
					// Indicamos que se ha añadido el artículo
					System.out.println("Artículo añadido");
				} else {
					// Indicamos que el array está lleno
					System.out.println("Array lleno");
				}
				
				break;
				
			case 3:
				// Eliminamos un artículo
				// Le preguntamos el código y lo leemos
				codigo = Lectura.preguntaInt("¿Cuál es el código del artículo?");
				
				// Comprobamos que se haya eliminado el artículo
				if (Gestisimal.baja(codigo)) {
					// Indicamos que se ha eliminado el artículo
					System.out.println("Artículo eliminado");
				} else {
					// Indicamos que no se ha eliminado
					System.out.println("No se ha encontrado el artículo");
				}
				
				break;
				
			case 4:
				// Modificación del artículo
				// Le preguntamos el código y lo leemos
				codigo = Lectura.preguntaInt("¿Cuál es el código del artículo?");
				
				// Le preguntamos la descripción y la leemos
				descripcion = Lectura.preguntaString("¿Cuál es la descripción del artículo?");
				
				// Le preguntamos el precio de compra y lo leemos
				precioCompra = Lectura.preguntaDouble("¿Cuál es el precio de compra?");
				
				// Le preguntamos el precio de venta y lo leemos
				precioVenta = Lectura.preguntaDouble("¿Cuál es el precio de venta?");
				
				// Le preguntamos el stock y lo leemos
				stock = Lectura.preguntaInt("¿Cuál es el stock?");
				
				// Comprobamos que se haya modificado el artículo
				if (Gestisimal.modifica(codigo, descripcion, precioCompra, precioVenta, stock)) {
					// Indicamos que se ha modificado el artículo
					System.out.println("Artículo modificado");
				} else {
					// Indicamos que no se ha modificado el artículo
					System.out.println("No se ha encontrado el artículo");
				}
				
				break;
				
			case 5:
				// Añadimos unidades
				// Le preguntamos el código y lo leemos
				codigo = Lectura.preguntaInt("¿Cuál es el código del artículo?");
				
				// Le preguntamos la cantidad y la leemos
				cantidad = Lectura.preguntaInt("¿Cuántas unidades quieres añadir?");
				
				// Comprobamos que se haya añadido
				if (cantidad >= 0 && Gestisimal.entrada(codigo, cantidad)) {
					// Indicamos que se ha añadido correctamente
					System.out.println("Cantidad añadida correctamente");
				} else {
					// Indicamos que no se ha añadido
					System.out.println("Artículo no encontrado o cantidad incorrecta");
				}
				
				break;
				
			case 6:
				// Eliminamos unidades
				// Le preguntamos el código y lo leemos
				codigo = Lectura.preguntaInt("¿Cuál es el código del artículo?");
				
				// Le preguntamos la cantidad y la leemos
				cantidad = Lectura.preguntaInt("¿Cuántas unidades quieres eliminar?");
				
				// Comprobamos que se haya eliminado
				if (Gestisimal.salida(codigo, cantidad)) {
					// Indicamos que se ha eliminado correctamente
					System.out.println("Cantidad eliminada correctamente");
				} else {
					// Indicamos que no se ha añadido
					System.out.println("Artículo no encontrado o cantidad incorrecta");
				}
			}
			
		} while (eleccion != 7);
		
		// Mostramos el mensaje de despedida
		System.out.println("¡Adiós!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que imprime el menú
	static void menu() {
		System.out.println(
			"MENÚ\n" +
			"1. Listado\n" +
			"2. Alta\n" +
			"3. Baja\n" +
			"4. Modificación\n" + 
			"5. Entrada de mercancía\n" + 
			"6. Salida de mercancía\n" + 
			"7. Salir"
		);
	}
 	
}
