package com.example.parser.controller;

import com.example.parser.dto.PersonDTO;
import com.example.parser.entity.PersonEntity;
import com.example.parser.mapper.PersonMapper;
import com.example.parser.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")

public class PersonController {

    private PersonRepository redisPersonRepos;
    private PersonMapper mapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PersonDTO personDTO) {
        PersonEntity personEntity = mapper.toEntity(personDTO);
        redisPersonRepos.save(personEntity);
        return ResponseEntity.ok(personEntity);
    }

    @GetMapping
    public ResponseEntity<?> get(@RequestBody int id) {
        return ResponseEntity.ok(redisPersonRepos.findById(id));
    }
}


