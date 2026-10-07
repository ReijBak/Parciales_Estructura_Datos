package Methods;
import java.util.Scanner;

public class Validations {
    public  int readInt(Scanner sc, int min, int max) {
        int num;

        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());

                if (num >= min && num <= max) {
                    return num;
                }

                System.out.println("Error: ingrese un número entre "
                        + min + " y " + max + ".");

            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número entero.");
            }
        }
    }
}
