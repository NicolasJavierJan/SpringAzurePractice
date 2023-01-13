package com.example.practicespringazure;

import com.example.practicespringazure.model.Student;
import com.example.practicespringazure.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class PracticeSpringAzureApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testStudent(){
        Student st1 = new Student();
        studentRepository.save(st1);
        List<Student> lst = studentRepository.findAll();
        assertEquals(1, lst.size());
    }

}
