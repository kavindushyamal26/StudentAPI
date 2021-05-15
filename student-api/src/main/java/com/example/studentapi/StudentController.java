package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    StudentRepository repository = new InMemoryStudentRepository();

    //create student
    @PostMapping("/student")
    public void CreateStudent(@RequestBody Student student){

        repository.save(student);
    }
    //retrieve student
    @GetMapping("/student/{id}")
    public  Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //delete student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.delete(id);
    }

    //update student
    @PutMapping("/student/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){
        repository.update(id,student);
    }

}
