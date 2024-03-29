package dev.ulman.deptest.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mvc")
public class ControllerTestMvc {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("name", "Bob");
        return "test";
    }

    @GetMapping("2")
    public String test2() {
        return "test2";
    }
}
