package com.mwimar.SpringJDBCEx.repo;

import com.mwimar.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Student saved");
    }
}
