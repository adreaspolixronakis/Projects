package com.example.project4;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {


    public String getPasswordEncrypted(String rawpassword){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String encodedpassword=encoder.encode(rawpassword);


        return encodedpassword;
    }

}
