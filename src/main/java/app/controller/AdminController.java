package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String listUsers(Model model) {
//        model.addAttribute("allUsers", userService.getAllUsers());
        return "admin/list";
    }

    @GetMapping("/admin/create")
    public String createPage(Model model) {
//        model.addAttribute("actionPath", "create");
        return "admin/update";
    }

    @PostMapping("/admin/create")
    public String createUser(@ModelAttribute("user") User user, Model model) {
//        userService.createUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/admin/update/{id}")
    public String updatePage(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("actionPath", "update");
//        model.addAttribute("user", userService.getUserById(id));
        return "admin/update";
    }

    @PostMapping("/admin/update")
    public String updateUser(@ModelAttribute("user") User user, Model model) {
//        userService.updateUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
//        userService.deleteUserById(id);
        return "redirect:/admin";
    }

}
