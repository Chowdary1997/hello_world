package Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class HelloWorldApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to World..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
