package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message1:test}")
	private String message1 = "";
	
	@Value("${welcome.message2:test}")
	private String message2 = "";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message1);
		return "welcome";
	}

	@RequestMapping("/2")
	public String welcome2(Map<String, Object> model) {
		model.put("message", this.message2);
		return "welcome2";
	}
}