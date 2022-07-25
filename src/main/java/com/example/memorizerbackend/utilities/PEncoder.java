package com.example.memorizerbackend.utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class PEncoder {

    Integer EncoderLength;

    public PEncoder(){
        EncoderLength = 20;
    }

    public PEncoder(Integer EncoderLength){
        this.EncoderLength = EncoderLength;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(EncoderLength);
    }
}
