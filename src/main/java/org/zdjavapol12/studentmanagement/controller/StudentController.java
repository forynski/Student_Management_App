package org.zdjavapol12.studentmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zdjavapol12.studentmanagement.model.Student;
import org.zdjavapol12.studentmanagement.service.StudentService;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping(path = "/university/student")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if (Objects.nonNull(student)) {
            log.info("Student successfully found by id");
            return ResponseEntity.ok(student);
        } else {
            log.info("404 not found");
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        log.info("All students successfully found");
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        if (studentService.deleteStudentById(id)) {
            log.info("Student successfully deleted by id");
            return ResponseEntity.accepted().build();
        } else {
            log.info("404 not found");
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        log.info("Student successfully added");
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(student));
    }

    @PostMapping(path = "/multiple")
    public ResponseEntity<?> addStudent(@RequestBody List<Student> students) {
        log.info("All students successfully added");
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addMultipleStudents(students));
    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<?> updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        log.info("Student's data successfully updated");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.updateStudent(id, student));
    }

}
