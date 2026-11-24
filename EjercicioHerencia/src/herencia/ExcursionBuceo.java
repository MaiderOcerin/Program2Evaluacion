package herencia;

public class ExcursionBuceo extends Excursion{
	private boolean certificado;
	private int profMaxima;
	private boolean alquiler;
	
	
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificado, int profMaxima, boolean alquiler) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profMaxima = profMaxima;
		this.alquiler = alquiler;
	}
	public boolean isCertificado() {
		return certificado;
	}
	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	public int getProfMaxima() {
		return profMaxima;
	}
	public void setProfMaxima(int profMaxima) {
		this.profMaxima = profMaxima;
	}
	public boolean isAlquiler() {
		return alquiler;
	}
	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}
	@Override
	public String toString() {
		return super.toString() + "\nExcursionBuceo [certificado=" + certificado + ", profMaxima=" + profMaxima + ", alquiler=" + alquiler
				+ "]";
	}
	@Override
	public double calcularPrecio() {
		if (isAlquiler())
			return super.calcularPrecio()+ getNumeroParticipantes()*100;
		return super.calcularPrecio();
	}
	
	


}
