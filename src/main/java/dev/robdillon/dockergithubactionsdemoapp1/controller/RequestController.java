package dev.robdillon.dockergithubactionsdemoapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RequestController {

    @GetMapping("message")
    public String getApiResponseMessage() {
        return "Hello from Docker Demo App 1!";
    }

}
