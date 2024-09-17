package com.betterchinglish.demo06_abstract;

public class Test {
    public static void main(String[] args) {

        // 抽象类不可以实例化
        // Person p1 = new Person();   // 报错


        // 抽象类的子类必须重写所有的抽象方法
        // 或者子类也是个抽象类

        Student s1 = new Student("zhangsan", 18);

        // 好处
        // 父类知道子类都要做某个行为，但是行为的表现可能不一致，这时候就需要提前定义好抽象方法，交由子类去重写、实现
        // 如此做可以更好地支持多态

    }
}
