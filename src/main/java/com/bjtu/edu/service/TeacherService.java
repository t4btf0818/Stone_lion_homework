package com.bjtu.edu.service;

import com.bjtu.edu.dto.ImageHolder;
import com.bjtu.edu.dto.TeacherExecution;
import com.bjtu.edu.entity.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * @description: 查询全部教师信息
     *
     * @param 
     * @return java.util.List<com.bjtu.edu.entity.Teacher>
     */
    List<Teacher> getTeacherList();
    
    /**
     * @description: 通过教师ID获取指定教师信息
     *
     * @param teacherId
     * @return com.bjtu.edu.entity.Teacher
     */
    Teacher getTeacherById(long teacherId);

    /**
     * @description: 新增教师信息
     *
     * @param teacher
     * @param thumbnail
     * @return com.bjtu.edu.dto.TeacherExecution
     */
    TeacherExecution addTeacher(Teacher teacher, ImageHolder thumbnail);

    /**
     * @description: 修改教师信息
     *
     * @param teacher
     * @param thumbnail
     * @return com.bjtu.edu.dto.TeacherExecution
     */
    TeacherExecution modifyTeacher(Teacher teacher, ImageHolder thumbnail);
    
    /**
     * @description: 删除指定教师信息
     *
     * @param teacherId
     * @return com.bjtu.edu.dto.TeacherExecution
     */
    TeacherExecution deleteTeacher(long teacherId);
}
