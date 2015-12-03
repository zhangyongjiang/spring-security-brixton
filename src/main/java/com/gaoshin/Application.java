package com.gaoshin;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
@EnableEurekaClient
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
public class Application {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String hi(Principal p) {
        return p!=null ? "Hello " + p.getName() : "Hello guest";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        WebSecurityConfiguration w;
    }
}

