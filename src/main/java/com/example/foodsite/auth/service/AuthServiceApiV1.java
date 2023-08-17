package com.example.foodsite.auth.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.foodsite.auth.dto.ReqJoinDTO;
import com.example.foodsite.model.user.entity.UserEntity;
import com.example.foodsite.model.user.repository.UserRepository;

@Service
public class AuthServiceApiV1 {
    
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public ResponseEntity<?> join(ReqJoinDTO reqJoinDTO){

        Optional<UserEntity> userEntityOptional = userRepository.findById(reqJoinDTO.getUser().getId());

        if(userEntityOptional.isPresent()){
            return new ResponseEntity<>(
                "이미 사용중", 
                HttpStatus.BAD_REQUEST);
        }

        UserEntity userEntity = UserEntity.builder()
        .id(reqJoinDTO.getUser().getId())
        .password(reqJoinDTO.getUser().getPassword())
        .username(reqJoinDTO.getUser().getUsername())
        .createDate(LocalDateTime.now())
        .build();

        userRepository.save(userEntity);

        return new ResponseEntity<>(
            "회원가입에 성공!",
            HttpStatus.OK);
    }
}
