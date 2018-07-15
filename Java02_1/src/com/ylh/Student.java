package com.ylh;

/**
 * Created By yinlihong on 2018/7/14 13:39.
 */
public class Student extends Person{
    //类包含属性和行为（方法）
    private String address;
    //无参的构造方法
    public Student(){

    }
    //有参数的构造方法
    //shift+Alt+s Constructor
    public Student(String name, int age, String sex, String address) {
       super(name, age, sex);
        this.address = address;
    }
    //shift+Alt+s getter and setter
    //全选shift+↓
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //定义一个方法，自我介绍的方法
    public void showInfo(){
        System.out.println(super.getName()+super.getAge()+address);
    }
    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                '}'+super.getName();
    }
}
