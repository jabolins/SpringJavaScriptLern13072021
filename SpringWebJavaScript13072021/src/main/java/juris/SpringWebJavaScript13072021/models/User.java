package juris.SpringWebJavaScript13072021.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private String password;
    private String state; // TODO šo vēlāk jāpārtaisa uz enum
    private LocalDate dateOfBirth;
    private LocalDate dateOfRegistration;

    public User() {
    }


    //TODO iespējams šo konstruktoru mums vispār nevajadzēs
    public User(String name, String password, String state, LocalDate dateOfBirth, LocalDate dateOfRegistration) {
        this.name = name;
        this.password = password;
        this.state = state;
        this.dateOfBirth = dateOfBirth;
        this.dateOfRegistration = dateOfRegistration;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}

