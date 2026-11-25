package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcursionCultural excursionCultural=new ExcursionCultural ("1", Destino.CIUDAD, 25, 150, 10, true);
		System.out.println(excursionCultural.toString());
		System.out.println(excursionCultural.calcularPrecio());
		
		ExcursionBuceo excursionBuceo=new ExcursionBuceo ("1", Destino.PLAYA, 1, 150, 10, true, 30, true );
		System.out.println(excursionBuceo.toString());
		System.out.println(excursionBuceo.calcularPrecio());
	}

}
