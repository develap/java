package academia.izquierdo;

import java.util.ArrayList;

public class Curso {
	private int id;
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	private ArrayList<Profesor> profesores = new ArrayList<>();
	private ArrayList<Materia> materias = new ArrayList<>();
	
	
	/**
	 * @param id
	 */
	public Curso(int id) {
		super();
		this.id = id;
	}
	
	void asignarProfesor(Profesor profesor){
		profesores.add(profesor);
	}
	
	void inscribirAlumno(Alumno alumno){
		alumnos.add(alumno);
	}
	
	void addMateria(Materia materia){
		materias.add(materia);
	}

	public void listar(){
		System.out.println("######################################################");
		System.out.println("ID CURSO: " + id);
		System.out.println("######################################################");
		
		//Listado de alumnos
		for(Alumno a:alumnos) a.listar();		
		System.out.println("------------------------------------------------------");
		
		//Listado de profesores
		for(Profesor p:profesores) p.listar();
		System.out.println("------------------------------------------------------");
		
		//Listado de materias
		for(Materia m:materias) m.listar();
		System.out.println("------------------------------------------------------");
		
		System.out.println("\n\n");
	}
}
