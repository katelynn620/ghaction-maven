package net.hiru.playground.ghactiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GhactiontestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhactiontestApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

}
