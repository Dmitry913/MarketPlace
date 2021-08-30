package com.DK.MarketPlace.controllers;


import com.DK.MarketPlace.models.Purchase;
import com.DK.MarketPlace.persistences.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class MainController {



    @GetMapping
    public String getMainPage() {
        return "MainPage";
    }

}
