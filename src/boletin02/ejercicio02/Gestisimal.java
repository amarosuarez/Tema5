package boletin02.ejercicio02;

import boletin02.ejercicio01.Alumno;

/**
 * Clase que contiene los métodos de gesión del almacén
 * 
 * @author Amaro
 * @version 1.0
 */
public class Gestisimal {

	/**
	 * Array que almacena hasta 20 artículos
	 */
	public static Articulo[] articulos = new Articulo[20];

	/**
	 * Función que imprime los artículos que no sean nulos
	 */
	public static void listado() {
		// Bucle para recorrer el array
		for (Articulo art : articulos) {
			// Comprobamos que el alumno no sea nulo
			if (art != null) {
				// Imprimimos el alumno
				System.out.println(art);
			}
		}
	}
	
	/**
	 * Función que añade un artículo
	 * 
	 * @param codigo       Código del artículo
	 * @param descripcion  Descripción del artículo
	 * @param precioCompra Precio de compra del artículo
	 * @param precioVenta  Precio de venta del artículo
	 * @param stock        Stock del artículo
	 * @return Devuelve si se ha añadido o no
	 */
	public static boolean alta(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		// Creamos un nuevo objeto Artículo
		Articulo art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

		// Variable donde se almacenará si se ha añadido o no
		boolean anyadido = false;

		// Variable donde se almacenará la posición
		int i = 0;

		// Bucle para recorrer el array hasta encontrar una posición nula o salirnos de
		// la longitud
		while (i < articulos.length && articulos[i] != null) {
			// Incrementamos la posición
			i++;
		}

		// Comprobamos si la posición esta dentro de la longitud del array
		if (i < articulos.length) {
			// Añadimos el artículo
			articulos[i] = art;

			// Cambiamos el valor al boolean
			anyadido = true;
		}

		// Devolvemos el boolean
		return anyadido;
	}

	/**
	 * Función que elimina un artículo
	 * 
	 * @param codigo Código del artículo
	 * @return Devuelve si se ha eliminado el artículo o no
	 */
	public static boolean baja(int codigo) {
		// Variable donde se almacenará si se ha dado de baja o no
		boolean baja = false;

		// Variable donde se almacenará la posición
		int i = buscaArticulo(codigo);

		// Comprobamos que la posición no sea mayor a la longitud del array
		if (i < articulos.length) {
			// Cambiamos a null el artículo
			articulos[i] = null;

			// Cambiamos el valor a boolean
			baja = true;
		}

		// Devolvemos el boolean
		return baja;
	}

	/**
	 * Función que modifica un artículo
	 * 
	 * @param codigo       Código del artículo
	 * @param descripcion  Descripción del artículo
	 * @param precioCompra Precio de compra del artículo
	 * @param precioVenta  Precio de venta del artículo
	 * @param stock        Stock del artículo
	 * @return Devuelve si se ha modificado o no
	 */
	public static boolean modifica(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		// Variable donde se almacenará si se ha modificado o no
		boolean modificado = false;

		// Variable donde se almacenará la posición
		int i = buscaArticulo(codigo);

		// Comprobamos que la posición no se salga de la longitud del array
		if (i < articulos.length) {
			// Modificamos el articulo
			articulos[i].setDescripcion(descripcion);
			articulos[i].setPrecioCompra(precioCompra);
			articulos[i].setPrecioVenta(precioVenta);
			articulos[i].setStock(stock);

			// Cambiamos el valor del boolean
			modificado = true;
		}

		// Devuelve el boolean
		return modificado;
	}

	/**
	 * Función que añade una cantidad x del articulo
	 * 
	 * @param codigo   Codigo del articulo
	 * @param cantidad Cantidad a incrementar
	 * @return Devuelve si se ha añadido o no
	 */
	public static boolean entrada(int codigo, int cantidad) {
		// Variable donde se almacenará si se ha añadido o no
		boolean anyadido = false;

		// Variable donde se almacenará la posicion
		int i = buscaArticulo(codigo);

		// Variable donde se almacenará el número de stock del artículo
		int stock = 0;

		// Comprobamos si la posición no se sale del array
		if (i < articulos.length) {
			// Obtenemos el stock
			stock = articulos[i].getStock();

			// Aumentamos el stock
			stock += cantidad;

			// Aumentamos el stock
			articulos[i].setStock(stock);

			// Cambiamos el valor del boolean
			anyadido = true;
		}

		// Devolvemos el boolean
		return anyadido;
	}

	/**
	 * Función que saca cantidades x del artículo
	 * @param codigo Código del artículo
	 * @param cantidad Cantidad a sacar
	 * @return Devuelve si se ha sacado o no
	 */
	public static boolean salida(int codigo, int cantidad) {
		// Variable donde se almacenará si se ha sacado o no
		boolean sacado = false;

		// Variable donde se almacenará la posicion
		int i = buscaArticulo(codigo);

		// Variable donde se almacenará el número de stock del artículo
		int stock = 0;

		// Comprobamos si la posición no se sale del array
		if (i < articulos.length) {
			// Obtenemos el stock
			stock = articulos[i].getStock();
			System.out.println(stock);
			
			// Comprobamos que el stock no quede en negativo
			if (stock - cantidad >= 0) {
				// Decrementamos el stock
				stock -= cantidad;

				// Aumentamos el stock
				articulos[i].setStock(stock);

				// Cambiamos el valor del boolean
				sacado = true;
			}
		}

		// Devolvemos el boolean
		return sacado;
	}

	/**
	 * Función que busca un artículo en el array
	 * 
	 * @param codigo Código del artículo
	 * @return Devuelve la posición del artículo en el array
	 */
	public static int buscaArticulo(int codigo) {
		// Variable donde se almacenará la posición
		int i = 0;

		// Bucle para buscar el código en el array
		while (i < articulos.length && (articulos[i] == null || articulos[i].getCodigo() != codigo)) {
			i++;
		}

		// Devolvemos la posición
		return i;
	}

}
