package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Homework;
import com.bjtu.edu.entity.StudentHomework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 学生作业实体类dao层接口
 */
public interface StudentHomeworkDao {
    /**
     * @author: NTSZ
     * @description: 查询所有学生作业列表
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> queryStudentHomework();

    /**
     * @author: NTSZ
     * @description: 通过studentHomeworkId查询指定学生作业信息
     *
     * @param studentHomeworkId
     * @return com.bjtu.edu.entity.StudentHomework
     */
    StudentHomework queryStudentHomeworkById(long studentHomeworkId);

    /**
     * @author: NTSZ
     * @description: 通过courseId查询学生作业信息列表
     *
     * @param courseId
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> queryStudentHomeworkByCourseId(long courseId);

    /**
     * @author: NTSZ
     * @description: 通过teacherId查询学生作业信息列表
     *
     * @param teacherId
     * @return java.util.List<com.bjtu.edu.entity.StudentHomework>
     */
    List<StudentHomework> queryStudentHomeworkByTeacherId(long teacherId);

    /**
     * @author: NTSZ
     * @description: 查询指定的学生作业信息是否存在
     *
     * @param studentHomeworkCondition
     * @return int
     */
    int queryStudentHomeworkExist(@Param("studentHomeworkCondition") StudentHomework studentHomeworkCondition);

    /**
     * @author: NTSZ
     * @description: 通过传入的条件获取指定的学生信息
     *
     * @param studentHomeworkCondition
     * @return com.bjtu.edu.entity.StudentHomework
     */
    StudentHomework queryStudentHomeworkByCondition(@Param("studentHomeworkCondition") StudentHomework studentHomeworkCondition);

    /**
     * @author: NTSZ
     * @description: 新增学生作业信息
     *
     * @param studentHomework
     * @return int
     */
    int addStudentHomework(StudentHomework studentHomework);

    /**
     * @author: NTSZ
     * @description: 修改学生作业信息
     *
     * @param studentHomework
     * @return int
     */
    int modifyStudentHomework(StudentHomework studentHomework);

    /**
     * @author: NTSZ
     * @description: 通过studentHomeworkId删除学生作业信息
     *
     * @param studentHomeworkId
     * @return int
     */
    int deleteStudentHomework(long studentHomeworkId);
}
