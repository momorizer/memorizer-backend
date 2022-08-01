package com.example.memorizerbackend.rest;

import com.example.memorizerbackend.db.user.AUser;
import com.example.memorizerbackend.db.user.AUserRepository;
import com.example.memorizerbackend.utilities.PEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authenticator {
    @Autowired
    AUserRepository AUserRepository;

    @PostMapping(path = "register")
    public ResponseEntity<?> RegisterUser(@RequestBody AUser usr){
        String Password = usr.getPassword();
        PEncoder encoder = new PEncoder(10);
        String EncodedPassword = encoder.passwordEncoder().encode(Password);
        usr.setPassword(EncodedPassword);
        AUserRepository.save(usr);
        return ResponseEntity.status(200).body("User added");
    };
}
