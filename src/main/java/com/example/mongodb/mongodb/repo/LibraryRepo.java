package com.example.mongodb.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.mongodb.model.Library;

public interface LibraryRepo extends MongoRepository<Library,Integer>{
    
}
