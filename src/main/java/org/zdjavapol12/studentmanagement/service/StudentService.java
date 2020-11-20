package org.zdjavapol12.studentmanagement.service;

import org.zdjavapol12.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudentByIndexNumber(Long indexNumber);

    List<Student> getAllStudents;

    boolean deleteStudentByIndexNumber(Long indexNumber);

    Student addStudent(Student student);

    Student updateStudent(Long indexNumber, Student student);

    List<Student> addMultipleStudents(List<Student> students);
}
