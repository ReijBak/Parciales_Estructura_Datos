package Classes.Exercise2;
import java.time.LocalDate;
import java.util.UUID;

public class User {
    private UUID Id;
    private String Name;
    private int Age;
    private LocalDate CreatedAt;

    public User(String name, int age) {
        Id = UUID.randomUUID();
        Name = name;
        Age = age;
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
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public LocalDate getCreatedAt() {
        return CreatedAt;
    }
}
