package juris.SpringWebJavaScript13072021.services;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.models.UserInput;
import org.springframework.stereotype.Component;

@Component
public class MappingFromDb {


    public UserInput mappingFromDb(User user) {
        UserInput userInput= new UserInput();
        userInput.setName(user.getName());
        userInput.setPassword(user.getPassword());
        userInput.setState(user.getState());
        userInput.setDateOfBirth(user.getDateOfBirth().toString());
        userInput.setDateOFRegistration(user.getDateOfRegistration().toString());
        userInput.setId(user.getId());
        return userInput;
    }


}
