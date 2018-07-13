package com.ylh;

import javax.naming.Name;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //控制台输入长和宽 计算长方形面积 并输出结果
        Scanner scanner1 = new Scanner(System.in);
        int anInt1 = scanner1.nextInt();
        int anInt2 = scanner1.nextInt();
        int s = anInt1*anInt2;
        System.out.println("面积为"+s);


    }
    public void test1()
    {
        System.out.println("欢迎使用IDEA");
        //变量
        //定义一个整型变量
        int a1 = 3;
        //字符类型
        char sex = '女';
        //定义分数的变量
        double score = 59.9;
        //字符串变量 存储姓名
        String name = "阴丽红";
        //以上都是使用变量存储数据
        System.out.println(sex);
        System.out.println(name);
        //定义两个整型变量，a=3,b=5
        //实现交换两个变量的值，打印出a为5,b为3
        int a=3, b = 5;
        a=a+b;//a=8 b=5;
        b=a-b;//a=8 b=3;
        a=a-b;//a=5 b=3;
        System.out.println(a);

        int num1 = 1,num2 = 2,num3 =3;

        boolean result = a>b;//比较结果为布尔值

        //比较两个数的大小 使用三目运算符
        int max = a>b?a:b;
        System.out.println("最大值为"+max);

        //控制台输入一个整数
        Scanner scanner = new Scanner(System.in);
        //获取控制台输入的整型变量值
        int anInt = scanner.nextInt();
        System.out.println("输入的值为"+anInt);
    }
}
