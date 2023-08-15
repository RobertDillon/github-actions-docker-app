package dev.robdillon.dockergithubactionsdemoapp1.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class LogMessageScheduler {

    @Scheduled(fixedRate = 30000)
    public void printMessage() {
        System.out.println("Hello from Docker Demo App 1! This is version 0.0.1");
    }

}
