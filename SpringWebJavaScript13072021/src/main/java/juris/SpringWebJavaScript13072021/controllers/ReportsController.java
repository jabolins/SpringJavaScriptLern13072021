package juris.SpringWebJavaScript13072021.controllers;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.models.UserInput;
import juris.SpringWebJavaScript13072021.repositories.UserRepo;
import juris.SpringWebJavaScript13072021.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportsController {

    @Autowired
    private UserServices userServices;
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/reports")
    public String reports(Model model) {
        //Iterable<UserInput> userInput = userServices.findAll();
        Iterable<User> users =userRepo.findAll();
        model.addAttribute("users", users);

        return "reports";
    }


}


