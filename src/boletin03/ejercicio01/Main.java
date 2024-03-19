package boletin03.ejercicio01;

import java.util.InputMismatchException;

import boletin02.Lectura;

public class Main {

	public static void main(String[] args) {
		// Creamos el objeto Libro
		Libro libro;
		
		// Mostramos el menú
		menu();
		
		anyadirLibro();
		
		ArrayLibros.listaLibros();
	}

	public static void anyadirLibro() {
		String titulo = "";
		String autor = "";
		Genero genero = null;
		int numEjemplares;
		int numEjPrestados;
		boolean generoDentro = false;
		boolean anyadido = false;
		
		titulo = Lectura.preguntaString("¿Cuál es el titulo?");
		autor = Lectura.preguntaString("¿Cómo se llama el autor?");

		do {
			try {
				genero = Genero.valueOf(Lectura.preguntaString("¿Cuál es el género del libro?"));
				generoDentro = true;
			} catch (IllegalArgumentException e) {
				System.out.println("Error");
			}
		} while (!generoDentro);
		
		numEjemplares = Lectura.preguntaInt("¿Cuántos ejemplares hay?");
		numEjPrestados = Lectura.preguntaInt("¿Cuántos ejemplares hay prestados?");
		
		anyadido = ArrayLibros.anyadirLibro(titulo, autor, numEjemplares, numEjPrestados, genero);
		
		if (anyadido) {
			System.out.println("Añadido");
		} else {
			System.out.println("No se pudo añadir");
		}
	}
	
	static void menu() {
		// Mostramos el menú
		System.out.println("\tMENÚ");
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Añadir un libro");
		System.out.println("2. Eliminar un libro");
		System.out.println("3. Listar los libros");
		System.out.println("---------------------");
	}
 	
}
