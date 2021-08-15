package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot heroku";
	}
	

}
