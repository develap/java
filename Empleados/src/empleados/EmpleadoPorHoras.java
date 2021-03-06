package empleados;

public class EmpleadoPorHoras extends Empleado{

	private Integer precioHora;

	/**
	 * @param precioHora
	 */
	public EmpleadoPorHoras(Integer precioHora) {
		super();
		this.precioHora = precioHora;
	}

	public Integer getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(Integer precioHora) {
		this.precioHora = precioHora;
	}
	
	public String presentarInfo(){
		return super.presentarInfo() + "Precio Hora: " + Integer.toString(this.precioHora);
	}
}
