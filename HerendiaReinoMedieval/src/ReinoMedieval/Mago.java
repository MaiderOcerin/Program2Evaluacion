package ReinoMedieval;

public class Mago extends Personaje {
	private int hechizos;
	private Ataque ataque;
	
	public Mago(String nombre, int nivel, int puntosVida, int hechizos, Ataque ataque) {
		super(nombre, nivel, puntosVida);
		this.hechizos = hechizos;
		this.ataque = ataque;
	}
	
	public void meditar(int cantidad) {
		hechizos+=cantidad;
	}
	@Override
	public void play() {
		if (hechizos>0) {
			hechizos=hechizos-1;
			System.out.println("Ataque mágico "+ataque);
		}else
			System.out.println("no tienes hechizos, medita un poco");
	}
	@Override
	public void presentarse() {
		super.presentarse();
		System.out.println("Mago [hechizos= " + hechizos + ", ataque= " + ataque + "]");
	}
}
