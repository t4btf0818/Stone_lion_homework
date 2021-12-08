package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 作业实体类dao层接口
 */
public interface HomeworkDao {
    /**
     * @author: NTSZ
     * @description: 查询所有作业列表
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> queryHomework();

    /**
     * @author: NTSZ
     * @description: 通过homeworkId查询指定作业信息
     *
     * @param homeworkId
     * @return com.bjtu.edu.entity.Homework
     */
    Homework queryHomeworkById(long homeworkId);

    /**
     * @description: 通过courseId查询作业信息列表
     *
     * @param courseId
     * @return com.bjtu.edu.entity.Homework
     */
    List<Homework> queryHomeworkByCourseId(long courseId);

    /**
     * @author: NTSZ
     * @description: 通过teacherId查询作业信息列表
     *
     * @param teacherId
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> queryHomeworkByTeacherId(long teacherId);

    /**
     * @author: 泥头狮子
     * @description: 通过studentId查询作业信息列表
     *
     * @param studentId
     * @return java.util.List<com.bjtu.edu.entity.Homework>
     */
    List<Homework> queryHomeworkByStudentId(@Param("studentId") long studentId);

    /**
     * @author: NTSZ
     * @description: 新增作业信息
     *
     * @param homework
     * @return int
     */
    int addHomework(Homework homework);

    /**
     * @author: NTSZ
     * @description: 修改作业信息
     *
     * @param homework
     * @return int
     */
    int modifyHomework(Homework homework);

    /**
     * @author: NTSZ
     * @description: 通过homeworkId删除指定作业信息
     *
     * @param homeworkId
     * @return int
     */
    int deleteHomework(long homeworkId);
}
