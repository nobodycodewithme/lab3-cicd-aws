package com.nobodycodewithme.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
@RequestMapping("/info")
public class Lab3Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab3Application.class, args);
    }

    @GetMapping
    public String test() throws UnknownHostException {
        return String.format("<h4>NoBodyCodeWithMe aws code commit, codebuild, codepipeline, ecr, ecs fargate, route 53, autoscaling</h4> " +
                "<br> " +
                "<h4>Trigger CI/CD pipeline by commit and push</h4>" +
                "<br> " +
                "<h4>Host name: %s</>", InetAddress.getLocalHost().getHostName());
    }

}
