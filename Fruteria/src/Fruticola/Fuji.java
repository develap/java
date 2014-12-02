package Fruticola;

import Comprar.Comprar;

public class Fuji extends Manzana implements Comprar, Comer{

	
	/**
	 * @param precio
	 * @param color
	 * @param azucar
	 */
	public Fuji(double precio, String color, double azucar) {
		super();
		this.precio = precio;
		this.color = color;
		this.azucar = azucar;
		System.out.println("Fuji");
	}

	@Override
	public void centenares() {
		System.out.println("Se compra Fuji señores!");		
	}

	@Override
	protected void comer() {
		// TODO Auto-generated method stub
		
	}

}
