import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise1Menu e1 = new Exercise1Menu();
        Exercise2Menu e2 = new Exercise2Menu();
        boolean GoOn = true;
        while (GoOn) {
            try {
                System.out.println("\n==========================================================\n");
                System.out.println("           BIENVENIDO AL PROGRAMA DE PARCIALES          ");
                System.out.println("\n==========================================================\n");
                System.out.println("Ingrese el número del ejercicio que desea ejecutar (1-2): ");
                System.out.println("1. Parcial matrices");
                System.out.println("2. Parcial colas");
                System.out.println("Presione 0 para salir.");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        GoOn = false;
                        break;
                    case 1:
                        e1.Exercise1();
                        break;
                    case 2:
                        e2.Exercise2();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 2.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }

        }
    }
}