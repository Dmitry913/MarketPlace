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
public class BaseController {

    private PurchaseRepo repo;

    @Autowired
    public BaseController(PurchaseRepo purchaseRepo) {
        this.repo = purchaseRepo;
    }

    @GetMapping("/createPurchase")
    public String getCreatePage() {
        return "createBuy";
    }

    @PostMapping("/createPurchase")
    public String addPurchase(@RequestParam String name, @RequestParam Double cost,
                              @RequestParam(required = false) LocalDateTime date) {
        repo.save(new Purchase(name, cost, date));
        return "purchases";
    }

    @GetMapping
    public String getMainPage() {
        return "MainPage";
    }

    @GetMapping("/makePurchase")
    public String makePurchase(Map<String, Object> model) {
        model.put("listPurchases", repo.findAll());

        return "purchases";
    }
}
