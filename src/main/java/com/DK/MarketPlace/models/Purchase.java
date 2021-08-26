package com.DK.MarketPlace.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Double cost;
    private LocalDateTime shelfLife;
//    private String description;

    public Purchase(String name, Double cost, LocalDateTime shelfLife) {
        this.name = name;
        this.cost = cost;
        this.shelfLife = shelfLife;
    }
}
