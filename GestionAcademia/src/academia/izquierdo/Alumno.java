package academia.izquierdo;

import java.util.ArrayList;

public class Alumno extends Persona{

	public Alumno(String nombre, String apellidos, String nus, String iban,
			String dni, String telefono, String email) {
		super(nombre, apellidos, nus, iban, dni, telefono, email);
	}

	public void listar() {
		System.out.print("Alumno: ");
		super.listar();	
	}

	public void listarTodo() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("--- INFORMACION ALUMNO -----------------------------------------");
		System.out.println("----------------------------------------------------------------");
		super.listarTodo();
		System.out.println("\n");
	}	
}
