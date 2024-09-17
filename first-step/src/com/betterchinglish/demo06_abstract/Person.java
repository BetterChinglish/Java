package com.betterchinglish.demo06_abstract;

// 只要有一个抽象方法则该类必须声明为抽象类，使用abstract
// 但是抽象类可以没有抽象方法（有抽象方法的类一定是抽象类）
public abstract class Person {

    private String name;
    private int age;

    // 父类中不确定的方法可以只声明不实现，而继承该类的子类则必须实现该方法
    // 这种方法称为抽象方法
    public abstract void work();

    // 可以有构造方法


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
}
