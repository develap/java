package empleados;

public class EmpleadoAsalariado extends Empleado{

	private Integer sueldoFijo;

	/**
	 * @param sueldoFijo
	 */
	public EmpleadoAsalariado(Integer sueldoFijo) {
		super();
		this.sueldoFijo = sueldoFijo;
	}

	/**
	 * @param nombre
	 * @param sueldoFijo 
	 */
	public EmpleadoAsalariado(String nombre, Integer sueldoFijo) {
		super(nombre);
		this.sueldoFijo = sueldoFijo;
	}

	public Integer getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(Integer sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	
	
	public String presentarInfo(){
		return super.presentarInfo() + "Salario: " + Integer.toString(this.sueldoFijo);
	}
}
