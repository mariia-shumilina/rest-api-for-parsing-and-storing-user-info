package com.example.parser.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.text.SimpleDateFormat;

@AllArgsConstructor
@Data
public class PersonDTO {
        private int id;
        private String fullName;
        private com.example.parser.entity.PersonEntity.Gender gender;
        private String homeTown;
        private SimpleDateFormat birthDate;
}
