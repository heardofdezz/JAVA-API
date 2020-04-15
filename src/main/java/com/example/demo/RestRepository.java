package com.example.demo;

// Extending Rest Repository to CRUDRepository operating on User
// Spring handling all the methods
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //Generating API
public interface RestRepository extends CrudRepository<User, Long> {

}
