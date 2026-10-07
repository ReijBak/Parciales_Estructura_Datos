package Methods;
import Classes.Exercise2.*;

import java.util.Queue;
import java.util.Scanner;

public class Exercise2 {
    Validations v = new Validations();

    public void showMenu() {
        System.out.println("\n==========================================================\n");
        System.out.println("           BIENVENIDO AL INTENTO DE SISTEMA DE Llamadas         ");
        System.out.println("\n==========================================================\n");
        System.out.println("Ingrese el número de la funcionalidad que desea ejecutar (1-5): ");
        System.out.println("1. Ingresar una nueva llamada");
        System.out.println("2. Ver siguiente llamada");
        System.out.println("3. Atender siguiente llamada");
        System.out.println("4. Cambiar estado de llamada");
        System.out.println("5. Ver llamadas...");
        System.out.println("Presione 0 para salir.");
    }

    public Queue<Client> createCall (Scanner sc, Queue<Client> clients) {
        System.out.println("Ingrese el nombre del cliente: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el motivo de su llamada: ");
        String description = sc.nextLine();
        System.out.println("Ingrese la hora de su llamada: ");
        String time = sc.nextLine();
        System.out.println("Ingrese la prioridad de su llamada: ");
        String priority = sc.nextLine();
        Client createCall = new Client(name, description, time, priority);
        boolean addCall = clients.offer(createCall);
        if (addCall) {
            System.out.println("Llamada creada correctamente.");
        } else {
            System.out.println("No se pudo crear la llamada.");
        }
        return clients;
    }

    public void showNextCall (Scanner sc, Queue<Client> clients) {
        if (!clients.isEmpty()) {
            Client sigClient = clients.peek();
            sigClient.showCall();
            System.out.println("==========================================================");
        } else  {
            System.out.println("No hay ninguna llamada en cola.");
        }
    }

    public String attendNextCall (Scanner sc, Queue<Client> clients, Queue<Client> clientsAtt) {
        Client clientAtt = clients.poll();
        if (clientAtt != null) {
            System.out.println("Atendiendo turno...");
            clientAtt.setState("Finalizada");
            clientsAtt.offer(clientAtt);
            return "Llamada atendida correctamente.";
        } else {
            return  "No hay llamadas por atender";
        }
    }

    public String changeState (Scanner sc, Queue<Client> clients) {
        System.out.println("Ingrese el nombre del cliente: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el estado al que desea cambiar la llamada: (1. Transferida - 2. Cancelada - 3. Actualizada) ");
        int state = v.readInt(sc, 1, 3);
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                switch (state) {
                    case 1:
                        client.setState("Transferida");
                        return  "Estado actualizado correctamente";
                    case 2:
                        client.setState("Cancelada");
                        return  "Estado actualizado correctamente";
                    case 3:
                        client.setState("Actualizada");
                        return  "Estado actualizado correctamente";
                    default:
                        return  "No se pudo actualizar el estado de la llamada.";
                }
            }
        }
        return "No se pudo actualizar el estado de la llamada (Cliente no encontrado).";
    }

    public void showAllCalls (Scanner sc, Queue<Client> clients, Queue<Client> clientsAtt) {
        if (!clients.isEmpty()) {
            for (Client client : clients) {
                client.showCall();
            }
            System.out.println("==========================================================");
        } else {
            System.out.println("No hay llamadas en cola.");
        }
        if (!clientsAtt.isEmpty()) {
            for (Client clientAtt : clientsAtt) {
                clientAtt.showCall();
            }
            System.out.println("==========================================================");
        } else {
            System.out.println("No hay llamadas finalizadas.");
        }
    }
}
