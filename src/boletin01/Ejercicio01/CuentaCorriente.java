package boletin01.Ejercicio01;

public class CuentaCorriente {
	
	/**
	 * Atributo que almacena el DNI de titular
	 */
	private String dni;
	
	/**
	 * Atributo que almacena el nombr del titular
	 */
	private String nombre;
	
	/**
	 * Atributo que almacena el saldo del titular
	 */
	private double saldo;
		
	/**
	 * Constructor con los parámetros DNI y saldo
	 * @param dni DNI del titular
	 * @param saldo Saldo inicial del titular
	 */
	public CuentaCorriente(String dni, double saldo) {
		// Comprobamos que el dni no sea nulo ni vacío
		if (dni != null && !dni.equals(""))
			this.dni = dni;
		
		// Comprobamos que el saldo sea mayor o igual que 0
		if (saldo >= 0)
			this.saldo = saldo;
	}
	
	/**
	 * Constructor con los parámetros DNI, nombre y saldo
	 * @param dni DNI del titular
	 * @param nombre Nombre del titular
	 * @param saldo Saldo inicial del titular
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		// Comprobamos que el dni no sea nulo ni vacío
		if (dni != null && !dni.equals(""))
			this.dni = dni;
		
		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		
		// Comprobamos que el saldo sea mayor o igual que 0
		if (saldo >= 0)
			this.saldo = saldo;
	}
	
	/**
	 * Función que indica si es posible sacar dinero o no, en caso positivo le resta la cantidad al saldo
	 * @param cantidad Cantidad a retirar
	 * @return Si es posible realizar la operación o no
	 */
	public boolean sacarDinero(double cantidad) {
		// Variable donde se almacenará el booleano
		boolean esPosible = false;
		
		/* Comprobamos que el saldo sea igual o mayor que la cantidad a retirar 
		 * para poder realizar la operación
		 */
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
			esPosible = true;
		}
			
		// Devolvemos el boolean
		return esPosible;
	}

	/**
	 * Función que incrementa el saldo según la cantidad
	 * @param cantidad Cantidad a incrementar
	 */
	public void ingresarDinero(double cantidad) {
		if (cantidad > 0)
			this.saldo += cantidad;
	}
	
	/**
	 * Función que muestra la información de la cuenta
	 */
	public void muestraInformacion() {
		// Elemento decorador
		System.out.println("\n----------------------------------------------------------------\n");
		
		// Mostramos la información
		System.out.println(
				"\t\tINFORMACIÓN DE LA CUENTA\n" +
				"DNI DEL TITULAR: " + this.dni
		);
		
		// Comprobamos si el nombre no está vacío para mostrarlo
		if (this.nombre != null && !this.nombre.equals(""))  {
			System.out.println("NOMBRE DEL TITULAR: " + this.nombre);
		}
		
		System.out.println("SALDO ACTUAL: " + this.saldo + " €");
	}
 
	/**
	 * Función que devuelve el saldo
	 * @return Saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
