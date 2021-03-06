package Fruticola;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args){	
		
		Fruta frutas[] = new Fruta[11]; 
				
		frutas[0] = new Fuji(13, "rojo", 0.6699);
		frutas[1] = new Golden(13, "rojo", 0.6699);
		frutas[2] = new Melocoton(13, "rojo", 0.6699);
		frutas[3] = new Melocoton(13, "rojo", 0.6699);
		frutas[4] = new Pera(13, "rojo", 0.6699);
		frutas[5] = new Fuji(13, "rojo", 0.6699);
		frutas[6] = new Golden(13, "rojo", 0.6699);
		frutas[7] = new Pera(13, "rojo", 0.6699);
		frutas[8] = new Pera(13, "rojo", 0.6699);
		frutas[9] = new Golden(13, "rojo", 0.6699);
		
		//frutas[10] = new Manzana();  
		/** 	Ahora manzana es abstracta, no se puede instanciar 
		 ** 	pero si que se pueden referenciar desde una clase 'hija'.
		 ***/
		
		
		//frutas[0].getAzucar();
		((Fuji)frutas[0]).getAzucar();
		
		
		for(Fruta elem: frutas){
			//System.out.println(elem.getClass().getName());
			System.out.println(elem.vender(elem));
		}
		
		Fuji.vender(frutas[0]);
		frutas[0].precio = 10;
		
		//System.out.println(fruta instanceof Fuji);		
		//System.out.println(fruta.vender(fruta));
		
		
		/*
		 *  Inserci�n de los elementos en una lista
		 */
		ArrayList listaFrutas = new ArrayList<>();
		
		for(Fruta elem: frutas)
			listaFrutas.add(elem);
		
		for(Object elem: listaFrutas)		// No podemos poner for(Fruta elem: listaFrutas), Pues ArrayList almacena Objects
			System.out.println(elem);
		
		
		/*
		 *	Con <Manzana> Indicamos que esta lista es capaz de contener cualquier objeto que implementa Manzana.
		 *
		 *	Ojo, no podremos hacer esto : Manzana m = new Manzana();
		 *
		 *	pero si ArrayList<Manzana>
		 */
		
		
		System.out.println("----------------------------------------------");
		
		Fruta manzanas[] = new Fruta[10];

		manzanas[0] = new Fuji(13, "rojo", 0.6699);
		manzanas[1] = new Golden(13, "rojo", 0.6699);
		manzanas[2] = new Melocoton(13, "rojo", 0.6699);
		
		ArrayList<Manzana> listaManzanas = new ArrayList<>();
		
		

			try {
				listManzanas(listaManzanas, manzanas);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		/*
		try{
			for(Fruta elem: manzanas)
				listaManzanas.add((Manzana) elem);
		}
		catch(ClassCastException e){
			System.out.println("---------------------------\n" + e + "\n---------------------------");
		}
		finally{
			// Instrucciones que ejecutar� al final
			System.out.println("--------------- Finally -----------------");
		}
		*/

		
		
		//------------------------------------------------------------------------------------------
		//------------------------------------------------------------------------------------------
		
		
		for(Manzana elem: listaManzanas){
			//System.out.println(elem);
			elem.centenares();
		}
	}
	
	/*
	 * Con el "throws" lanzamos la excepci�n para que sea tratada por la llamada.
	 * Asi podremos user el try / catch para tratar la excepci�n.
	 * El "throws" nos informa de las excepciones que es conveniente tratara.
	 * 
	 * Throw (sin 's') obliga a tratar las excepciones desde la llamada.
	 * 
	 */
	public static void listManzanas(ArrayList<Manzana> listaManzanas, Fruta [] manzanas) throws Exception
	{
			for(Fruta elem: manzanas)
				listaManzanas.add((Manzana) elem);
	}
	
}
