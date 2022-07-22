package com.saurabh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingClass {
    public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle-alias");
        triangle.draw();
    }

}
