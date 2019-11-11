package com.javakc.ssm.service;

import com.javakc.ssm.entity.UserEntity;

import java.util.List;


public interface UserService {
    /**
     * 添加用户
     * @param entity
     * @return 状态
     */
    public int insert(UserEntity entity);

    /**
     * 删除用户
     * @param id
     * @return 状态
     */
    public int delete(String id);

    /**
     * 修改用户
     * @param entity
     * @return 状态
     */
    public int update(UserEntity entity);

    /**
     * 查询总条数
     * @param entity
     * @return 符合条件结果
     */
    public long queryByCount(UserEntity entity);

    /**
     * 根据条件分页查询
     * @param entity
     * @param start 起始参数
     * @param end 结束参数
     * @return 符合条件结果集
     */
    public List<UserEntity> queryByPage(UserEntity entity,int start,int end );

    /**
     * 根据主键查询唯一结果
     * @param id
     * @return 对象
     */
    public UserEntity queryById(String id);
}
