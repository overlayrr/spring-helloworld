package ru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Cat cat = applicationContext.getBean(Cat.class);
        Cat cat1 = applicationContext.getBean(Cat.class);
        HelloWorld world = applicationContext.getBean(HelloWorld.class);
        HelloWorld world1 = applicationContext.getBean(HelloWorld.class);
        System.out.println(world.equals(world1));
        System.out.println(cat.equals(cat1));
    }
}