package com.ylh;

/**
 * Created By yinlihong on 2018/7/15 13:15.
 */
public class Student1 {
    private String number;
    private String name;
    private int age;
    private String hometown;
    //无参的构造函数
    public Student1(){

    }
    //有参的构造函数
    public Student1(String number, String name, int age, String hometown) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }
    //get,set方法
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
