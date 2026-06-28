package com.ocean.demoOracleAPI.controller;

import com.ocean.demoOracleAPI.security.JwtUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        String userName = request.get("userName");
        String password = request.get("password");

        
        //# Spring Security's built-in handling
        // authenticationManager.authenticate(
        //        new UsernamePasswordAuthenticationToken(userName, password));
        
        
        try {
        	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
        } catch (BadCredentialsException e) {
            return ResponseEntity
            		.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "Invalid credentials :~"));
        }
        

        String token = jwtUtil.generateToken(userName);
        return ResponseEntity.ok(Map.of("token", token));
    }
}
