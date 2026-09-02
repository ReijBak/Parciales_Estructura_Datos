import Methods.*;
import Classes.Exercise1.*;
import java.util.Scanner;
public class Exercises {
    Scanner sc = new Scanner(System.in);
    public void Exercise_1() {
        Exercise1 e = new Exercise1();
        System.out.println("Ingrese la dimensión de la matriz de mensajeros");
        int n = sc.nextInt();
        Messenger[][] m = new Messenger[n][n];
        boolean goOn = true;
        while (goOn) {
            try {
                System.out.println("\n=============================//=============================\n");
                System.out.println("Bienvenido al ejercicio 1, por favor seleccione una opción:\n" +
                        "1. Llenar matriz de mensajeros\n" +
                        "2. Mostrar todos los mensajeros\n" +
                        "3. Buscar un mensajero por nombre\n" +
                        "4. Volver al menú principal");
                int opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 1:
                        e.FillMessengersMatrix(m);
                        break;
                    case 2:
                        System.out.println("Listado de mensajeros:");
                        for (int i = 0; i < m.length; i++) {
                            for (int j = 0; j < m[i].length; j++) {
                                if (m[i][j] != null) {
                                    System.out.println("-------------------------------");
                                    System.out.println("Nombre: " + m[i][j].getName());
                                    System.out.println("Cantidad de entregas: " + m[i][j].getDeliveries_Quantity());
                                }
                            }
                        }
                        break;
                    case 3:
                        String name = "";
                        System.out.println("Ingrese el nombre del mensajero que desea buscar: ");
                        name = sc.nextLine();
                        Messenger messengerFound = e.FindMessengerByName(m, name);
                        if (messengerFound != null) {
                            System.out.println("-------------------------------");
                            System.out.println("Nombre: " + messengerFound.getName());
                            System.out.println("Cantidad de entregas: " + messengerFound.getDeliveries_Quantity());
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del ejercicio 1...");
                        goOn = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                    sc.nextLine(); // Clear the buffer
            }
        }
    }
    
}