package com.test.MainStrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class ServiceApp {
    public static void main( String[] args ) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
        context.start();
        while(true){
            Thread.sleep(Long.MAX_VALUE);
        }
    }
}
