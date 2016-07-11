package com.lisk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/7/11.
 */
@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;

    public void world(){
        userDaoImpl.test();
    }

}
