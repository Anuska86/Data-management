package apilamiento;

import java.util.Vector;

/**
 * 
 * @author Ana Sappia Rey
 * La clase @class Stack define una clase que permite apilar y desapilar elementos. 
 */

public class Stack {
/**
 * Se define el n�mero de elementos de la pila
 */
	private int tama�o;
	/**
	 * Variable donde se guarda la informaci�n de la pila
	 */
	private Vector<Integer> elementos;
/**
 * Constructor que inicializa el apilamiento 
 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tama�o = 0;
	}
/** 
 * Con este m�todo se comprueba si la pila est� o no vac�a
 * @return boolean
 */
	
	
	public boolean stackVacio () {
		if (tama�o==0) {
			return true;
		}
		return false;
	}

	/**
	 * M�todo para agregar un nuevo elemento a la pila
	 * @param o entero
	 */
	
	public void apilar ( Integer o ) {
		elementos.add(tama�o, o);
		tama�o++;
	}

	/**
	 * M�todo para recuperar el �ltimo elemento que se haya apilado
	 * @return entero
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tama�o);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack est� vacio");
			return null;
		}
	}
	
	/**
	 * M�todo que devuelve el n�mero de elementos que tiene la pila
	 * @return entero
	 */

	public int getNumElements() {
		return tama�o;
	}
	
	

	@Override
	public String toString() {
		return "Stack [tama�o=" + tama�o + ", elementos=" + elementos + "]";
	}

/** 
 * Clase que ampl�a la clase "Exception" de java
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

