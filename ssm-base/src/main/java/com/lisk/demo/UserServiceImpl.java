package com.lisk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/7/11.
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserDaoImpl userDaoImpl;

    @Autowired
    private UserMapper userMapper;

    public void world(){
        userDaoImpl.test();
    }

    public void saveUser(User user){
        userMapper.addUser(user);
    }

}
