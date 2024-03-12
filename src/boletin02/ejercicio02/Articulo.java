package boletin02.ejercicio02;

/**
 * Clase que contiene los datos de un artículo
 * 
 * @author Amaro
 * @version 1.0
 */
public class Articulo {

	/**
	 * Atributo que almacena el código
	 */
	private int codigo = 0;

	/**
	 * Atributo que almacena la descripción
	 */
	private String descripcion = "";

	/**
	 * Atributo que almacena el precio de compra
	 */
	private double precioCompra = 0.0;

	/**
	 * Atributo que almacena el precio de venta
	 */
	private double precioVenta = 0.0;

	/**
	 * Atributo que almacena el stock
	 */
	private int stock = 0;

	/**
	 * Constructor vacío
	 */
	public Articulo() {
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo       Código del artículo
	 * @param descripcion  Descripción del artículo
	 * @param precioCompra Precio de compra del artículo
	 * @param precioVenta  Precio de venta del artículo
	 * @param stock        Stock del artículo
	 */
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock ) {
		// Comprobamos que el codigo no sea negativo
		if (codigo >= 0) {
			this.codigo = codigo;
		}

		// Comprobamos que la descripción no sea nula ni vacía
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}

		// Comprobamos que el precio de compra no sea negativo
		if (precioCompra >= 0) {
			this.precioCompra = precioCompra;
		}

		// Comprobamos que el precio de venta no sea negativo
		if (precioVenta >= 0) {
			this.precioVenta = precioVenta;
		}

		// Comprobamos que el stock no sea negativo
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	/**
	 * Función que devuelve el código del artículo
	 * 
	 * @return Devuelve el código del artículo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Función que almacena el código
	 * 
	 * @param codigo Código del artículo
	 */
	public void setCodigo(int codigo) {
		// Comprobamos que el codigo no sea negativo
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Función que devuelve la descripción
	 * 
	 * @return Devuelve la descripción del artículo
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Función que almacena la descripción
	 * 
	 * @param descripcion Descripción del artículo
	 */
	public void setDescripcion(String descripcion) {
		// Comprobamos que la descripción no sea nula ni vacía
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	/**
	 * Función que devuelve el precio de compra
	 * 
	 * @return Devuelve el precio de compra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Función que almacena el precio de compra
	 * 
	 * @param precioCompra Precio de compra del artículo
	 */
	public void setPrecioCompra(double precioCompra) {
		// Comprobamos que el precio de compra no sea negativo
		if (precioCompra >= 0) {
			this.precioCompra = precioCompra;
		}
	}

	/**
	 * Función que devuelve el precio de venta
	 * 
	 * @return Devuelve el precio de venta del artículo
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Función que almacena el precio de venta
	 * 
	 * @param precioVenta Precio de venta del artículo
	 */
	public void setPrecioVenta(double precioVenta) {
		// Comprobamos que el precio de venta no sea negativo
		if (precioVenta >= 0) {
			this.precioVenta = precioVenta;
		}
	}

	/**
	 * Función que devuelve el stock
	 * 
	 * @return Devuelve el stock del artículo
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Función que almacena el stock del artículo
	 * 
	 * @param stock Stock del artículo
	 */
	public void setStock(int stock) {
		// Comprobamos que el stock no sea negativo
		if (stock >= 0) {
			this.stock = stock;
		}
	}
	
	/**
	 * Función que devuelve la información del artículo
	 * @return Devuelve la información del artículo
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la cadena
		String cadena = "";
		
		// Guardamos la información del artículo 
		cadena += "--------------------------------";
		cadena += "\nCódigo: " + this.codigo;
		cadena += "\nDescripción: " + this.descripcion;
		cadena += "\nPrecio de compra: " + this.precioCompra;
		cadena += "\nPrecio de venta: " + this.precioVenta;
		cadena += "\nStock: " + this.stock + " uds";
		
		// Devolvemos la cadena
		return cadena;
	}

}
