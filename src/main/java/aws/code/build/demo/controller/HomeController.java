package aws.code.build.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping({ "/", "/index" })
	public String home() {
		return "index " + new java.util.Date() + " Version 10";
	}

}
