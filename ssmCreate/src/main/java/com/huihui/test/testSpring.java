package com.huihui.test;

import com.huihui.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FBI WARING:
 **/
public class testSpring {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.findAll();
    }
}
