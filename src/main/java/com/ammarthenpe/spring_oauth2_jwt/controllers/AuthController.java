package com.ammarthenpe.spring_oauth2_jwt.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
@Api(tags = "1. Admin", description = "Admin")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return "Welcome " + username + "!";
    }

    @PostMapping("/register")
    public String register(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("username") String username, @RequestParam("password") String password) {
        return "Welcome " + username + "!";
    }
}
