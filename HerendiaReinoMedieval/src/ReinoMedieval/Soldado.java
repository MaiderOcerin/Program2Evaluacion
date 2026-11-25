package ReinoMedieval;

public class Soldado extends Personaje {
	private String arma;
	private int armadura;
	
	public Soldado(String nombre, int nivel, int puntosVida, String arma, int armadura) {
		super(nombre, nivel, puntosVida);
		this.arma = arma;
		this.armadura = armadura;
	}
	@Override
	public void play() {
		if (this.arma.equalsIgnoreCase("lanza")) {
			System.out.println("el daño inflingido es 5");
		}
		else if(this.arma.equalsIgnoreCase("espada larga")) {
			System.out.println("el daño inflingido es de 6");
		}
		
	}
	@Override
	public void recibirDanio() {
		
	}
}
