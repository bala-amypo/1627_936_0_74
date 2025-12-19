package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.ValidationService;
import jakarta.validation.Valid;
@RestController
public class ValidationController{
    
@Autowired ValidationService val;
@PostMapping("/post2")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity value){
            return val.postdata(value);
}

}