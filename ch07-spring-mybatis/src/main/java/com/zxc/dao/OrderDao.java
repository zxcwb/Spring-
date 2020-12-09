package com.zxc.dao;

import com.zxc.domain.Student;

import java.util.List;

public interface OrderDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
