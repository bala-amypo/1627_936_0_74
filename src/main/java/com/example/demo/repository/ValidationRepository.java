package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ValidationEntity;

@Repository
public interface ValidationRepository extends JpaRepository<ValidationEntity,Long>{

}
