package boletin02.ejercicio01;

/**
 * Clase que contiene los métodos de un alumno
 * 
 * @author Amaro
 * @version 1.0
 */
public class Alumno {

	/**
	 * Atributo donde se almacenará el nombre del alumno
	 */
	private String nombre = "";

	/**
	 * Atributo donde se almacenará la nota media del alumno
	 */
	private double notaMedia = 0.0;

	/**
	 * Constructor sin parámetros
	 */
	public Alumno() {
		// Podemos inicializar aquí los parámetros
		this.nombre = "";
		this.notaMedia = 0.0;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre    Nomre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Comprobamso que la nota media sea mayor o igual que 0 y menor o igual que 10
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Función que obtiene el nombre del alumno
	 * 
	 * @return Nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Almacena el nombre del alumno
	 * 
	 * @param nombre Nombre del alumno
	 */
	public void setNombre(String nombre) {
		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Función que obtiene la nota media
	 * 
	 * @return Nota media del alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Función que almacena la nota media
	 * 
	 * @param notaMedia Nota media del alumno
	 */
	public void setNotaMedia(double notaMedia) {
		// Comprobamso que la nota media sea mayor o igual que 0 y menor o igual que 10
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	
	
	/**
	 * Función que devuelve la información del alumno
	 * 
	 * @return Información del alumno
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la cadena con la información
		String cadena = "";
		
		// Almacenamos la información
		cadena = this.nombre + ": " + this.notaMedia;
		
		// Devolvemos la cadena
		return cadena;
	}

}
