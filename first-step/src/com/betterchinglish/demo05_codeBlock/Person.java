package com.betterchinglish.demo05_codeBlock;

public class Person {

    private String name;
    private int age;


    // 弃用，不够灵活，可以使用函数方式代替
    { // 创建对象时必会执行一次
        System.out.println("create obj");
    }

    // 利用其只会输出一次的特性，可以在这进行一些数据的初始化操作
    static { // 加载类时执行一次，只会执行一次
        System.out.println("static code block");
    }

    public Person() {
        // System.out.println("create obj");
    }

    public Person(String name, int age) {
        // System.out.println("create obj");
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
}
