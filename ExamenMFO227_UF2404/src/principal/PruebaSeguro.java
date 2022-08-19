package principal;

import modelo.SeguroCoche;

public class PruebaSeguro {

	public static void main(String[] args) {
		SeguroCoche s1 = new SeguroCoche();
		System.out.println("El seguro es "+s1);
		
		SeguroCoche s2 = new SeguroCoche("h","charo","ca","11111"
				,2018,"Anual",300,2,"123as",2012);
		System.out.println("Los datos del seguro son "+ s2);
		System.out.println("la prima es "+s2.calcularPrima());
		
		s2.setAnioCarnet(2000);
		System.out.println("Los datos del seguro son "+ s2);
		System.out.println("la prima es cambiando año "+s2.calcularPrima());
	}

}
