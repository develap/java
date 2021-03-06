package principios;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	
	private int numPuertas;	
	private float velocidad;
	private float maxDeposito;
	private float ltrDeposito;
	private boolean[] stadoPuertas;
	private int revoluciones;	
	
	
	public Vehiculo(String _marca, String _modelo, String _color, String _matricula){
		marca = _marca;
		modelo = _modelo;
		color = _color;
		matricula = _matricula;
	}
	
	public void acelerar(){
		velocidad++;
	}
	
	public void embrague(){
		velocidad--;
	}
	
	
	public void girarDerecha(){
		
	}
	
	public void girarIzquierda(){
		
	}
	
	public void llenarDeposito(float litros){
		if(maxDeposito <= ltrDeposito + litros)
			ltrDeposito = maxDeposito;
		else
			ltrDeposito = ltrDeposito + litros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public float getMaxDeposito() {
		return maxDeposito;
	}

	public void setMaxDeposito(float maxDeposito) {
		this.maxDeposito = maxDeposito;
	}

	public float getLtrDeposito() {
		return ltrDeposito;
	}

	public void setLtrDeposito(float ltrDeposito) {
		this.ltrDeposito = ltrDeposito;
	}

	public boolean[] getStadoPuertas() {
		return stadoPuertas;
	}

	public void setStadoPuertas(boolean[] stadoPuertas) {
		this.stadoPuertas = stadoPuertas;
	}

	public int getRevoluciones() {
		return revoluciones;
	}

	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones;
	}
	
	public Vehiculo ficha(){
		return new Vehiculo("ford", "fiesta", "rojo", "555");
	}

}
