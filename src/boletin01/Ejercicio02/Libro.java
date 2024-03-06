package boletin01.Ejercicio02;

/**
 * Clase que almacena a información de un libro
 * 
 * @author Amaro
 * @version 1.0
 */
public class Libro {

	/** 
	 * Atributo que almacena el titulo del libro
	 */
	private String titulo = "";
	
	/**
	 * Atributo que almacena el autor del libro
	 */
	private String autor = "";
	
	/**
	 * Atributo que almacena el número de ejemplares
	 */
	private int ejemplares = 0;
	
	/**
	 * Atributo que almacena el número de ejemplares prestados
	 */
	private int ejemplaresPrestados = 0;
	
	/**
	 * Constructor vacío
	 */
	public Libro() {}
	
	/**
	 * Constructor con parámetros
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param ejemplares Ejemplares del libro
	 * @param ejemplaresPrestados Ejemplares prestados del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		
		if (ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
		
	}
	
	/**
	 * Obtiene el titulo del libro
	 * @return Devuelve el titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * Método que incrementa la cantidad de ejemplares prestados
	 * @return Devuelve si se ha realizado el prestamo o no
	 */
	public boolean prestamo() {
		// Variable donde se almacenará si se ha prestado o no
		boolean prestado = false;
		
		// Comprobamos si existen ejemplares
		if (this.ejemplares > 0 && this.ejemplaresPrestados < this.ejemplares) {
			// Aumentamos el número de ejemplares prestados
			this.ejemplaresPrestados++;
			
			// Cambiamos el valor a true del booleano 
			prestado = true;
		}
		
		// Devolvemos el booleano
		return prestado;
	}
	
	/**
	 * Método que decrementa la cantidad de ejemplares prestados
	 * @return Devuelve si se ha realizado la devolución o no
	 */
	public boolean devolucion() {
		// Variable donde se almacenará si se ha devuelto o no
		boolean devuelto = false;
		
		// Comprobamos si existen ejemplares prestados
		if (this.ejemplaresPrestados > 0) {
			// Decrementamos el valor de ejemplares prestados
			this.ejemplaresPrestados--;
			
			// Cambiamos el valor del booleano a true
			devuelto = true;
		}
		
		// Devolvemos el booleano
		return devuelto;
	}
	
}
