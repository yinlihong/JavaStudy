package com.ylh;

import java.util.*;

/**
 * Created By yinlihong on 2018/7/15 13:07.
 */
public class Practice {
    //list的创建写在main函数外面加上static即可在任一个函数使用，
    // 无需再为函数设置参数将其传入
    static List<Student1> list = new LinkedList<>();
    public static void main(String[] args) {
        while (true) {
            print();
            choice();
        }
    }
    public static void print(){
        System.out.println("------------"+"欢迎使用学生管理系统"+"--------------");
        System.out.println("==========================");
        System.out.println("1.查看学生信息");
        System.out.println("2.添加学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.删除学生信息");
        System.out.println("5.退出学生信息管理系统");
        System.out.println("请输入对应功能的序号");
        System.out.println("==========================");
    }
    public static void choice () {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanInfo();
                    break;
                case 2:
                    addInfo();
                    break;
                case 3:
                    alterInfo();
                    break;
                case 4:
                    deleteInfo();
                    break;
                case 5:
                    System.out.println("感谢使用管理系统 欢迎下次再来哦");
                    System.exit(0);//强制退出
                default:
                    System.out.println("您要进行的操作不存在！");
            }
        }
    public static void scanInfo(){
        //用list的isEmpty方法判断学生信息是否为空
        if(list.isEmpty()){
            System.out.println("系统中没有学生的信息，请选择添加功能");
        }else{
            System.out.println("==============学生信息如下===============");
            System.out.println("学号    姓名    年龄    家乡");
            //利用迭代器实现list的遍历
            Iterator<Student1> iterator = list.iterator();
            //当仍有元素可以迭代的时候，取出下一个元素的值并输出
            while(iterator.hasNext()){
                Student1 s2 = iterator.next();
                //student对象的属性为private,不能取出,
                // 但get及set方法为public,故用get方法将各属性值取出
                System.out.println(s2.getNumber()+"\t\t"+s2.getName()+"\t\t"+s2.getAge()+"\t\t"+s2.getHometown());
            }
        }
        System.out.println("======================");
        System.out.println("展示完毕");
    }
    public static void addInfo(){
        //每次建立一个新的对象
        Student1 student1 = new Student1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号：");
        String number = scanner.next();
        //把对象的学号设置为输入的学号
        student1.setNumber(number);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        //把对象的姓名设置为输入的姓名
        student1.setName(name);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        //把对象的年龄设置为输入的年龄
        student1.setAge(age);
        System.out.println("请输入家乡");
        String hometown = scanner.next();
        //把对象的家乡设置为输入的家乡
        student1.setHometown(hometown);
        //把整个对象加入到list中
        list.add(student1);
        System.out.println("添加完毕");
    }
    public static void alterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String num = scanner.next();
        //设置布尔值flag初值为false,当把修改后的信息加入list中后设为true,
        // 之后判断flag的真假即可知信息是否被修改，被修改即为存在，否则学生不存在
        boolean flag = false;
        //先创建一个Student1的对象tempStudent并设置为空,遍历整个list,如果要修改的学号存在，
        // 则让原来的对象指向创建的空对象，并退出循环，之后如果tempStudent不为空则将其删除，并
        //创建一个新的Student1对象，不能边删除边创建新对象，会受fast-fail机制影响
        Student1 tempStudent=null;
        //增强for循环
        for (Student1 student1 : list) {
            if (num.equals(student1.getNumber())) {
                tempStudent=student1;
                break;
            }
        }
        if (tempStudent!=null){
            //用list的remove方法删除tempStudent
            list.remove(tempStudent);
            Student1 student2 = new Student1();
            student2.setNumber(num);
            System.out.println("请输入新姓名");
            String name = scanner.next();
            student2.setName(name);
            System.out.println("请输入新年龄");
            int age = scanner.nextInt();
            student2.setAge(age);
            System.out.println("请输入新家乡");
            String hometown = scanner.next();
            student2.setHometown(hometown);
            //将student2的信息加入list中
            list.add(student2);
            flag = true;
        }
        if(flag){
            System.out.println("修改成功");
        }else{
            System.out.println("该学生不存在");
        }
    }
    public static void deleteInfo() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("系统中没有学生的信息，无法删除");
        }
        else {
            System.out.println("请输入学号");
            String num = scanner.next();
            //flag的用法同上
            boolean flag = false;
            for (Student1 student1 : list) {
                if (num.equals(student1.getNumber())) {
                    list.remove(student1);
                    flag = true;
                }
            }
            if(flag){
                System.out.println("删除完毕");
            }
            else{
                System.out.println("该学生不存在");
            }
        }
    }
}
