package com.example.foodsite.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodsite.auth.dto.ReqJoinDTO;
import com.example.foodsite.auth.service.AuthServiceApiV1;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthControllerApiV1 {
    
    @Autowired
    private AuthServiceApiV1 authServiceApiV1;

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody ReqJoinDTO reqJoinDTO){
        ResponseEntity<?> responseEntity = authServiceApiV1.join(reqJoinDTO);

        return responseEntity;
    }
}
