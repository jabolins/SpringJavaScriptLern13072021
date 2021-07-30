package juris.SpringWebJavaScript13072021.models;

import java.time.LocalDate;

public class UserInput {
    private String name;
    private String password;
    private String state; // TODO šo vēlāk jāpārtaisa uz enum
    private String dateOfBirth;
    private String dateOFRegistration;
    private Long id;


    public UserInput() {
    }

    public UserInput(String name, String password, String state, String dateOfBirth) {
        this.name = name;
        this.password = password;
        this.state = state;
        this.dateOfBirth = dateOfBirth;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOFRegistration() {
        return dateOFRegistration;
    }

    public void setDateOFRegistration(String dateOFRegistration) {
        this.dateOFRegistration = dateOFRegistration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOFRegistration='" + dateOFRegistration + '\'' +
                ", id=" + id +
                '}';
    }
}
