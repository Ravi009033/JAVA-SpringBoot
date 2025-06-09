package com.ems.contoller;

import com.ems.entity.Users;
import com.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    //store the details of Admin or User
    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    //verify with username & password and return token
    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        if(service.verify(user).equals("fail"))
            return "invalid user request!";
        return service.verify(user);
    }
}
