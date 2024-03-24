package com.betterchinglish.demo3_polymorphic;

public class Person {
    private String name;
    private int age;

     String hobby1 = "Person hobby1";

     void showHobby1() {
         System.out.println(this.hobby1);
     }


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(this.name + " is " + this.age + " years old");
    }
}
