package juris.SpringWebJavaScript13072021.services;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.models.UserInput;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class MappingFromInput {

    public User mappingFromInput(UserInput userInput){
        User user= new User();
        user.setName(userInput.getName());
        user.setPassword(userInput.getPassword());
        user.setState(userInput.getState());
        user.setDateOfBirth(LocalDate.parse(userInput.getDateOfBirth()));
        user.setDateOfRegistration(LocalDate.now());
        return user;
    }
}
