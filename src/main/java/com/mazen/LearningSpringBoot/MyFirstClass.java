package com.mazen.LearningSpringBoot;

public class MyFirstClass  {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello From MyFirstClass ==> myVar = " + myVar;
    }
}
