package excepciones;


public class MiExcepcion extends Exception{
	
	private String action;

	/**
	 * @param action
	 */
	public MiExcepcion(String action) {
		super();
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public void lanzarExcepcion() throws MiExcepcion{
		if(action.equals("Hola"))
			throw new MiExcepcion("Adios");
		if(action.equals("Adios"))
			throw new MiExcepcion("Hola");
		if(action.equals("Excepcion"))
			throw new MiExcepcion("Error");
		
		/**
		 * Con el 'throw' obligamos a tratar la excepción con el try... catch...
		 */
	}
	
	@Override
	public String getMessage(){
		return action;		
	}
	
}
