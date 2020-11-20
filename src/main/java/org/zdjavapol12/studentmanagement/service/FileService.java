package org.zdjavapol12.studentmanagement.service;

import org.zdjavapol12.studentmanagement.model.Student;

import java.io.File;
import java.util.List;

public interface FileService {
    File saveToFile(List<Student> students, File file);
}
