package dev.ulman.module.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mvc2")
public class ControllerTest {

    @GetMapping
    public String test() {
        return "test";
    }

    @GetMapping("2")
    public String test2() {
        return "test2";
    }
}
