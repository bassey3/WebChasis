package com.exgnt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dashboard {

    @GetMapping("/dashboard")
    public String dashboard(@RequestParam(name="name", required=false, defaultValue="Fred") String name, Model model) {
        User user = new User();
        model.addAttribute(user);
    	model.addAttribute("name", name);
        //System.out.println("name");
        return "index5";
    }
}
