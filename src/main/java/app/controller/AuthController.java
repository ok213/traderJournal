package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "auth/registration";
    }

    @PostMapping("/registration")
    public String registrationProcessing(@Valid @ModelAttribute("user") User user, Map<String, Object> model) {
        if (userService.findUserByEmail(user.getEmail()) != null) {
            model.put("message", "User exists!");
            return "registration";
        }
        userService.createUser(user);
        return "redirect:/login";
    }

}
