import Methods.*;
import Classes.Exercise2.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise2Menu {
    Scanner sc = new Scanner(System.in);

    public void Exercise2() {
        Queue<Client> ClientsQueue = new LinkedList<>();
        Queue<Client> ClientsAttQueue = new LinkedList<>();

        Exercise2 m = new Exercise2();
        Validations v = new Validations();

        boolean goOn = true;
        while (goOn) {
            try {
                m.showMenu();
                int opt = v.readInt(sc,1,5);
                switch (opt) {
                    case 1:
                        m.createCall(sc, ClientsQueue);
                        break;
                    case 2:
                        m.showNextCall(sc, ClientsQueue);
                        break;
                    case 3:
                        String res = m.attendNextCall(sc, ClientsQueue, ClientsAttQueue);
                        System.out.println(res);
                        break;
                    case 4:
                        String res1 = m.changeState(sc, ClientsQueue);
                        System.out.println(res1);
                        break;
                    case 5:
                        m.showAllCalls(sc, ClientsQueue, ClientsAttQueue);
                        break;
                    case 0:
                        goOn = false;
                        break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
