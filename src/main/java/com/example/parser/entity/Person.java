package com.example.parser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Person")
public class Person implements Serializable {
    @Id
    private int id;
    private String fullName;
    private SimpleDateFormat birthDate;
    private String homeCity;

}
