package boletin01.Ejercicio01;

/**
 * Clase que almacena los métodos para ingresar, retirar y mostrar información
 * de una cuenta corriente
 * 
 * @author Amaro
 * @version 1.0
 */
public class CuentaCorriente {
	
	/**
	 * Atributo que almacena el DNI de titular
	 */
	private String dni = "";
	
	/**
	 * Atributo que almacena el nombre del titular
	 */
	private String nombre = "";
	
	/**
	 * Atributo que almacena el saldo del titular
	 */
	private double saldo = 0.0;
		
	/**
	 * Constructor con los parámetros DNI y saldo
	 * @param dni DNI del titular
	 * @param saldo Saldo inicial del titular
	 */
	public CuentaCorriente(String dni, double saldo) {
		// Comprobamos que el dni no sea nulo ni vacío
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		
		// Comprobamos que el saldo sea mayor o igual que 0
		if (saldo >= 0) {
			this.saldo = saldo;
		}
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
	 * Función que devuelve el DNI
	 * @return Devuelve el DNI
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Función que añade el DNI
	 * @param dni DNI del titular
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Función que devuelve el nombre
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Función que añade el nombre
	 * @param nombre Nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Función que devuelve el saldo
	 * @return Saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Función que añade el saldo
	 * @param saldo Salddo del cliente
	 */
	public void setSaldo(double saldo) {
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
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
	}
	
	/**
	 * Función que muestra la información de la cuenta
	 */
	public String muestraInformacion() {
		// Variable donde se almacenará la información
		String cadena = "";
		
		// Elemento decorador
		cadena += "----------------------------------------------------------------\n";
		
		// Almacenamos la información
		cadena += "\t\tINFORMACIÓN DE LA CUENTA\n";
		cadena += "DNI DEL TITULAR: " + this.dni;
		
		// Comprobamos si el nombre no está vacío para mostrarlo
		if (this.nombre != null && !this.nombre.equals(""))  {
			cadena += "\nNOMBRE DEL TITULAR: " + this.nombre;
		}
		
		cadena += "\nSALDO ACTUAL: " + this.saldo + " €";
		
		// Devolvemos la cadena
		return cadena;
	}
	
	/**
	 * Función que muestra el saldo actual
	 */
	public String muestraSaldo() {
		// Variable donde se almacenará el saldo actual
		String cadena = "";
		
		// Almacenamos el saldo actual
		cadena += "Su saldo actual es: " + this.saldo + " €";
		
		// Devolvemos la cadena
		return cadena;
	}
}
