package com.bjtu.edu.service;

import com.bjtu.edu.dto.FileHolder;
import com.bjtu.edu.dto.StudentHomeworkExecution;
import com.bjtu.edu.entity.StudentHomework;

import java.util.List;

public interface StudentHomeworkService {
    /**
     * @description: 查询全部学生作业列表信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> getStudentHomeworkList();

    /**
     * @description: 通过学生作业ID获取指定学生作业信息
     *
     * @param studentHomeworkId
     * @return com.bjtu.edu.entity.StudentHomework
     */
    StudentHomework getStudentHomeworkById(long studentHomeworkId);

    /**
     * @description: 通过课程ID获取学生作业列表信息
     *
     * @param courseId
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> getStudentHomeworkByCourseId(long courseId);

    /**
     * @description: 通过教师ID获取学生作业列表信息
     *
     * @param teacherId
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> getStudentHomeworkByTeacherId(long teacherId);

    /**
     * @description: 通过传入的信息判断是否存在符合条件的学生作业信息
     *
     * @param studentHomeworkCondition
     * @return com.bjtu.edu.entity.StudentHomework
     */
    StudentHomework getStudentHomeworkCondition(StudentHomework studentHomeworkCondition);

    /**
     * @description: 新增学生作业信息
     *
     * @param studentHomework
     * @param fileHolder
     * @return com.bjtu.edu.dto.StudentHomeworkExecution
     */
    StudentHomeworkExecution addStudentHomework(StudentHomework studentHomework, FileHolder fileHolder);

    /**
     * @description: 修改学生作业信息
     *
     * @param studentHomework
     * @param fileHolder
     * @return com.bjtu.edu.dto.StudentHomeworkExecution
     */
    StudentHomeworkExecution modifyStudentHomework(StudentHomework studentHomework, FileHolder fileHolder);

    /**

     * @description: 删除指定学生作业信息
     *
     * @param studentHomeworkId
     * @return com.bjtu.edu.dto.StudentHomeworkExecution
     */
    StudentHomeworkExecution deleteStudentHomework(long studentHomeworkId);
}
