import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList<Fighter> fighters = new SinglyLinkedList<>();
        int option = 0;

        fighters.insertFirst(new Fighter("Shoto", "Terry"));
        fighters.insertLast(new Fighter("Adonito", "Random"));
        fighters.insertLast(new Fighter("MLF", "Sonic"));
        fighters.insertLast(new Fighter("Chipilin", "Terry"));
        fighters.insertLast(new Fighter("ElGris", "Bowser"));
        fighters.insertLast(new Fighter("Manumano", "Inkling"));
        System.out.println("Jugadores existentes: ");
        fighters.traverse();

        while (option != 5) { //mejor forma de validar opción?
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Eliminar jugador");
            System.out.println("3. Mostrar jugadores");
            System.out.println("4. Eliminar todos los jugadores");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            option = Integer.parseInt(scanner.nextLine());
            //Investigué y este comando también convierte de String a int, y este
            //lo hace de mejor forma porque no necesitamos usar el otro comando
            //"Use parseInt(String) to convert a string to a int primitive"

            if (option == 1) {
                System.out.print("Nombre del jugador: ");
                String name = scanner.nextLine();
                System.out.print("Personaje que más usa: ");
                String game = scanner.nextLine();
                fighters.insertLast(new Fighter(name, game));
                System.out.println("Jugador agregado.");
            } else if (option == 2) {
                System.out.print("Nombre del jugador a eliminar: ");
                String name = scanner.nextLine();
                System.out.print("Personaje que más usa: ");
                String game = scanner.nextLine();
                if (fighters.remove(new Fighter(name, game))) {
                    System.out.println("jugador eliminado.");
                } else {
                    System.out.println("No se encontró al jugador.");
                }
            } else if (option == 3) {
                fighters.traverse();
            } else if (option == 4) {
                fighters.clear();
                System.out.println("Hecho");
            } else if (option == 5) {
                System.out.println("Adiós.");
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}