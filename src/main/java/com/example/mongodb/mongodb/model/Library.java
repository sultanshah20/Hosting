package com.example.mongodb.mongodb.model;

import org.springframework.data.mongodb.core.annotation.Collation;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Collation
public class Library 
{
   private int id;
   private String name;
   private int page;
   private int price;
    
}
