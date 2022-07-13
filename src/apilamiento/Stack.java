package apilamiento;

import java.util.Vector;

/**
 * 
 * @author Ana Sappia Rey
 * La clase @class Stack define una clase que permite apilar y desapilar elementos. 
 */

public class Stack {
/**
 * Se define el número de elementos de la pila
 */
	private int tamaño;
	/**
	 * Variable donde se guarda la información de la pila
	 */
	private Vector<Integer> elementos;
/**
 * Constructor que inicializa el apilamiento 
 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tamaño = 0;
	}
/** 
 * Con este método se comprueba si la pila está o no vacía
 * @return boolean
 */
	
	
	public boolean stackVacio () {
		if (tamaño==0) {
			return true;
		}
		return false;
	}

	/**
	 * Método para agregar un nuevo elemento a la pila
	 * @param o entero
	 */
	
	public void apilar ( Integer o ) {
		elementos.add(tamaño, o);
		tamaño++;
	}

	/**
	 * Método para recuperar el último elemento que se haya apilado
	 * @return entero
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tamaño);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack está vacio");
			return null;
		}
	}
	
	/**
	 * Método que devuelve el número de elementos que tiene la pila
	 * @return entero
	 */

	public int getNumElements() {
		return tamaño;
	}
	
	

	@Override
	public String toString() {
		return "Stack [tamaño=" + tamaño + ", elementos=" + elementos + "]";
	}

/** 
 * Clase que amplía la clase "Exception" de java
 * @author Ana Sappia Rey
 *
 */

	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}


	
}

