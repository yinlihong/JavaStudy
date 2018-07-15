package com.ylh;

/**
 * Created By yinlihong on 2018/7/15 15:37.
 */
public class DirectorEmployee extends Employee{
    @Override
    public void setSalary(double salary) {
        double temp = salary+ salary*0.4+salary*0.6+1500;
        super.setSalary(temp-temp/30*getHoliday());
    }
}
