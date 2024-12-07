package in.sbss.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping(value = "/admin")
	public String admin() {
		return "<h3> WELCOME Admin :) <h3/>";
	}
	
	@GetMapping(value = "/user")
	public String user() {
		return "<h3> Hello User :) <h3/>";
	}
	
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "<h3> WELCOME  :) <h3/>";
	}

}
