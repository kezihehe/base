package com.lisk.test;

import com.lisk.demo.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016/7/11.
 */
public class SpringTest {

    @Test
    public void test(){

        ApplicationContext axt=new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        UserService userService= (UserService) axt.getBean("userService");
        userService.world();



    }

}
