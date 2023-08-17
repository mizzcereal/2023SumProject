package com.example.foodsite.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    
    @GetMapping("/auth/join")
    public String join(){
        return "auth/join";
    }
}
