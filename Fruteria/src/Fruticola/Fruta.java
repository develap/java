package Fruticola;

import Comprar.Comprar;

public class Fruta implements Comprar{
	
	private int diametro;
	private String arbol;
	protected static int contador = 0;
	
	protected double precio;
	protected String color;
	protected double azucar;
	
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getAzucar() {
		return azucar;
	}


	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}


	/**
	 * 
	 */
	public Fruta() {
		super();
	}


	/**
	 * @param diametro
	 * @param arbol
	 */
	public Fruta(int diametro, String arbol) {
		super();
		this.diametro = diametro;
		this.arbol = arbol;
	}
	

	public String getArbol() {
		return arbol;
	}

	public void setArbol(String arbol) {
		this.arbol = arbol;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	protected static String vender(Fruta fruta){
		contador++;
		System.out.print(contador + " ");
		return "Vender fruta";
	}


	@Override
	public void centenares() {
		System.out.println("Se compra fruta!");
	}

}
