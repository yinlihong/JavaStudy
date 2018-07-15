package com.ylh;

/**
 * Created By yinlihong on 2018/7/15 15:36.
 */
public class ManagerEmployee extends Employee{
    @Override
    public void setSalary(double salary) {
        double temp = salary+ salary*0.2+salary*0.5+500;
        super.setSalary(temp-temp/30*getHoliday());
    }
}
