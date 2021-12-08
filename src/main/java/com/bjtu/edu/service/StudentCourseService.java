package com.bjtu.edu.service;

import com.bjtu.edu.dto.StudentCourseExecution;
import com.bjtu.edu.entity.StudentCourse;

import java.util.List;

public interface StudentCourseService {
    /**
     * @description: 查询全部选课信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.StudentCourse>
     */
    List<StudentCourse> getStudentCourseList();

    /**
     * @description: 通过选课ID获取指定选课信息
     *
     * @param studentCourseId
     * @return com.bjtu.edu.entity.StudentCourse
     */
    StudentCourse getStudentCourseById(long studentCourseId);

    /**
     * @description: 通过studentId查询选课信息列表
     *
     * @param studentId
     * @return java.util.List<com.bjtu.edu.entity.StudentCourse>
     */
    List<StudentCourse> getStudentCourseByStudentId(long studentId);

    /**
     * @description: 通过课程ID获取学生列表信息
     *
     * @param courseId
     * @return com.bjtu.edu.entity.StudentCourse
     */
    List<StudentCourse> getStudentByCourseId(long courseId);

    /**
     * @description: 新增选课信息
     *
     * @param studentCourse
     * @return com.bjtu.edu.dto.StudentCourseExecution
     */
    StudentCourseExecution addStudentCourse(StudentCourse studentCourse);

    /**
     * @description: 修改选课信息
     *
     * @param studentCourse
     * @return com.bjtu.edu.dto.StudentCourseExecution
     */
    StudentCourseExecution modifyStudentCourse(StudentCourse studentCourse);

    /**
     * @description: 删除指定选课信息
     *
     * @param studentCourseId
     * @return com.bjtu.edu.dto.StudentCourseExecution
     */
    StudentCourseExecution deleteStudentCourse(long studentCourseId);
}
