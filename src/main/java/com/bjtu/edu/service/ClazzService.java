package com.bjtu.edu.service;

import com.bjtu.edu.dto.ClazzExecution;
import com.bjtu.edu.entity.Clazz;

import java.util.List;

public interface ClazzService {
    /**
     * @description: 查询全部班级信息
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Clazz>
     */
    List<Clazz> getClazzList();
    
    /**
     * @description: 通过班级Id查询唯一的班级信息
     *
     * @param clazzId
     * @return java.util.List<com.bjtu.edu.entity.Clazz>
     */
    Clazz getClazzById(long clazzId);

    /**
     * @description: 新增班级信息
     * @param clazz
     * @return com.bjtu.edu.dto.ClazzExecution
     */
    ClazzExecution addClazz(Clazz clazz);

    /**
     * @description: 修改班级信息
     *
     * @param clazz
     * @return com.bjtu.edu.dto.ClazzExecution
     */
    ClazzExecution modifyClazz(Clazz clazz);

    /**
     * @description: 删除指定班级
     *
     * @param clazzId
     * @return com.bjtu.edu.dto.ClazzExecution
     */
    ClazzExecution deleteClazz(long clazzId);
}
