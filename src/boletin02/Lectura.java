package boletin02;

import java.util.Scanner;

public class Lectura {
	static Scanner sc = new Scanner(System.in);
	
	public static int preguntaInt(String mensaje) {
		// Variable donde se almacenará el entero
		int entero = 0;
		
		// Preguntamos y leemos
		System.out.println(mensaje);
		entero = sc.nextInt();
		
		// Limpiamos el Scanner
		sc.nextLine();
		
		// Devolvemos el entero
		return entero;
	}
	
	public static String preguntaString(String mensaje) {
		// Variable donde se almacenará el String
		String cadena = "";
		
		// Preguntamos y leemos
		System.out.println(mensaje);
		cadena = sc.nextLine();
		
		// Devolvemos el entero
		return cadena;
	}
	
	public static double preguntaDouble(String mensaje) {
		// Variable donde se almacenará el entero
		double doble = 0;
		
		// Preguntamos y leemos
		System.out.println(mensaje);
		doble = sc.nextDouble();
		
		// Limpiamos el Scanner
		sc.nextLine();
		
		// Devolvemos el entero
		return doble;
	}
}
