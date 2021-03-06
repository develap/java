package retorno.funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
	
	

	public String devuelveObjetoPrimitivo(int num) {
		String objPrimitivo = "Hola a todos ";
		if (num % 2 == 0) {
			objPrimitivo = objPrimitivo + "PAR";
			return objPrimitivo;
		} else {
			return objPrimitivo + "IMPAR";
		}
	}

	public int[] devuelveVector() {
		int[] vector1 = new int[] { 1, 2, 3, 4 };

		int[] vector2 = { 1, 2, 3, 4 }; // Que diferencia hay entre estos tipos
										// de definiciones?
		
		System.out.println("Function vec ref = " + vector2);

		return vector2; // Pasamos la regerencia o el valor ??
						// Repasar paso por valor o referencia.
	}

	/*
	 * Nota: Los vectores en Java no se pueden redimensiona
	 */

	public double[] devuelveVectorDecimales(int size) {
		double[] vector = new double[size]; // Crea un vector del tama�o
											// indicado

		// for(double elem:vector)
		// elem = 2.2;
		/**
		 * Este NO cambiar el valor de los elementos Para ello tendremos que
		 * acceder con el operador [] Mejor, para este caso, user el siguiente
		 * bucle:
		 **/

		for (int i = 0; i < size; i++)
			vector[i] = i + 2.5; 	// Convertir� e entero (i) a doble (contenido
									// de vector)
									// siempre converte del m�s peque�o al mas
									// grande (en esta caso de INT a DOUBLE)
		return vector;
	}
	
	
	/***********************************************************************************/
	
	public ArrayList<String> devuelveArrayList(){
		/*
		 * Arrays.asList : Transforma el Array, como un ArrayList.
		 */
		String[] array = new String[10];
		
		
		/** Esto no funciona : 
		 * 	Arrays hereda de Object --> Cannot be cast to java.util.ArrayList 
		 * **/
		// ArrayList<String> result = (ArrayList<String>) Arrays.asList("a", "b", "c", "d");
		
		
		/** M�todo 1 
		 * 	Utiliza un m�todo constructor de la clase ArrayList:
		 * **/
		
		ArrayList<String> result = new ArrayList<String>( Arrays.asList("a", "b", "c", "d") );		
			
		/** Metodo 2
			ArrayList<String> result = new ArrayList<String>();
			result.add("a");
			result.add("b");
			result.add("c");
		****/
			
		return result;
	}
	
	
	/***********************************************************************************/
	
	
	public ArrayList<Persona> devuelveArrayListPersonas(){
		ArrayList<Persona> result = new ArrayList<Persona>( Arrays.asList(new Persona("a"), new Persona("b")) );
		return result;
	}
	
	
	
		/***********************************************************************************
		 * Ejemplo. Devuelve un vector de objetos Persona;
		 *  
		 */
		
			public static class Persona{
				static String name;
				Persona(String n){name = n;}
				public String getName() { return name; }
				public void setName(String name) { this.name = name; }
				
				public static Persona devuelvePersona(){
					return new Persona("Juanito");
				}
				
			}
			
			public Persona[] devuelveVectorPersona(){
				//Persona[] vectorPersona = {new Persona(), new Persona()};		
				//Persona[] vectorPersona = new Persona[10];
				//Persona[] vectorPersona = new Persona[]{};
				Persona[] vectorPersona = new Persona[]{new Persona("a"), 
														new Persona("b"),
														new Persona("c"),
														new Persona("d")};
				return vectorPersona;
			}
		
}
