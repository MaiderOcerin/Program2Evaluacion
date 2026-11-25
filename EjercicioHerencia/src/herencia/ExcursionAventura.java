package herencia;

public class ExcursionAventura extends Excursion{
	
	private Dificultad dificultad;
	private String Aventura;
	
	public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, String aventura, Dificultad dificultad) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		 this.Aventura = aventura;
		 this.dificultad = dificultad;
	}


	public String getAventura() {
		return Aventura;
	}

	public void setAventura(String aventura) {
		Aventura = aventura;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\nExcursionAventura [dificultad=" + dificultad + ", Aventura=" + Aventura + "]";
	}

	@Override
	public double calcularPrecio() {
		if (dificultad == Dificultad.MEDIO)
			return super.calcularPrecio()+ 150;
		else if (dificultad == Dificultad.EXTREMO) {
			return super.calcularPrecio()+ 300;
		}
		return super.calcularPrecio();
	}
}