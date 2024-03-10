package boletin02.ejercicio01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable donde se almacenará la elección del usuario
		int eleccion = 0;
		
		// Variable donde se almacenará el nombre del alumno
		String nombre = "";
		
		// Variable donde se almacenará la nota del alumno
		double nota = 0.0;

		// Ejecutamos el bucle hasta que el usuario elija la opción para salirse
		do {
			// Mostramos el menú y almacenamos la opción
			menu();
			eleccion = sc.nextInt();
			
			// Limpiamos el Scanner
			sc.nextLine();

			// Ejecutamos la eleccion
			switch (eleccion) {
				case 1:
					// Imprimimos el listado de alumnos
					ArrayAlumno.imprimir();
					break;
	
				case 2:
					// Añade un alumno
					// Le pedimos el nombre al usuario y lo almacenamos
					nombre = preguntaNombre();
					
					// Le pedimos la nota al usuario y la almacenamos
					nota = preguntaNota();
					
					// Comprobamos que aún hayan posiciones libres en el array
					if (ArrayAlumno.nuevoAlumno(nombre, nota)) {
						// Indicamos que se ha añadido al alumno
						System.out.println("Alumno añadido");
					} else {
						// Indicamos que el array está lleno
						System.out.println("Array lleno");
					}
					
					break;
				
				case 3:
					// Modifica un alumno
					// Le pedimos el nombre al usuario y lo almacenamos
					nombre = preguntaNombre();
			
					// Le pedimos la nota al usuario y la almacenamos
					nota = preguntaNota();
					
					// Comprobamos si se ha podido modificar al alumno
					if (ArrayAlumno.modifica(nombre, nota)) {
						// Mostramos que se ha modificado
						System.out.println("Alumno modificado correctamente");
					} else {
						// Mostramos que no se ha modificado
						System.out.println("Alumno no encontrado");
					}
					
					break;
				
				case 4:
					// Elimina un alumno
					// Le pedimos el nombre al usuario y lo almacenamos
					nombre = preguntaNombre();
					
					// Comprobamos si se ha podido eliminar
					if (ArrayAlumno.elimina(nombre)) {
						// Mostramos que se ha eliminado
						System.out.println("Alumno eliminado correctamente");
					} else {
						// Mostramos que no se ha eliminado
						System.out.println("Alumno no encontrado");
					}
					
					break;
			}

		} while (eleccion != 5);
		
		// Mostramos un mensaje de despedida
		System.out.println("¡Adiós!");

		// Cerramos el Scanner
		sc.close();
	}

	// Función que muestra el menú por pantalla
	static void menu() {
		// Mostramos las opciones del menú
		System.out.println("ALUMNOS/AS\n" + "===================\n" + "1. Listado.\n" + "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n" + "4. Borrar.\n" + "5. Salir.");

	}
	
	// Función que pregunta el nombre y lo devuelve
	static String preguntaNombre() {
		// Variable donde se almacenará el nombre
		String nombre = "";
		
		// Le pedimos el nombre al usuario y lo almacenamos
		System.out.println("¿Cómo se llama el alumno?");
		nombre = sc.nextLine();
		
		// Devolvemos el nombre
		return nombre;
	}
	
	// Función que pregunta la nota y la devuelve
	static double preguntaNota() {
		// Variable donde se almacenará la nota
		double nota = 0.0;
		
		// Le pedimos la nota al usuario y la almacenamos
		System.out.println("¿Cuál es la nota media del alumno?");
		nota = sc.nextDouble();
		
		// Devolvemos la nota
		return nota;
	}

}
