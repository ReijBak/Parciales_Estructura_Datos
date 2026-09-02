import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercises e = new Exercises();
        boolean GoOn = true;
        while (GoOn) {
            try {
                System.out.println("\n==========================================================\n");
                System.out.println("           BIENVENIDO AL PROGRAMA DE PARCIALES          ");
                System.out.println("\n==========================================================\n");
                System.out.println("Ingrese el número del ejercicio que desea ejecutar (1-1): ");
                System.out.println("Presione 0 para salir.");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        GoOn = false;
                        break;
                    case 1:
                        e.Exercise_1();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 10.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }

        }
    }
}