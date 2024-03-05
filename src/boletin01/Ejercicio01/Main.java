package boletin01.Ejercicio01;

import java.util.Scanner;

public class Main {
	
	// Elemento estático CuentaCorriente
	static CuentaCorriente cc;
	
	// Elemento estático Scanner
	static Scanner sc;
	
	// Variable donde se almacenará la opción seleccionada
	static int opcion;

	public static void main(String[] args) {
		// Variable donde se almacenará el nombre del titular
		String nombre = "";
		
		// Variable donde se almacenará el dni del titular
		String dni = "";
		
		// Variable donde se almacenará el saldo inicial
		double saldoInicial;
		
		// Variable donde se almacenará si desea seguir o no
		String sale = "";
		
		// Creamos el Scanner
		sc = new Scanner(System.in);
		
		// Le pedimos el nombre al usuario
		System.out.println("¿Cuál es el nombre del titular? (Puede dejarlo vacío)");
		nombre = sc.nextLine().toUpperCase();
		
		// Ejecutamos mientras el dni esté vacío
		do {
			// Le pedimos el dni al usuario
			System.out.println("¿Cuál es el DNI del titular?");
			dni = sc.nextLine().toUpperCase();
		} while (dni.equals(""));
		
		// Ejecutamos mientras el saldo sea menor que 0
		do {
			// Le pedimos el saldo inicial al usuario
			System.out.println("¿Cuál es el saldo inicial?");
			saldoInicial = sc.nextDouble();
		} while (saldoInicial < 0);
		
		// Iniciamos el objeto CuentaCorriente
		// Comprobamos si hay nombre del titular
		if (!nombre.equals("")) {
			cc = new CuentaCorriente(dni, nombre, saldoInicial);
		} else {
			cc = new CuentaCorriente(dni, saldoInicial);
		}
		
		// Ejecutamos mientras el usuario no ingrese el caracter S
		do {
			// Elemento decorador
			System.out.println("\n----------------------------------------------------------------\n");
			
			// Le mostramos el menú al usuario
			showMenu();
			
			// Mostramos la opción seleccionada
			optionSelected(opcion);
			
			// Elemento decorador
			System.out.println("\n----------------------------------------------------------------\n");
			
			// Le preguntamos al usuario si desea continuar
			System.out.println("¿Desea salir? (S para salir, cualquier otra letra para continuar)");
			sale = sc.next();
		} while (!sale.equalsIgnoreCase("S"));
		
		System.out.println("Cerrando sesión...");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Función que muestra el menú de opciones
	 */
	static void showMenu() {
		// Mostramos las opciones mientra la opción elegida no esté entre 1 y 3
		do {
			// Mostramos el mensaje con las opciones
			System.out.println(
					"¿Qué desea hacer?\n" + 
					"1. Mostrar información\n" +
					"2. Retirar fondos\n" + 
					"3. Ingreso"
				);
			// Leemos la opción seleccionada
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 3);
	}
	
	/**
	 * Función que ejecuta la opción seleccionada
	 * @param opcion Opción seleccionada
	 */
	static void optionSelected(int opcion) {
		// Switch para mostrar la opción seleccionada
		switch (opcion) {
			// Opción 1 muestra la información de la cuenta
			case 1:
				// Mostramos la información de la cuenta
				System.out.println(cc.muestraInformacion());
				break;
			
			/* Opción 2 retira dinero y muetra el saldo actual
			 * si es posible y muestra mensaje de error si no es posible */
			case 2:
				// Le pedimos cuanto desea retirar y lo retiramos si es posible
				if (cc.sacarDinero(pideMovimiento(false))) {
					// Mostramos el nuevo saldo actual
					System.out.println(cc.muestraSaldo());
				} else {
					// Mostramos el mensaje de fondos insuficientes
					System.out.println("FONDOS INSUFICIENTES");
				}
				break;
			
			// Opción 3 ingresa dinero en la cuenta y muestra el saldo actual
			case 3:
				// Le pedimos cuanto desea ingresar y lo ingresamos
				cc.ingresarDinero(pideMovimiento(true));
				// Mostramos el nuevo saldo actual
				System.out.println(cc.muestraSaldo());
				break;
		}
	}
	
	/**
	 * Función que pide cuanto desea ingresar o retirar
	 * @param op Boolean que indica si se va a retirar o a ingresar
	 * @return Saldo a retirar/ingresar
	 */
	static double pideMovimiento(boolean op) {
		// Variable donde se almacenará el saldo a ingresar o retirar
		double saldoMovimiento = 0;

		// Elemento decorador
		System.out.println("\n----------------------------------------------------------------\n");
		
		// Le pedimos cuanto desea ingresar o retirar 
		System.out.println("¿Cuánto desea " + (op ? "ingresar" : "retirar") + "?");
		saldoMovimiento = sc.nextDouble();
				
		// Devolvemos el saldo a retirar o ingresar
		return saldoMovimiento;
	}
	
}
