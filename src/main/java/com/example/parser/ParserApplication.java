package com.example.parser;

import com.example.parser.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.parser.repository.PersonDAO;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/person")
public class ParserApplication {

    private PersonDAO dao;

    @PostMapping
    public Person save(@RequestBody Person person) {
        return dao.save(person);
    }

    @GetMapping
    public List<Person> getAll() {
        return dao.getAll();
    }

    @GetMapping("/{id}")
    public Person find(@PathVariable int id) {
        return dao.findById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id) {
        return dao.deleteById(id);
    }

    public static void main(String[] args) {

        SpringApplication.run(ParserApplication.class, args);
    }

}
