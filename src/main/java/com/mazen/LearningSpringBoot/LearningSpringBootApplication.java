package com.mazen.LearningSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(LearningSpringBootApplication.class, args);

        MyFirstClass myFirstClass = ctx.getBean("myFirstClass", MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
    }

}
