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

		// Array de 30 alumnos que representa a un grupo
		Alumno[] arrayAlumnos = new Alumno[30];

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
				muestraListado(arrayAlumnos);
				break;

			case 2:
				nuevoAlumno(arrayAlumnos);
				break;
			}

		} while (eleccion != 5);

		// Cerramos el Scanner
		sc.close();
	}

	// Función que muestra el menú por pantalla
	static void menu() {
		// Mostramos las opciones del menú
		System.out.println("ALUMNOS/AS\n" + "===================\n" + "1. Listado.\n" + "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n" + "4. Borrar.\n" + "5. Salir.");

	}

	// Fución que muestra los alumnos que no son
	static void muestraListado(Alumno[] arrayAlumno) {
		// Variable donde se almacena si se ha encontrado algún alumno
		boolean encontrado = false;

		// Bucle para recorrer el listado de alumnos
		for (int i = 0; i < arrayAlumno.length; i++) {
			// Comprobamos que el alumno no sea nulo
			if (arrayAlumno[i] != null) {
				// Mostramos la información del alumno
				System.out.println(arrayAlumno[i]);

				// Cambiamos el valor a true del booleano
				encontrado = true;
			}
		}

		// Comprobamos si no hay alumnos
		if (!encontrado) {
			System.out.println("No hay alumnos");
		}
	}

	// Función que añade un nuevo alumno
	static boolean nuevoAlumno(Alumno[] arrayAlumno) {
		// Variable donde se almacenará si se ha añadido el nuevo alumno o no
		boolean anyadido = false;

		// Variable donde se almacenará el nombre del alumno
		String nombre = "";

		// Variable donde se almacenará la nota media del alumno
		double notaMedia = 0.0;
		
		// Variable que almacena si el valor es correcto o no
		boolean valorCorrecto = false;
		
		// Le preguntamos el nombre al usuario
		System.out.println("¿Cuál es el nombre del alumno?");
		nombre = sc.nextLine();
		
		// Bucle que pide la nota media al usuario mientras introduzca un dato erróneo
		do {
			// Comprobamos que el valor introducido sea correcto
			try {
				// Le preguntamos la nota media al usuario
				System.out.println("¿Cuál es el la nota media del alumno?");
				notaMedia = sc.nextDouble();
				
				// Cambiamos el valor al booleano a true
				valorCorrecto = true;
			} catch (InputMismatchException e) {
				// Mostramos el mensaje de error
				System.out.println("Valores incorrectos");
			} finally {
				// Limpiamos el Scanner
				sc.nextLine();
			}
			
		} while (!valorCorrecto);
		
		// Creamos el objeto
		Alumno alumno = new Alumno(nombre, notaMedia);
		
		// Lo añadimos en el array donde sea nulo
		// Para ello buscamos el primer nulo con una función auxiliar
		arrayAlumno[buscaNulo(arrayAlumno)] = alumno;

		// Devolvemos el booleano
		return anyadido;
	}
	
	// Función que busca nulo y devuelve la posición del primer nulo encontrado
	static int buscaNulo(Alumno[] arraysAlumnos) {
		// Variable donde se almacenará el primer nulo encontrado
		int nulo = 0;
		
		// Auxiliar boolean que indica si se ha encontrado o no
		boolean encontrado = false;
		
		// Auxiliar que almacena el índice
		int indice = 0;
		
		// Bucle para buscar en el array
		while (indice < arraysAlumnos.length && !encontrado) {
			// Comprobamos si es nulo
			if (arraysAlumnos[indice] == null) {
				// Añadimos la posicion
				nulo = indice;
				
				// Cambiamos el valor a encontrado
				encontrado = true;
			}
			
			// Aumentamos el indice
			indice++;
		}
		
		// Devolvemos la posición
		return nulo;
	}
}
