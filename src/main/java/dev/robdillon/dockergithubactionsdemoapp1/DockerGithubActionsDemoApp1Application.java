package dev.robdillon.dockergithubactionsdemoapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DockerGithubActionsDemoApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerGithubActionsDemoApp1Application.class, args);
    }

}
