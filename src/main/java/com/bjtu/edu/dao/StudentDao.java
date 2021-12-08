package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Student;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 学生实体类dao层接口
 */
public interface StudentDao {
    /**
     * @author: NTSZ
     * @description: 查询所有学生列表
     *
     * @param 
     * @return java.util.List<com.bjtu.edu.entity.Student>
     */
    List<Student> queryStudent();

    /**
     * @author: NTSZ
     * @description: 通过studentId查询指定学生信息
     *
     * @param studentId
     * @return com.bjtu.edu.entity.Student
     */
    Student queryStudentById(long studentId);
    
    /**
     * @author: NTSZ
     * @description: 新增学生信息
     *
     * @param student
     * @return int
     */
    int addStudent(Student student);
    
    /**
     * @author: NTSZ
     * @description: 修改学生信息
     *
     * @param student
     * @return int
     */
    int modifyStudent(Student student);
    
    /**
     * @author: NTSZ
     * @description: 通过studentId删除指定学生
     *
     * @param studentId
     * @return int
     */
    int deleteStudent(long studentId);
}
