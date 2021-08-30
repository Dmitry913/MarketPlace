package com.DK.MarketPlace.persistences;

import com.DK.MarketPlace.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String username);
}
