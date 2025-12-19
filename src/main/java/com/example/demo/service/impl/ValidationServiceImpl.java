package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.exception.ValidationException;

@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository student;
    @Override
    public ValidationEntity postdata(ValidationEntity stu){
        return student.save(stu);
    }
    @Override
    public ValidationEntity getData(Long id){
        return student.findById(id).orElseThrow(()-> new ValidationException("Invalid Id" + id));

    }
}