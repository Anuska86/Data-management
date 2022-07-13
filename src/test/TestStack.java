package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import apilamiento.Stack;

public class TestStack {
		
		private Stack pilaLlena;

		private Stack pilaVacia;
		
		@BeforeEach
		public void setUp() throws Exception {
			pilaLlena=new Stack();
			pilaLlena.apilar(1);
			pilaLlena.apilar(2);
			pilaVacia=new Stack(); 
		}
		
		//Comprueba que el método StackVacio devuelve un array vacío cuando está vacío 
		@Test
		public void testStackVacio() {
			assertEquals(pilaVacia.getNumElements(),0);
			
		}
		
		//Comprueba que el método Apilar añada elementos a la pila
		@Test
		public void testApilar() {
			int i=8;
			int tamanyo=pilaLlena.getNumElements();
			pilaLlena.apilar(i);
			assertEquals(pilaLlena.getNumElements(),tamanyo+1);
		}

		//Comprueba que el método DesapilarpilaVacía funciona correctamente cuando se le pasa 
		//una pila sin elementos
		@Test
		public void testDesapilarpilaVacia() {
			int tamanyo=pilaVacia.getNumElements();
			Integer i=pilaVacia.desapilar();
			assertEquals(i,null);
			assertEquals(pilaVacia.getNumElements(),tamanyo);
			
		}
		
		//Comprueba que el método DesapilarpilaLLena elimina un elemento de una pila con contenido
		@Test
		public void testDesapilarpilaLlena() {
			int contar=pilaLlena.getNumElements();
			int i=pilaLlena.desapilar();
			assertEquals(i,2);
			assertEquals(pilaLlena.getNumElements(),contar -1);
		}

		//Comprueba que el método GetNumElements trae los elementos apilados
		@Test
		public void testGetNumElements() {
			int numero=0;
			numero=pilaLlena.getNumElements();
			assertEquals(numero,2);
		}

	

}
