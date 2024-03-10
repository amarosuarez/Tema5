package boletin02.ejercicio01;

/**
 * Clase que almacena los métodos para mostrar, agregar, modificar y eliminar alumnos
 * 
 * @author Amaro
 * @version 1.0
 */
public class ArrayAlumno {
	/** 
	 * Array donde almacenaremos los 30 alumnos
	 */
	public static Alumno[] alumnos = new Alumno[30];
	
	/**
	 * Función que imprime los alumnos que no sean nulos
	 */
	public static void imprimir() {
		// Bucle para recorrer el array
		for (Alumno alumno : alumnos) {
			// Comprobamos que el alumno no sea nulo
			if (alumno != null) {
				// Imprimimos el alumno
				System.out.println(alumno);
			}
		}
	}
	
	/**
	 * Función que añade un nuevo alumno
	 * @param nombre Nombre del alumno
	 * @param nota Nota media del alumno
	 * @return Devuelve si se ha añadido o no
	 */
	public static boolean nuevoAlumno(String nombre, double nota) {
		// Creamos un nuevo objeto alumno
		Alumno alumn = new Alumno(nombre, nota);
		
		// Variable donde se almacenará la posición
		int i = 0;
		
		// Variable donde se almacenará si se ha añadido o no
		boolean anyadido = false;
		
		// Bucle para recorrer el array hasta encontrar una posición nula o salirnos de la longitud
		while(i<alumnos.length && alumnos[i]!=null) {
			i++;
		}
		
		// Comprobamos que la posición no sea mayor a la longitud del array
		if(i<alumnos.length) {
			// Añadimos al alumno
			alumnos[i] = alumn;
			
			// Cambiamos el valor del boolean
			anyadido = true;
		} 
		
		// Devolvemos el boolean
		return anyadido;
	}
	
	/**
	 * Función que modifica la nota media de un alumno
	 * @param nombre Nombre del alumno
	 * @param nota Nueva nota media 
	 * @return Devuelve si se ha modificado o no
	 */
	public static boolean modifica(String nombre, double nota) {
		// Variable donde se almacenará si se ha modificado o no
		boolean modificado = false;
		
		// Auxiliar donde se almacenará la posición del alumno en el array
		int i = buscaAlumno(nombre);
		
		// Comprobamos que la posición no se salga de la longitud del array
		if (i < alumnos.length) {
			// Modificamos la nota media
			alumnos[i].setNotaMedia(nota);
			
			// Cambiamos el valor del boolean
			modificado = true;
		}
		
		// Devolvemos el boolean
		return modificado;
	}
	
	/**
	 * Función que elimina el alumno del array
	 * @param nombre Nombre del alummno
	 * @return Devuelve si se ha eliminado al alumno o no
	 */
	public static boolean elimina(String nombre) {
		// Variable donde se almacenará si se ha eliminado o no
		boolean eliminado = false;
		
		// Auxiliar donde se almacenará la posición del alumno en el array
		int i = buscaAlumno(nombre);
		
		// Comprobamos que la posición no se salga de la longitud del array
		if (i < alumnos.length) {
			// Cambiamos el valor del alumno a null
			alumnos[i] = null;
			
			// Cambiamos el valor del boolean
			eliminado = true;
		}
		
		// Devolvemos el boolean
		return eliminado;
	}
	
	/**
	 * Función que busca al alumno en el array y devuelve su posición
	 * @param nombre Nombre del alumno
	 * @return Devuelve la posición del alumno en el array
	 */
	private static int buscaAlumno(String nombre) {
		// Variable donde se almacenará la posición del alumno en el array
		int i = 0;
		
		// Bucle para buscar al alumno en el array
		while(i<alumnos.length && (alumnos[i]==null || !alumnos[i].getNombre().equals(nombre))) {
			i++;
		}
		
		// Devolvemos la posición del alumno en el array
		return i;
	}
	
}
