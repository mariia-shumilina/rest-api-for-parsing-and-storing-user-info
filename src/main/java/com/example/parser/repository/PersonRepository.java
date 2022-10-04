package com.example.parser.repository;

import com.example.parser.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {}