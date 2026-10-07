package Classes.Exercise2;
import java.time.LocalDate;
import java.util.UUID;

public class Client {
    private UUID Id;
    private String Name;
    private String Description;
    private String Time;
    private String Priority;
    private String State;
    private LocalDate CreatedAt;

    public Client(String name, String description, String time, String priority) {
        Id = UUID.randomUUID();
        Name = name;
        Description = description;
        Time = time;
        Priority = priority;
        State = "Pendiente";
        CreatedAt = LocalDate.now();
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }

    public LocalDate getCreatedAt() {
        return CreatedAt;
    }

    public void showCall(){

        System.out.println("==========================================================");
        System.out.println("Cliente: " + getName());
        System.out.println("Descripción: " + getDescription());
        System.out.println("Hora: " + getTime());
        System.out.println("Prioridad: " + getPriority());
        System.out.println("Estado: " + getState());
        System.out.println("Dia: " + getCreatedAt());

    }
}


