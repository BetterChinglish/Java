package com.betterchinglish.demo07_abstract_template;

public class Test {
    public static void main(String[] args) {
        // 模板方法设计模式
        // 1. 定义公共方法----模板方法
        // 2. 定义抽象方法
        // 3. 在公共方法中调用抽象方法
        // 4. 在子类中重写抽象方法

        // 模板方法建议使用final修饰
        People teacher = new Teacher();
        People student = new Student();
        teacher.write();
        student.write();
    }
}
