package com.example.mongodb.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.mongodb.model.Library;
import com.example.mongodb.mongodb.repo.LibraryRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LibraryController {
    @Autowired
    private LibraryRepo libraryRepo;

    @GetMapping("/")
    public Library getMethodName(@RequestBody Library param) {

        return libraryRepo.save(param);
    }
    @GetMapping("/test")
    public String getMethodName() {
        return  "working....";
    }
    

}
