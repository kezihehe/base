package com.lisk.test;

import com.lisk.demo.User;
import com.lisk.demo.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016/7/11.
 */
public class SpringTest {

    @Test
    public void test(){

        ApplicationContext axt=new ClassPathXmlApplicationContext(new String[]{"classpath:spring-beans.xml","classpath:spring-mybatis.xml"});
        UserServiceImpl userService= (UserServiceImpl) axt.getBean("userServiceImpl");
        User user=new User();
        user.setUsername("hello");
        userService.saveUser(user);



    }

}
