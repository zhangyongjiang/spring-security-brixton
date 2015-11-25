package com.gaoshin;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Resource
@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
public class Application {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String hi(Principal p) {
        return p!=null ? "Hello " + p.getName() : "Hello guest";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

