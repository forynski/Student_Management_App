package org.zdjavapol12.studentmanagement.service;

import org.springframework.stereotype.Service;
import org.zdjavapol12.studentmanagement.model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public File saveToFile(List<Student> students, File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(students.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
