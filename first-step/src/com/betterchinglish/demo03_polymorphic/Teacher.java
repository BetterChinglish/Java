package com.betterchinglish.demo03_polymorphic;

public class Teacher extends Person {


    public void show() {
        System.out.println("teacher: " + this.getName());
        System.out.println("age: " + this.getAge());
        System.out.println("----");
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching...");
    }
}
