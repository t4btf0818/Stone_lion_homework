package com.bjtu.edu.service;

import com.bjtu.edu.dto.CourseExecution;
import com.bjtu.edu.entity.Course;

import java.util.List;

public interface CourseService {
    /**
     * @description: 查询全部课程信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Course>
     */
    List<Course> getCourseList();

    /**
     * @description: 通过课程ID获取指定课程信息
     *
     * @param courseId
     * @return com.bjtu.edu.entity.Course
     */
    Course getCourseById(long courseId);

    /**
     * @description: 通过教师ID获取指定课程信息
     *
     * @param teacherId
     * @return com.bjtu.edu.entity.Course
     */
    List<Course> getCourseByTeacherId(long teacherId);

    /**
     * @description: 新增课程信息
     *
     * @param course
     * @return com.bjtu.edu.dto.CourseExecution
     */
    CourseExecution addCourse(Course course);

    /**
     * @description: 修改课程信息
     *
     * @param course
     * @return com.bjtu.edu.dto.CourseExecution
     */
    CourseExecution modifyCourse(Course course);

    /**
     * @description: 删除指定课程信息
     *
     * @param courseId
     * @return com.bjtu.edu.dto.CourseExecution
     */
    CourseExecution deleteCourse(long courseId);
}
