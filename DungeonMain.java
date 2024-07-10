package dungeon.crawler;

import java.util.*;

public class DungeonMain {

	public static void main(String[] args) {
		int numero;
		
		System.out.println("Benevenuto");
		System.out.println("1 = Gioca");
		System.out.println("2 = Esci");
		System.out.print("Inserire un numero: ");
				
		Scanner sc = new Scanner(System.in);
		numero = 0;
		try {
			numero = sc.nextInt();
		} catch (Exception e) {
			e.toString();
			sc.close();
		}
		
		if (numero == 1) {
			System.out.println("Inizio gioco");
			System.out.println("Ciao, intraprendi il tuo viaggio");
			GraphicRoute.drawRoute();
			System.out.println("1 = Destra");
			System.out.println("2 = Sinistra");
			System.out.print("Inserire un numero: ");
			numero = sc.nextInt();
			if (numero == 1) {
				GraphicRoute.takeRight();
			} else {
				GraphicRoute.takeLeft();
			}
			
		} else {
			System.out.println("Fine gioco");
		}
	}

}
