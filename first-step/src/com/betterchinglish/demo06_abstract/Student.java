package com.betterchinglish.demo06_abstract;

// 抽象类的子类必须重写所有的抽象方法
public class Student extends Person{

    public Student() {
    }

    public Student(String name, int age) {
        // 使用父类的构造方法
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
