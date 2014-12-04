package academia.izquierdo;

import java.util.ArrayList;

public class Persona{
	private String nombre;
	private String apellidos;
	private String nus;
	private String iban;
	private String dni;
	private String telefono;
	private String email;
	private ArrayList<Titulacion> titulaciones = new ArrayList<>();
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param nus
	 * @param iban
	 * @param dni
	 * @param telefono
	 * @param email
	 * @param titulacione
	 */
	public Persona(String nombre, String apellidos, String nus, String iban,
			String dni, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nus = nus;
		this.iban = iban;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}

	public void listar() {
		System.out.println(this.nombre + ", " + this.apellidos);		
	}

	public void listarTodo() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Nus: " + this.nus);
		System.out.println("Iban: " + this.iban);
		System.out.println("Dni: " + this.dni);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Email: " + this.email);
		
		System.out.println("-- Titulaciones -----------------------------------------------");
		for(Titulacion t:titulaciones)
			System.out.println(t);
		System.out.println("---------------------------------------------------------------");
	}
}
