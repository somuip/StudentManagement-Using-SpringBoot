package com.badmashcompany.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //API
public class StudentController {

    @Autowired
    Service service;

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("q") int admnNo){

        return service.get_info(admnNo);
    }

    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody() Student student){
        service.addStudent(student);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }

//    @DeleteMapping("/delete/{q}")
//    String deletStudent(@PathVariable("q") int admnNo){
//
//    }

//    @PutMapping({"/{q}"})
//    String putStudent(@PathVariable("q") int admnNo, @RequestBody() Student student){
//
//    }
    // put API
    // get API - name
}
