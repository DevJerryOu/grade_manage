package com.management.grade.service.impl;

import com.management.grade.mapper.UserMapper;
import com.management.grade.model.User;
import com.management.grade.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public boolean insertNewUser(User user) {
        boolean flag = false;
        try{
            userMapper.insert(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
