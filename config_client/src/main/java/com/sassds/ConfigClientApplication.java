package com.sassds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
@Configuration
public class ConfigClientApplication {

	@Value("${a:World!}")
	String bar;
	@Value("${spring.cloud.config.profile:asdf}")
	String bar2;

	@RequestMapping("/")
	String hello() {
		return "Hello " + bar + "!" + bar2;
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
