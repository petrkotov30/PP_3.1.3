package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.services.UserService;
//import ru.kata.spring.boot_security.demo.security.UserImplDetails;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String homePage() {
        return "hello world";
    }
//    @GetMapping("/showUserInfo")
//    public String showUSerInfo() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        UserService userImplDetails = (UserService) authentication.getPrincipal();
//        System.out.println(userImplDetails.());
//        return userImplDetails.getUser().toString();
//    }
    @GetMapping("/only_for_admins")
    public String onlyForAdmins(){
        return "only_for_admins !";
    }
}
