package com.mwimar.SpringJDBCEx.service;


import com.mwimar.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void addStudent(Student s){
        System.out.println("Added student");
    }
}
