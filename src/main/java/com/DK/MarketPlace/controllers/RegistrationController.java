package com.DK.MarketPlace.controllers;

import com.DK.MarketPlace.models.Role;
import com.DK.MarketPlace.models.User;
import com.DK.MarketPlace.persistences.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    UserRepo userRepo;

    @Autowired
    public RegistrationController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/registration")
    public String registration() {
        return "registrationController";
    }

    @PostMapping("registration")
    public String createAccount(User user, Map<String, Object> model) {
        if (userRepo.findUserByUsername(user.getUsername()).isPresent()) {
            model.put("message", "User exists!");
            return "registration";
        } else {
            user.setActive(true);
            user.setRole(Collections.singleton(Role.CUSTOMER));
            userRepo.save(user);
            return "redirect:/login";
        }

    }
}
