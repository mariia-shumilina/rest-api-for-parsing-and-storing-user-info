package com.example.parser.dto;

import com.example.parser.entity.PersonEntity.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PersonDTO {
        private Long id;
        private String fullName;
        private Gender gender;
        private String homeTown;
        private String birthDate;
}
