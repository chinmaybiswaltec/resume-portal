package com.chinmaybiswaltec.resumeportal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello!!!";
    }

    @GetMapping("/edit")
    public String edit() {
        return "edit page";
    }
    
    @GetMapping("/view/{userId}")
    public String view(@PathVariable("userId") String userId, Model model) {
    	model.addAttribute("userId", userId);
        return "profile";
    }
}
