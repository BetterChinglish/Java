package com.betterchinglish.demo3_polymorphic;

public class Student extends Person {

    String hobby = "Student hobby";
    String hobby1 = "Student hobby1";

    void showHobby1() {
        System.out.println(this.hobby1);
    }

    void showHobby() {
        System.out.println(this.hobby);
    }

    @Override
    public void show() {
        System.out.println("student: " + this.getName());
        System.out.println("age: " + this.getAge());
        System.out.println("----");
    }

}
