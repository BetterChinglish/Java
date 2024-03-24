package com.betterchinglish.demo1_Class;

public class Test {

    // main方法是静态的, 所以也只能调用静态的方法, 所以里面要调用的方法也要是静态的
    // String[] args以前用于键盘录入数据, 现在没有, 保持向下兼容, 所以保留
    public static void main(String[] args) {

        /*
        * 测试静态变量
        * */
        /*Student s1 = new Student();

        s1.setName("zhangsan");
        s1.setAge(17);
        s1.setGender("boy");

        s1.study();
        System.out.println(s1.toString());

        Student s2 = new Student("lisi", 19, "girl");

        s2.study();
        System.out.println(s2.toString());

        System.out.println(Student.NumberOfStudents);*/

        /*
        * 测试工具类
        * */
        int[] arr = {1,2,5,12,3,5,345,6,123};
        System.out.println(ArrayUtil.ArraySum(arr));
    }

}
