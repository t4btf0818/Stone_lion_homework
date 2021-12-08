package com.bjtu.edu.service;

import com.bjtu.edu.dto.FileHolder;
import com.bjtu.edu.dto.HomeworkExecution;
import com.bjtu.edu.entity.Homework;

import java.util.List;

public interface HomeworkService {
    /**
     * @description: 查询全部作业信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> getHomeworkList();

    /**
     * @description: 通过作业ID查询指定作业信息
     *
     * @param homeworkId
     * @return com.bjtu.edu.entity.Homework
     */
    Homework getHomeworkById(long homeworkId);

    /**
     * @description: 通过课程ID查询作业列表信息
     *
     * @param courseId
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> getHomeworkByCourseId(long courseId);

    /**
     * @description: 通过教师ID查询作业列表信息
     *
     * @param teacherId
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> getHomeworkByTeacherId(long teacherId);

    /**
     * @description: 通过学生ID查询作业列表信息
     *
     * @param studentId
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> getHomeworkByStudentId(long studentId);

    /**
     * @description: 新增作业信息
     *
     * @param homework
     * @param fileHolder
     * @return com.bjtu.edu.dto.HomeworkExecution
     */
    HomeworkExecution addHomework(Homework homework, FileHolder fileHolder);

    /**
     * @description: 修改作业信息
     *
     * @param homework
     * @param fileHolder
     * @return com.bjtu.edu.dto.HomeworkExecution
     */
    HomeworkExecution modifyHomework(Homework homework, FileHolder fileHolder);

    /**
     * @description: 删除指定作业信息
     *
     * @param homeworkId
     * @return com.bjtu.edu.dto.HomeworkExecution
     */
    HomeworkExecution deleteHomework(long homeworkId);
}
