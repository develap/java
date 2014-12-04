package academia.izquierdo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {		

		ArrayList<Curso> cursos = new ArrayList<>();
		ArrayList<Profesor> profesores = new ArrayList<>();
		ArrayList<Alumno> alumnos = new ArrayList<>();
		ArrayList<Materia> materias = new ArrayList<>();
		
		
		/*************************************************************************************************
		 * Materias
		 *************************************************************************************************/
		// Crea un listado de materias para test
		for(int j=0; j<3; j++)
			materias.add(new Materia(j, "Materia " + j));
		
		
		/*************************************************************************************************
		 * Alumnos
		 *************************************************************************************************/
		// Crea un listado de alumnos para test
		for(int j=0; j<10; j++)
			alumnos.add(new Alumno("Alumno " + j, "apellidos", "nus", "iban", "dni", "telefono", "email"));
		
		
		/*************************************************************************************************
		 * Profesores
		 *************************************************************************************************/
		// Crea un listado de profesores para test
		for(int j=0; j<2; j++)
			profesores.add(new Profesor("Profesor " + j, "apellidos", "nus", "iban", "dni", "telefono", "email"));
		
		
		
		/*************************************************************************************************
		 * Cursos
		 *************************************************************************************************/
		// Introducción de cursos
		for(int i=0; i<5; i++){
			cursos.add(new Curso(i));
			// Inscribe todos los alumnos a todos los cursos
			for(Alumno a:alumnos)
				cursos.get(i).inscribirAlumno(a);		
			// Asigna todos los profesores a todos los cursos
			for(Profesor p:profesores)
				cursos.get(i).asignarProfesor(p);
			// Asigna todas las materias a todos los cursos
			for(Materia m:materias)
				cursos.get(i).addMateria(m);
		}
		
		
		// Listar la información de todos los cursos
		// for(Curso c:cursos)	c.listar();
		
		
		// Listar todo la información de un alumno
		alumnos.get(0).listarTodo();
		
		
		// Listar todo la información de un profesor
		profesores.get(0).listarTodo();		
		
	}
}
