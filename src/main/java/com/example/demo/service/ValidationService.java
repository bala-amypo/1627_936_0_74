package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;

public interface ValidationService{
        ValidationEntity postdata(ValidationEntity stu);
        ValidationEntity getData(Long id);
}