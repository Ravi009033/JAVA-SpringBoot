package com.ems.repository;

import com.ems.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users,  Long> {
    //use field username for login
    Users findByUsername(String username);

}
