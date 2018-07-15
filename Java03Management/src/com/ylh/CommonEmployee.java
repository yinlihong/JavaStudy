package com.ylh;


/**
 * Created By yinlihong on 2018/7/15 15:36.
 */
//extends继承关键字
public class CommonEmployee extends Employee {
    //重写父类的setSalary方法，因为各个职位的工资不同，需要重新设置，体现了多态
    //添加extends关键字继承父类之后，按快捷键Shift+Alt+s选择override method,
    //再选择要重写的方法即可
    @Override
    public void setSalary(double salary) {
        //应发工资 = 基本工资+基本工资*10%+基本工资*50%+200
        //实发工资 = 应发工资—应发工资/30天*请假天数
        double temp = salary+ salary*0.1+salary*0.5+200;
        //super重写父类方法
        super.setSalary(temp-temp/30*getHoliday());
    }
}



