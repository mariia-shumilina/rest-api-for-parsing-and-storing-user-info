package com.example.parser.controller;

import com.example.parser.dto.PersonDTO;
import com.example.parser.entity.PersonEntity;
import com.example.parser.mapper.PersonMapper;
import com.example.parser.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository redisPersonRepos;
    private final PersonMapper mapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PersonDTO personDTO) {
        PersonEntity personEntity = mapper.toEntity(personDTO);
        redisPersonRepos.save(personEntity);
        return ResponseEntity.ok(personEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        return ResponseEntity.ok(redisPersonRepos.findById(id));
    }
}


