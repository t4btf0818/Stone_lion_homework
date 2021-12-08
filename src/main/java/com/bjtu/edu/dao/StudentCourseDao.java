package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Homework;
import com.bjtu.edu.entity.StudentCourse;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 选课实体类dao层接口
 */
public interface StudentCourseDao {
    /**
     * NTSZ
     * @description: 查询所有选课列表
     *
     * @param 
     * @return java.util.List<com.bjtu.edu.entity.StudentCourse>
     */
    List<StudentCourse> queryStudentCourse();
    
    /**
     * @author: NTSZ
     * @description: 通过studentCourseId查询指定选课信息
     *
     * @param studentCourseId
     * @return com.bjtu.edu.entity.StudentCourse
     */
    StudentCourse queryStudentCourseById(long studentCourseId);


    /**
     * @author:NTSZ
     * @description: 通过studentId查询选课信息列表
     *
     * @param studentId
     * @return java.util.List<com.bjtu.edu.entity.Course>
     */
    List<StudentCourse> queryStudentCourseByStudentId(long studentId);

    /**
     * @author: NTSZ
     * @description: 通过courseId查询选课信息列表
     *
     * @param courseId
     * @return com.bjtu.edu.entity.StudentCourse
     */
    List<StudentCourse> queryStudentByCourseId(long courseId);
    
    /**
     * @author: NTSZ
     * @description: 新增选课信息
     *
     * @param studentCourse
     * @return int
     */
    int addStudentCourse(StudentCourse studentCourse);
    
    /**
     * @author: NTSZ
     * @description: 修改选课信息
     *
     * @param studentCourse
     * @return int
     */
    int modifyStudentCourse(StudentCourse studentCourse);
    
    /**
     * @author: NTSZ
     * @description: 通过studentCourseId删除指定选课信息
     *
     * @param studentCourseId
     * @return int
     */
    int deleteStudentCourse(long studentCourseId);
}
