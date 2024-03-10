package boletin02.ejercicio03;

/**
 * Clase que contiene los métodos de los pedidos
 * 
 * @author Amaro
 * @version 1.0
 */
public class Pedidos {

	/**
	 * Atributo que almacena un array de hasta 50 pizzas
	 */
	public static Pizza[] pizzas = new Pizza[50];

	/**
	 * Función que imprime las pizzas que no sean nulas
	 */
	public static void listado() {
		// Bucle para recorrer el array
		for (Pizza pizza : pizzas) {
			// Comprobamos que no sea nulo
			if (pizza != null) {
				// Imprimimos la información de la pizza
				System.out.println(pizza);
			}
		}
	}

	/**
	 * Función que añade un nuevo pedido
	 * 
	 * @param codigo Código único de la pizza
	 * @param tamanyo Tamaño de la pizza
	 * @param tipo Tipo de la pizza
	 * @return Devuelve si se ha añadido o no
	 */
	public static boolean nuevoPedido(int codigo, String tamanyo, String tipo) {
		// Variable donde se almacenará si se ha creado el nuevo pedido o no
		boolean anyadido = false;
		
		// Variable donde se almacenará la posición
		int i = 0;

		// Creamos el nuevo objeto Pizza
		Pizza pizza = new Pizza(codigo, tamanyo, tipo);

		// Bucle para recorrer el array hasta encontrar una posición nula o salirnos de la longitud 
		while (i < pizzas.length && pizzas[i] != null) {
			// Incrementamos la posición
			i++;
		}
		
		// Comprobamos que la posición esté dentro de la longitud del array
		if (i < pizzas.length) {
			// Añadimos la pizza al array
			pizzas[i] = pizza;
			
			// Cambiamos el valor del boolean
			anyadido = true;
		}

		// Devolvemos el boolean
		return anyadido;
	}
	
	/**
	 * Función que cambia el estado de la pizza a servida
	 * 
	 * @param codigo Código de la pizza
	 * @return Devuelve si se ha podido servir
	 */
	public static boolean pizzaServida(int codigo) {
		// Variable donde se almacenará si se ha servido o no
		boolean servida = false;
		
		// Variable donde se almacenará la posición de la pizza en el array
		int i = buscaPizza(codigo);
		
		// Comprobamos que la posición no se salga del array
		if (i < pizzas.length) {
			// Cambiamos el estado de la pizza
			pizzas[i].setEstado("Servida");
			
			// Cambiamos el estado del boolean
			servida = true;
		}
		
		// Devolvemos el boolean
		return servida;
	}
	
	/**
	 * Función auxiliar que busca el código de la pizza en el array y
	 * devuelve la posición de esta en el array
	 * 
	 * @param codigo Código de la pizza
	 * @return Devuelve la posición de la pizza en el array
	 */
	public static int buscaPizza(int codigo) {
		// Variable donde se almacenará la posición de la pizza en el array
		int i = 0;
		
		while (i < pizzas.length && (pizzas[i] == null || pizzas[i].getCodigo() != codigo)) {
			// Incrementamos la posición
			i++;
		}
		
		// Devolvemos la posición
		return i;
	}

}
