package boletin02.ejercicio03;

/**
 * Clase que almacena los atributos de un pizza
 * 
 * @author Amaro
 * @version 1.0
 */
public class Pizza {

	/**
	 * Atributo que almacena el código único de la pizza
	 */
	private int codigo = 0;

	/**
	 * Atributo que almacena el tamaño de la pizza pudiendo ser Mediana o Familiar
	 */
	private String tamanyo = "";

	/**
	 * Atributo que almacena el tipo de la pizza pudiendo ser Margarita,
	 * CuatroQuesos o Funghi
	 */
	private String tipo = "";

	/**
	 * Atributo que almacena el estado de la pizza pudiendo ser Pedida o Servida
	 */
	private String estado = "Pedida";

	/**
	 * Constructor vacío
	 */
	public Pizza() {
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo  Código único de la pizza
	 * @param tamanyo Tamaño de la pizza
	 * @param tipo    Tipo de la pizza
	 */
	public Pizza(int codigo, String tamanyo, String tipo) {
		// Comprobamos que el codigo no sea negativo
		if (codigo >= 0) {
			this.codigo = codigo;
		}

		/* Comprobamos que el tamaño no sea nulo, vacío ni un valor diferente a Mediana
		 * o Familiar
		 */
		if (tamanyo != null && !tamanyo.equals("") && (tamanyo.equals("Mediana") || tamanyo.equals("Familiar"))) {
			this.tamanyo = tamanyo;
		}

		/*
		 * Comprobamos que el tipo no sea nulo, vacío ni un valor diferente a Margarita,
		 * CuatroQuesos o Funghi
		 */
		if (tipo != null && !tipo.equals("")
				&& (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}
	}

	/**
	 * Función que devuelve el código de la pizza
	 * 
	 * @return Devuelve el código de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Función que almacena el código
	 * 
	 * @param codigo Código único de la pizza
	 */
	public void setCodigo(int codigo) {
		// Comprobamos que el codigo no sea negativo
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Función que obtiene el tamaño de la pizza
	 * 
	 * @return Devuelve el tamaño de la pizza
	 */
	public String getTamanyo() {
		return tamanyo;
	}

	/**
	 * Función que almacena el tamaño de la pizza
	 * 
	 * @param tamanyo Tamaño de la pizza
	 */
	public void setTamanyo(String tamanyo) {
		/* Comprobamos que el tamaño no sea nulo, vacío ni un valor diferente a Mediana
		 * o Familiar
		 */
		if (tamanyo != null && !tamanyo.equals("") && (tamanyo.equals("Mediana") || tamanyo.equals("Familiar"))) {
			this.tamanyo = tamanyo;
		}
	}

	/**
	 * Función que devuelve el tipo de la pizza
	 * 
	 * @return Devuelve el tipo de la pizza
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Función que almacena el tipo de la pizza
	 * 
	 * @param tipo Tipo de la pizza
	 */
	public void setTipo(String tipo) {
		/* Comprobamos que el tipo no sea nulo, vacío ni un valor diferente a Margarita,
		 * CuatroQuesos o Funghi
		 */
		if (tipo != null && !tipo.equals("")
				&& (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}
	}

	/**
	 * Función que devuelve el estado de la pizza
	 * 
	 * @return Devuelve el estado de la pizza
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Función que almacena el estado de la pizza
	 * 
	 * @param estado Estado de la pizza
	 */
	public void setEstado(String estado) {
		// Comprobamos que el estado no sea nulo, vacío ni un valor diferente a Pedida o Servida
		if (estado != null && !estado.equals("") && 
				(estado.equals("Pedida") || estado.equals("Servida"))) {
			this.estado = estado;
		}
	}
	
	/**
	 * Función que devuelve la información de la pizza
	 * 
	 * @return Devuelve la información de la pizza
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la cadena
		String cadena = "";
		
		// Almacenamos la información
		cadena += "Código: " + this.codigo;
		cadena += "\nTamaño: " + this.tamanyo;
		cadena += "\nTipo: " + this.tipo;
		cadena += "\nEstado: " + this.estado;
		cadena += "\n-----------------------------";
		
		// Devolvemos la cadena
		return cadena;
	}

}
