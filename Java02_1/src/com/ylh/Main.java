package com.ylh;

import java.util.Random;
import java.util.Scanner;

/**
 * 面向对象
 */

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //test3();
        //StuInfo();
    }
    public static void test1(){
       //创建学生对象
        Student student = new Student();
        //给学生属性赋值
        student.setName("阴丽红");
        student.setSex("女");
        student.setAge(22);
        student.setAddress("河北");
        System.out.println(student);//如果没有ToString方法就打印出地址，有的话打出ToString
        student.showInfo();
        //创建一个老师对象
        Teacher teacher = new Teacher();
        teacher.setName("王");
        teacher.setAge(30);
        teacher.setSex("男");
        teacher.setWorkAge(8);
        System.out.println(teacher);
    }
    public static void test2(){
        Teacher teacher = new Teacher("张三",33,"男",10,"2000");
        teacher.showInfo();
    }

    /**
     * 控制台输入一个学生信息，最终输出
     */
    public static void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学生信息:");
        System.out.println("请输入学生姓名:");
        //创建学生对象
        Student s = new Student();
        //录入学生姓名
        s.setName(scanner.next());
        System.out.println("请输入学生年龄:");
        s.setAge(scanner.nextInt());
        System.out.println("请输入学生性别:");
        s.setSex(scanner.next());
        System.out.println("请输入学生住址:");
        s.setAddress(scanner.next());
        //输出学生信息
        s.showInfo();
    }

    /**
     * 控制台输入三个学生信息，并将信息存入到数组中，再定义一个方法用来输出所有学生信息
    定义一个静态方法，用来专门输出数组中的学生信息
     */
    public static void StuInfo (){
        Student[] stus = new Student[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("请录入学生信息:");
            System.out.println("请输入学生姓名:");
            //创建学生对象
            Student s = new Student();
            //录入学生姓名
            s.setName(scanner.next());
            System.out.println("请输入学生年龄:");
            s.setAge(scanner.nextInt());
            System.out.println("请输入学生性别:");
            s.setSex(scanner.next());
            System.out.println("请输入学生住址:");
            s.setAddress(scanner.next());
            stus[i]=s;//要把学生对象放入数组，不能直接给数组赋值
        }
        showStuArray(stus);
    }
    public static void showStuArray(Student[] array){
        for (int i = 0; i < 3; i++) {
            //输出学生信息
            array[i].showInfo();
        }
    }

}
