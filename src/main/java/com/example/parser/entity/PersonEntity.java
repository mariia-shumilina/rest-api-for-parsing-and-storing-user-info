package com.example.parser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@RedisHash("Person")
@AllArgsConstructor
@Data
public class PersonEntity implements Serializable {

    private int id;
    private String fullName;
    public enum Gender {
        MALE, FEMALE
    }
    private Gender gender;
    private String homeTown;
    private SimpleDateFormat birthDate;

}
