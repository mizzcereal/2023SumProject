package com.example.foodsite.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReqJoinDTO {
    
    private User user;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class User{
        private String id;
        private String password;
        private String username;
    }
}
