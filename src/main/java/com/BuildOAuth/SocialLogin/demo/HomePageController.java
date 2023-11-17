package com.BuildOAuth.SocialLogin.demo;

import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping()
public class HomePageController {

	@GetMapping("/home")
	public String hello(Model model){
		model.addAttribute("message", "Backend Developer");
		return "Home";
	}
}
