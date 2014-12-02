package excepciones;

public class Main {

	public static void main(String[] args) {
		
		MiExcepcion exp = new MiExcepcion("Excepcion");
		
		try {
			exp.lanzarExcepcion();
		} catch (MiExcepcion e) {
			e.printStackTrace();
		}
		
	}

}
