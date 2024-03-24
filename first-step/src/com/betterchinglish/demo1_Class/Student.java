package com.betterchinglish.demo1_Class;

public class Student {

    String name;
    int age;
    String gender;

    // 从方法区获取类时，在堆内存单独的一块区域--静态区--为该类创建相应的静态变量
    // 随着类加载而加载，优先于对象出现

    // 静态方法没有this
    // 静态方法只能访问静态内容
    // 非静态方法可以访问所有

    // 静态变量的访问方式为类目.变量名, 也可以使用对象访问但不推荐




    static int NumberOfStudents;

    public Student() {
        Student.NumberOfStudents++;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Student.NumberOfStudents++;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(this.name + " is studying...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
