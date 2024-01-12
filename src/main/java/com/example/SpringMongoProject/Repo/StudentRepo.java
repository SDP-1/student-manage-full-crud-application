package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {

}
