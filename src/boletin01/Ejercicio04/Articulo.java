package boletin01.Ejercicio04;

/**
 * Clase que contiene métodos de un artículo
 * 
 * @author Amaro
 * @version 1.0
 */
public class Articulo {

	/**
	 * Atributo que almacena el nombre del artículo
	 */
	String nombre = "";
	
	/**
	 * Atributo que almacena el precio
	 */
	double precio = 0.0;
	
	/**
	 * Atributo constante que almacena el IVA
	 */
	final double IVA = 0.21;
	
	/**
	 * Atributo que almacenan cuantos artículos quedan
	 */
	int cuantosQuedan = 0;

	/**
	 * Constructor con parámetros
	 * @param nombre Nombre del artículo
	 * @param precio Precio del artículo
	 * @param cuantosQuedan Cantidad de artículos que quedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		// Variable que almacena si hay algún error
		boolean error = true;
		
		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		} else {
			error = false;
		}
		
		// Comprobamos que el precio sea mayor o igual que 0
		if (precio >= 0) {
			this.precio = precio;
		} else {
			error = false;
		}
		
		// Comprobamos que la cantidad de stock sea mayor o igual que 0
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			error = false;
		}
		
		// Comprobamos si hay algún error
		if (!error) {
			System.out.println("Alguno de los parámetros no es correcto");
		}
	}
	
	/**
	 * Método que devuelve la información
	 * @return Devuelve la información
	 */
	public String informacion() {
		// Variable donde se almacenará la información
		String cadena = "";
		
		// Almacenamos la información
		cadena += "----------------------------------------------------------------";
		cadena += "\nNombre del artículo: " + nombre;
		cadena += "\nPrecio del artículo: " + precio + " €";
		cadena += "\nStock del artículo: " + cuantosQuedan + " uds";
		cadena += "\n----------------------------------------------------------------";
		
		// Devolvemos la información
		return cadena;
	}
	
	/**
	 * Método que devuelve el precio con IVA
	 * @return Devuelve el precio con IVA
	 */
	public double getPVP() {
		// Variable donde se almacena el precio con iva
		double pvp = 0.0;
		
		// Calculamos el pvp
		pvp = (precio*IVA) + precio;
		
		// Devolvemos el pvp
		return pvp;
	}
	
	/**
	 * Método que calcula el PVP con descuento
	 * @param descuento Descuento a aplicar
	 * @return Devolvemos el PVP con descuento
	 */
	public double getPVPDescuento(double descuento) {
		// Variable donde se almacena el precio con descuento
		double pvpDescuento = 0.0;
		
		// Variable donde se pasa el descuento a porcentaje
		double porcentaje = descuento/100;
		
		// Calculamos el pvpDescuento
		pvpDescuento = getPVP() - (getPVP()*porcentaje);
		
		// Devolvemos el PVP con descuento
		return pvpDescuento;
	}
	
	/**
	 * Método que comprueba si se puede vender o no y
	 * en caso afirmativo, resta la cantidad al stock
	 * @param cantidad Cantidad a vender
	 * @return Devuelve si se puede vender o no
	 */
	public boolean vender(int cantidad) {
		// Variable donde se almacena si se vende o no
		boolean vende = false;
		
		// Comprobamos si hay más o igual stock que cantidad
		if (cantidad <= cuantosQuedan) {
			// Restamos la cantidad al stock
			cuantosQuedan -= cantidad;
			
			// Cambiamos el valor del booleano a true
			vende = true;
		}
		
		// Devolvemos el booleano
		return vende;
	}
	
	/**
	 * Almacena la cantidad indicada en el stock
	 * @param cantidad Cantidad a almacenar
	 */
	public void almacenar(int cantidad) {
		// Actualizamos el stock
		cuantosQuedan += cantidad;
	}
}
