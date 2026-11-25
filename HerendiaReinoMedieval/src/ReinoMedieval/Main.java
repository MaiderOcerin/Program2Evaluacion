package ReinoMedieval;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje personaje=new Personaje("maider", 5, 55);
		personaje.presentarse();	
		
		Mago mago=new Mago("maider", 5, 55, 10, Ataque.FUEGO);
		mago.play();
		mago.presentarse();
		
		Soldado soldado=new Soldado("maider", 5, 55, "lanza", 35);
		soldado.play();
	}

}
