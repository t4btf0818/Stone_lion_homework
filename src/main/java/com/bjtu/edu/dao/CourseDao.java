package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Course;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 课程实体类dao层接口
 * @createTime: 2021/10/15
 */
public interface CourseDao {
    /**
     * @author: NTSZ
     * @description: 查询所有课程列表
     * @createTime: 2021/10/16
     *
     * @param 
     * @return java.util.List<com.bjtu.edu.entity.Course>
     */
    List<Course> queryCourse();
    
    /**
     * @author: NTSZ
     * @description: 通过courseId查询指定课程信息
     *
     * @param courseId
     * @return com.bjtu.edu.entity.Course
     */
    Course queryCourseById(long courseId);

    /**
     * @author: NTSZ
     * @description: 通过teacherId查询课程信息列表
     *
     * @param teacherId
     * @return java.util.List<com.bjtu.edu.entity.Course>
     */
    List<Course> queryCourseByTeacherId(long teacherId);
    
    /**
     * @author: NTSZ
     * @description: 新增课程信息
     *
     * @param course
     * @return int
     */
    int addCourse(Course course);
    
    /**
     * @author: NTSZ
     * @description: 修改课程信息
     * @param course
     * @return int
     */
    int modifyCourse(Course course);
    
    /**
     * @author: NTSZ
     * @description: 通过courseId删除指定课程信息
     * @param courseId
     * @return int
     */
    int deleteCourse(long courseId);
}
