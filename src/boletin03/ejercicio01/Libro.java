package boletin03.ejercicio01;

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
	 * Atributo que almacena el género del linro
	 */
	private Genero genero;
	
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
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
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
		
		if (genero != null) {
			this.genero = genero;
		}
	}
	
	/**
	 * Obtiene el titulo del libro
	 * @return Devuelve el titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el titulo del libro
	 * @param titulo Cadena con el valor a modificar en el titulo del libro
	 */
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
	}

	/**
	 * Obtiene el autor del libro
	 * @return Devuelve el autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Modifica al autor del libro
	 * @param autor Cadena con el nombre del autor del libro
	 */
	public void setAutor(String autor) {
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
	}

	/**
	 * Obtiene el número de ejemplares del libro
	 * @return Devuelve el número de ejemplares del libro
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Modifica el número de ejemplares del libro
	 * @param ejemplares Int con el número de ejemplares del libro
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		};
	}

	/**
	 *  Obtiene el número de ejemplares prestados del libro
	 * @return Devuelve el número de ejemplares prestados del libro
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * Modifica el número de ejemplares prestados del libro
	 * @param ejemplaresPrestados Int con el número de ejamplares prestados del libro
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		if (ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}

	/**
	 * Obtiene el género del libro
	 * @return Devuelve el género del libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Modifica el género del libro
	 * @param genero Enum con el género del libro
	 */
	public void setGenero(Genero genero) {
		if (genero != null) {
			this.genero = genero;
		}
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
	
	
	@Override
	/**
	 * Devuelve la información del libro en el siguiente formato:
	 * Título:
	 * Género:
	 * Autor:
	 * Número de ejemplares:
	 * Número de ejemplares prestados:
	 * 
	 * @return Devuelve la información del libro
	 */
	public String toString() {
		// Cadena donde se almacenará la información del libro
		String info = "";
		
		// Almacenamos la información del libro
		info += "Título: " + this.titulo;
		info += "\nGénero: " + this.genero;
		info += "\nAutor: " + this.autor;
		info += "\nNúmero de ejemplares: " + this.ejemplares;
		info += "\nNúmero de ejemplares prestados: " + this.ejemplaresPrestados;
		
		// Devolvemos la informaciónd del libro
		return info;
	}
	
}
