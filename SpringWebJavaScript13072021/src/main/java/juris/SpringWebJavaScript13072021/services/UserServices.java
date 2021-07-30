package juris.SpringWebJavaScript13072021.services;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.models.UserInput;
import juris.SpringWebJavaScript13072021.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepo userRepo;

    public UserServices() {
    }

    public List<User> findAll() {
        System.out.println("sākam drukāt");
        return userRepo.findAll();

//        List<User> result = new ArrayList<>(); //šī ir vesija kas dara to pašu tikai ar citu paņēmienu
//        for (User user : userRepo.findAllByOrderByIdDesc()) {
//            System.out.println(user);
//        }
//        return result;


//        List<UserInput> usersForWeb = new ArrayList<>();
//        Iterable<User> users = userRepo.findAll();
//        for (User user : users) {
//            System.out.println(user); // pārbaudei
//        }
//
//        for (UserInput userInput : usersForWeb) {
//            System.out.println("izdrukājam");
//            System.out.println(userInput);
//        }
//        return usersForWeb;
    }
}
