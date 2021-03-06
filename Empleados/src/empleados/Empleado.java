package empleados;

import java.util.ArrayList;

import com.aeat.valida.Validador;


public class Empleado extends Exception{
	
		Validador validador = new Validador();
	
		enum Sexo{h,m};
		
		private String nombre;
		private String apellido1;
		private String apellido2;
		private ArrayList<String> titulaciones = new ArrayList<>();
		private String dni;
		private String nuss;
		private int edad;
		private Sexo sexo;
		
		
		
		/**
		 * 
		 */
		public Empleado() {
			super();
		}
	

		/**
		 * @param nombre
		 */
		public Empleado(String nombre) {
			super();
			this.nombre = nombre;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellido1() {
			return apellido1;
		}



		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}



		public String getApellido2() {
			return apellido2;
		}



		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}



		public ArrayList<String> getTitulaciones() {
			return titulaciones;
		}



		public void setTitulaciones(String... titulaciones) {
			for(String elem:titulaciones)
				this.titulaciones.add(elem);
		}



		public String getDni() {
			return dni;
		}



		public void setDni(String dni) throws Exception {			
			if(validador.checkNif(dni)<0)
				throw new Exception();
			else
				this.dni = dni;
		}



		public String getNuss() {
			return nuss;
		}



		public void setNuss(String nuss) {
			this.nuss = nuss;
		}



		public int getEdad() {
			return edad;
		}



		public void setEdad(int edad) {
			this.edad = edad;
		}



		public Sexo getSexo() {
			return sexo;
		}



		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}



		public String presentarInfo(){
			String outNombre = "\nNombre: " + this.nombre;
			String outDni = "\nDni: " + this.dni;
			String outTit = "\n";
			for(String elem:this.titulaciones)
				outTit = outTit + elem + "\n";
				
			return outNombre + outDni + outTit;
		}
}
