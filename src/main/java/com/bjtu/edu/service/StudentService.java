package com.bjtu.edu.service;

import com.bjtu.edu.dto.ImageHolder;
import com.bjtu.edu.dto.StudentExecution;
import com.bjtu.edu.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * @description: 查询全部教师信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Student>
     */
    List<Student> getStudentList();

    /**
     * @description: 通过学生ID获取指定学生信息
     *
     * @param studentId
     * @return com.bjtu.edu.entity.Student
     */
    Student getStudentById(long studentId);

    /**
     * @description: 新增学生信息
     *
     * @param student
     * @param imageHolder
     * @return com.bjtu.edu.dto.StudentExecution
     */
    StudentExecution addStudent(Student student, ImageHolder imageHolder);

    /**
     * @description: 修改学生信息
     *
     * @param student
     * @param imageHolder
     * @return com.bjtu.edu.dto.StudentExecution
     */
    StudentExecution modifyStudent(Student student, ImageHolder imageHolder);

    /**
     * @description: 删除指定学生信息
     *
     * @param studentId
     * @return com.bjtu.edu.dto.StudentExecution
     */
    StudentExecution deleteStudent(long studentId);
}
