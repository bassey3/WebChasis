package com.exgnt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilePageController {

	
    @GetMapping("/documents")
    public String documents(Model model) {
        User user = new User();
        model.addAttribute(user);
        String name = "nom";
    	model.addAttribute("name", name);
        //System.out.println("name");
        return "filepage";
    }
}
