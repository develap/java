package clases.internas;

public class ClaseInterna {
	
	private String nombreClase = "CLASE_INTERNA";
	
	
	ClaseInterna(){
		ClasePrivada foo = new ClasePrivada();
		foo.nombreClaseInterna = "NUEVO_NOMBRE";
		foo.getMsg();		
		
		new ClaseProtegida();
		new ClasePublica();
	}

	/*
	 * Se pueden definir subclases privadas, protegidas o publicas.
	 */
	
			private class ClasePrivada{
				public String nombreClaseInterna = "ClasePrivada";			
				
				ClasePrivada(){				
					System.out.println("La Clase Privada " + nombreClaseInterna +  " es interna de " + nombreClase);
				}
				
				private void getMsg(){
					System.out.println("La Clase Privada " + nombreClaseInterna +  " es interna de " + nombreClase);
				}
			}
		
			protected class ClaseProtegida{
				public String nombreClaseInterna = "ClaseProtegida";
				
				ClaseProtegida(){
					System.out.println("Clase Protegida de " + nombreClase);
				}
			}
			
			public class ClasePublica{
				public String nombreClaseInterna = "ClasePublica";
				
				ClasePublica(){
					System.out.println("Clase Publica " + nombreClase);
				};
			}
	
		
	
	public static void main(String[] args) {
		new ClaseInterna();
		
		/*
		 *  <!> Error al declarar:
		 *  
		*	new ClasePrivada();
		*	new ClaseProtegida();
		*	new ClasePublica();
		*
		*	Necesitarķamos declarar las clases como static:
		*
		*	No enclosing instance of type ClaseInterna is accessible. 
		*	Must qualify the allocation with an enclosing instance of 
		*	type ClaseInterna (e.g. x.new A() where x is an instance 
		*	of ClaseInterna).
		*
		**/
	}
	
}
