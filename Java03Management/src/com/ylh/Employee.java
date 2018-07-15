package com.ylh;

/**
 * Created By yinlihong on 2018/7/15 16:09.
 */
//创建父类Employee,供其他类继承
public class Employee {
    //各个属性
    private int ID;
    private String name;
    private String job;
    private int holiday;
    private double salary;
    //无参的构造函数
    public Employee(){

    }
    //有参的构造函数
    public Employee(int ID, String name, String job, int holiday, double salary) {
        this.ID = ID;
        this.name = name;
        this.job = job;
        this.holiday = holiday;
        this.salary = salary;
    }
    //get,set方法
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
