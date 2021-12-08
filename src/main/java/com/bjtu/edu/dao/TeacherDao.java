package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Teacher;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 教师实体类dao层接口
 */
public interface TeacherDao {
    /**
     * @author: NTSZ
     * @description: 查询所有教师列表
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Teacher>
     */
    List<Teacher> queryTeacher();

    /**
     * @author: NTSZ
     * @description: 通过teacherId查询指定教师信息
     *
     * @param teacherId
     * @return com.bjtu.edu.entity.Teacher
     */
    Teacher queryTeacherById(long teacherId);

    /**
     * @author: NTSZ
     * @description: 新增教师信息
     *
     * @param teacher
     * @return int
     */
    int addTeacher(Teacher teacher);

    /**
     * @author: NTSZ
     * @description: 修改教师信息
     *
     * @param teacher
     * @return int
     */
    int modifyTeacher(Teacher teacher);

    /**
     * @author: NTSZ
     * @description: 通过teacherId删除指定教师
     *
     * @param teacherId
     * @return int
     */
    int deleteTeacher(long teacherId);
}
