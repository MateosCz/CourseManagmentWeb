package com.test.demo.Service;

import com.test.demo.Bean.UserBean;
import com.test.demo.DAO.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean getUserByID(String name, String password){
        return userMapper.getUserByID(name,password);
    }
}
