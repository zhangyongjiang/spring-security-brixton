package com.gaoshin.brixton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@EnableOAuth2Sso
@EnableAutoConfiguration
public class Application {
	@RequestMapping(name="/hi", method=RequestMethod.GET)
	public String home() {
		return "Hello World";
	}
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
