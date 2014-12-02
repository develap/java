package Fruticola;

public abstract class Manzana extends Fruta{

	public Manzana() {
		super();
	}

	protected static String vender(Fruta fruta)
	{
		contador++;
		System.out.println("Manzana");
		return "Vender manzana";
	}
	
	protected abstract void comer();

}
