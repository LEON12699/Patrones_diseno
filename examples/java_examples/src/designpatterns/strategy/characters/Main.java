
package designpatterns.strategy.characters;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Character personaje = new Queen();
			System.out.println(personaje.toString());
			personaje.fight();
			
			while (true) {
			    System.out.println("--------------------------------------");

			    System.out.println("Elige:\n"
			            + "1.-Cambia de arma\n"
			            + "2.-Salir");
			    System.out.println("--------------------------------------");
			    int opcion = sc.nextInt();
			    if (opcion != 1) {
			        break;
			    }
			    System.out.println("\033[34m Elige tu nueva arma\n"
			            + "\033[34m 1.-Acha\n"
			            + "\033[34m 2.-Espada\n"
			            + "\033[34m 3.-Arco y flecha\n"
			            + "\033[34m 4.-cuchillo");
			    System.out.println("--------------------------------------");
			    opcion = sc.nextInt();
			    
			    System.out.println("Cambio de arma , ataca..!");
			    switch (opcion) {
			        case 1:
			            personaje.setWeapon(new Axe());
			            break;
			        case 2:
			            personaje.setWeapon(new Sword());
			            break;
			        case 3:
			            personaje.setWeapon(new BowandArrow());
			            break;
			        case 4:
			            personaje.setWeapon(new Knife());
			            break;
			        
			    }
			    
			   personaje.fight();
			
			}
			
			System.out.println("Antes de irte se ataca una ultima vez con su ultima arma...");
			personaje.fight();
		}catch (Exception e) {
			e.printStackTrace();
		}


    }

}
