package boletin03.ejercicio01;

/**
 * Clase que contiene los métodos para añadir, eliminar y mostrar los libros
 * 
 * @author Amaro
 * @version 1.0
 */
public class ArrayLibros {

	/**
	 * Atributo estático que almacena todos los libros en un array
	 */
	static Libro[] libros = new Libro[5];

	/**
	 * Función que imprime la información de los libros que no son nulos
	 */
	static void listaLibros() {
		// Bucle para recorrer el array de libros
		for (Libro libro : libros) {
			// Comprobamos que no sea nulo
			if (libro != null) {
				// Mostramos su información
				System.out.println(libro);
				System.out.println("-------------------------------");
			}
		}
	}

	static boolean anyadirLibro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
		// Variable que almacena si se ha añadido el libro
		boolean anyadido = false;

		Libro libro;
		
		int i = busca(titulo);
		
		int pos = -1;
		
		if (i == -1) {
			pos = buscaNull();
			
			if (pos > -1) {

				libro = new Libro(titulo, autor, ejemplares, ejemplaresPrestados, genero);
				libros[pos] = libro;
				anyadido = true;
			}
			
		}
		
		// Devolvemos si se ha añadido el libro
		return anyadido;
	}

	static int busca(String titulo) {
		// Variable que almacena si se ha encontrado el libro
		boolean encontrado = false;

		int pos = -1;
		
		// Variable auxiliar que almacena el índice del array
		int i = 0;

		// Bucle que se ejecuta mientras el indice esté dentro de la longitud del array
		// y no se haya encontrado el libro
		while (i < libros.length && !encontrado) {
			if (libros[i] != null && libros[i].getTitulo().equals(titulo)) {
				pos = i;
				encontrado = true;
			}
			i++;
		}

		// Devolvemos si se ha encontrado el libro
		return pos;
	}
	
	static int buscaNull() {
		// Variable que almacena si se ha encontrado el libro
		boolean encontrado = false;

		int pos = -1;
		
		// Variable auxiliar que almacena el índice del array
		int i = 0;

		// Bucle que se ejecuta mientras el indice esté dentro de la longitud del array
		// y no se haya encontrado el libro
		while (i < libros.length && !encontrado) {
			if (libros[i] == null) {
				pos = i;
				encontrado = true;
			}
			i++;
		}

		// Devolvemos si se ha encontrado el libro
		return pos;
	}
}
