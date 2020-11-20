package org.zdjavapol12.studentmanagement.service;

import org.springframework.stereotype.Service;
import org.zdjavapol12.studentmanagement.model.Student;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl {

    private final Map<Long, Student> studentMap = new HashMap<>();
    private Long id = 1L;
}
