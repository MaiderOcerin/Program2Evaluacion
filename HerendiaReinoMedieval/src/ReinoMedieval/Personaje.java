package ReinoMedieval;

public class Personaje {
	private String nombre;
	private int nivel;
	private int puntosVida;
	public static int numeroDePersonajes=0; //defino este atributo que va a ser el mismo para todos, es estatico (no cambia)
	
	public Personaje(String nombre, int nivel, int puntosVida) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		numeroDePersonajes++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public void presentarse() {//está vacio porque me lo da el main
		System.out.println("Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntosVida=" + puntosVida + "]");
	}
	
	public void play() {
		
	}
	public void recibirDanio(int cantidad) {
		setPuntosVida(puntosVida-cantidad);
	}
	
}
