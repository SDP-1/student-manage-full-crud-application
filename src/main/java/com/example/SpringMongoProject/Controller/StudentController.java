package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student students) {

        studentServices.serverUpdate(students);
        return students.getId();
    }

    @GetMapping(value = "/getAll")
    private Iterable<Student> getStudents() {
        return studentServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name = "id") String studentId) {
        student.setId(studentId);
        studentServices.serverUpdate(student);
        return student;
    }

    @DeleteMapping(value = "/delete/{id}")
    private void delete(@PathVariable(name = "id") String studentId) {
        studentServices.deleteStudent(studentId);
    }

    @RequestMapping("/student/{id}")
    private Student getStudent(@PathVariable(name = "id") String studentId) {
        return studentServices.getStudentById(studentId);
    }

}
