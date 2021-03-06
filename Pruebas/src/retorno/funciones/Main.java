package retorno.funciones;

import retorno.funciones.MyClass.*;

public class Main{

	
	
/************************************************************************/

	public void metodo1(String s){
		Persona.name = s;		// Si la variable es est�tica, entonces nos deja acceder.
	}
	
	public void metodo2(){
		Persona persona = new Persona("persona");
		Persona.name = "animal";
	}
	
/************************************************************************/
	
	

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		int[] vec = obj.devuelveVector();
		
		System.out.println("Main vec ref = " + vec);
		
		for(int elem:vec)
			System.out.println(elem);
		
		
		
		/*** O Tambi�n se puede:
		 * 
			for(int elem:obj.devuelveVector())
				System.out.println(elem);
		 ***/
		
		//JOptionPane.showMessageDialog(null, "Length of vec is " + vec.length);
		

		
		/** Si la clase internet es 'static' instanciar el m�todo persona de este modo:
		 * 
		 */
			Persona p1 = new Persona("Monolito");
			Persona p2 = p1.devuelvePersona();		
		/************************************************************************/
			
	/*
	 * Recorrer un vector de personas:
	 */
		
		Persona[] vecPersonas = obj.devuelveVectorPersona(); //new Persona[]{};
		System.out.println(vecPersonas);
		for(Persona per:vecPersonas)
			System.out.println(per);
		
		
		/************************************************************************/
		
		for(Persona elem:obj.devuelveArrayListPersonas()){
			System.out.println(elem.getName());
		}
			
	}
}
