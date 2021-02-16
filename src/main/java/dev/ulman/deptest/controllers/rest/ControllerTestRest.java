package dev.ulman.deptest.controllers.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ControllerTestRest {

    @GetMapping("{name}")
    public ResponseEntity<?> test(@PathVariable("name") String name) {
        return new ResponseEntity<>("Hello " + name + "!", HttpStatus.OK);
    }

}
