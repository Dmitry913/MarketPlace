package com.DK.MarketPlace.persistences;

import com.DK.MarketPlace.models.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PurchaseRepo extends CrudRepository<Purchase, Integer> {

}
