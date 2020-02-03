package com.amogoscode.demoAgain.student;

import com.amogoscode.demoAgain.Exception.APIRequestException;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


@RestController
@RequestMapping("students")
public class StudentController {
        @GetMapping
        @CrossOrigin(origins = "http://localhost:3000")
        public List<Student> getAllStudents(){
            Student S1 = new Student(UUID.randomUUID(),"Lavanya","Guthi","lavanya.gooty@gmail.com", Student.Gender.FEMALE);
            Student S2 = new Student(UUID.randomUUID(),"Vijay","Krishna","Vijay.info229@gmail.com", Student.Gender.MALE);

            ArrayList<Student> A1 = new ArrayList<Student>();
            A1.add(S1);
            A1.add(S2);
            //throw new IllegalStateException("Oops cannot get all Students");
            throw new APIRequestException("Oops cannot get all Students with custom Exception");
           // return A1;

    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public void addNewStudent(@RequestBody Student student){
        System.out.println(student);

    }
}
