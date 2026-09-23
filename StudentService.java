package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Neelima", "neelima@gmail.com", "CSE"));
        students.add(new Student(2, "Priskilla", "priskilla@gmail.com", "CSE"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}