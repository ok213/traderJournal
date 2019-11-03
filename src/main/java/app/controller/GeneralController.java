package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }


}
