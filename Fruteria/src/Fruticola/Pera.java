package Fruticola;

public class Pera extends Fruta{


	/**
	 * @param precio
	 * @param color
	 * @param azucar
	 */
	public Pera(double precio, String color, double azucar) {
		super();
		this.precio = precio;
		this.color = color;
		this.azucar = azucar;
	}

	
	public static String vender(Fruta fruta){
		contador++;
		System.out.println("Pera");
		return "Vender pera";
	}
	
}
