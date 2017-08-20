package com.ailin.dao;


import com.ailin.model.Manager;

public interface ManagerMapper {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入，空属�?也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    int insert(Manager record);
    /**
     * 插入，空属�?不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    int insertSelective(Manager record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键�?
     * 返回:对象
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    Manager selectByPrimaryKey(Integer id);
    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的�?
     * 返回:成功修改个数
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    int updateByPrimaryKeySelective(Manager record);
    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的�?
     * 返回:成功修改个数
     * @ibatorgenerated 2017-08-07 17:07:49
     */
    int updateByPrimaryKey(Manager record);
}