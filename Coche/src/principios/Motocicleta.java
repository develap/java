package principios;

public class Motocicleta extends Vehiculo {
	
	public boolean manillar;

	public Motocicleta(String _marca, String _modelo, String _color,
			String _matricula) {
		super(_marca, _modelo, _color, _matricula);
		this.setManillar(true);		
	}

	public boolean getManillar() {
		return manillar;
	}

	public void setManillar(boolean manillar) {
		this.manillar = manillar;
	}
	
	public Vehiculo ficha(){
		return new Vehiculo("HONDA", "variant", "roja", "333");
	}

}
