package com.cg.JwtSecurityservice.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.JwtSecurityservice.security.jwt.JwtUtils;
 

@Service
public class ValidateService {
    @Autowired
    private JwtUtils jwtutils;

     /**
     * @param token
     * compare the token
     * returns the authenticationResponse
     */
    public AuthenticationResponse validate(String token) {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        String jwt = token.substring(7);
        authenticationResponse.setJwtToken(jwt);
        authenticationResponse.setValid(jwtutils.validateJwtToken(jwt));
        return authenticationResponse;
    }
}
