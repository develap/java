package empleados;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		
		for(int i=0; i<5; i++){			
			// Crea un empleado Asalariado
			empleados.add(new EmpleadoAsalariado(i*1000));	// SET Salario
			
			Empleado tmpEmp = empleados.get(i); 
			tmpEmp.setNombre(Integer.toString(i));			// SET Nombre
			
			// Introducir y comprobar DNI
			try {
				tmpEmp.setDni("20461325L");		// SET dni
			} catch (Exception e) {				// Si el dni es incorrecto, causa una excepci�n
				e.printStackTrace();
			}
			
			// Titulaciones
			tmpEmp.setTitulaciones("Ingeniero de obras", "Topografo", "Astronomo");
		}
		
		
		
		for(int i=5; i<10; i++){
			// Crea un empleado a contrato por obra (Empleado por horas)
			empleados.add(new EmpleadoPorHoras(i*1000));	// SET Precio por hora
			
			Empleado tmpEmp = empleados.get(i); 
			tmpEmp.setNombre(Integer.toString(i));			// SET Nombre
			
			// Introducir y comprobar DNI
			try {
				tmpEmp.setDni("20461325L");		// SET dni
			} catch (Exception e) {				// Si el dni es incorrecto, causa una excepci�n
				e.printStackTrace();
			}
			
			// Titulaciones
			tmpEmp.setTitulaciones("Ingeniero de obras", "Topografo", "Astronomo");
		}
		
		
		
		// Imprime la informaci�n por pantalla
		for(Empleado emp:empleados){
			
			/* El m�todo presentarInfo() est� dentro en las clase Empleado, y es sobrecargada (o sobrescrita?) por
			 * EmpleadoAsalariado y EmpleadoPorHoras, las cuales heredan de Empleado.
			 */
			System.out.println(emp.presentarInfo());
			
			/*
			 * En caso de querer ejecutar un m�todo propio de una clase,
			 * que no existe en las clases herederas, tendremos que usar un 'casting'
			 * En este caso tambi�n un instanceof, pues el 'casting' no podr�a convertir EmpleadoAsalariado en EmpleadoPorHoras
			 * 
			 * Nos mostrar�a el siguiente error:
			 * 
			 * "empleados.EmpleadoPorHoras cannot be cast to empleados.EmpleadoAsalariado" 
			 */
			
			if (emp instanceof EmpleadoAsalariado)
				System.out.println("> Sueldo del emplado asalariado = "+ ((EmpleadoAsalariado)emp).getSueldoFijo() );
		}
			
	}

}
