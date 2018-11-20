package com.exgnt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {


	@GetMapping("/signup")
    public String signup() {
            	
        return "signup";
    }
	
    @GetMapping("/signin")
    public String signin(Model model) {
        User user = new User();
        model.addAttribute(user);    	
        return "signin";
    }
    
    @PostMapping("/signin")
    public String signinform(User user) {
		
    	return "redirect:/dashboard";
    	
    }
}
