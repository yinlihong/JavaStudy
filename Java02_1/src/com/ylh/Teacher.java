package com.ylh;

/**
 * Created By yinlihong on 2018/7/14 13:58.
 */
//extends 继承关键字
public class Teacher extends Person{
    private int workAge;
    private String salary;

    public Teacher(String name, int age, String sex, int workAge, String salary) {
        super(name,age,sex);
        this.workAge = workAge;
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Teacher(){

    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    //定义输出信息的方法
    public void showInfo(){
        System.out.println("老师名字"+getName()+"工龄"+workAge+"薪水"+salary);
    }
}
