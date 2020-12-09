package com.zxc.service;

import com.zxc.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
