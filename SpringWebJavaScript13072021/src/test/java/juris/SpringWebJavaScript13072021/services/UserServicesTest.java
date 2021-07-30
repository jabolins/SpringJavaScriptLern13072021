package juris.SpringWebJavaScript13072021.services;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesTest {


    @Test
    void findAll() {

        UserServices userServices = new UserServices();
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.addAll(userServices.findAll());
        for (User user: allUsers){
            System.out.println(user);
        }
    }
}