package com.smartscheduler.web;


import com.smartscheduler.model.Person;
import com.smartscheduler.repo.PersonRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.Optional;

@RequestMapping("/people")
@RestController
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return repo.findById(id);     //return Optional.empty() if not found
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return repo.save(person);
    }


}
