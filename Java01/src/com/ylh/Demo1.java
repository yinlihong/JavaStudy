package com.ylh;


import java.util.Scanner;

/**
 * Created By yinlihong on 2018/7/13 11:12.
 */
public class Demo1 {
    public static void main(String[] args) {

        //test2();
        //test5();
        //test6();
        //test7();
        //test8();
        test9();


    }
    public static  void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入美元数:");
        int money = scanner.nextInt();
        //求出20美元的个数
        int twentyCount = money/20;
        System.out.println("20美元个数"+twentyCount);
        //求出10美元的个数
        money=money-twentyCount*20;
        int tenCount = money/10;
        System.out.println("10美元个数"+tenCount);
        //求出5美元的个数
        money=money-tenCount*10;
        int fiveCount = money/5;
        System.out.println("5美元个数"+fiveCount);
        //求出1美元的个数
        int oneCount = money-fiveCount*5;
        System.out.println("1美元个数"+oneCount);
    }
    public static void test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dollar amount:");
        int amount = scanner.nextInt();
        int[] a = {20, 10, 5, 1};
        int num;
        for (int i = 0; i < 4; i++) {
        num = amount/a[i];
        amount = amount%a[i];
        System.out.println("$"+a[i]+" bills:"+num);
        }
    }
    public static void test3(){
        //输入一个四位数的整数，要求编程将这个四位数的个位，十位，百位，千位分别输出
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a1, a2, a3, a4;
        a1 = num / 1000;
        a2 = num / 100 % 10;
        a3 = num / 10 % 10;
        a4 = num % 10;
        System.out.println("千位是" + a1);
        System.out.println("百位是" + a2);
        System.out.println("十位是" + a3);
        System.out.println("个位是" + a4);
//        while (num>=0){
//
//        }

    }
    public static void test4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = scanner.nextInt();
        if(score>90){
            System.out.println("优秀");
        }
        else if(score > 60) {
            System.out.println("及格");
        }
        else{
            System.out.println("不及格");
        }
    }
    public static void test5(){
        //练习：控制台输入成绩，小于10秒，提示用户“恭喜你！进入到决赛组了”。
        //再输入“男”，“女”，根据性别不同进入到男子组或者女子组，提示用户“你进入的是男子组”
        //或者“你进入的是女子组”
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if(time<10){
            System.out.println("恭喜你！进入到决赛组了");
            String sex = scanner.next();
            if("男".equals(sex)){
                System.out.println("你进入的是男子组");
            }
            else{
                System.out.println("你进入的是女子组");
            }
        }
    }
    public static void test6 (){
        //练习：输入名次
        //第一名：阴丽红
        //第二名：2
        //第三名：3
        //第四名：4
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名次：");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("阴丽红");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("继续努力");
        }
    }
    public static void test7 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();
        if((0==year%400)||(0==(year%4))&&(0!=(year%100))){
            //只有字符串才用equals比较
            System.out.println("该年是闰年");
        }
        else{
            System.out.println("该年不是闰年");
        }
    }
    public static void test8(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        if(x<1){
            y = x;
        }
        else if(x<10){
            //x>=1可以不写，简化代码
            y = 2*x-1;
        }
        else{
            y = 3*x-11;
        }
        System.out.println("y的值为："+y);
    }
    public static void test9(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String op = scanner.next();
        int num2 = scanner.nextInt();
        System.out.print("运算结果为：");
        switch (op) {
            case "+":
                System.out.println(num1+num2);
                     break;
            case "-":System.out.println(num1-num2);
                     break;
            case "*":System.out.println(num1*num2);
                     break;
            case "/":System.out.println(1.0*num1/num2);
                     break;
            default:
                System.out.println("无此操作符");
        }
    }

}


