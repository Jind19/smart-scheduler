package com.smartscheduler.repo;

import com.smartscheduler.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    // No need to write any code — CRUD methods are inherited:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - count()
}
