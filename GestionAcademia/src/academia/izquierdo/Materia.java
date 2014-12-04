package academia.izquierdo;

public class Materia {
	
	private int id;
	private String titulo;

	/**
	 * @param id
	 * @param titulo
	 */
	public Materia(int id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public void listar() {
		System.out.print("Materia: ");
		System.out.println("ID: " + id + ", Titulo: " + titulo);
	}

}
