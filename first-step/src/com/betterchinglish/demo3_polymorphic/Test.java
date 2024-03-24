package com.betterchinglish.demo3_polymorphic;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("zhangsan");

        Teacher t1 = new Teacher();
        t1.setAge(35);
        t1.setName("Bob");

        /*
        * 多态的基本使用
        * */

        // 多态，使用Person p 形参接受 Student类型 与 Teacher类型 的对象
        register(s1);
        register(t1);

        Person p1 = s1; // 接受类型Person，实际类型Student

        // 此时访问p1指针中的变量与访问p1中的方法时，需要注意：
        // 访问变量： 编译看左边，运行也看左边；
        // 访问方法： 编译看左边，运行看右边

        // 如此处，虽然Student类有hobby，但是Person类，所以编译不通过，报错；
        // p1.hobby = "喜欢打篮球";

        // 此处Person与Student类都有hobby2这个变量，所以编译通过；
        // 但是p1是多态形式的访问Student类型的对象的变量，所以运行的时候看左边，也就是说看Person p1 = s1;的等于号的左边，即访问Person中的hobby1
        System.out.println(p1.hobby1);  // Person hobby1

        // 虽然Student类型对象中有showHobby但是Person没有，也就是说编译时看接收类型中是否有该方法
        // p1.showHobby();  // 报错
        // 但是运行的时候看实际类型Student, Person与Student中都有showHobby1方法
        p1.showHobby1();    // Student hobby1

        /*
        * 多态的弊端
        *   无法访问实际对象的特有方法
        * */
    }

    public static void register(Person p) {
        p.show();
    }
}
