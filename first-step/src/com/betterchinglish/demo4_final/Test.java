package com.betterchinglish.demo4_final;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*
        * 修饰方法：
        *   表面该方法是最终的方法，不能被重写
        *
        * 修饰类：
        *   表示该类是最终类，不能被继承
        *
        *
        * 修饰变量：
        *   表示该变量为常量，不可以被修改，需要在定义的时候进行初始化
        *   例如定义PI = 3.1415926535这种等
        *
        * */


        // 对修饰变量做一个例子，其他的就不搞了

        final String Monday = "1";
        final String Tuesday = "2";
        final String Wednesday = "3";
        final String Thursday = "4";
        final String Friday = "5";
        final String Saturday = "6";
        final String Sunday = "7";

        Scanner sc = new Scanner(System.in);

        System.out.println("告诉我今天周几好吗？使用数字 1-7: ");
        String today = sc.nextLine();

        switch (today) {
            case Monday -> System.out.println("原来今天是周1");
            case Tuesday -> System.out.println("原来今天是周2");
            case Wednesday -> System.out.println("原来今天是周3");
            case Thursday -> System.out.println("原来今天是周4");
            case Friday -> System.out.println("原来今天是周5");
            case Saturday -> System.out.println("原来今天是周6");
            case Sunday -> System.out.println("原来今天是周7");
            default -> System.out.println("输入错误");
        }


    }
}
