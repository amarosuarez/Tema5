package boletin01.Ejercicio02;

public class Main {

	public static void main(String[] args) {
		// Creamos dos libros diferentes
		Libro libro1 = new Libro("You", "Caroline Kepnes", 20, 0);
		Libro libro2 = new Libro("Los Juegos del Hambre", "Suzane Collins", 20, 20);
		
		// Pedimos un prestamo del libro 1 y libro 2
		System.out.println(libro1.prestamo());
		System.out.println(libro2.prestamo());
		
		// Devolvemos libro 1 y libro 2
		System.out.println(libro1.devolucion());
		System.out.println(libro2.devolucion());
	}
	
}
