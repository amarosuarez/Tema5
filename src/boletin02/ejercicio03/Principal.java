package boletin02.ejercicio03;

import java.util.Scanner;

import boletin02.Lectura;

public class Principal {
	
	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variable donde se almacenará el código unico de la pizza
		int codigo = 0;
		
		// Variable donde se almacenará el código de la pizza a buscar
		int codigoBusqueda = 0;
		
		// Variable donde se almacenará el tamaño de la pizza
		String tamanyo = "";
		
		// Variable donde se almacenará el tipo de la pizza
		String tipo = "";
		
		// Variable donde se almacenará la elección del usuario
		int eleccion = 0;
		
		// Bucle que se ejecuta hasta que el usuario indique salirse
		do {
			// Imprimimos el menú y leemos la elección del usuario
			menu();
			eleccion = sc.nextInt();
			
			// Ejecutamos la eleccion
			switch (eleccion) {
			case 1:
				// Listado de pizzas
				// Mostramos las pizzas
				Pedidos.listado();
				break;
				
			case 2:
				// Nuevo pedido
				// Agregamos el código
				codigo++;
				
				// Bucle para preguntar el tamaño mientras el valor introducido no sea correcto
				do {
					// Le pedimos el tamaño y lo almacenamos
					tamanyo = Lectura.preguntaString("¿Cuál es el tamaño? (Mediana o Familiar)");
				} while (!tamanyo.equals("Mediana") && !tamanyo.equals("Familiar"));
				
				// Bucle para preguntar el tipo mientras el valor introducido no sea correcto
				do {
					// Le pedimos el tipo y lo almacenamos
					tipo = Lectura.preguntaString("¿Cuál es el tipo? (Margarita, CuatroQuesos o Funghi)");
				} while (!tipo.equals("Margarita") && !tipo.equals("CuatroQuesos") && !tipo.equals("Funghi"));
				
				// Comprobamos que se haya almacenado el nuevo pedido
				if (Pedidos.nuevoPedido(codigo, tamanyo, tipo)) {
					// Indicamos que se ha almacenado
					System.out.println("Nuevo pedido almacenado correctamente");
				} else {
					// Indicamos que no se ha almacenado
					System.out.println("No se ha podido efectuar el pedido");
				}
				
				break;
			
			case 3:
				// Servir pizza
				// Le preguntamos el código y lo almacenamos
				codigoBusqueda = Lectura.preguntaInt("¿Cuál es el código de la pizza?");
				
				// Comprobamos que se haya podido servir
				if (Pedidos.pizzaServida(codigoBusqueda)) {
					// Indicamos que se ha servido
					System.out.println("¡Pizza servida!");
				} else {
					// Indicamos que no se ha servido
					System.out.println("No se ha encontrado la pizza");
				}
				
				break;
			}
		} while (eleccion != 4);
		
		// Mostramos el mensaje de despedida
		System.out.println("¡Hasta pronto!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que imprime el menú
	static void menu() {
		// Imprimimos el menú
		System.out.println(
			"\nMENÚ" +
			"\n--------------------" + 
			"\n1. Listado de pizzas" +
			"\n2. Nuevo pedido" +
			"\n3. Pizza servida" +
			"\n4. Salir"
		);
	}
	
}
