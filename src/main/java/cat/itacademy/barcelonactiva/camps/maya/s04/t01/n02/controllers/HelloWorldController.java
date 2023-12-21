package cat.itacademy.barcelonactiva.camps.maya.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String salute(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hi, " + name + ". You're running a Gradle project.";
    }
}
