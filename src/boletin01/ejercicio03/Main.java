package boletin01.ejercicio03;

public class Main {

	public static void main(String[] args) {
		// Creamos dos objetos
		Punto punto = new Punto(5, 2);
		Punto punto2 = new Punto(10, -4);
		
		// Imprimimos las coordenadas
		System.out.println("La coordenada del P1 es " + punto.imprime());
		System.out.println("La coordenada del P2 es " + punto2.imprime());
		
		// Modificamos las coordenadas
		punto.setXY(10, 4);
		System.out.println("La nueva coordenada del P1 es: " + punto.imprime());
		punto2.setXY(20, -8);
		System.out.println("La nueva coordenada del P2 es: " + punto2.imprime());
		
		// Desplazamos las coordenadas
		punto.desplaza(2, 5);
		System.out.println("La nueva coordenada del P1 es: " + punto.imprime());
		punto2.desplaza(5, 3);
		System.out.println("La nueva coordenada del P2 es: " + punto2.imprime());
		
		// Calculamos la distancia y la mostramos
		System.out.println("La distancia es: " + punto.distancia(punto2));
	}
	
}
