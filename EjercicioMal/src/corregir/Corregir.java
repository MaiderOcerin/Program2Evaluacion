package corregir;
import java.util.Scanner;
public class Corregir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();

		boolean sospechosa = false;

		for (int i = 0; i < palabra.length() - 1; i++) {

			if (palabra.charAt(i) == palabra.charAt(i + 1)) {
				sospechosa=true;
			}

		}
		if (sospechosa==true) {
			System.out.println("La palabra es sopechosa");
		}
		else 
			System.out.println("la palabra no es sospechosa");

		sc.close();

	}

}
