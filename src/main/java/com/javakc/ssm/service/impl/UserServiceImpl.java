package com.javakc.ssm.service.impl;

import com.javakc.ssm.dao.UserDao;
import com.javakc.ssm.entity.UserEntity;
import com.javakc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = false)
    public int insert(UserEntity entity) {
        return userDao.insert(entity);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(String id) {
        return userDao.delete(id);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(UserEntity entity) {
        return userDao.update(entity);
    }

    @Override
    public long queryByCount(UserEntity entity) {
        return 0;
    }

    @Override
    public List<UserEntity> queryByPage(UserEntity entity, int start, int end) {
        return null;
    }

    @Override
    public UserEntity queryById(String id) {
        return null;
    }
}
