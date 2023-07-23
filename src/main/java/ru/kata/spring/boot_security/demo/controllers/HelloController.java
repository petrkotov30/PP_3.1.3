package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
//import ru.kata.spring.boot_security.demo.security.UserImplDetails;

@RestController
public class HelloController {
    @GetMapping("/")
    public String homePage() {
        return "hello world";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(Principal principal) {
        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        return "secured part of web service: " + principal.getName();
    }

    @GetMapping("/only_for_admins")
    public String pageOnlyForAdmins() {
        return "only_for_admins !";
    }

    @GetMapping("/read_profile")
    public String pageReadProfile() {
        return "read profile page";
    }
}


//    @GetMapping("/showUserInfo")
//    public String showUSerInfo() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        UserService userImplDetails = (UserService) authentication.getPrincipal();
//        System.out.println(userImplDetails.());
//        return userImplDetails.getUser().toString();
//    }