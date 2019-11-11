package com.javakc.ssm.dao;

import com.javakc.ssm.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserDao {
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
     * @param param
     * @return 符合条件结果
     */
   public long queryByCount(Map<String,Object> param);

    /**
     * 根据条件分页查询
     * @param param
     * @return 符合条件结果集
     */
   public List<UserEntity> queryByPage(Map<String,Object> param);

    /**
     * 根据主键查询唯一结果
     * @param id
     * @return 对象
     */
   public UserEntity queryById(String id);

}
