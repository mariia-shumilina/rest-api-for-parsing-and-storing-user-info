package com.example.parser.mapper;

import com.example.parser.dto.PersonDTO;
import com.example.parser.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonDTO toDTO(PersonEntity person) {
        return new PersonDTO(person.getId(),
                person.getFullName(),
                person.getGender(),
                person.getHomeTown(),
                person.getBirthDate()
        );
    }

    public PersonEntity toEntity(PersonDTO personDTO) {
        return new PersonEntity(personDTO.getId(),
                personDTO.getFullName(),
                personDTO.getGender(),
                personDTO.getHomeTown(),
                personDTO.getBirthDate()
        );
    }

}
