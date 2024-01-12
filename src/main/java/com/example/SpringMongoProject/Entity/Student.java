package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;

@Document(collection = "student")
public class Student {
    @Id
    private String id;
    private String studentname;
    private String studentAddress;
    private String mobile;

    public Student() {
    }

    public Student(String id, String studentname, String studentAddress, String mobile) {
        this.id = id;
        this.studentname = studentname;
        this.studentAddress = studentAddress;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
