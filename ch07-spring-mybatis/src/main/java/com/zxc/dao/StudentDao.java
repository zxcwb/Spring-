package com.zxc.dao;

import com.zxc.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
