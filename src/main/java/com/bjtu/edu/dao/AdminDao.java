package com.bjtu.edu.dao;

import com.bjtu.edu.entity.Admin;

/**
 * @author: NTSZ
 * @description: 管理员实体类dao层接口
 * @createTime: 2021/10/12
 */
public interface AdminDao {
    /**
     * @author: NTSZ
     * @description: 通过adminId查询指定管理员信息
     * @createTime: 2021/10/12
     *
     * @param adminId
     * @return com.bjtu.edu.entity.Admin
     */
    Admin queryAdminById(long adminId);

    /**
     * @author: NTSZ
     * @description: 修改管理员信息
     * @createTime: 2021/10/15 19:21
     *
     * @param admin
     * @return int
     */
    int modifyAdmin(Admin admin);
}
