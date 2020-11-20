package org.zdjavapol12.studentmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zdjavapol12.studentmanagement.model.Student;
import org.zdjavapol12.studentmanagement.service.FileService;
import org.zdjavapol12.studentmanagement.service.StudentService;

import java.io.File;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "university/save")
public class FileController {

    private final FileService fileService;
    private final StudentService studentService;

    public FileController(FileService fileService, StudentService studentService) {
        this.fileService = fileService;
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<?> saveToFile() {
        List<Student> students = studentService.getAllStudents();
        log.info("All data has been saved successfully to txt file");
        return ResponseEntity.ok(fileService.saveToFile(students, new File("students_data.txt")));
    }
}
