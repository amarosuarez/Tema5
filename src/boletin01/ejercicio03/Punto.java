package boletin01.ejercicio03;

/**
 * Clase que almacena los métodos de un plano
 * 
 * @author Amaro
 * @version 1.0
 */
public class Punto {

	/**
	 * Atributo que almacena la coordenada x
	 */
	private int coordX = 0;
	
	/**
	 * Atributo que almacena la coordenada y
	 */
	private int coordY = 0;
	
	/**
	 * Constructor con parámetros
	 * @param coordX Coordenada X
	 * @param coordY Coordenada Y
	 */
	public Punto(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	/**	
	 * Obtiene la coordenada X
	 * @return Devuelve la coordenada X
	 */
	public int getCoordX() {
		return this.coordX;
	}

	/**
	 * Añade la coordenada X
	 * @param coordX Coordenada X
	 */
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	
	/**
	 * Obtiene la coordenada Y
	 * @return Devuelve la coordenada Y
	 */
	public int getCoordY() {
		return this.coordY;
	}
	
	/**
	 * Añade la coordenada Y
	 * @param coordY Coordenada Y
	 */
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	/***
	 * Método que devuelve las coordenadas a imprimir
	 * @return Coordenadas a imprimir
	 */
	public String imprime() {
		// Variable donde se almacenarán las coordenadas
		String coordenadas = "";
		
		// Almacenamos las coordenadas
		coordenadas = "(" + this.coordX + ", " + this.coordY + ")";
		
		// Devolvemos las coordenadas
		return coordenadas;
	}
	
	/**
	 * Método que modifica ambas coordenadas
	 * @param x Coordenada X
	 * @param y Coordenada Y
	 */
	void setXY(int x, int y) {
		// Modificamos la variable x
		this.coordX = x;
		
		// Modificamos la variable y
		this.coordY = y;
	}
	
	/**
	 * Método que modifica ambas coordenadas según cuanto se desplacen
	 * @param dx Valor de desplazamiento de la x
	 * @param dy Valor de desplazamiento de la y
	 */
	void desplaza(int dx, int dy) {
		// Variable donde se almacenará la nueva coordenada x
		int nuevaX = 0;
		
		// Variable donde se almacenará la nueva coordenada y
		int nuevaY = 0;
		
		// Calculamos las nuevas coordenadas
		nuevaX = this.coordX + dx;
		nuevaY = this.coordY + dy;
		
		// Modificamos las coordenadas
		this.coordX = nuevaX;
		this.coordY = nuevaY;
	}
	
	/**
	 * Método que calcula la distancia entre dos puntos
	 * @param p Objeto punto
	 * @return Devuelve la distancia entre dos puntos
	 */
	double distancia(Punto p) {
		// Variable donde se almacenará la distancia entre puntos
		double distancia = 0;
		
		// Calculamos la distancia
		distancia = Math.sqrt( Math.pow((p.coordX - this.coordX), 2) + Math.pow((p.coordY - this.coordY), 2) );  
		
		// Devolvemos la distancia
		return distancia;
	}
}
