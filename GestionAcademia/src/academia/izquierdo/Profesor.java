package academia.izquierdo;

import java.util.ArrayList;

public class Profesor extends Persona{
	private ArrayList<Materia> materias = new ArrayList<>();
	
	public Profesor(String nombre, String apellidos, String nus, String iban,
			String dni, String telefono, String email) {
		
		super(nombre, apellidos, nus, iban, dni, telefono, email);		
	}
	
	void addMateria(Materia materia){
		materias.add(materia);
	}
	
	public void listar() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("--- INFORMACION PROFESOR ---------------------------------------");
		System.out.println("----------------------------------------------------------------");
		super.listarTodo();
		System.out.println("\n");
	}
}
