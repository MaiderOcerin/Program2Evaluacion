package herencia;

public class ExcursionAventura extends Excursion{
	
	public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, String aventura) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		Aventura = aventura;
	}

	private String Aventura;

	public String getAventura() {
		return Aventura;
	}

	public void setAventura(String aventura) {
		Aventura = aventura;
	}

	@Override
	public String toString() {
		return "ExcursionAventura [Aventura=" + Aventura + "]";
	}
	
}
