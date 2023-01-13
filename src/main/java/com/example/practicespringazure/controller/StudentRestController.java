package com.example.practicespringazure.controller;

import com.example.practicespringazure.model.Student;
import com.example.practicespringazure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value="*")
public class StudentRestController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students(){
        List<Student> lst = studentRepository.findAll();
        return lst;
    }

    @GetMapping("/addStudent")
    public List<Student> addStudent(){
        Student st = new Student();
        List<Student> lst = studentRepository.findAll();
        st.setName("Generated value: " + lst.size());
        studentRepository.save(st);
        return lst;
    }

    @GetMapping("/")
    public List<Student> rootStudent(){
        List<Student> lst = studentRepository.findAll();
        return lst;

    }
}
