package org.zdjavapol12.studentmanagement.service;

import org.zdjavapol12.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    boolean deleteStudentById(Long id);

    Student addStudent(Student student);

    Student updateStudent(Long id, Student student);

    List<Student> addMultipleStudents(List<Student> students);
}
