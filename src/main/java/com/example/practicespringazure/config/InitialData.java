package com.example.practicespringazure.config;

import com.example.practicespringazure.model.Student;
import com.example.practicespringazure.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialData implements CommandLineRunner {

    StudentRepository studentRepository;

    public InitialData(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String ...args) throws Exception {
        Student st1 = new Student();
        st1.setName("Nicolas");

        Student st2 = new Student();
        st2.setName("Nicolas2");

        studentRepository.save(st1);
        studentRepository.save(st2);
    }
}
