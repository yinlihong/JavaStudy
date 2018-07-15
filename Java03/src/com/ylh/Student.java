package com.ylh;

/**
 * Created By yinlihong on 2018/7/15 9:51.
 */
public class Student <T> {
    private String name;
    private T t;//泛型类型，指定什么类型就是什么类型
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void show(T t){
        System.out.println(t);
    }
}
