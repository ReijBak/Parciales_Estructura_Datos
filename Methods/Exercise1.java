package Methods;
import Classes.Exercise1.*;
import java.util.Scanner;

public class Exercise1 {
    Scanner sc = new Scanner(System.in);
    public void FillMessengersMatrix(Messenger[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese el nombre del mensajero");
                String name = sc.next();
                System.out.println("Ingrese el numero de entregas realizadas por el mensajero");
                int delivery_quantity = sc.nextInt();
                m[i][j] = new Messenger(name, delivery_quantity);
            }
        }
    }

    public Messenger FindMessengerByName(Messenger[][] m, String name) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getName().equals(name)) {
                    System.out.println("Mensajero encontrado en la posición: [" + i + "][" + j + "]");
                    return m[i][j];
                }
            }
        }
        System.out.println("Mesanjero no encontrado");
        return null;
    }
}