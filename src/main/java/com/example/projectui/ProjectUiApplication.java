package com.example.projectui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjectUiApplication {

    @RequestMapping(value="/ui", method = RequestMethod.GET)
    public String uiOnly() {
        return "This is only working with Jenkins UI pipeline";
    }
    public static void main(String[] args) {
        SpringApplication.run(ProjectUiApplication.class, args);
    }
}
