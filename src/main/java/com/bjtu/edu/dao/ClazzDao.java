package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Clazz;

import java.util.List;

/**
 * @author: NTSZ
 * @description: 班级实体类dao层接口
 * @createTime: 2021/10/12 11:23
 */
public interface ClazzDao {
    /**
     * @author: NTSZ
     * @description: 查询所有班级列表
     * @createTime: 2021/10/13
     *
     * @param
     * @return java.util.List<com.bjtu.edu.entity.Clazz>
     */
    List<Clazz> queryClazz();

    /**
     * @author: NTSZ
     * @description: 通过clazzId查询指定班级信息
     * @createTime: 2021/10/13
     *
     * @param clazzId
     * @return com.bjtu.edu.entity.Clazz
     */
    Clazz queryClazzById(long clazzId);

    /**
     * @author: NTSZ
     * @description: 新增班级信息
     * @param clazz
     * @return int
     */
    int addClazz(Clazz clazz);

    /**
     * @author: NTSZ
     * @description: 修改班级信息
     * @createTime: 2021/11/3
     *
     * @param aClazz
     * @return int
     */
    int modifyClazz(Clazz aClazz);

    /**
     * @author: NTSZ
     * @description: 通过clazzId删除指定班级
     * @param clazzId
     * @return int
     */
    int deleteClazz(long clazzId);
}
