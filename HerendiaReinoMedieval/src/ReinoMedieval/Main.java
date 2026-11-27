package ReinoMedieval;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje personaje=new Personaje("maider", 5, 55);
		personaje.presentarse();	
		personaje.play();
		
		Mago mago=new Mago("maider", 5, 55, 10, Ataque.FUEGO);
		mago.play();
		mago.presentarse();
		
		Soldado soldado=new Soldado("maider", 5, 55, "lanza", 35);
		soldado.play();
		soldado.recibirDanio(5);
		
		Campesino campesino=new Campesino ("maider", 5, 55, "hoz", 20);
		campesino.play();
		campesino.venderCosecha();
		
		System.out.println("El numero de personajes introducidos es: " + Personaje.numeroDePersonajes);
		Personaje [] arrayDeTodo=new Personaje [3];
		arrayDeTodo[0]=new Mago("maider", 5, 55, 10, Ataque.FUEGO);
		arrayDeTodo[1]= new Soldado("maider", 5, 55, "lanza", 35);
		arrayDeTodo[2]= new Campesino ("maider", 5, 55, "hoz", 20);
		System.out.println(arrayDeTodo[1] instanceof Mago);
		System.out.println(arrayDeTodo[2] instanceof Campesino);
	}

}
