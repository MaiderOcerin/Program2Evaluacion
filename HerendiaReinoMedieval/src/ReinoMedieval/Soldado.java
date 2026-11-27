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
	public void recibirDanio(int cantidad) {
		if (this.arma.equalsIgnoreCase("lanza") && armadura>5) {
			this.armadura=armadura-5;
			System.out.println("te quedan " + armadura + " puntos de armadura");
		}else if (this.arma.equalsIgnoreCase("espada larga") && armadura>6) {
			this.armadura=armadura-6;
			System.out.println("te quedan " + armadura + " puntos de armadura");
		}else
			System.out.println("Ya no tienes armadura y Se ha restado una vida");
	}
}
