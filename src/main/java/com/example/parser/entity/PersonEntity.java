package com.example.parser.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Person")
@AllArgsConstructor
@Data
public class PersonEntity implements Serializable {

    @Id
    private Long id;
    private String fullName;
    private Gender gender;
    private String homeTown;
    private String birthDate;

    public enum Gender {
        @JsonProperty("female")
        MALE ("female"),
        @JsonProperty("male")
        FEMALE ("male");

        private final String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        @JsonValue
        @Override
        public String toString() {
            return gender;
        }
    }

}
