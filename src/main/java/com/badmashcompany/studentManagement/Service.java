package com.badmashcompany.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {



    @Autowired
    Repository repository;
    public Student get_info(int id){
        return repository.getInfo(id);
    }

    public void addStudent(Student student){
        repository.addStudent(student);
    }
}
