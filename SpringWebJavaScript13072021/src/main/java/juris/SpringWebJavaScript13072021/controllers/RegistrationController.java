package juris.SpringWebJavaScript13072021.controllers;

import juris.SpringWebJavaScript13072021.models.User;
import juris.SpringWebJavaScript13072021.models.UserInput;
import juris.SpringWebJavaScript13072021.repositories.UserRepo;
import juris.SpringWebJavaScript13072021.services.MappingFromInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("registration")
    public String registration(Model model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String userAdd(@RequestParam String name
            , @RequestParam String password
            , @RequestParam("state") String state
            , @RequestParam("dateOfBirth") String dateOfBirth
            , Model model) {
        UserInput userInput = new UserInput(name, password, state, dateOfBirth);
        System.out.println(userInput); // TODO šis pagaidām pārbaudei
        MappingFromInput mappingFromInput = new MappingFromInput();
        User user = mappingFromInput.mappingFromInput(userInput);
        userRepo.save(user);

        return "/registration";
    }

}
