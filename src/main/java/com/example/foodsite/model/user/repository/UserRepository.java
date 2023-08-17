package com.example.foodsite.model.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodsite.model.user.entity.UserEntity;
import java.util.Optional;



public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    Optional<UserEntity> findById(String id);

    Optional<UserEntity> findByIdAndDeleteDateIsNull(String id);

    Optional<UserEntity> findByIdxAndDeleteDateIsNull(Long idx);
}
