package com.atguigu.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {

        private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

        @Test
        public void test01(){
            Object user = applicationContext.getBean("user");
            System.out.println(user);
        }


}
