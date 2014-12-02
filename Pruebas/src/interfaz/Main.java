package interfaz;

public class Main {

	public static void main(String[] args) {
		
		IEjemplo ie = new IEjemplo() {				
				@Override
				public void foo() {
					System.out.println("Foo!");
				}
			};
		
		/**
		 * Java permite usar una interfaz a traves del new, sin necesidad 
		 * de la palabra clave 'implements'.
		 * Siempre que hagamos la definición de las interfaces.
		 */
		
		ie.foo();
	}

}
